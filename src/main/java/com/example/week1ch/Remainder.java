package com.example.week1ch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public  class Remainder {

    @RequestMapping("/")
    public String edenFizzbuzz(Model model) {

    StringBuilder outputString = new StringBuilder();

    for (int i = 1; i <= 100; i++) {

        if (i % 3 == 0 && i % 5 == 0) {

            outputString.append("Fizzbuzz<br />");
        }
        else if (i % 5 == 0) {
            outputString.append("buzz<br />");
        }
        else if (i % 3 == 0) {
            outputString.append("Fizz<br />");
        }
        else {

            //valueOf(i) => changes the integer variable i into a String
           outputString.append(String.valueOf(i) + "<br />");
        }

    }
            model.addAttribute("fizzystring", outputString);
            return "index";
        }
    }




