package com.tm.microservices.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LuckyClientController {

    @Value(value = "${lucky.word}")
    private String luckyWord;

    @RequestMapping(name = "/lucky-word", method = RequestMethod.GET)
    @ResponseBody
    public String luckyWord() {
        return "My lucky word is: " + luckyWord;
    }
}
