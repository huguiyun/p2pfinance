package com.p2p.sys.utils.controller;


import com.p2p.sys.utils.entity.User;
import com.p2p.sys.utils.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-10-22 12:23:59
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        System.out.println("asddfadfassdfasdfasdfasdfasd");

        return this.userService.queryById(id);
    }

}