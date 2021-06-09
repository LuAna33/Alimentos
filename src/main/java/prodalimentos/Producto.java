package prodalimentos;

import java.util.Date;

public abstract class Producto implements Informacion{

    private Date fechaCaducidad;
    private int numeroLote;
    private String paisOrigen;
    private Date fechaEnvasado;

    public Producto() {
    }
    public Producto(Date fechaCaducidad, int numeroLote, String paisOrigen, Date fechaEnvasado){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }


    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }


    public String mostrarInformacion() {
        return "Producto{" +
                "fechaCaducidad=" + fechaCaducidad +
                ", numeroLote=" + numeroLote +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaEnvasado=" + fechaEnvasado +
                '}';
    }
}
