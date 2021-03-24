package bdstock.dao;

import java.util.List;

import persistance.entities.Produit;

public interface IProduitDao{

	void add(Produit produit);
	
	void delete (Produit produit);
	
	void update (Produit produit);
	
	List<Produit> findAll();
	
	Produit findById(int idproduit);
}
