
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;
import logica.Persona;


public class PersonaJpaController {


    private EntityManagerFactory emf = null;

    public PersonaJpaController(EntityManagerFactory emf) {
    
        this.emf = emf;
    }
    
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public PersonaJpaController( ) {
        emf = Persistence.createEntityManagerFactory("Barberia_PU");
    }


    // ---------------- CRUD ----------------

    // Crear persona
    public void create(Persona persona) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Editar persona
    public void edit(Persona persona) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Eliminar persona por ID
    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Persona persona = em.find(Persona.class, id);
            if (persona != null) {
                em.remove(persona);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Buscar persona por ID
    public Persona findPersona(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    // Listar todas las personas
    public List<Persona> findPersonaEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
        } finally {
            em.close();
        }
    }
}
    
