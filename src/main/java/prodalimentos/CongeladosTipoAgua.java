package prodalimentos;

import java.util.Date;

public class CongeladosTipoAgua extends ProductosCongelados implements Informacion{
    private int gramosSalPorLitro;


    public CongeladosTipoAgua(){
    }
        public CongeladosTipoAgua(Date FechaCaducidad, int NumeroLote, String PaisOrigen,
                                  Date FechaEnvasado, int TempMantRecomendada,
                                  int gramosSalPorLitro){
        super(FechaCaducidad, NumeroLote, PaisOrigen, FechaEnvasado, TempMantRecomendada);
        this.gramosSalPorLitro = gramosSalPorLitro;
    }

    public int getGramosSalPorLitro() {
        return gramosSalPorLitro;
    }

    public void setGramosSalPorLitro(int gramosSalPorLitro) {
        this.gramosSalPorLitro = gramosSalPorLitro;
    }

    @Override
    public String mostrarInformacion() {
        return "CongeladosTipoAgua{" +
                "gramosSalPorLitro=" + gramosSalPorLitro +
                "} " + super.mostrarInformacion();
    }
}
