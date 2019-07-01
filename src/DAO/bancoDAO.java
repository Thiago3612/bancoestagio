package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import modelo.correntista;
import static modelo.correntista_.conta;

public class bancoDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bancoestagioPU");
        
        return factory.createEntityManager();
    }
    
    //ver saldo - apenas o valor atualizado em R$
    public correntista verSaldo(correntista vSaldo){
        EntityManager em = getEM();
        
        try{
            em.getTransaction().begin();
            em.find(correntista.class,conta);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
        System.out.println("Saldo:"+vSaldo.getSaldo());
        
        return vSaldo;
    }
    
    //saque
    public correntista saque(correntista vSaque){
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
