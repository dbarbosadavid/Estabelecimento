package estabelecimento;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;

public class Pedido {
    int codigo;
    private Cliente cliente;
    private List<Pizza> pizzas;
    private LocalDateTime dataHoraPedido;

    public Pedido(int codigo, Cliente cliente, List<Pizza> pizzas) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.pizzas = pizzas;
        this.dataHoraPedido = LocalDateTime.now() ;
    }

    public int getCodigo(){
        return codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    @Override
    public String toString() {
        return "Pedido feito por: " + cliente.getNome() + "\nData e Hora: " + dataHoraPedido.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) +
               "\nPizzas: " + pizzas;
    }
}

