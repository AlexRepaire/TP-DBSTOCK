package bdstock.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import bdstock.dao.InterfaceDao;
import persistance.HibernateUtil;
import persistance.entities.Categorie;

public class CategorieImpl implements InterfaceDao<Categorie>{

//	@Override
//	public void add(Categorie categorie) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(categorie);
//		tx.commit();
//	}
//
//	@Override
//	public void delete(Categorie categorie) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.delete(categorie);
//		tx.commit();
//	}
//
//	@Override
//	public void update(Categorie categorie) {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.update(categorie);
//		tx.commit();
//	}

	@Override
	public List<Categorie> findAll() {
		List<Categorie> list = new ArrayList<Categorie>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Categorie").list();
		session.close();
		return list;
	}

	@Override
	public Categorie findById(int idCategorie) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Categorie categorie = session.get(Categorie.class, idCategorie);
		session.close();
		return categorie;
	}

}
