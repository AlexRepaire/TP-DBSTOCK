package bdstock.dao;

import java.util.List;

import persistance.entities.Commande;

public interface ICommandeDao{

	void add(Commande commande);
	
	void delete (Commande commande);
	
	void update (Commande commande);
	
	List<Commande> findAll();
	
	Commande findById(int idcommande);
}
