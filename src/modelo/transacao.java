package modelo;

import java.sql.Date;
import java.sql.Time;
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
public class transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "transacao_seq")
    private int id;
    @ManyToOne
    private String conta;
    @Temporal(TemporalType.DATE)
    private java.sql.Date data;
    @Temporal(TemporalType.TIME)
    private java.sql.Time hora;
    private String tipo;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
