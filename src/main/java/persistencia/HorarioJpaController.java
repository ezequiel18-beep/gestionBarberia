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
import logica.Barbero;
import logica.Horario;

/**
 *
 * @author ezego
 */
public class HorarioJpaController {
        private EntityManagerFactory emf = null;

    public HorarioJpaController(EntityManagerFactory emf) {
    
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public HorarioJpaController( ) {
        emf = Persistence.createEntityManagerFactory("Barberia_PU");
    }


    public void create(Horario horario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(horario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Horario horario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(horario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Horario horario = em.find(Horario.class, id);
            if (horario != null) em.remove(horario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Horario findHorario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Horario.class, id);
        } finally {
            em.close();
        }
    }

    public List<Horario> findHorarioEntities() {
        EntityManager em = getEntityManager();
        try {
            return em.createQuery("SELECT b FROM Horario b", Horario.class).getResultList();
        } finally {
            em.close();
        }
    }
}


