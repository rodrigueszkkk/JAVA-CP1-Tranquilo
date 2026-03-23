package br.com.fiap.checkpoint.reflection;

import br.com.fiap.checkpoint.annotation.Descricao;
import br.com.fiap.checkpoint.annotation.Tabela;

public class GeradorSQL {

    public static void gerarSelect(Object obj) {
        Class<?> clazz = obj.getClass();

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            String nomeTabela = tabela.nome();

            System.out.println("SELECT * FROM " + nomeTabela);
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não possui a anotação @Tabela.");
        }

        if (clazz.isAnnotationPresent(Descricao.class)) {
            Descricao descricao = clazz.getAnnotation(Descricao.class);
            System.out.println("-- Descrição da Tabela: " + descricao.descricao());
        }
    }
}