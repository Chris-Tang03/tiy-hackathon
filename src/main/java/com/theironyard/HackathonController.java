package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by forestnewark on 4/6/17.
 */
@Controller
public class HackathonController {

    @RequestMapping("/")
    public String setUp(){
        return "index";
    }

}
