package modelo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class correntista {
    @Id
    private String conta;
    private String senha;
    private String nome;
    private String perfil;
    private float saldo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conta")
    @JoinColumn(name = "conta")
    private List<transacao> transacao;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public List<transacao> getTransacao() {
        return transacao;
    }

    public void setTransacao(List<transacao> transacao) {
        this.transacao = transacao;
    }


}
