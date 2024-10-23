/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.seatsite.seatsite.models;

/**
 *
 * @author jkqui
 */
public class Seat {
    private String id;
    private double precio;    
    private State estado;

    public Seat(String id, double precio) {
        this.id = id;
        this.precio = precio;
        this.estado = State.AVAILABLE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
}
