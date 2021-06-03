package com.company;

public class Contact {
    private String telNum;
    private String firstName;
    private String lastName;
    private Category category;


    public Contact(String telNum, String firstName, String lastName, Category category){
        this.telNum = telNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
    }


    public Contact(String telNum,String firstName, Category category){
        this.telNum = telNum;
        this.firstName = firstName;
        this.category = category;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAll(){
        if (getLastName() == null) {
            return getTelNum()+" "+getFirstName()+" "+getCategory();
        } else {
            return getTelNum() + " " + getFirstName() + " " + getLastName() + " " + getCategory();
        }
    }
}
