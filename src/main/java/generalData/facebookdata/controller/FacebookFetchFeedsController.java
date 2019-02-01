package generalData.facebookdata.controller;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class FacebookFetchFeedsController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public FacebookFetchFeedsController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping("/a")
    public String getFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }
        return "redirect:/connected";
    }
    @GetMapping("/connected")
    public String getFacebookConnected(Model model) {
        String [] fields = { "id", "email",  "first_name", "last_name" };
        User userProfile = facebook.fetchObject("me", User.class, fields);
        model.addAttribute("profileImage", userProfile.getFirstName().concat(userProfile.getLastName()));
        model.addAttribute("pic", connectionRepository.getPrimaryConnection(Facebook.class).createData().getImageUrl());
        return "hello";
    }

}