package com.xiaohe.xhapiinterface.controller;

import cn.hutool.crypto.digest.DigestUtil;
import com.xiaohe.xhapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 *
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getNameGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("xiaohe"));
        return "GET 你的名字是：" + name;
    }

    @PostMapping
    public String getNamePost(@RequestParam String name) {
        return "POST 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        long nonce = Long.parseLong(request.getHeader("nonce"));
//        long timestamp = Long.parseLong(request.getHeader("timestamp"));
//        String body = request.getHeader("body");
//        String sign = request.getHeader("sign");
//        // 从数据库查出是否已分配给用户 accessKey
//        String dbAccessKey = "xiaohe";
//        if (!dbAccessKey.equals(accessKey)) {
//            throw new RuntimeException("无权限");
//        }
//        // nonce 是一个长度为 4 的整数
//        if (nonce > 9999) {
//            throw new RuntimeException("无权限");
//        }
//        //时间和当前时间不能超过 5 分钟
//        if (System.currentTimeMillis() - timestamp > (5 * 60 * 1000)) {
//            throw new RuntimeException("无权限");
//        }
//        // 从数据库查出 secretKey
//        String secretKey = "qwertyuiop";
//        String serverSign = DigestUtil.sha256Hex(body + "." + secretKey);
//        if (!serverSign.equals(sign)) {
//            throw new RuntimeException("无权限");
//        }
        // 调用成功，次数 + 1
        return "POST 你的名字是：" + user.getUsername();
    }

}
