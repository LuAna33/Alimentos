package prodalimentos;

import java.util.Date;

public class ProductosFrescos extends Producto implements Informacion{

    public ProductosFrescos(Date fechaCaducidad, int numeroLote, String paisOrigen,
                            Date fechaEnvasado){
        super( fechaCaducidad, numeroLote, paisOrigen, fechaEnvasado);
    }

    @Override
    public String mostrarInformacion() {
        return "ProductosFrescos{} " + super.mostrarInformacion();
    }
}


