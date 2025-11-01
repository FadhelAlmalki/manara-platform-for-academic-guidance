package com.seniorproject.manara.AdvisorsPage;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvisorService {
    
        @Autowired
        private AdvisorRepository advisorRepository;
    
        public List<Advisor> getAllAdvisors() {
    
            return advisorRepository.findAll();
        }
    
    
    
    // This method retrieves the logo (byte[]) of a specific advisor by ID
    public byte[] getAdvisorLogo(Long id) {
        // Fetch the advisor by ID
        Advisor advisor = advisorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Advisor not found with id: " + id));
    
        // Return the logo (byte[]) from the advisor entity
        return advisor.getLogo();
    }
    
    }
