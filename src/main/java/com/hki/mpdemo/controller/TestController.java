package com.hki.mpdemo.controller;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hki.mpdemo.ResultBean;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hki.mpdemo.mvc.test.ITestService;
import com.hki.mpdemo.mvc.test.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhanghao
 * @since 2019-03-11
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    public ITestService iTestService;

    /**
     *
     * 添加Test
     * @author zhanghao
     * @since 2019-03-11
     * @return
     */
    @RequestMapping(value = { "/test" }, method = RequestMethod.POST)
    public ResultBean<Boolean> addTest(Test test) {
        return new ResultBean<Boolean>(iTestService.save(test));
    }

    /**
     *
     * 功能描述: 根据ID查找Test
     *
     * @param: id
     * @return:
     * @author zhanghao
     * @since 2019-03-11
     */
    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public ResultBean<Test> findTest(@PathVariable("id") int id) {
        return new ResultBean<Test>(iTestService.getById(id));
    }

    /**
     *
     * 功能描述: 更新Test
     *
     * @param: Test
     * @return:
     * @author zhanghao
     * @since 2019-03-11
     */
    @RequestMapping(value = "/test", method = RequestMethod.PUT)
    public ResultBean<Boolean> updateTest(@RequestBody Test test) {
        return new ResultBean<Boolean>(iTestService.updateById(test));
    }
    /**
     *
     * 功能描述: 删除Test
     * @param:
     * @return:
     * @author zhanghao
     * @since 2019-03-11
     */
    @RequestMapping(value = "/test/{id}", method = RequestMethod.DELETE)
    public ResultBean<Boolean> deleteTest(@PathVariable("id") int id) {
        return new ResultBean<Boolean>(iTestService.removeById(id));
    }
    /**
     *
     * 功能描述: 查询所有
     *
     * @param: 总条数 getTotal 当前页数 getCurrent 每页显示数 getSize
     * @return:
     * @author zhanghao
     * @since 2019-03-11
     */
    @RequestMapping(value = { "/tests", "/" }, method = RequestMethod.GET)
    public ResultBean<IPage<Test>> findeAll(@RequestBody IPage<Test> page) {
        return new ResultBean<IPage<Test>>(iTestService.page(page));
    }



}