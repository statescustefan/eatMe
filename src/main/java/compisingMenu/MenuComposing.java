package compisingMenu;

import Food.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuComposing {

    @GetMapping("/foo")
    public String showPage(Model model) {
        model.addAttribute("someBean", new Menu()); //assume SomeBean has a property called datePlanted
        return "foo";
    }

    @PostMapping("/foo")
    public String showPage(@ModelAttribute("someBean") Menu menu) {

        System.out.println("Menu choosed: " + menu.getFinalMenu()); //in reality, you'd use a logger instead :)
        return "redirect:/";
    }
}
