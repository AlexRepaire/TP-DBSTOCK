package bdstock.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bdstock.dao.IClientDao;
import persistance.HibernateUtil;
import persistance.entities.Client;

public class ClientImpl implements IClientDao{

	@Override
	public void add(Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(client);
		tx.commit();
	}

	@Override
	public void delete(Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(client);
		tx.commit();
	}

	@Override
	public void update(Client client) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(client);
		tx.commit();
		
	}

	@Override
	public List<Client> findAll() {
		List<Client> list = new ArrayList<Client>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		list = session.createQuery("from Client").list();
		session.close();
		return list;
	}

	@Override
	public Client findById(int idclient) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Client client = session.get(Client.class, idclient);
		session.close();
		return client;
	}

}
