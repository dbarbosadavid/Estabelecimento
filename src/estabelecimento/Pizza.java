package estabelecimento;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
public class Pizza {
    private Sabor sabor = new Sabor();
    private double preco;

    public Pizza(Sabor s, double preco){
        this.sabor = s;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor.toString();
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return sabor + "Preco: R$" + preco + "\n";
    }
}

