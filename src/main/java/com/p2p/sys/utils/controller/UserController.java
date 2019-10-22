package com.p2p.sys.utils.controller;

import com.p2p.base.utils.PageUtils;
import com.p2p.base.utils.Query;
import com.p2p.sys.utils.entity.User;
import com.p2p.sys.utils.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-10-21 20:37:26
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
        return this.userService.queryById(id);
    }

    @GetMapping("queryPage")
    public PageUtils queryPage(@RequestParam Map<String, Object> params){
        // 查询列表数据
        Query query = new Query(params);
        List<User> list =this.userService.queryPager(query);
        return new PageUtils(list, query.getTotal());
    }


}