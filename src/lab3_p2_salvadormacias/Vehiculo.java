/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_p2_salvadormacias;

/**
 *
 * @author Apple
 */
public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int year;
    private String tipo_combustible;
    private int hora_entrada;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int year, String tipo_combustible, int hora_entrada) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.tipo_combustible = tipo_combustible;
        this.hora_entrada = hora_entrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    @Override
    public String toString() {
        return "placa del vehiculo: "+ placa +" marca del vehiculo: "+ marca+ "modelo del vehiculo: "+ modelo+ "año del vehiculo:  "+ year
                + "tipo de combustible: "+ tipo_combustible ;
    }

}
