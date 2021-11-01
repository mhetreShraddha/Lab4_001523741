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
public class VitalSigns
{
    private String respirationRate;
    private String bloodPressure;
    
    private String pulseRate;
    private String temperature;
    

    public String getPulseRate() {
        return pulseRate;
    }
    
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getRespirationRate() {
        return respirationRate;
    }
    
    public String getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }


    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
        
    }

    public String getTemperature() {
        return temperature;
    }

    

    public void setRespirationRate(String respirationRate) {
        this.respirationRate = respirationRate;
    }

    
    
}
