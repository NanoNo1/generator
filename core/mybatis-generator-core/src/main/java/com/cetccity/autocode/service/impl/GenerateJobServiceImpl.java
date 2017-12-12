package com.cetccity.autocode.service.impl;

import com.cetccity.athena.common.WebResult;
import com.cetccity.athena.common.model.mybatis.PageList;
import com.cetccity.athena.mybatis.util.PageUtils;
import com.cetccity.autocode.mapper.GenerateJobMapper;
import com.cetccity.autocode.model.GenerateJob;
import com.cetccity.autocode.service.GenerateJobService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateJobServiceImpl implements GenerateJobService {
    /**
     * 消息结果
     */
    @Autowired
    private GenerateJobMapper generateJobMapper;

    private static final Logger logger = LoggerFactory.getLogger(GenerateJobServiceImpl.class);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult selectByPrimaryKey(Long id) {
        GenerateJob record = generateJobMapper.selectByPrimaryKey(id);
        return WebResult.of(record);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult selectAll(GenerateJob record) {
        PageList list=generateJobMapper.selectAll(record,PageUtils.getPageBounds(record, "ID.DESC"));
        return WebResult.of(list);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult deleteByPrimaryKey(Long id) {
        generateJobMapper.deleteByPrimaryKey(id);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult updateByPrimaryKeySelective(GenerateJob record) {
        generateJobMapper.updateByPrimaryKeySelective(record);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    public WebResult insertSelective(GenerateJob record) {
        generateJobMapper.insertSelective(record);
        String[] logparam = { "", "" };
        return WebResult.addLogdada(WebResult.ok("S.message!!!!请修改"), "L.message!!!!请修改", logparam);
    }
}