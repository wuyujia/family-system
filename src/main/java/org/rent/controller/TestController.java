package org.rent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuyujia on 2017/4/16.
 */
@RequestMapping("/base")
@RestController
public class TestController {

    @RequestMapping("/hello")
    public Object hello() {
        return "hello";
    }
}
