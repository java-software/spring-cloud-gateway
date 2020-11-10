package com.software.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/11/10
 * @description
 */
@RestController
@RequestMapping("/info")
public class InfoController {

    @GetMapping("/get")
    public Object get(HttpServletRequest request) {
        return "你正在请求的是：" + request.getRequestURL();
    }
}
