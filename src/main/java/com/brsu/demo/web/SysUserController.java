package com.brsu.demo.web;

import com.alibaba.fastjson.JSON;
import com.brsu.demo.common.CommonUtils;
import com.brsu.demo.dto.PageView;
import com.brsu.demo.entity.SysUser;
import com.brsu.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by brsu on 2018/1/21.
 */
@RestController
@RequestMapping("/sys")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/test")
    public SysUser test() {
        SysUser su = new SysUser();
//        su.setCode("abc");
//        su.setName("测试");
//        sysUserService.in
//        su.setName("测试");
//        sysUserService.in
        return su;

    }

    @RequestMapping("/listSysUser")
    public PageView<SysUser> listSysUser(PageView<SysUser> pv, SysUser sysUser) {
        CommonUtils.checkCond(sysUser);
        pv.setEntity(sysUser);
        sysUserService.queryPageByCondition(pv);
        System.out.println(JSON.toJSONString(pv,true));
        return pv;
    }
}
