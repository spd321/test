package cn.dfkj.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/user/list")
    public String list(){
        return "spd,加油吧！";
    }
}
