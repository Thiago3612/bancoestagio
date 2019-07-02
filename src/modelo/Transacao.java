package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "transacao_seq", sequenceName = "transacao_seq",
        initialValue = 1, allocationSize = 1)
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "transacao_seq")
    private int id;
    private String conta;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data")
    private Date dataHora;
    private String tipo;
    @ManyToOne
    private Correntista correntista;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    
}
