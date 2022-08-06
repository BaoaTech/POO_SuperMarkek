package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;

public abstract class Productos implements IProducto {

    private String referencia;
    private int peso;
    private int volumen;

    public Productos(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
