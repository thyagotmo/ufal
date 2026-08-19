package projeto;

import java.util.Date;

/**
 *
 * @author thyagotmo
 */
public class Mae {
    
    //ATRIBUTOS
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataNascimento;
    
    //Construtor
    public Mae(String nome){
        this.nome = nome;
    }
    
    //GET AND SET
    String getNome(){
        return this.nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Mae{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
    
    
}
