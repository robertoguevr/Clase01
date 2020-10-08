/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Roberto
 */
public class NewClass {
    
    public static void main(String[]args ){
    String user = "";
    String pass = "";
    if(user == "" && pass == ""){
        System.out.println("Datos vacios"); 
    }else if(user.isEmpty()&& pass.isEmpty()){
        System.out.println("Empty");
    }else{
        System.out.println("Ninguna");
    }
    }
}
