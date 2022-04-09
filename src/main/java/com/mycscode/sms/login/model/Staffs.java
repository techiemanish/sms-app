package com.mycscode.sms.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SMS_Staff")
public class Staffs {
    @Id
    private int registrationId;
    private String name;
    private String fatherName;
    private String motherName;
    private String contact;
    private String email;
    private String gender;
    private String address;
    private String city;
    private String qualification;
    private String experience;
    private String emergency;
    
    public Staffs() {
    }

    public Staffs(int registrationId, String name, String fatherName, String motherName, String contact, String email,
            String gender, String address, String city, String qualification, String experience, String emergency) {
        this.registrationId = registrationId;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.qualification = qualification;
        this.experience = experience;
        this.emergency = emergency;
    }


    public int getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getEmergency() {
        return emergency;
    }
    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    @Override
    public String toString() {
        return "Staffs [address=" + address + ", city=" + city + ", contact=" + contact + ", email=" + email
                + ", emergency=" + emergency + ", experience=" + experience + ", fatherName=" + fatherName + ", gender="
                + gender + ", motherName=" + motherName + ", name=" + name + ", qualification=" + qualification
                + ", registrationId=" + registrationId + "]";
    }
    
}
