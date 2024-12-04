package estabelecimento;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class Estabelecimento {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args){
        Sabor mussarela = new Sabor("Mussarela", "Molho de tomate, Queijo Mussarela, Tomate e Azeitona");
        Sabor calabresa = new Sabor("Calabresa", "Molho de tomate, Calabresa, Cebola e Azeitona");
        Sabor portuguesa = new Sabor("Portuguesa", "Molho de tomate, Presunto, Mussarela, Tomate, Ovo, Cebola, Pimentao e Azeitona");
        
        // Criando alguns sabores de pizza
        Pizza pizza1 = new Pizza(mussarela, 30.0);
        Pizza pizza2 = new Pizza(calabresa, 35.0);
        Pizza pizza3 = new Pizza(portuguesa, 40.0);

        // Criando um cliente
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.CriaCliente(new Cliente(1, "Joao Silva", "Rua das Flores, 123", "1234-5678"));
        clienteDAO.CriaCliente(new Cliente(2, "Amanda", "Rua 1", "122727"));
        // Criando um pedido
        PedidoDAO pedidoDAO = new PedidoDAO();
        pedidoDAO.CriaPedido(new Pedido(1, clienteDAO.getCliente(1), Arrays.asList(pizza1, pizza2)));
        pedidoDAO.CriaPedido(new Pedido(2, clienteDAO.getCliente(2), Arrays.asList(pizza3, pizza2, pizza1)));
        
        
        // Criando uma pizzaria e adicionando o pedido
        Pizzaria pizzaria = new Pizzaria(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        pizzaria.adicionarPedido(pedidoDAO.getPedido(1));
        pizzaria.adicionarPedido(pedidoDAO.getPedido(2));
        Pizzaria pizzaria2 = new Pizzaria(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        pizzaria2.adicionarPedido(pedidoDAO.getPedido(2));
        pizzaria.getPizzaria("03/12/2024");

        
        // Exibindo informações
        clienteDAO.GetAll();
        System.out.println(pizzaria);
        pedidoDAO.getPedido(1);
        System.out.println(pizzaria2);
    }
}
