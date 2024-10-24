/**/
/*Guarda la informacion de la id del cliente, e id del asiento*/
/*Verificar estado del asiento boolean*/
//formato id silla: idBloque: fila-columna
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package seatsite.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Reserva {
    private final List<Seat> seats;
    private double precio;

    public Reserva(){
        this.precio = 0;
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat){
        if(checkSeat(seat)){
            reserveSeat(seat);
            seats.add(seat);
        }
    }

    public void removeSeat(Seat seat){
        if(seats.contains(seat)){
            unreserveSeat(seat);
            seats.remove(seat);
        }
    }

    private boolean checkSeat(Seat seat){
        return seat.getEstado() == State.AVAILABLE;
    }

    private void reserveSeat(Seat seat){
        seat.setEstado(State.RESERVED);
    }

    private void unreserveSeat(Seat seat){
        seat.setEstado(State.AVAILABLE);
    }

    private void calculatePrice(){
        precio = 0;
        for (Seat seat : seats) {
            precio += seat.getPrecio();
        }
    }

    public double getPrecio() {
        calculatePrice();
        return precio;
    }

    @Override
    public String toString() {
        String str = "Reserva{" + "seats=" + seats.size() + ", precio=" + precio + '}';
        for (Seat seat : seats) {
            str += "\n" + seat.getId();
        }
        return str;
    }
}
