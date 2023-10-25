package com.marklogic.interview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    @ResponseBody
    public String test() {
        return "working";
    }
}
