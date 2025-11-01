package com.seniorproject.manara.CollegePage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Data
@Table(name="colleges")
public class College {
    
    @Id
    @Column(name="id")
    private Long id;

    @Lob
    @Column(name="logo")
    private byte[] logo;
    
    @Column(name="name")
    private String name;

    @Column(name="info")
    private String info;

    @Column(name="jobs")
    private String jobs;

    @Column(name="skills")
    private String skills;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getSkills(){
        return skills;
    }

    public void setSkills(String skills){
        this.skills = skills;
    }
        

}
