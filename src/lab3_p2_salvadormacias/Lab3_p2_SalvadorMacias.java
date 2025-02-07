/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_p2_salvadormacias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab3_p2_SalvadorMacias {

    /**
     * @param args the command line arguments
     */
    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList<Auto> autos = new ArrayList();
    public static ArrayList<Motocicleta> motocicletas = new ArrayList();
    public static ArrayList<Camion> camiones = new ArrayList();
    public static ArrayList lista = new ArrayList();

    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println("---Menu principal---");
            System.out.println("1.registrar entrada de vehiculo");
            System.out.println("2.ver vehiculos");
            System.out.println("3.actualizar vehiculos");
            System.out.println("4.Marcar salida de vehiculo");
            System.out.println("5.salir");
            int opc_menu = lea.nextInt();
            switch (opc_menu) {
                case 1: {
                    System.out.println("\n---agregar vehiculos---");
                    System.out.println("1.agregar auto");
                    System.out.println("2.agregar moto");
                    System.out.println("3.agregar camion");
                    System.out.println("ingrese opcion: ");
                    int opc_Entrada = lea.nextInt();
                    switch (opc_Entrada) {
                        case 1: {
                            System.out.println("---agregar auto---\n");
                            agregar_auto();
                            System.out.println("el auto se ha agregado exitosamente...");
                        }

                        break;
                        case 2: {
                            System.out.println("---agregar moto---\n");
                            agregar_moto();
                            System.out.println("la motocicleta se ha agregado exitosamente...");
                        }

                        break;
                        case 3: {
                            System.out.println("---agregar camion---\n");
                            agregar_camion();
                            System.out.println("el camion se ha agregado exitosamente...");
                        }

                        break;
                        default:
                            System.out.println("opcion ingresada es incorrecta...");
                    }

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;

                default:
                    System.out.println("opcion ingresada es invalida...");
            }
        } while (salida
                != true);//fin while

    }//fin main

    public static void agregar_auto() {
        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        System.out.println("ingrese el tipo de combustible: ");
        String tipo_combustible = str.nextLine();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el numero de puertas: ");
        int numero_puertas = lea.nextInt();
        System.out.println("Ingrese el tipo de transmision: ");
        String tipo_transmion = str.nextLine();
        autos.add(new Auto(numero_puertas, tipo_transmion, placa, marca, modelo, year, tipo_combustible, hora_entrada));
        lista.add(new Auto(numero_puertas, tipo_transmion, placa, marca, modelo, year, tipo_combustible, hora_entrada));

    }//fin auto

    public static void agregar_moto() {
        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        System.out.println("ingrese el tipo de combustible: ");
        String tipo_combustible = str.nextLine();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el cilindraje: ");
        int cilindraje = lea.nextInt();
        System.out.println("Indique si tiene baul [s/n]: ");
        String baul = str.nextLine();
        motocicletas.add(new Motocicleta(cilindraje, baul, placa, marca, modelo, year, tipo_combustible, hora_entrada));
        lista.add(new Motocicleta(cilindraje, baul, placa, marca, modelo, year, tipo_combustible, hora_entrada));

    }//fin moto

    public static void agregar_camion() {
        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        System.out.println("ingrese el tipo de combustible: ");
        String tipo_combustible = str.nextLine();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el numero de ejes: ");
        int ejes = lea.nextInt();
        System.out.println("Ingrese el tipo de carga: ");
        String tipo_carga = str.nextLine();
        camiones.add(new Camion(ejes, tipo_carga, placa, marca, modelo, year, tipo_combustible, hora_entrada));
        lista.add(new Camion(ejes, tipo_carga, placa, marca, modelo, year, tipo_combustible, hora_entrada));

    }//fin camion

    public static void listar_todo() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + "-" + "vehiculo: ");

        }
    }//fin listar todo

    public static void listar_autos() {
        for (int i = 0; i < autos.size(); i++) {
            System.out.println(i + 1 + "-" + "vehiculo: ");

        }
        
    }//fin listar autos

    public static void listar_moto() {
        for (int i = 0; i < motocicletas.size(); i++) {
            System.out.println(i + 1 + "-" + "vehiculo: ");

        }

    }//fin listar moto

    public static void listar_camiones() {
        for (int i = 0; i < camiones.size(); i++) {
            System.out.println(i + 1 + "-" + "vehiculo: ");

        }
    }//fin listar camiones

    public static void mod_autos() {
    }

    public static void mod_camiones() {
    }

    public static void mod_motos() {
    }

    public static void marcar_salida() {
    }

}//fin clase
