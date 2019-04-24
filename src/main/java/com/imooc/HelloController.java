package com.imooc;

import com.imooc.bean.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2018/6/4.
 */
//通过web方式访问RestController  相当于Controller+@ResponseBody
//@RestController
@Controller
@ResponseBody
@RequestMapping(value = "/hello") //类头写 要在URL里加入/hello/say(可以不写)
public class HelloController {

    @Autowired
    private Girl girl;

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private String age;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Spring boot " + girl;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "id",required = false,defaultValue = "0") String myId){
        //,required = false 不是必须穿的 defaultValue 默认值
        return "Hello:" + myId;
    }

    @GetMapping(value = "/test1")
    public String testGit(){
        return "test git";
    }
}
