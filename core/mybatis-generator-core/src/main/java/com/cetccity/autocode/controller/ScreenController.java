package com.cetccity.autocode.controller;

import com.cetccity.athena.common.WebResult;
import com.cetccity.athena.common.util.MethodRemark;
import com.cetccity.autocode.model.Screen;
import com.cetccity.autocode.service.ScreenService;
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
public class ScreenController {
    @Autowired
    private ScreenService screenService;

    private static final Logger logger = LoggerFactory.getLogger(ScreenController.class);

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @GetMapping(value = "/")
    @MethodRemark(value = "列表", type = MethodRemark.MethodType.GET)
    public WebResult selectAll(Screen para) {
        return WebResult.of(screenService.selectAll(para));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @GetMapping(value = "/")
    @MethodRemark(value = "查询", type = MethodRemark.MethodType.GET)
    public WebResult selectByPrimaryKey(Screen para) {
        return WebResult.of(screenService.selectByPrimaryKey(para.getId()));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @DeleteMapping(value = "/")
    @MethodRemark(value = "删除", type = MethodRemark.MethodType.DELETE)
    public WebResult deleteByPrimaryKey(Screen para) {
        return WebResult.of(screenService.deleteByPrimaryKey(para.getId()));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @PutMapping(value = "/")
    @MethodRemark(value = "修改", type = MethodRemark.MethodType.UPDATE)
    public WebResult updateByPrimaryKeySelective(Screen para) {
        return WebResult.of(screenService.updateByPrimaryKeySelective(para));
    }

    /**
     * 描述：
     * @author auto-jiangxp
     * @param
     * @return
     */
    @PostMapping(value = "/")
    @MethodRemark(value = "新增", type = MethodRemark.MethodType.INSERT)
    public WebResult insertSelective(Screen para) {
        return WebResult.of(screenService.insertSelective(para));
    }
}