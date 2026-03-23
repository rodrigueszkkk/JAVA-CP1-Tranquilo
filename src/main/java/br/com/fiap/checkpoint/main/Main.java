package br.com.fiap.checkpoint.main;

import br.com.fiap.checkpoint.dao.FuncionarioDao;
import br.com.fiap.checkpoint.model.FuncionarioSenior;
import br.com.fiap.checkpoint.model.Funcionario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle-fiap");
        EntityManager em = emf.createEntityManager();

        FuncionarioDao dao = new FuncionarioDao(em);

        System.out.println("--- INICIANDO TESTES DE CRUD ---");

        System.out.println("\n[1] TESTANDO CREATE...");
        FuncionarioSenior senior = new FuncionarioSenior();
        senior.setNome("Kaiky");
        senior.setHorasTrabalhadas(160);
        senior.setValorHora(50.0);

        dao.cadastrar(senior);
        System.out.println("Funcionário salvo com sucesso! ID: " + senior.getId());

        System.out.println("\n[2] TESTANDO READ...");
        List<Funcionario> lista = dao.listar();
        for (Funcionario f : lista) {
            f.imprimirInformacao();
        }

        System.out.println("\n[3] TESTANDO UPDATE...");
        senior.setHorasTrabalhadas(180);
        dao.atualizar(senior);
        System.out.println("Horas atualizadas no banco!");

        System.out.println("\n[4] TESTANDO DELETE...");
        dao.remover(senior.getId());
        System.out.println("Funcionário removido com sucesso!");

        // 3. Fechar conexões
        em.close();
        emf.close();

        System.out.println("\n--- FIM DOS TESTES ---");
    }
}