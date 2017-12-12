package com.cetccity.autocode.controller;

import com.cetccity.athena.common.WebResult;
import com.cetccity.athena.common.util.MethodRemark;
import com.cetccity.autocode.model.GenerateJob;
import com.cetccity.autocode.service.GenerateJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 */
@RestController
@RequestMapping("")
public class GenerateJobController {
    @Autowired
    private GenerateJobService generateJobService;

    private static final Logger logger = LoggerFactory.getLogger(GenerateJobController.class);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @GetMapping(value = "/")
    @MethodRemark(value = "列表", type = MethodRemark.MethodType.GET)
    public WebResult selectAll(GenerateJob para) {
        return WebResult.of(generateJobService.selectAll(para));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @GetMapping(value = "/")
    @MethodRemark(value = "查询", type = MethodRemark.MethodType.GET)
    public WebResult selectByPrimaryKey(GenerateJob para) {
        return WebResult.of(generateJobService.selectByPrimaryKey(para.getId()));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @DeleteMapping(value = "/")
    @MethodRemark(value = "删除", type = MethodRemark.MethodType.DELETE)
    public WebResult deleteByPrimaryKey(GenerateJob para) {
        return WebResult.of(generateJobService.deleteByPrimaryKey(para.getId()));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @PutMapping(value = "/")
    @MethodRemark(value = "修改", type = MethodRemark.MethodType.UPDATE)
    public WebResult updateByPrimaryKeySelective(GenerateJob para) {
        return WebResult.of(generateJobService.updateByPrimaryKeySelective(para));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @PostMapping(value = "/")
    @MethodRemark(value = "新增", type = MethodRemark.MethodType.INSERT)
    public WebResult insertSelective(GenerateJob para) {
        return WebResult.of(generateJobService.insertSelective(para));
    }
}