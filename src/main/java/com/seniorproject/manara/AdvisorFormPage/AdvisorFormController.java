package com.seniorproject.manara.AdvisorFormPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advisors")
public class AdvisorFormController {
    
    private final AdvisorFormRepository advisorFormRepository;

    public AdvisorFormController(AdvisorFormRepository advisorFormRepository) {
        this.advisorFormRepository = advisorFormRepository;
    }

    @GetMapping("/advisorForm")
    public String showAdvisorForm() {
        return "advisorForm"; // Make sure the corresponding view exists
    }

    @PostMapping("/advisorForm")
    public String submitForm(@ModelAttribute AdvisorForm advisorForm, Model model) {
        advisorFormRepository.save(advisorForm);
        return "redirect:/advisors/advisorFormSuccess";
    }

    @GetMapping("/advisorFormSuccess")
    public String showSuccessPage(Model model) {
        model.addAttribute("message", "Your registration has been successfully submitted.");
        return "advisorFormSuccess";
    }

}
