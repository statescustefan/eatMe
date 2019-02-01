package generalData.menuComposing;

import generalData.food.FoodPicking;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MenuComposing {

    @GetMapping("/food/addFood")
    public String showPage(Model model) {
        model.addAttribute("name", new FoodPicking("name")); //assume SomeBean has a property called datePlanted
        return "addFood";
    }

}
