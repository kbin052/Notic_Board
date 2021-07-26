package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","Hello!!");
        return "hello";
    }


    @GetMapping("Hello-mvc")
    public String helloMvc(@RequestParam(name = "name")String name,Model model)
    {
        model.addAttribute("name",name);
        return "Hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //http에서 body부에 아래 내용을 직접 넣어주겠다는 의미
    public String helloString(@RequestParam("name")String name){
        return "hello" + name; //"hello spring"
    }

    @GetMapping("Hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name")String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    static class Hello {
        private String name;
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
