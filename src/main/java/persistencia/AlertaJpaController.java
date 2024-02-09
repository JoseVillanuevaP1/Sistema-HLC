/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Alerta;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author jose
 */
public class AlertaJpaController implements Serializable {

    public AlertaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public AlertaJpaController() {
        emf = Persistence.createEntityManagerFactory("SendAlertsPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Alerta alerta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alerta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Alerta alerta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alerta = em.merge(alerta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = alerta.getId_alerta();
                if (findAlerta(id) == null) {
                    throw new NonexistentEntityException("The alerta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alerta alerta;
            try {
                alerta = em.getReference(Alerta.class, id);
                alerta.getId_alerta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alerta with id " + id + " no longer exists.", enfe);
            }
            em.remove(alerta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Alerta> findAlertaEntities() {
        return findAlertaEntities(true, -1, -1);
    }

    public List<Alerta> findAlertaEntities(int maxResults, int firstResult) {
        return findAlertaEntities(false, maxResults, firstResult);
    }

    private List<Alerta> findAlertaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alerta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Alerta findAlerta(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Alerta.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlertaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Alerta> rt = cq.from(Alerta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
