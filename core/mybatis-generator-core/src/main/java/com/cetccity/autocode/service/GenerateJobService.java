package com.cetccity.autocode.service;

import com.cetccity.athena.common.WebResult;
import com.cetccity.autocode.model.GenerateJob;
import java.util.List;

public interface GenerateJobService {
    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult selectByPrimaryKey(Long id);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult selectAll(GenerateJob record);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult deleteByPrimaryKey(Long id);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult updateByPrimaryKeySelective(GenerateJob record);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult insertSelective(GenerateJob record);
}