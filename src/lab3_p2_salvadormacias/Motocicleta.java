/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Motocicleta extends Vehiculo {

    private int cilindraje;
    private String baul;

    public Motocicleta() {
    }

    public Motocicleta(int cilindraje, String baul, String placa, String marca, String modelo, int year, String tipo_combustible, int hora_entrada) {
        super(placa, marca, modelo, year, tipo_combustible, hora_entrada);
        this.cilindraje = cilindraje;
        this.baul = baul;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocicleta{" + "cilindraje=" + cilindraje + ", baul=" + baul + '}';
    }

}
