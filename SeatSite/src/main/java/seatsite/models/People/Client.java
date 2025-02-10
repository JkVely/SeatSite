/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package seatsite.models;

/**
 *
 * @author jkqui
 */
public class Client extends Persona{
    private Reserva reserva;

    public Client(String name, String lastName, String email, String password) {
        super(name, lastName, email, password);
        this.reserva = new Reserva();
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
