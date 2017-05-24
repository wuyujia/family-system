package org.rent.family.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.rent.controller.ExceptionHandlerController;
import org.rent.family.domain.FamilyUser;
import org.rent.family.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.controller
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:15
 * @version: V1.0
 */
@RestController
@Api("用户Controller")
@RequestMapping("/user")
public class UserController extends ExceptionHandlerController{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
    @ApiOperation(value = "查询一个用户", response = FamilyUser.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, httpMethod = "GET")
    public Object findOneById(@RequestParam("uid") Integer uid){
        return userService.findFamilyUserById(uid);
    }
}
