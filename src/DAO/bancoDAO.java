package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Correntista;

public class bancoDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bancoestagioPU");
        
        return factory.createEntityManager();
    }
    
    public Correntista Consulta(Correntista Conta){
        EntityManager em = getEM();
        Correntista c = null;
        try{
            em.getTransaction().begin();
            c = em.find(Correntista.class, Conta);
        } finally{
            em.close();
        }
        return c;
    }
    
    
}