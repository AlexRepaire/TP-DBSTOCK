package bdstock;

import java.math.BigDecimal;
import java.util.HashSet;

import bdstock.repository.CategorieImpl;
import bdstock.repository.ClientImpl;
import bdstock.repository.CommandeImpl;
import persistance.entities.Categorie;
import persistance.entities.Client;
import persistance.entities.Commande;
import persistance.entities.CommandeId;
import persistance.entities.Produit;

public class Main {

	public static void main(String[] args) {
		Categorie categorie = new Categorie((short) 1,"10ff01","Alimentation", new HashSet<Produit>());
		Produit produit = new Produit((short)1, categorie, "eau", new BigDecimal(5.2), (short) 4, "bouteille", "cristaline", "bouteille eau", new HashSet<Commande>());
		Client client = new Client(new BigDecimal(1), null, null, "Dumas", "Jean", null, null, null, null, null, null, null, "00.00.00.00.00", null, null, "test@test.com", new HashSet<Commande>());
		CommandeId commandeId = new CommandeId(produit.getIdproduit(), client.getIdclient());
		Commande commande = new Commande(commandeId, client, produit);

	}

}
