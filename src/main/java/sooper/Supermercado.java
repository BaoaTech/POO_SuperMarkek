package sooper;

import java.time.LocalDate;
import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;
import sooper.productos.Congelado;
import sooper.productos.Fresco;
import sooper.productos.Higiene;

public class Supermercado {

    public static void main(String[] args) {

        IPedido miPedido = new Pedido("pedido001");
        IContenedor bolsa1 = new Bolsa("B111", 40, 25, 900);
        IContenedor caja1 = new Caja(30, 50, "C222", 75);
        miPedido.addContenedor(caja1);
        miPedido.addContenedor(bolsa1);

        IProducto manzanas = new Fresco("MNZ", 1000, 1500,LocalDate.now().plusDays(20));
        IProducto helado = new Congelado("HLD", 800, 1000);
        IProducto papelWC = new Higiene("MNZ", 500, 2500);
        IProducto peras = new Fresco("PER", 800, 1200,LocalDate.now().plusDays(20));

        IContenedor contPeras = miPedido.addProducto(peras);
        IContenedor contHelado = miPedido.addProducto(helado);
        IContenedor contPapel = miPedido.addProducto(papelWC);
        IContenedor contManzanas = miPedido.addProducto(manzanas);

        System.out.println("Bolsa: " + bolsa1);
        System.out.println("Caja: " + caja1);
        System.out.println("Mi pedido con contenedores: " + miPedido);
    }

}
