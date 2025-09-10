package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;
import logica.Turno;

public class TurnoJpaController implements Serializable {

   private EntityManagerFactory emf = null;

    public TurnoJpaController(EntityManagerFactory emf) {
    
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public TurnoJpaController( ) {
        emf = Persistence.createEntityManagerFactory("Barberia_PU");
    }

    // ---------------- CRUD ----------------

    // Crear turno
    public void create(Turno turno) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(turno);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Editar turno
    public void edit(Turno turno) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(turno);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Eliminar turno por ID
    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Turno turno = em.find(Turno.class, id);
            if (turno != null) {
                em.remove(turno);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Buscar turno por ID
        public Turno findTurno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Turno.class, id);
        } finally {
            em.close();
        }
    }

    // Listar todos los turnos
    public List<Turno> findTurnoEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT t FROM Turno t", Turno.class).getResultList();
        } finally {
            em.close();
        }
    }
}