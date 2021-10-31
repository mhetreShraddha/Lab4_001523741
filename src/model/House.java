/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhetr
 */
public class House
{
    private String addressLine1;
    private String addressLine2;
    private String pincode;
    private List<Person> personList;

    public House() {
        personList = new ArrayList<>();
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson()
    {
        Person person = new Person();
        personList.add(0, person);
        return person;
    }
    
    public String toString()
    {
        return this.addressLine1;
    }
}
