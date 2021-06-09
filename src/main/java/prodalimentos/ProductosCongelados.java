package prodalimentos;

import java.util.Date;

public class ProductosCongelados extends Producto implements Informacion {

    private int TempMantRecomendada;


    public ProductosCongelados() {
    }

    public ProductosCongelados(Date FechaCaducidad, int NumeroLote, String PaisOrigen,
                               Date FechaEnvasado, int TempMantRecomendada) {
        super(FechaCaducidad,
                NumeroLote,
                PaisOrigen,
                FechaEnvasado);
        this.TempMantRecomendada = TempMantRecomendada;
    }

    public int getTempMantRecomendada() {
        return TempMantRecomendada;
    }

    public void setTempMantRecomendada(int tempMantRecomendada) {
        TempMantRecomendada = tempMantRecomendada;
    }

    @Override
    public String mostrarInformacion() {
        return "ProductosCongelados{" +
                "TempMantRecomendada=" + TempMantRecomendada +
                "} " + super.mostrarInformacion();
    }
}