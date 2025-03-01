/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3_p2_salvadormacias;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
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
    public static ArrayList <Vehiculo> lista= new ArrayList();

    public static String tipo_combustible;
    public static String tipo_transmision;
    public static String tipo_carga;

    public static void main(String[] args) {

        Auto auto1 = new Auto(2, "automatica", "HAZ3590", "honda", "accord", 2000, "diesel", 0);
        Motocicleta motocicleta1 = new Motocicleta(200, "n", "AXK2333", "suzuki", "raptor", 2020, "regular", 0);
        Camion camionsito = new Camion(6, "construccion", "MAX1000", "Mercedes", "V200", 2014, "gasolina", 0);

        lista.add(auto1);
        lista.add(motocicleta1);
        lista.add(camionsito);

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
                    System.out.println("\n---ver vehiculos---");
                    System.out.println("1.ver todos");
                    System.out.println("2.listar por tipo");
                    System.out.println("Ingrese opcion: ");
                    int opc_listar = lea.nextInt();
                    switch (opc_listar) {
                        case 1: {
                            System.out.println("---\nlista de todos los vehiculos---");
                            listar_todo();

                        }

                        break;
                        case 2: {
                            System.out.println("---\nlista de autos---");
                            listar_autos();
                            System.out.println("---\nlista de motocicletas---");
                            listar_moto();
                            System.out.println("---\nlista de camiones---");
                            listar_camiones();

                        }

                        break;

                        default:
                            System.out.println("opcion ingresada es incorrecta...");
                    }

                }
                break;
                case 3: {
                    System.out.println("---\nactualizar vehiculos---");
                    System.out.println("1.lista de autos");
                    System.out.println("2.lista de motos");
                    System.out.println("3.lista de camiones");
                    System.out.println("Ingrese la lista que desea ingresar a modificar: ");
                    int mod_opc = lea.nextInt();
                    switch (mod_opc) {
                        case 1: {
                            System.out.println("---\nlista de autos---");
                            mod_autos(autos);
                        }

                        break;
                        case 2: {
                            System.out.println("---\nlista de motos---");
                            mod_motos(motocicletas);
                        }

                        break;
                        case 3: {
                            System.out.println("---\nlista de camiones---");
                            mod_camiones(camiones);

                        }

                        break;
                        default:
                            System.out.println("opcion ingresada es incorrecta...");
                    }

                }
                break;
                case 4: {
                    System.out.println("---\nmarcar salida---");
                    marcar_salida();

                }
                break;
                case 5: {
                    salida = true;

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

        // String tipo_combustible = str.nextLine();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el numero de puertas: ");
        int numero_puertas = lea.nextInt();
        System.out.println("Ingrese el tipo de transmision: ");
        System.out.println("1.automatica");
        System.out.println("2.manual");
        System.out.println("3.continua variable");
        int tipo_t = lea.nextInt();
        if (tipo_t == 1) {
            tipo_transmision = "automatica";

        } else if (tipo_t == 2) {
            tipo_transmision = "manual";
        } else if (tipo_t == 3) {
            tipo_transmision = "continua variable";

        } else {
            System.out.println("la transmision ingresada no existe");
        }
        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }
        autos.add(new Auto(numero_puertas, tipo_transmision, placa, marca, modelo, year, tipo_combustible, hora_entrada));
        lista.add(new Auto(numero_puertas, tipo_transmision, placa, marca, modelo, year, tipo_combustible, hora_entrada));

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
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el cilindraje: ");
        int cilindraje = lea.nextInt();
        System.out.println("Indique si tiene baul [s/n]: ");
        String baul = str.nextLine();
        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }
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
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el numero de ejes: ");
        int ejes = lea.nextInt();
        System.out.println("Ingrese el tipo de carga: ");
        System.out.println("1.materiales de construccion");
        System.out.println("2.paqueteria");
        System.out.println("3.alimentos");
        int tipo_car = lea.nextInt();
        if (tipo_car == 1) {
            tipo_carga = "materiales de construccion";

        } else if (tipo_car == 2) {
            tipo_carga = "paqueteria";

        } else if (tipo_car == 3) {
            tipo_carga = "alimentos";

        } else {
            System.out.println("el tipo de carga ingresado es invalido...");
        }

        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }
        camiones.add(new Camion(ejes, tipo_carga, placa, marca, modelo, year, tipo_combustible, hora_entrada));
        lista.add(new Camion(ejes, tipo_carga, placa, marca, modelo, year, tipo_combustible, hora_entrada));

    }//fin camion

    public static void listar_todo() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + "-" + "vehiculo: "+lista.get(i));

        }
    }//fin listar todo

    public static void listar_autos() {
        for (int i = 0; i < autos.size(); i++) {
            System.out.println(i + 1 + "-" + "auto: "+autos.get(i));

        }

    }//fin listar autos

    public static void listar_moto() {
        for (int i = 0; i < motocicletas.size(); i++) {
            System.out.println(i + 1 + "-" + "motocicleta: "+motocicletas.get(i));

        }

    }//fin listar moto

    public static void listar_camiones() {
        for (int i = 0; i < camiones.size(); i++) {
            System.out.println(i + 1 + "-" + "camion: "+camiones.get(i));

        }
    }//fin listar camiones

    public static ArrayList mod_motos(ArrayList<Motocicleta> motocicletas) {
        listar_moto();
        System.out.println("Cual es la posicion de la motocicleta a modificar: ");
        int pos_ModMotos = lea.nextInt();

        Motocicleta modificar = motocicletas.get(pos_ModMotos);

        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el cilindraje: ");
        int cilindraje = lea.nextInt();
        System.out.println("Indique si tiene baul [s/n]: ");
        String baul = str.nextLine();
        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }

        modificar.setMarca(marca);
        modificar.setModelo(modelo);
        modificar.setYear(year);
        modificar.setTipo_combustible(tipo_combustible);
        modificar.setHora_entrada(hora_entrada);
        modificar.setCilindraje(cilindraje);
        modificar.setBaul(baul);

        System.out.println("La información fue actualizada");

        return motocicletas;
    }

    public static ArrayList mod_camiones(ArrayList<Camion> camiones) {
        listar_camiones();
        System.out.println("Cual es la posicion del camion a modificar: ");
        int pos_ModCamion = lea.nextInt();

        Camion modificar = camiones.get(pos_ModCamion);

        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        System.out.println("Ingrese la hora de entrada: ");
        int hora_entrada = lea.nextInt();
        System.out.println("Ingrese el numero de ejes: ");
        int ejes = lea.nextInt();
        System.out.println("Ingrese el tipo de carga: ");
        String tipo_carga = str.nextLine();
        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }

        modificar.setMarca(marca);
        modificar.setModelo(modelo);
        modificar.setYear(year);
        modificar.setTipo_combustible(tipo_combustible);
        modificar.setHora_entrada(hora_entrada);
        modificar.setEjes(ejes);
        modificar.setTipo_carga(tipo_carga);

        System.out.println("La información fue actualizada");

        return camiones;
    }

    public static ArrayList<Auto> mod_autos(ArrayList<Auto> autos) {
        listar_autos();
        System.out.println("Cual es la posicion del auto a modificar: ");
        int pos_ModCarros = lea.nextInt();

        Auto modificar = autos.get(pos_ModCarros);

        System.out.println("Ingrese la placa: ");
        String placa = str.nextLine();
        System.out.println("Ingrese la marca: ");
        String marca = str.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modelo = str.nextLine();
        System.out.println("ingrese el año: ");
        int year = lea.nextInt();
        //System.out.println("Ingrese la hora de entrada: ");
        //int hora_entrada = lea.nextInt();
        LocalTime horaEntrada;
        System.out.println("Ingrese el numero de puertas: ");
        int numero_puertas = lea.nextInt();
        System.out.println("Ingrese el tipo de transmision: ");
        String tipo_transmion = str.nextLine();
        System.out.println("ingrese el tipo de combustible: ");
        System.out.println("1.Diesel");
        System.out.println("2.regular");
        System.out.println("3.gasolina");
        int tipo_c = lea.nextInt();
        if (tipo_c == 1) {
            tipo_combustible = "diesel";
        } else if (tipo_c == 2) {
            tipo_combustible = "regular";
        } else if (tipo_c == 3) {
            tipo_combustible = "gasolina";
        } else {
            System.out.println("combustible ingresado no es validp");
        }

        modificar.setMarca(marca);
        modificar.setModelo(modelo);
        modificar.setYear(year);
        modificar.setTipo_combustible(tipo_combustible);
        // modificar.setHora_entrada(hora_entrada);
        modificar.setNumero_puertas(numero_puertas);
        modificar.setTipo_transmision(tipo_transmion);

        System.out.println("La información fue actualizada");

        return autos;
    }

    public static void marcar_salida() {
         for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + "-" + lista.get(i));
             System.out.println("ingrese el vehiculo que saldra del sistema: ");
             int pos_salida = lea.nextInt();
             lista.remove(pos_salida);
             System.out.println("el vehiculo ha salido del sistema...");

        }
         
    }

   /* public static void DiferenciaTiempo() {
        LocalTime horaSalida = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
Duration tiempoTotal = Duration.between(ArrayList get(indice). getHoraEntrada(), horaSalida
        ) ;
String stringTiempoTotal  = String format("802d: 802d: 802d", hours, minutes, seconds);
    }*/

    }//fin clase
