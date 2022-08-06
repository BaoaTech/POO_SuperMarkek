package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Higiene extends Productos {

    public Higiene(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.HIGIENE;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
