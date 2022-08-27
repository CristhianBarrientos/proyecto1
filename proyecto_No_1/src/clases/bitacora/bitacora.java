package clases.bitacora;

import java.util.ArrayList;
import java.util.Scanner;

public class bitacora {

    private String soporte;
    private String fecha;
    private String hora;
    private String mensaje;
    //estado creado = 1; estado cerrado = 0;
    private int Evento;

    public bitacora(String Soporte, String fecha, String hora, String mensaje, int evento) {
        this.soporte = Soporte;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.hora = hora;
        this.Evento = evento;
    }

    public String getSoporte() {
        return soporte;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getEvento() {
        return Evento;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setEvento(int evento) {
        Evento = evento;
    }

    //Eventos de la bitácora

    //Primer Evento
    public void crearTicket() {


    }

    //Segundo Evento
    public static void asignarTicket() {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaNumerica = new Scanner(System.in);
        System.out.println("Ingresa el campo soporte ");
        String campo = entrada.nextLine();
        System.out.println("Ingrese la fecha");
        String fecha = entrada.nextLine();
        System.out.println("Ingrese la hora en la hora de hoy");
        String hora = entrada.nextLine();
        System.out.println("Explique cual es el error que experimenta: ");
        String mensaje = entrada.nextLine();


        bitacora objetoEvento = new bitacora(campo, fecha, hora,mensaje, 1);


        ArrayList<bitacora> eventosBitacora = new ArrayList<>();

        eventosBitacora.add(objetoEvento);

        for( bitacora bitacora : eventosBitacora){
            System.out.println(bitacora.getSoporte()+"\n"+"Evento creado el: "+bitacora.getFecha()+" a las "+bitacora.getHora()+" horas"+"\n"+"Error encontrado: "+"\n"+ bitacora.getMensaje());


        }

    }

    //Tercer Evento
    public void moverTicket() {


    }

    //Cuarto Evento
    public void solucion() {


    }


}
