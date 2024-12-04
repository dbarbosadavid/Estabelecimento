package estabelecimento;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pizzaria {
    private List<Pedido> pedidos;
    private String diaFunc;
    private String diaMostrar;
    
    public Pizzaria(String diaFunc) {
        this.pedidos = new ArrayList<>();
        this.diaFunc = diaFunc;
        this.diaMostrar = diaFunc.split("-")[2] + "/" +
                          diaFunc.split("-")[1] + "/" +
                          diaFunc.split("-")[0];
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getDiaFunc() {
        return diaMostrar;
    }
    
    public String getPizzaria(String diaFunc) {
        if (getDiaFunc().equals(diaMostrar)) {
            return "Pizzaria aberta no dia: " + diaMostrar + ", Total de pedidos: " + pedidos.size(); 
        }
        return null;
    }
    

    @Override
    public String toString() {
        return "Pizzaria aberta no dia: " + diaMostrar + ", Total de pedidos: " + pedidos.size();
    }
}
