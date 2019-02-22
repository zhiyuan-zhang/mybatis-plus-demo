package com.hki.mpdemo.user.service.impl;

import com.hki.mpdemo.user.entity.User;
import com.hki.mpdemo.user.mapper.UserMapper;
import com.hki.mpdemo.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-02-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
