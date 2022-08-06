
package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;


public class Drogueria extends Productos{

    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }
    

    @Override
    public Categoria getCategoria() {
        return Categoria.DROGUERIA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
