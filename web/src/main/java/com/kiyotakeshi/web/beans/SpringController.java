package com.kiyotakeshi.web.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    private final SpringBean1 springBean1;

    public SpringController(SpringBean1 springBean1) {
        this.springBean1 = springBean1;
    }

    @RequestMapping
    @ResponseBody
    public String index() {
        return springBean1.getHello();
    }
}
