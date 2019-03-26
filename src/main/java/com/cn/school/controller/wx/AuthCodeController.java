package com.cn.school.controller.wx;

import com.alibaba.fastjson.JSONObject;
import com.cn.school.service.wx.AuthCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: leiyunlong
 * @Date: 2019/3/26 18:51
 * @Version 1.0
 */
@RestController
public class AuthCodeController {


    @Autowired
    private AuthCodeService authCodeService;
    @GetMapping("rollback")
    public Object rollback(String code, String state, HttpServletRequest request, HttpServletResponse response) {
        String referer = request.getHeader("Referer");
        String data= authCodeService.rollback(code,state);

        /**
         * header和cookie保持一致
         */
        String header_string = "refresh_token";
        JSONObject jsonObject = JSONObject.parseObject(data);
        /*if(jsonObject.containsKey("errcode")){
            return "redirect:/";
        }else {
            String string = jsonObject.getString(header_string);
            //TODO 信息入库
            Cookie cookie = new Cookie(header_string, data);
            cookie.setPath("/");
            response.addCookie(cookie);
            String rollback = authCodeService.rollback(code, state);
            response.setHeader(header_string,string);
        }
        if (StringUtils.isEmpty(referer)){
            return ;
        }

        return "redirect:"+referer;*/
        return jsonObject;
    }
}