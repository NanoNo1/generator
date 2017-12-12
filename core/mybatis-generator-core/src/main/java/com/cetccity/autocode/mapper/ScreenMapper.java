/* 中电科嘉兴院 */
package com.cetccity.autocode.mapper;

import com.cetccity.athena.common.model.mybatis.PageList;
import com.cetccity.athena.mybatis.paginate.PageBounds;
import com.cetccity.autocode.model.Screen;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScreenMapper {
    /** 
     * 根据ID删除
     * @param id 主键ID
     */
    int deleteByPrimaryKey(Long id);

    /** 
     * 添加对象对应字段
     * @param record 插入字段对象(必须含ID）
     */
    int insertSelective(Screen record);

    /** 
     * 根据ID查询
     * @param id 主键ID
     */
    Screen selectByPrimaryKey(Long id);

    /** 
     * 根据ID修改对应字段
     * @param record 修改字段对象(必须含ID）
     */
    int updateByPrimaryKeySelective(Screen record);

    /** 
     *
     * @param record 修改字段对象(必须含ID）
     * @param pb
     */
    PageList<Screen> selectAll(Screen record, PageBounds pb);
}