package bdstock.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bdstock.dao.ICommandeDao;
import bdstock.dao.InterfaceDao;
import persistance.HibernateUtil;
import persistance.entities.Commande;

public class CommandeImpl implements InterfaceDao<Commande>{

//	@Override
//	public void add(Commande commande) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(commande);
//		tx.commit();
//		
//	}
//
//	@Override
//	public void delete(Commande commande) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(commande);
//		tx.commit();
//	}
//
//	@Override
//	public void update(Commande commande) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(commande);
//		tx.commit();
//	}

	@Override
	public List<Commande> findAll() {
		List<Commande> list = new ArrayList<Commande>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Commande").list();
		session.close();
		return list;
	}

	@Override
	public Commande findById(int idcommande) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Commande commande = session.get(Commande.class, idcommande);
		session.close();
		return commande;
	}

}
