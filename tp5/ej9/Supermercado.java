package ej9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ej9.pFacturacion.FiltroFacturacion;
import ej9.pRecaudacion.FiltroRecaudacion;

public class Supermercado {
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Factura> facturas = new ArrayList<>();

    public Supermercado() {

    }

    public void agregaProducto(Producto producto) {
        productos.add(producto);
    }

    public void agregaStock(String producto, int stock) {
        for (Producto p : productos) {
            if (p.getNombre() == producto) {
                p.cambiaStock(stock);
            }
        }
    }

    // el usuario ingresa un Map<nombre del pedido, cantidad de unidades a comprar>
    public void nuevoPedido(Map<String, Integer> pedido, boolean pagoContado) {
        Map<Producto, Integer> p = new HashMap<>();
        for (String x : pedido.keySet()) {
            for (Producto producto : productos) {
                if (producto.getNombre() == x) {
                    p.put(producto, pedido.get(x));
                }
            }
        }
        Factura factura = new Factura(p, pagoContado);
        facturas.add(factura);
        factura.print();
    }

    // retorna el monto total de facturacion del supermercado en una fecha o periodo
    // dada
    public float busquedaDineroTotal(FiltroFacturacion filtro) {
        float total = 0;
        for (Factura factura : facturas) {
            if (filtro.aplica(factura)) {
                total += filtro.retorno(factura);
            }
        }
        return total;
    }

    // retorna el producto con mas recaudacion en una fecha o periodo dada
    public Producto busquedaDineroXproducto(FiltroRecaudacion filtro) {
        Producto p = new Producto(null, 0, 0);
        float monto = 0;

        for (Factura factura : facturas) {
            if (filtro.aplica(factura)) {
                Map<Producto, Float> values = filtro.retorno(factura); // Map<Producto, monto recaudado> en esa factura
                for (Producto producto : values.keySet()) {
                    if (values.get(producto) > monto) {
                        p = producto; // nuevo producto con mayor monto recaudado
                    }
                }
            }
        }
        return p;
    }
    // public ArrayList<Producto> productosEscasos(){

    // }
}
