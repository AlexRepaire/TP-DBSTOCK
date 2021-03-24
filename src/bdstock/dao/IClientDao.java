package bdstock.dao;

import java.util.List;

import persistance.entities.Client;

public interface IClientDao {

	void add(Client client);
	
	void delete (Client client);
	
	void update (Client client);
	
	List<Client> findAll();
	
	Client findById(int idclient);
}
