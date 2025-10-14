package main.com.session8.task.controller;

import main.com.session8.task.UserFormModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/register")
    public String showFormPage(Model model) {
        model.addAttribute("userForm", new UserFormModel());
        return "formPage";
    }

    @RequestMapping("/result")
    public String submitForm(@ModelAttribute("userForm") UserFormModel userForm, Model model) {
        model.addAttribute("userForm", userForm);
        return "resultPage";
    }
}
