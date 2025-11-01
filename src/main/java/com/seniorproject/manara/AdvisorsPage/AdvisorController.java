package com.seniorproject.manara.AdvisorsPage;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdvisorController {
    
    @Autowired
    private AdvisorService advisorService;

    @GetMapping("/advisors")
    public String getAdvisors(Model model){
        List<Advisor> advisors=advisorService.getAllAdvisors();
        model.addAttribute("advisors",advisors);
        return "advisors";
    }



// Serve the advisor logo
    @GetMapping("/advisors/{id}/logo")
    @ResponseBody
    public ResponseEntity<byte[]> getAdvisorLogo(@PathVariable Long id) {
        // Retrieve the image byte[] from the service
        byte[] logoBytes = advisorService.getAdvisorLogo(id);

        // Return the image as a ResponseEntity with the correct MIME type (e.g., image/png or image/jpeg)
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)  // Adjust to your image type (e.g., IMAGE_JPEG for JPEG images)
                .body(logoBytes);
    }

}
