package com.mycscode.sms.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "SMS_Student")
public class Students {
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
    private String pincode;
    private String state;
    private String country;
    private String student_class;
    private String section;
    private String emergency;
    
    public Students() {
    }

    public Students(int registrationId, String name, String fatherName, String motherName, String contact, String email,
            String gender, String address, String city, String pincode, String state, String country,
            String student_class, String section, String emergency) {
        this.registrationId = registrationId;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
        this.student_class = student_class;
        this.section = section;
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
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStudent_class() {
        return student_class;
    }
    public void setStudent_class(String student_class) {
        this.student_class = student_class;
    }
    public String getSection() {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getEmergency() {
        return emergency;
    }
    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }
    @Override
    public String toString() {
        return "Students [address=" + address + ", city=" + city + ", contact=" + contact + ", country=" + country
                + ", email=" + email + ", emergency=" + emergency + ", fatherName=" + fatherName + ", gender=" + gender
                + ", motherName=" + motherName + ", name=" + name + ", pincode=" + pincode + ", registrationId="
                + registrationId + ", section=" + section + ", state=" + state + ", student_class=" + student_class
                + "]";
    }
    
}
