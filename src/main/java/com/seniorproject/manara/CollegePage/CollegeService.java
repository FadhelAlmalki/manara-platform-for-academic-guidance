package com.seniorproject.manara.CollegePage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public List<College> getAllColleges() {

        return collegeRepository.findAll();
    }

// This method retrieves the logo (byte[]) of a specific college by ID
public byte[] getCollegeLogo(Long id) {
    // Fetch the college by ID
    College college = collegeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("College not found with id: " + id));

    // Return the logo (byte[]) from the college entity
    return college.getLogo();
}

}
