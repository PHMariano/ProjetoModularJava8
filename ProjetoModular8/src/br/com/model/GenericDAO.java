/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

import br.com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Paulo H
 * @param <E>
 */
public class GenericDAO<E> {

    private Session sessao;

    public GenericDAO() {

        sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void insere(E e) {

        try {
            sessao.beginTransaction();
            sessao.save(e);
            sessao.getTransaction().commit();

        } catch (HibernateException ex) {
            System.out.println("Erro ao inserir");
            sessao.close();
        }
    }

    public List<E> selecionaTodos(E e) {

        List<E> lista = new ArrayList<>();

        sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(e.getClass());

        lista = criteria.list();

        return lista;
    }

}
