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
public class City
{
    private String cityName;
    private String state;
    private List<Community> communityList;

    public City() {
        this.communityList = new ArrayList<>();
    }

    public City(String cityName, String state) {
        this.cityName = cityName;
        this.state = state;
        this.communityList = new ArrayList<>();
    }
    
    

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addCommunity() {
        Community community = new Community();
        communityList.add(community);
        return community;
    }
    
    public String toString()
    {
        return this.cityName;
    }
}
