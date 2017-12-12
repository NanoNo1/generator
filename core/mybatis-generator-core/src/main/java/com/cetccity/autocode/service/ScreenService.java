package com.cetccity.autocode.service;

import com.cetccity.athena.common.WebResult;
import com.cetccity.autocode.model.Screen;
import java.util.List;

public interface ScreenService {
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
    WebResult selectAll(Screen record);

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
    WebResult updateByPrimaryKeySelective(Screen record);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    WebResult insertSelective(Screen record);
}