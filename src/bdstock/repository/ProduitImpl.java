package bdstock.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import bdstock.dao.InterfaceDao;
import persistance.HibernateUtil;
import persistance.entities.Produit;

public class ProduitImpl implements InterfaceDao<Produit>{

//	@Override
//	public void add(Produit produit) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(produit);
//		tx.commit();
//	}
//
//	@Override
//	public void delete(Produit produit) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(produit);
//		tx.commit();
//		
//	}
//
//	@Override
//	public void update(Produit produit) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(produit);
//		tx.commit();
//		
//	}

	@Override
	public List<Produit> findAll() {
		List<Produit> list = new ArrayList<Produit>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Produit").list();
		session.close();
		return list;
	}

	@Override
	public Produit findById(int idproduit) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Produit produit = session.get(Produit.class, idproduit);
		session.close();
		return produit;
	}

}
