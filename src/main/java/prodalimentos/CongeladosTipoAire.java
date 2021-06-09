package prodalimentos;

import java.util.Date;

public class CongeladosTipoAire extends ProductosCongelados implements Informacion{
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeAire;
    private int porcentajeVaporDeAgua;

    public CongeladosTipoAire(){
    }
    public CongeladosTipoAire(Date FechaCaducidad, int NumeroLote, String PaisOrigen,
                              Date FechaEnvasado, int TempMantRecomendada,
                              int porcentajeNitrogeno, int porcentajeOxigeno,
                              int porcentajeAire, int porcentajeVaporDeAgua) {
        super(FechaCaducidad, NumeroLote, PaisOrigen, FechaEnvasado, TempMantRecomendada);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeAire = porcentajeAire;
        this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
    }

    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public int getPorcentajeAire() {
        return porcentajeAire;
    }

    public void setPorcentajeAire(int porcentajeAire) {
        this.porcentajeAire = porcentajeAire;
    }

    @Override
    public String mostrarInformacion() {
        return "CongeladosTipoAire{" +
                "porcentajeNitrogeno=" + porcentajeNitrogeno +
                ", porcentajeOxigeno=" + porcentajeOxigeno +
                ", porcentajeAire=" + porcentajeAire +
                ", porcentajeVaporDeAgua=" + porcentajeVaporDeAgua +
                "} " + super.mostrarInformacion();
    }
}
