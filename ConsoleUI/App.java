package ConsoleUI;

import Domain.Model.Clientes.Cliente;
import Domain.Model.Pedidos.Pedido;
import Domain.Model.Productos.Producto;


public class App {
    
    public static void main(String[] args) {
        Producto objProducto1 = new Producto("Pepsi 500ml", 22.5,5);
        Producto objProducto2 = new Producto("Hamburguesa simple", 22.5, 10);
        Cliente objCliente = new Cliente("Jose Carlos Gutierrez");


        Pedido objPedido = new Pedido("12");
        objPedido.AgregarItem(objProducto1.Id, 2, objProducto1.PrecioVenta, "Fria");
        objPedido.AgregarItem(objProducto2.Id, 1, objProducto2.PrecioVenta, "");

        objPedido.ConsolidarPedido();
        
        System.out.println("Descripcion:"+objProducto1.Nombre+" Precio:"+objProducto1.PrecioVenta.Value+" Stock:"+objProducto1.StockActual.Value);
        System.out.println("Descripcion:"+objProducto2.Nombre+" Precio:"+objProducto2.PrecioVenta.Value+" Stock:"+objProducto2.StockActual.Value);
        System.out.println("Cliente: "+objCliente.NombreCompleto.Value);
 
        for(int i = 0; i < objPedido.Detalle.size(); i++) {
            System.out.println(objPedido.Detalle.get(i).ProductoId.toString());
        }
        // System.out.println(" "+objPedido.ConsolidarPedido());

 

    }
}
