package com.zb.controller;

import com.alibaba.fastjson.JSON;
import com.zb.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RepliesController {

    @Autowired
    private RepliesService repliesService;

    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        return JSON.toJSONString(repliesService.getRepliesList());
    }
}
