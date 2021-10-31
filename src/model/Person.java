/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mhetr
 */
public class Person
{
    private String name;
    private String age;
    private Patient patient;

    public Person() {
        patient = new Patient(this);
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String toString()
    {
        return this.name;
    }
    
}
