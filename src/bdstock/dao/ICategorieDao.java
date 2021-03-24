package bdstock.dao;

import java.util.List;

import persistance.entities.Categorie;

public interface ICategorieDao {

	void add(Categorie categorie);
	
	void delete (Categorie categorie);
	
	void update (Categorie categorie);
	
	List<Categorie> findAll();
	
	Categorie findById(int idCategorie);
}
