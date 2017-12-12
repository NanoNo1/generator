package org.mybatis.test;

import org.mybatis.generator.api.ShellRunner;

/**
 *
 */
public class AutoCodeTest
{


    public static void main(String[] args) throws Exception {

        // 调试初始化参数
        AutoCodeTest test = new AutoCodeTest();
        //取得根目录路径
        String rootPath = test.getClass().getResource("/").getFile().toString();
        //当前目录路径
        //String currentPath1=test.getClass().getResource(".").getFile().toString();
        //String currentPath2=test.getClass().getResource("").getFile().toString();
        //当前目录的上级目录路径
        //   String parentPath=test.getClass().getResource("../").getFile().toString();
//        String[] arg = new String[]{"-configfile", rootPath + "test/generatorConfig.xml", "-overwrite"};
        String[] arg = new String[]{"-configfile", rootPath + "generatorConfigForOracle.xml", "-overwrite"};
        //String[] arg = new String[]{"-configfile", rootPath + "test/generatorConfigForMySql.xml", "-overwrite"};

        ShellRunner.main(arg);

    }
}
