package com.hki.mpdemo.mvc.test.impl;

import com.hki.mpdemo.mvc.test.Test;
import com.hki.mpdemo.mvc.test.mapper.TestMapper;
import com.hki.mpdemo.mvc.test.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * test登记表 服务实现类
 * </p>
 *
 * @author zhanghao
 * @since 2019-03-11
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
