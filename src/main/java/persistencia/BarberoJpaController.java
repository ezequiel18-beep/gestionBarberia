package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;
import logica.Barbero;

public class BarberoJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public BarberoJpaController(EntityManagerFactory emf) {
    
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public BarberoJpaController() {
        emf = Persistence.createEntityManagerFactory("Barberia_PU");
    }


    public void create(Barbero barbero) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(barbero);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Barbero barbero) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(barbero);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Barbero barbero = em.find(Barbero.class, id);
            if (barbero != null) em.remove(barbero);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Barbero findBarbero(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Barbero.class, id);
        } finally {
            em.close();
        }
    }

    public List<Barbero> findBarberoEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT b FROM Barbero b", Barbero.class).getResultList();
        } finally {
            em.close();
        }
    }
}
