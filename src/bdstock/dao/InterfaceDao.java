package bdstock.dao;

import java.util.List;


public interface InterfaceDao {

	void add();
	
	void delete ();
	
	void update ();
	
	<Object> List<Object> findAll();
	
	Object findById();
}
