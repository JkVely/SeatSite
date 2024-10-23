/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.seatsite.seatsite.models;
import java.util.ArrayList;
/**
 *
 * @author jkqui
 */
public class SeatBlock  {
    private final String id;
    private double precio;
    private final ArrayList<Seat> seats;
    private final int filas, columnas;

    public SeatBlock(String id, int filas, int columnas) {
        this.id = id;
        this.precio = 0;
        this.filas = filas;
        this.columnas = columnas;
        this.seats = new ArrayList<>();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String seatId = id +": "+i + "-" + j;
                seats.add(new Seat(seatId, this.precio));
            }
        }
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        for (Seat s : seats) {
            s.setPrecio(precio);
        }
    }
}
