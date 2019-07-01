package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import modelo.Correntista;
import static modelo.Correntista_.conta;


public class bancoDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bancoestagioPU");
        
        return factory.createEntityManager();
    }
    
    //ver saldo - apenas o valor atualizado em R$
    public Correntista verSaldo(Correntista vSaldo){
        EntityManager em = getEM();
        
        try{
            em.getTransaction().begin();
            em.find(Correntista.class, conta);
            System.out.println("Saldo: R$"+vSaldo.getSaldo());
        } finally{
            em.close();
        }
        
        
        return vSaldo;
    }
    
    //saque
    public float saque(float vSaque){
        EntityManager em = getEM();
        
        try{
            em.getTransaction().begin();
            em.merge(vSaque);
            em.getTransaction().commit();
        } finally{
            em.close();
        }

        return vSaque;
        
    }
            
}
