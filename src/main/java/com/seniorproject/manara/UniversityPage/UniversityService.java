package com.seniorproject.manara.UniversityPage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
    
    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversities() {

        return universityRepository.findAll();
    }



// This method retrieves the logo (byte[]) of a specific university by ID
public byte[] getUniversityLogo(Long id) {
    // Fetch the university by ID
    University university = universityRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("University not found with id: " + id));

    // Return the logo (byte[]) from the university entity
    return university.getLogo();
}

}
