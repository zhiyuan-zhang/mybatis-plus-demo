package com.hki.mpdemo.mvc.test.mapper;

import com.hki.mpdemo.mvc.test.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * test登记表 Mapper 接口
 * </p>
 *
 * @author zhanghao
 * @since 2019-03-11
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
