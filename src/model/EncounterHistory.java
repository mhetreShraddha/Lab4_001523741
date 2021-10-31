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
public class EncounterHistory
{
    private List<Encounter> encounterList;

    public EncounterHistory()
    {
        encounterList = new ArrayList<>();
    }

    public List<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(List<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public void addEncounter(Encounter encounter) {
        encounterList.add(encounter);
    }
}
