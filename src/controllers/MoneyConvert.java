package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoneyConvert {
    @GetMapping("/screen")
    public String screen(){
        return "screen";
    }
    @PostMapping("/result")
    public ModelAndView displayResult(@RequestParam double money, @RequestParam double rate){
        double result = money * rate;
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("result",result);
        modelAndView.addObject("money", money);
        modelAndView.addObject("rate", rate);
        return modelAndView;
    }

}
