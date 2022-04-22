package ConsoleUI;

import Domain.Model.Clientes.Cliente;
import Domain.Model.Pedidos.Pedido;
import Domain.Model.Productos.Producto;


public class App {
    
    public static void main(String[] args) {
        Producto objProducto1 = new Producto("coca", 22.5,5);
        Producto objProducto2 = new Producto("coca", 22.5, 10);
        Cliente objCliente = new Cliente("Jose Carlos Gutierrez");


        Pedido objPedido = new Pedido("12");
        objPedido.AgregarItem(objProducto1.Id, 2, objProducto1.PrecioVenta, "Fria");
        objPedido.AgregarItem(objProducto2.Id, 1, objProducto2.PrecioVenta, "");

        objPedido.ConsolidarPedido();
        
        System.out.println(objPedido);
        System.out.println(objProducto2);
    }
}
