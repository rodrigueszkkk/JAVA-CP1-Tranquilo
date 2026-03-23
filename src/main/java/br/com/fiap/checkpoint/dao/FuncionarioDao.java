package br.com.fiap.checkpoint.dao;

import br.com.fiap.checkpoint.model.Funcionario;
import jakarta.persistence.EntityManager;
import java.util.List;

public class FuncionarioDao {

    private EntityManager em;

    public FuncionarioDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }

    public List<Funcionario> listar() {
        return em.createQuery("FROM Funcionario", Funcionario.class).getResultList();
    }

    public void atualizar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();
    }

    public void remover(Long id) {
        Funcionario f = em.find(Funcionario.class, id);
        if (f != null) {
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        }
    }
}