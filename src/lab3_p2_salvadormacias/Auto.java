/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Auto extends Vehiculo {

    private int numero_puertas;
    private String tipo_transmision;

    public Auto() {
    }

    public Auto(int numero_puertas, String tipo_transmision, String placa, String marca, String modelo, int year, String tipo_combustible, int hora_entrada) {
        super(placa, marca, modelo, year, tipo_combustible, hora_entrada);
        this.numero_puertas = numero_puertas;
        this.tipo_transmision = tipo_transmision;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public String getTipo_transmision() {
        return tipo_transmision;
    }

    public void setTipo_transmision(String tipo_transmision) {
        this.tipo_transmision = tipo_transmision;
    }

    @Override
    public String toString() {
        return super.toString() + "numero de puertas del auto: "+numero_puertas+ "tipo de transmision del auto: "+ tipo_transmision;
    }

}
