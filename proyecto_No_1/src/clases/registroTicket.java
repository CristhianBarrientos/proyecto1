package clases;

public class registroTicket {

    String nitUsuario;
    String rolUsuario;
    String correlativo = "0000";

    public registroTicket(String nitUsuario, String rolUsuario, String correlativo) {
        this.nitUsuario = nitUsuario;
        this.rolUsuario = rolUsuario;
        this.correlativo = correlativo;
    }

    public String getNitUsuario() {
        return nitUsuario;
    }

    public void setNitUsuario(String nitUsuario) {
        this.nitUsuario = nitUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
}
