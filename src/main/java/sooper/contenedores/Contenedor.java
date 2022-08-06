package sooper.contenedores;

import java.util.Set;
import sooper.IContenedor;
import sooper.IProducto; 

public abstract class Contenedor implements IContenedor {
    private String referencia;
    private int resistencia;
    private int alto;

    public Contenedor(String referencia, int alto) {
        this.referencia = referencia;
        this.alto = alto;
    }
    
    
    
    
    @Override
    public String getReferencia() {
        return referencia; 
    }

    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    @Override
    public int volumenDisponible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getResistencia() {
        return resistencia; 
    }

    @Override
    public Set<IProducto> getProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public boolean meter(IProducto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean resiste(IProducto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
