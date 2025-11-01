package com.seniorproject.manara.ContactUsPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactPage")
public class ContactUsController {
    
    private final ContactUsRepository contactUsRepository;

    public ContactUsController(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    @GetMapping("/contactUs")
    public String showContactUs() {
        return "contactUs"; // Make sure the corresponding view exists
    }

    @PostMapping("/contactUs")
    public String submitForm(@ModelAttribute ContactUs contactUs, Model model) {
        contactUsRepository.save(contactUs);
        return "redirect:/contactPage/contactUsSuccess";
    }

    @GetMapping("/contactUsSuccess")
    public String showSuccessPage(Model model) {
        model.addAttribute("message", "Your message has been successfully submitted.");
        return "contactUsSuccess";
    }

}
