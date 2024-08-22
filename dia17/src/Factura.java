

import java.until.ArrayList;
import java.until.List;
import java.until.funtion.Funtion;
public class Factura {
    private Cliente Cliente ;
    private List<Producto> productos = new ArrayList<>();
    private double total;

    public Factura (Cliente cliente){
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto){
        productos.add (producto);
        total += producto.getPrecio();
    }

    public double calcularTotal(Funcion<Double,Double>descuento) {
        return descuento.apply(total);
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
