/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.List;
import logica.Secretario;

/**
 *
 * @author ezego
 */
public class SecretarioJpaController {
       private EntityManagerFactory emf = null;

    public SecretarioJpaController(EntityManagerFactory emf) {
    
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public SecretarioJpaController( ) {
        emf = Persistence.createEntityManagerFactory("Barberia_PU");
    }

    
    
    // Crear secretario
    public void create(Secretario secretario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(secretario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Editar secretario
    public void edit(Secretario secretario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(secretario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Eliminar secretario por ID
    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Secretario secretario = em.find(Secretario.class, id);
            if (secretario != null) {
                em.remove(secretario);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Buscar secretario por ID
    public Secretario findSecretario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Secretario.class, id);
        } finally {
            em.close();
        }
    }

    // Listar todos los secretarios
    public List<Secretario> findSecretarioEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT s FROM Secretario s", Secretario.class).getResultList();
        } finally {
            em.close();
        }
    }
}
    

