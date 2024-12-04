package estabelecimento;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * AUTORES: IGOR MATEUS TELES e DAVID BARBOSA ARAUJO
 */
public class ClienteDAO {
    private List<Cliente> clientes;
    
    public ClienteDAO(){
        this.clientes = new ArrayList<>();
    }
    public void CriaCliente(Cliente cliente){
        clientes.add(cliente);
        System.out.println("Cliente criado: "+ cliente);
    }
    public void AttCliente(String nome, Cliente novo){
        for(int i = 0; i<clientes.size(); i++){
            if(clientes.get(i).getNome().equalsIgnoreCase(nome)){
                clientes.set(i, novo);
                System.out.println("Cliente atualizado: "+novo);
                return;
            }
        }
        System.out.println("Cliente "+nome+" nao encontrado");
    }
    public void DeletaCliente(String nome){
        clientes.removeIf(cliente -> cliente.getNome().equalsIgnoreCase(nome));
        System.out.println("Cliente "+nome+" removido");
    }
    
    public Cliente getCliente(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente; 
            }
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
        return null; 
    }

    public List<Cliente> GetAll(){
        return new ArrayList<>(clientes);
    }
}
