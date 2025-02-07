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
    
    public static void agregar_auto(){
    
    }//fin auto
    
     public static void agregar_moto(){
    
    }//fin moto
     
     public static void agregar_camion(){
    
    }//fin camion
     
     public static void listar_todo(){
     }//fin listar todo
     
     public static void listar_autos(){
     }//fin listar autos
     
     public static void listar_moto(){
     
     }//fin listar moto
     
     public static void listar_camiones(){
     }//fin listar camiones
     
     public static void mod_autos(){}
     
     public static void mod_camiones(){}
     
     public static void mod_motos(){}
     
     public static void marcar_salida(){}
     

}//fin clase
