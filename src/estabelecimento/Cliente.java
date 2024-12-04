package estabelecimento;

/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(int codigo, String nome, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public int getCodigo(){
       return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: "+ nome + ", Endereco: " + endereco + ", Telefone: " + telefone;
    }
}

