package prodalimentos;

import java.util.Date;

public class ProductosRefrigerados extends Producto implements Informacion{

    private int codOSA;
    private int tempMantRecomendada;

    public ProductosRefrigerados(Date fechaCaducidad, int numeroLote, String paisOrigen,
                                 Date fechaEnvasado) {
        super(fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
    }
    public ProductosRefrigerados(Date fechaCaducidad, int numeroLote, String paisOrigen,
                                 String fechaEnvasado,  int CodOSA, int TempMantRecomendada){
      this.codOSA = codOSA;
      this.tempMantRecomendada = tempMantRecomendada;
}

    public int getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(int codOSA) {
        this.codOSA = codOSA;
    }

    public int getTempMantRecomendada() {
        return tempMantRecomendada;
    }

    @Override
    public String toString() {
        return "ProductosRefrigerados{" +
                "codOSA=" + codOSA +
                ", tempMantRecomendada=" + tempMantRecomendada +
                "} " + super.mostrarInformacion();
    }

    public void setTempMantRecomendada(int tempMantRecomendada) {
        this.tempMantRecomendada = tempMantRecomendada;
    }


}