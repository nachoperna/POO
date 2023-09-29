package ej9;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Factura {
    private Map<Producto, Integer> pedido = new HashMap<>();
    private float monto_total;
    private LocalDate fecha_pedido;
    private boolean pago_contado;
    private int id;

    public Factura(Map<Producto, Integer> pedido, boolean pagoContado) {
        this.pedido = pedido;
        monto_total = 0;
        pago_contado = pagoContado;
        sumatoria();
        fecha_pedido = LocalDate.now();
        id = (int) Math.random() * 10000;
    }

    public void sumatoria() {
        for (Producto producto : pedido.keySet()) {
            float precio = producto.getPrecio();
            int unidades = pedido.get(producto);

            monto_total += precio * unidades;

            producto.cambiaStock(unidades);

        }
        if (pago_contado) {
            monto_total = (float) (monto_total * 0.90);
        }
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public float getMonto_total() {
        return monto_total;
    }

    public void print() {
        System.out.println("ID Pedido: #" + id);
        for (Producto producto : pedido.keySet()) {
            int unidades = pedido.get(producto);

            System.out.println("Producto: " + producto.getNombre() + " x "
                    + unidades + " unidades.");
            System.out.println("---------------------");
        }

        System.out.println("---------------------");
        System.out.println("Monto Total: $" + monto_total);
    }

    public boolean conincideFecha(LocalDate fecha) {
        return fecha_pedido == fecha;
    }

    public boolean conincideFecha(LocalDate fecha1, LocalDate fecha2) {
        return (fecha_pedido.isAfter(fecha1) && (fecha_pedido.isBefore(fecha2)));
    }

    public Map<Producto, Float> productoMasVendido() { // return Map<Producto, monto recaudado>
        float monto = 0;
        Map<Producto, Float> p = new HashMap<>();

        for (Producto producto : pedido.keySet()) {
            float monto_parcial = producto.getPrecio() * pedido.get(producto); // dinero recaudado por el producto:
                                                                               // precio * unidades
            if (monto_parcial > monto) {
                monto = monto_parcial;
                p.put(producto, monto);
            }
        }
        return p;
    }
}
