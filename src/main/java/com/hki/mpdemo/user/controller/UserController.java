package com.hki.mpdemo.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hki.mpdemo.user.entity.ResultBean;
import com.hki.mpdemo.user.entity.User;
import com.hki.mpdemo.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-02-21
 */
@RestController
@RequestMapping("/user/user")
public class UserController {

    @Autowired
    public IUserService iUserService;

    /**
     * 添加User
     * @return
     */
    @RequestMapping(value = { "/user" }, method = RequestMethod.POST)
    public ResultBean<Boolean> addUser(User user) {
        return new ResultBean<Boolean>(iUserService.save(user.setVersion(1).setDeleted(0)));
    }
    /**
     *
     * 功能描述: 根据ID查找用户
     *
     * @param: id
     * @return:
     * @auther: ZHANG.HAO
     * @date: 2019-03-01 15:30
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResultBean<User> findUser(@PathVariable("id") int id) {
        return new ResultBean<User>(iUserService.getById(id));
    }
    /**
     *
     * 功能描述: 更新User
     *
     * @param: User
     * @return:
     * @auther: ZHANG.HAO
     * @date: 2019-03-01 15:39
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResultBean<Boolean> updateUser(@PathVariable User user) {
        return new ResultBean<Boolean>(iUserService.updateById(user));
    }

    /**
     *
     * 功能描述: 删除User
     * @param:
     * @return:
     * @auther: ZHANG.HAO
     * @date: 2019-03-01 15:40
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResultBean<Boolean> deleteUser(@PathVariable("id") int id) {
        return new ResultBean<Boolean>(iUserService.removeById(id));
    }

    /**
     *
     * 功能描述: 查询所有
     *
     * @param: 总条数 getTotal 当前页数 getCurrent 每页显示数 getSize
     * @return:
     * @auther: ZHANG.HAO
     * @date: 2019-03-01 15:40
     */
    @RequestMapping(value = { "/users", "/" }, method = RequestMethod.GET)
    private ResultBean<IPage<User>> findeAll(IPage<User> page) {
        return new ResultBean<IPage<User>>(iUserService.page(page));
    }

}
