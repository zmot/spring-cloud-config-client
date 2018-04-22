package com.tm.microservices.config.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties("lucky")
public class LuckyClientController {

    private String word;

    @RequestMapping(name = "/lucky-word", method = RequestMethod.GET)
    @ResponseBody
    public String luckyWord() {
        return "My lucky word is: " + word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }

}
