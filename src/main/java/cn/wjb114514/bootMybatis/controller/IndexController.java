package cn.wjb114514.bootMybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wjb
 * @date 2022/10/29 10:26 周六
 */
@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public String indexPage() {
        return "hello,world!!";
    }
}
