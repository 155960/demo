package demo.controller;

import com.github.pagehelper.PageInfo;
import demo.pojo.Demo;
import demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @Autowired
    IDemoService demoService;

    @RequestMapping("text")
    public void demo(){
        PageInfo<Demo> pageInfo=demoService.getDemo();
        System.out.println("页数"+pageInfo.getPages()+"页面元素个数"+pageInfo.getSize());

    }
}
