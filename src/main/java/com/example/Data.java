/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author 2099444
 */
public class Data {

    private String string;
    
    public Data(){
    }
    
    public void addData(String str){
        this.string = str;        
    }
    
    public String getData(){
        return this.string; 
    }
}