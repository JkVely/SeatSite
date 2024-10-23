/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.seatsite.seatsite.models;

/**
 *
 */
public class Admin extends Persona{
    public Admin(String name, String lastName, String email) {
        String password = "Adm1ñ_321*";
        super(name, lastName, email, password);
    }
}