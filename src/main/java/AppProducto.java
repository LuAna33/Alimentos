
import prodalimentos.CongeladosTipoAgua;
import prodalimentos.ProductosCongelados;

import java.util.Date;

public class AppProducto {

    public static void main(String[] args) {
    mostrarMetodoInformacion();
    }
    public static void mostrarMetodoInformacion(){
        ProductosCongelados productoCongelado = new ProductosCongelados();//objetos prueba
        CongeladosTipoAgua congeladosTipoAgua = new CongeladosTipoAgua();
        congeladosTipoAgua.setGramosSalPorLitro(25);
        congeladosTipoAgua.setNumeroLote(12);
        congeladosTipoAgua.setTempMantRecomendada(-5);
        congeladosTipoAgua.setFechaCaducidad(new Date());
        System.out.println("Información de Productos " + congeladosTipoAgua.mostrarInformacion());
    }
}
