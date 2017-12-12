/**
 *    Copyright 2006-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.generator.plugins;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.ArrayList;
import java.util.List;

/**
 * DATE 2017/11/23
 * AUTHOR JIANGXP
 * DESCRIPTION 
 */
public class MybatisControllerPlugin extends PluginAdapter
{
	private FullyQualifiedJavaType slf4jLogger;
	private FullyQualifiedJavaType slf4jLoggerFactory;
	private FullyQualifiedJavaType remark;
	private FullyQualifiedJavaType interfaceType;
	private FullyQualifiedJavaType controllerType;
	private FullyQualifiedJavaType pojoType;
	private FullyQualifiedJavaType autowired;
	private String servicePack;
	private String project;
	private String pojoUrl;
	private String controllerPack;
	private FullyQualifiedJavaType webResult;

	private List<Method> methods;

	public MybatisControllerPlugin()
	{
		super();
		// 默认是slf4j
		slf4jLogger = new FullyQualifiedJavaType("org.slf4j.Logger");
		slf4jLoggerFactory = new FullyQualifiedJavaType("org.slf4j.LoggerFactory");
		methods = new ArrayList<Method>();
	}

	@Override
	public boolean validate(List<String> warnings)
	{
		servicePack = properties.getProperty("targetPackage");
		controllerPack = properties.getProperty("controllerPack");
		project = properties.getProperty("targetProject");
		pojoUrl = context.getJavaModelGeneratorConfiguration().getTargetPackage();
		autowired = new FullyQualifiedJavaType("org.springframework.beans.factory.annotation.Autowired");
		return true;
	}

