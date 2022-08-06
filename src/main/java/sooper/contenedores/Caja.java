package sooper.contenedores;

import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {

    private int ancho;
    private int largo;

    public Caja(int ancho, int largo, String referencia, int alto) {
        super(referencia, alto);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getSuperficie() {
        return ancho * largo;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

}
