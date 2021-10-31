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
public class Community {
    private String communityName;
    private List<House> houseList;

    public Community() {
        houseList = new ArrayList<>();
    }

    public Community(String communityName) {
        this.communityName = communityName;
        houseList = new ArrayList<>();
    }
    

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
    
    public House addHouse()
    {
        House house = new House();
        houseList.add(0, house);
        return house;
    }
    
    public String toString()
    {
        return this.communityName;
    }
}