	@Override
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable)
	{
		List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
		String table = introspectedTable.getBaseRecordType();
		String tableName = table.replaceAll(this.pojoUrl + ".", "");
		interfaceType = new FullyQualifiedJavaType(servicePack + "." + tableName + "Service");
		controllerType = new FullyQualifiedJavaType(controllerPack + "." + tableName + "Controller");
		// mybatis
		// logger.info(toLowerCase(daoType.getShortName()));
		pojoType = new FullyQualifiedJavaType(pojoUrl + "." + tableName);
		webResult = new FullyQualifiedJavaType("com.cetccity.athena.common.WebResult");
		remark = new FullyQualifiedJavaType("com.cetccity.athena.common.util.MethodRemark");

		Interface interface1 = new Interface(interfaceType);
		TopLevelClass topLevelClass = new TopLevelClass(controllerType);
		topLevelClass.addJavaDocLine("/**");
		topLevelClass.addJavaDocLine(" *");
		topLevelClass.addJavaDocLine(" *");
		topLevelClass.addJavaDocLine(" */");
		// 导入必要的类
		addImport(interface1, topLevelClass);
		// controller
		addController(topLevelClass, introspectedTable, tableName, files);
		return files;
	}

	/**
	 * 添加controller
	 * @param topLevelClass
	 * @param introspectedTable
	 * @param tableName
	 * @param files
	 */
	private void addController(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String tableName,
			List<GeneratedJavaFile> files)
	{
		topLevelClass.setVisibility(JavaVisibility.PUBLIC);
		topLevelClass.addImportedType(new FullyQualifiedJavaType("org.springframework.web.bind.annotation.*"));
		topLevelClass.addAnnotation("@RestController");
		topLevelClass.addAnnotation("@RequestMapping(\"\")");
		//添加注入service
		addField(topLevelClass, tableName);
		//添加Log
		addLogger(topLevelClass);
		// 添加方法
		topLevelClass.addMethod(selectAll(introspectedTable, tableName));
		topLevelClass.addMethod(selectByPrimaryKey(introspectedTable, tableName));
		topLevelClass.addMethod(deleteByPrimaryKey(introspectedTable, tableName));
		topLevelClass.addMethod(updateByPrimaryKeySelective(introspectedTable, tableName));
		topLevelClass.addMethod(insertSelective(introspectedTable, tableName));
		// 生成文件
		GeneratedJavaFile file = new GeneratedJavaFile(topLevelClass, project, context.getJavaFormatter());
		files.add(file);
	}

	/**
	 * 添加字段
	 *
	 * @param topLevelClass
	 */
	protected void addField(TopLevelClass topLevelClass, String tableName)
	{
		// 添加 dao
		Field field = new Field();
		field.setName(toLowerCase(interfaceType.getShortName())); // 设置变量名
		topLevelClass.addImportedType(interfaceType);
		field.setType(interfaceType); // 类型
		field.setVisibility(JavaVisibility.PRIVATE);
		field.addAnnotation("@Autowired");
		topLevelClass.addField(field);
	}

	/**
	 * BaseUsers to baseUsers
	 *
	 * @param tableName
	 * @return
	 */
	protected String toLowerCase(String tableName)
	{
		StringBuilder sb = new StringBuilder(tableName);
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		return sb.toString();
	}

	/**
	 * 导入需要的类
	 */
	private void addImport(Interface interfaces, TopLevelClass topLevelClass)
	{
		topLevelClass.addImportedType(interfaceType);
		topLevelClass.addImportedType(pojoType);
		topLevelClass.addImportedType(slf4jLogger);
		topLevelClass.addImportedType(slf4jLoggerFactory);
		topLevelClass.addImportedType(webResult);
		topLevelClass.addImportedType(autowired);
		topLevelClass.addImportedType(remark);

	}

	/**
	 * 导入logger
	 */
	private void addLogger(TopLevelClass topLevelClass)
	{
		Field field = new Field();
		field.setFinal(true);
		field.setInitializationString(
				"LoggerFactory.getLogger(" + topLevelClass.getType().getShortName() + ".class)"); // 设置值
		field.setName("logger"); // 设置变量名
		field.setStatic(true);
		field.setType(new FullyQualifiedJavaType("Logger")); // 类型
		field.setVisibility(JavaVisibility.PRIVATE);
		topLevelClass.addField(field);
	}

	/**
	 * 添加方法
	 */
	protected Method selectAll(IntrospectedTable introspectedTable, String tableName)
	{
		Method method = new Method();
		method.addAnnotation("@GetMapping(value = \"/\")");
		method.addAnnotation("@MethodRemark(value = \"列表\", type = MethodRemark.MethodType.GET)");
		method.setName("selectAll");
		method.setReturnType(webResult);
		method.addParameter(new Parameter(pojoType, "para"));
		method.setVisibility(JavaVisibility.PUBLIC);
		addJavaDoc(method);

		StringBuilder sb = new StringBuilder();
		sb.append("return WebResult.of(");
		sb.append(toLowerCase(interfaceType.getShortName()) + ".");
		sb.append("selectAll");
		sb.append("(");
		sb.append("para");
		//		sb.append(",");
		//		sb.setLength(sb.length() - 1);
		sb.append("));");
		method.addBodyLine(sb.toString());
		return method;
	}

	private void addJavaDoc(Method method)
	{
		method.addJavaDocLine("/**");
		method.addJavaDocLine(" * 描述：");
		method.addJavaDocLine(" * @author");
		method.addJavaDocLine(" * @param");
		method.addJavaDocLine(" * @return");
		method.addJavaDocLine(" */");
	}

	/**
	 * 添加方法
	 */
	protected Method selectByPrimaryKey(IntrospectedTable introspectedTable, String tableName)
	{
		Method method = new Method();
		method.addAnnotation("@GetMapping(value = \"/\")");
		method.addAnnotation("@MethodRemark(value = \"查询\", type = MethodRemark.MethodType.GET)");
		method.setName("selectByPrimaryKey");
		method.setReturnType(webResult);
		method.addParameter(new Parameter(pojoType, "para"));
		method.setVisibility(JavaVisibility.PUBLIC);
		addJavaDoc(method);
		StringBuilder sb = new StringBuilder();
		sb.append("return WebResult.of(");
		sb.append(toLowerCase(interfaceType.getShortName()) + ".");
		sb.append("selectByPrimaryKey");
		sb.append("(");

		sb.append("para.getId()");
		//		sb.append(",");
		//		sb.setLength(sb.length() - 1);
		sb.append("));");
		method.addBodyLine(sb.toString());
		return method;
	}

	/**
	 * 添加方法
	 */
	protected Method deleteByPrimaryKey(IntrospectedTable introspectedTable, String tableName)
	{
		Method method = new Method();
		method.addAnnotation("@DeleteMapping(value = \"/\")");
		method.addAnnotation("@MethodRemark(value = \"删除\", type = MethodRemark.MethodType.DELETE)");
		method.setName("deleteByPrimaryKey");
		method.setReturnType(webResult);
		method.addParameter(new Parameter(pojoType, "para"));
		method.setVisibility(JavaVisibility.PUBLIC);
		addJavaDoc(method);
		StringBuilder sb = new StringBuilder();
		sb.append("return WebResult.of(");
		sb.append(toLowerCase(interfaceType.getShortName()) + ".");
		sb.append("deleteByPrimaryKey");
		sb.append("(");
		sb.append("para.getId()");
		//		sb.append(",");
		//		sb.setLength(sb.length() - 1);
		sb.append("));");
		method.addBodyLine(sb.toString());
		return method;
	}

	/**
	 * 添加方法
	 */
	protected Method insertSelective(IntrospectedTable introspectedTable, String tableName)
	{
		Method method = new Method();
		method.addAnnotation("@PostMapping(value = \"/\")");
		method.addAnnotation("@MethodRemark(value = \"新增\", type = MethodRemark.MethodType.INSERT)");
		method.setName("insertSelective");
		method.setReturnType(webResult);
		method.addParameter(new Parameter(pojoType, "para"));
		method.setVisibility(JavaVisibility.PUBLIC);
		addJavaDoc(method);
		StringBuilder sb = new StringBuilder();
		sb.append("return WebResult.of(");
		sb.append(toLowerCase(interfaceType.getShortName()) + ".");
		sb.append("insertSelective");
		sb.append("(");
		sb.append("para");
		//		sb.append(",");
		//		sb.setLength(sb.length() - 1);
		sb.append("));");
		method.addBodyLine(sb.toString());
		return method;
	}

	/**
	 * 添加方法
	 */
	protected Method updateByPrimaryKeySelective(IntrospectedTable introspectedTable, String tableName)
	{
		Method method = new Method();
		method.addAnnotation("@PutMapping(value = \"/\")");
		method.addAnnotation("@MethodRemark(value = \"修改\", type = MethodRemark.MethodType.UPDATE)");
		method.setName("updateByPrimaryKeySelective");
		method.setReturnType(webResult);
		method.addParameter(new Parameter(pojoType, "para"));
		method.setVisibility(JavaVisibility.PUBLIC);
		addJavaDoc(method);
		StringBuilder sb = new StringBuilder();
		sb.append("return WebResult.of(");
		sb.append(toLowerCase(interfaceType.getShortName()) + ".");
		sb.append("updateByPrimaryKeySelective");
		sb.append("(");
		sb.append("para");
		//		sb.append(",");
		//		sb.setLength(sb.length() - 1);
		sb.append("));");
		method.addBodyLine(sb.toString());
		return method;
	}

}
