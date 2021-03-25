package bdstock.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.HibernateUtil;


public interface InterfaceDao <T>{

	default void add(T valeur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(valeur);
		tx.commit();
	};
	
	default void delete (T valeur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(valeur);
		tx.commit();
	};
	
	default void update (T valeur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(valeur);
		tx.commit();
	};
	
	List<T> findAll();
	
	T findById(int id);
}
