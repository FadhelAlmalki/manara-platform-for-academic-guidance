package com.seniorproject.manara.CollegePage;


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
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/colleges")
    public String getColleges(Model model){
        List<College> colleges=collegeService.getAllColleges();
        model.addAttribute("colleges",colleges);
        return "colleges";
    }

// Serve the colleges logo
    @GetMapping("/colleges/{id}/logo")
    @ResponseBody
    public ResponseEntity<byte[]> getCollegeLogo(@PathVariable Long id) {
        // Retrieve the image byte[] from the service
        byte[] logoBytes = collegeService.getCollegeLogo(id);

        // Return the image as a ResponseEntity with the correct MIME type (e.g., image/png or image/jpeg)
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)  // Adjust to your image type (e.g., IMAGE_JPEG for JPEG images)
                .body(logoBytes);
    }

}
