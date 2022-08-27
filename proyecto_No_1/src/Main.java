import clases.bitacora.bitacora;
import clases.registroTicket;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String campo = "", fecha = "", hora = "", mensaje = "";
        Scanner entradaUsuario = new Scanner(System.in);

        Scanner entrada = new Scanner(System.in);
        int opcion = 9;
        int exit = 0;
        while (exit != 1) {


            System.out.println("\n\n    Roles:" + "\n" + "Mesa de Ayuda" + "\n" + "Soporte Tecnico" + "\n" + "Desarrollador");

            System.out.println("\nIngrese su nit: ");
            String nitUsuario = entradaUsuario.nextLine();
            System.out.println("Ingrese el rol: ");
            String rolUsuario = entradaUsuario.nextLine();
            String rol = "desarrollador";
            int correlativo = 0;
            correlativo = correlativo + 1;
            String correlativoCadena = String.valueOf(correlativo);

            registroTicket rT = new registroTicket(nitUsuario, rolUsuario, correlativoCadena);

            while (exit != 1) {

                // menu
                menu();
                try {
                    opcion = entrada.nextInt();
                } catch (Exception e) {
                    System.out.println("Opcion no valida.");
                    entrada = new Scanner(System.in);
                }
                switch (opcion) {
                    case 1: //Mesa de Ayuda

                        ArrayList<bitacora> eventosBitacora = new ArrayList<>();
                        Scanner entradaString = new Scanner(System.in);
                        Scanner entradaNumerica = new Scanner(System.in);


                        if (rolUsuario.equalsIgnoreCase("desarrollador") || rolUsuario.equalsIgnoreCase("Mesa de Ayuda") || rolUsuario.equalsIgnoreCase("Soporte Tecnico")) {
                            System.out.println("Rol: " + rolUsuario);
                            System.out.println("Ingrese la fecha");
                            fecha = entradaString.nextLine();
                            System.out.println("Ingrese la hora hoy");
                            hora = entradaString.nextLine();
                            System.out.println("Explique cual es el error que experimenta: ");
                            mensaje = entradaString.nextLine();
                            bitacora objetoEvento = new bitacora(campo, fecha, hora, mensaje, 1);
                            eventosBitacora.add(objetoEvento);

                            for (bitacora bitacora : eventosBitacora) {
                                System.out.println(bitacora.getSoporte() + "\n" + "Evento creado el: " + bitacora.getFecha() + " a las " + bitacora.getHora() + " horas" + "\n" + "Error encontrado: " + "\n" + bitacora.getMensaje());
                            }
                        } else {
                            System.out.println("No puedes acceder a la bitacora porque no tienes los permisos necesarios!!!!");
                        }
                        break;

                    case 2: // Asignar

                        int escalada = 0;
                        if (rolUsuario.equalsIgnoreCase("desarrollador") || rolUsuario.equalsIgnoreCase("Soporte Tecnico")) {

                            for (String s : Arrays.asList("Correlativo actual " + rT.getCorrelativo(), "Desea Resolver los inconvenientes o los desea escalar a la mesa del Desarrollador ", "1. Resolver", "2. Escalar")) {
                                System.out.println(s);
                            }
                            String opc = "";
                            opc = entrada.nextLine();
                            escalada = 0;
                            if (opc == "1") {
                                delay();
                                System.out.println("Inconveniente resuelto...");
                                escalada = 2;
                                break;
                            } else if (opc == "2") {
                                System.out.println("Problema Escalado al rol de desarrollo.");
                                escalada = 1;


                            }


                        } else {
                            System.out.println("No cuenta con los permisos nescesarios!!!!");
                        }


                    case 3:
                        if (rolUsuario.equalsIgnoreCase("desarrollador")) {


                            System.out.println("Escalada completada!");
                        }

                        break;

                    default:
                        System.out.println("Ingrese una opcion valida!");
                        break;
                    case 10:
                        exit = 1;
                        break;

                }
            }


        }//fin del while

        bitacora b2 = new bitacora(campo, fecha, hora, mensaje, 1);


    }


    static void menu() {
        System.out.println("\n\nBienvenido al Sistema: ");
        System.out.println("1.  Crear Ticket");
        System.out.println("2.  Asignar Ticket");
        System.out.println("3.  Mover Ticket");
        System.out.println("10. Salir");
    }

    static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }


    }
}