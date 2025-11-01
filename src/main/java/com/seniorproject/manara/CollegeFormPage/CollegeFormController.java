package com.seniorproject.manara.CollegeFormPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/colleges")
public class CollegeFormController {
    

    private final CollegeFormRepository collegeFormRepository;

    public CollegeFormController(CollegeFormRepository collegeFormRepository) {
        this.collegeFormRepository = collegeFormRepository;
    }

    @GetMapping("/collegeForm")
    public String showCollegeForm() {
        return "collegeForm"; // Make sure the corresponding view exists
    }

    @PostMapping("/collegeForm")
    public String submitForm(@ModelAttribute CollegeForm collegeForm, Model model) {
        collegeFormRepository.save(collegeForm);
        return "redirect:/colleges/collegeFormSuccess";
    }

    @GetMapping("/collegeFormSuccess")
    public String showSuccessPage(Model model) {
        model.addAttribute("message", "Your Suggestion has been successfully submitted.");
        return "collegeFormSuccess";
    }

}
