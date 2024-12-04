/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estabelecimento;

/**
 *
 * @author Usuario
 */
public class Sabor {
    private String sabor;
    private String descricao;

    public Sabor(){}
    
    public Sabor(String sabor, String descricao){
        this.sabor = sabor;
        this.descricao = descricao;
    }
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return "\nSabor: " + sabor + "\nDescricao: " + descricao + "\n";
    }
}
