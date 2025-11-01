package com.seniorproject.manara.UniversityPage;

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
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/universities")
    public String getUniversities(Model model){
        List<University> universities=universityService.getAllUniversities();
        model.addAttribute("universities",universities);
        return "universities";
    }



// Serve the university logo
    @GetMapping("/universities/{id}/logo")
    @ResponseBody
    public ResponseEntity<byte[]> getUniversityLogo(@PathVariable Long id) {
        // Retrieve the image byte[] from the service
        byte[] logoBytes = universityService.getUniversityLogo(id);

        // Return the image as a ResponseEntity with the correct MIME type (e.g., image/png or image/jpeg)
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)  // Adjust to your image type (e.g., IMAGE_JPEG for JPEG images)
                .body(logoBytes);
    }


}
