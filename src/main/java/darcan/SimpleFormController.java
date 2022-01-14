package darcan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/form") // http://localhost:8080/form
public class SimpleFormController {

    @RequestMapping
    public ModelAndView response(@ModelAttribute SimpleFormBean form){
        System.out.println("form.getField1() "+form.getField1()); // can be null
        ModelAndView modelAndView = new ModelAndView("form_template");
        modelAndView.addObject("form", form);
        return modelAndView;
    }
    
}
