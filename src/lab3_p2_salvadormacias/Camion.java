/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Camion extends Vehiculo{
    private int ejes;
    private String tipo_carga;

    public Camion() {
    }

    public Camion(int ejes, String tipo_carga, String placa, String marca, String modelo, int year, String tipo_combustible, int hora_entrada) {
        super(placa, marca, modelo, year, tipo_combustible, hora_entrada);
        this.ejes = ejes;
        this.tipo_carga = tipo_carga;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public String getTipo_carga() {
        return tipo_carga;
    }

    public void setTipo_carga(String tipo_carga) {
        this.tipo_carga = tipo_carga;
    }

    @Override
    public String toString() {
        return super.toString()+ "numero de ejes del camion: "+ejes+ "tipo de carga: "+ tipo_carga;
    }
    
    
    
}
