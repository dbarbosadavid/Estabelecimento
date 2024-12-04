package estabelecimento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
public class PedidoDAO {
    private List<Pedido> pedidos;
    
    public PedidoDAO(){
        this.pedidos = new ArrayList<>();
    }
    public void CriaPedido(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("Pedido criado: "+ pedido);
    }
    public void AttPedido(Cliente cliente, Pedido novo){
        for(int i = 0; i<pedidos.size(); i++){
            if(pedidos.get(i).getCliente().getNome().equalsIgnoreCase(cliente.getNome())){
                pedidos.set(i, novo);
                System.out.println("Pedido atualizado: "+novo);
                return;
            }
        }
    }
    public void DeletaPedido(Cliente cliente){
        pedidos.removeIf(pedido -> pedido.getCliente().getNome().equalsIgnoreCase(cliente.getNome()));
        System.out.println("Pedido do cliente "+cliente.getNome()+" removido");
    }
    
    public Pedido getPedido(int codigo) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCodigo() == codigo) {
                return pedido; 
            }
        }
        System.out.println("Pedido com código " + codigo + " não encontrado.");
        return null; 
    }

    
    public List<Pedido> GetAll(){
        return new ArrayList<>(pedidos);
    }
}
