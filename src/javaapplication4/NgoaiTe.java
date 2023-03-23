/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author vinhn
 */
public class NgoaiTe {
    private String name;
    private double tigiaString;

    public NgoaiTe(String name, double tigiaString) {
        this.name = name;
        this.tigiaString = tigiaString;
    }

    public NgoaiTe() {
    }
    
    

    public String getName() {
        return name;
    }

    public double getTigiaString() {
        return tigiaString;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTigiaString(double tigiaString) {
        this.tigiaString = tigiaString;
    }
    
    
}
