package main.com.mvc.session7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
@RequestMapping("/birthday")
public class Task1Controller {

    @RequestMapping("/")
    public String showHomePage() {
        return "task1/birthdayPage";
    }

    @RequestMapping("/calculation")
    public String showCalculationPage(HttpServletRequest request, Model model) {

        String year = request.getParameter("txtYear");
        String month = request.getParameter("txtMonth");
        String day = request.getParameter("txtDay");

        //processing the data that received from the request
        long yearsDifference = LocalDate.now().getYear() -  Integer.parseInt(year);
        long monthsDifference = LocalDate.now().getMonthValue() -  Integer.parseInt(month);
        long daysDifference = LocalDate.now().getDayOfMonth() -  Integer.parseInt(day);

        //adding data to the model
        model.addAttribute("year" , yearsDifference);
        model.addAttribute("month" , monthsDifference);
        model.addAttribute("day" , daysDifference);

        return "task1/calculationPage";
    }

}
