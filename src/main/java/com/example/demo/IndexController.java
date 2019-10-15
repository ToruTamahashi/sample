package com.example.demo;

import com.example.demo.model.Message;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class IndexController {
    @Autowired
    private MessageService servie;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showTopPage() {
        return "index";
    }
    @RequestMapping(method=RequestMethod.POST)
    public String handleMessage(@Valid @ModelAttribute("form") Message message) {
        servie.addMessage(message.getMessage());
        return "redirect:messages";
    }
}
