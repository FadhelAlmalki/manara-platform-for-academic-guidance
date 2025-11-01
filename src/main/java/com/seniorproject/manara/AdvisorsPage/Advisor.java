package com.seniorproject.manara.AdvisorsPage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="advisors")
public class Advisor {
    
    @Id
    @Column(name="id")
    private Long id;

    @Lob
    @Column(name="logo")
    private byte[] logo;
    
    @Column(name="name")
    private String name;

    @Column(name="position")
    private String position;

    @Column(name="email")
    private String email;

    @Column(name="guidanceArea")
    private String guidanceArea;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuidanceArea(){
        return guidanceArea;
    }

    public void setGuidanceArea(String guidanceArea){
        this.guidanceArea=guidanceArea;
    }
}
