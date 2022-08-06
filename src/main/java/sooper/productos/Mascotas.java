package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascotas extends Productos {

    public Mascotas(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTAS;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
