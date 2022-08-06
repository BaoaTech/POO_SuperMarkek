package sooper.contenedores;

import java.util.HashSet;
import java.util.Set;
import sooper.IContenedor;
import sooper.IProducto;

public abstract class Contenedor implements IContenedor {

    private String referencia;
    private int resistencia;
    private int alto;
    private Set<IProducto> productos;

    public Contenedor(String referencia, int alto, int resistencia) {
        this.referencia = referencia;
        this.alto = alto;
        productos = new HashSet<IProducto>();
        this.resistencia = resistencia;
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
        return getVolumen() - volumenOcupado();
    }

    private int volumenOcupado() {
        int res = 0;
        for (IProducto p : productos) {
            res += p.getVolumen();
        }
        return res;
    }

    @Override
    public int getResistencia() {
        return resistencia;
    }

    @Override
    public Set<IProducto> getProductos() {
        return productos;
    }

    @Override
    public boolean meter(IProducto producto) {
        boolean resistencia0k = resiste(producto);
        boolean volumen0k = producto.tengoEspacio(this);
        boolean compatibilidad0k = true;

        for (IProducto p : productos) {
            boolean compatible0k = producto.esCompatible(p);
            compatibilidad0k &= compatible0k;
        }

        boolean acepta = resistencia0k && volumen0k && compatibilidad0k;
        if (acepta) {
            productos.add(producto);
            producto.meter(this);
        }

        return acepta;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return resistencia > producto.getPeso();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Contenedor " + referencia + " [" + getTipo()
                + "] (sup " + getSuperficie() + "cm2 - vol " + getVolumen() + "cm3 - resistencia " + getResistencia() + " g).\n");
        if (productos.isEmpty()) {
            sb.append("\t\tvacío\n");
        }
        for (IProducto p : productos) {
            sb.append("\t\t" + p + "\n");
        }
        sb.append("\t\t>> Disponible vol " + volumenDisponible() + "cm3");
        return sb.toString();
    }

}
