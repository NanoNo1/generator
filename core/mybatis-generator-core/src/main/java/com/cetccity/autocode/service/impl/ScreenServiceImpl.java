package com.cetccity.autocode.service.impl;

import com.cetccity.athena.common.WebResult;
import com.cetccity.athena.common.model.mybatis.PageList;
import com.cetccity.athena.mybatis.util.PageUtils;
import com.cetccity.autocode.mapper.ScreenMapper;
import com.cetccity.autocode.model.Screen;
import com.cetccity.autocode.service.ScreenService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenServiceImpl implements ScreenService {
    /**
     * 消息结果
     */
    @Autowired
    private ScreenMapper screenMapper;

    private static final Logger logger = LoggerFactory.getLogger(ScreenServiceImpl.class);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult selectByPrimaryKey(Long id) {
        Screen record = screenMapper.selectByPrimaryKey(id);
        return WebResult.of(record);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult selectAll(Screen record) {
        PageList list=screenMapper.selectAll(record,PageUtils.getPageBounds(record, "ID.DESC"));
        return WebResult.of(list);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult deleteByPrimaryKey(Long id) {
        screenMapper.deleteByPrimaryKey(id);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult updateByPrimaryKeySelective(Screen record) {
        screenMapper.updateByPrimaryKeySelective(record);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult insertSelective(Screen record) {
        screenMapper.insertSelective(record);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }
}