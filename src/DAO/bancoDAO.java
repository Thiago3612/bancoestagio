package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.correntista;
import static modelo.correntista_.conta;

public class bancoDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bancoestagioPU");
        
        return factory.createEntityManager();
    }
    
    //ver saldo - apenas o valor atualizado em R$
    public correntista verSaldo(correntista saldo){
        EntityManager em = getEM();
        
        try{
        em.getTransaction().begin();
        em.find(correntista.class, conta.getId());
        }finally{
            em.close();
        }
        return saldo;
    }
            
            
}
