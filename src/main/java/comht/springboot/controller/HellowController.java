package comht.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowController {
    @GetMapping("/abc")
   public String hello(Model model){
        model.addAttribute("mag","你好徐家斌最帅！！！嘿嘿嘿");
       return "success";
}
}
