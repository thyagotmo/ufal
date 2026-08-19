package projeto;

import java.util.Date;
/**
 *
 * @author thyagotmo
 */
public class Bebe {

    private String nome;
    private Date dataNascimento;
    private float peso;
    private float altura;
    private Mae mae;
    private Medico medico;

    public Bebe(String nome, Date dataNascimento, float peso, float altura, Mae mae, Medico medico) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
        this.mae = mae;
        this.medico = medico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Mae getMae() {
        return mae;
    }

    public void setMae(Mae mae) {
        this.mae = mae;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Bebe{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", peso=" + peso + ", altura=" + altura + ", mae=" + mae + ", medico=" + medico + '}';
    }
    
    
    
    
    
    

    
}
