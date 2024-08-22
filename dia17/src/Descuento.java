public class Descuento {
    public static  Function<Double, Double> descuentoPorTipoDeCliente(Cliente cliente){
        if(Cliente.getTipo().equals("VIP")){
            return total -> total * 0.9; // 10% de descuento para cliente VIP
        } else {
            return total -> total ;
        }
    }
}
