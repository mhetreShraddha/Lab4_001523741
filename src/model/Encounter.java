/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author mhetr
 */
public class Encounter
{
    
    private String hour;
    private String min;
    private VitalSigns vitalSigns;
    private String doctorName;
    private String encounterDate;
    

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    

    public void setHour(String hour) {
        this.hour = hour;
    }

    

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }
    
     public String getDoctorName() {
            
        return doctorName;
        }

        public void setDoctorName(String doctorName) {
            this.doctorName = doctorName;
        }  
    
    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    public void setMin(String min) {
        this.min = min;
    }
    
    public String getHour() {
        return hour;
    }

    
   
        
        
    public String getMin() {
        return min;
    }

    
}
