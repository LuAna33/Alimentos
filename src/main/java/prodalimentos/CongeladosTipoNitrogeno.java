package prodalimentos;
import java.util.Date;

public class CongeladosTipoNitrogeno extends ProductosCongelados implements Informacion{
    private int tiempoExposicion;
    private String metodoDeCongelado;

    public CongeladosTipoNitrogeno(){
    }
    public CongeladosTipoNitrogeno(Date FechaCaducidad, int NumeroLote, String PaisOrigen,
                                   Date FechaEnvasado, int TempMantRecomendada,  int tiempoExposicion,
                                   String metodoDeCongelado) {
        super(FechaCaducidad, NumeroLote, PaisOrigen, FechaEnvasado, TempMantRecomendada);
        this.tiempoExposicion = tiempoExposicion;
        this.metodoDeCongelado = metodoDeCongelado;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoDeCongelado() {
        return metodoDeCongelado;
    }

    public void setMetodoDeCongelado(String metodoDeCongelado) {
        this.metodoDeCongelado = metodoDeCongelado;
    }

    @Override
    public String mostrarInformacion() {
        return "CongeladosTipoNitrogeno{" +
                "tiempoExposicion=" + tiempoExposicion +
                ", metodoDeCongelado='" + metodoDeCongelado + '\'' +
                "} " + super.mostrarInformacion();
    }
}
