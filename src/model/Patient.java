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
public class Patient
{
    private EncounterHistory encounterHistory;
    private Person person;

    public Patient(Person person)
    {
        encounterHistory = new EncounterHistory();
        this.person = person;
    }
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
