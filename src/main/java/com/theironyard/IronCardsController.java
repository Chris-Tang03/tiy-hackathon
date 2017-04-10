package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IronCardsController {

    @RequestMapping("/")
    public String setUp(){
        return "index";
    }


    @RequestMapping("/describe")
    public String describeView(){
        return "describe";
    }

    @RequestMapping("game")
    public String gameView(){
        return "game";
    }

}

