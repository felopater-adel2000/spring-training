package main.com.mvc.session7.controller;

import main.com.mvc.session7.data.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class Task2Controller {

    @RequestMapping("/")
    public String showStudentForm() {
        return "task2/studentForm";
    }

    @RequestMapping("/form-data")
    public String showStudentFormData(
            @RequestParam("txtFirstName") String firstName,
            @RequestParam("txtLastName") String lastName,
            @RequestParam("txtEmail") String email,
            @RequestParam("txtBirthday") String birthday,
            @RequestParam("txtCity") String city,
            Model model
    ) {

        Student student = Student.builder()
                .firstName(firstName)
                .lastName(lastName)
                .city(city)
                .email(email)
                .dateOdBirthday(birthday)
                .build();

        model.addAttribute("student", student);

        return "task2/formData";
    }

}
