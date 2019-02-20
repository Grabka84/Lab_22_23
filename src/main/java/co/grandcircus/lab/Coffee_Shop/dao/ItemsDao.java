package co.grandcircus.lab.Coffee_Shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.lab.Coffee_Shop.entity.Items;

@Repository
public class ItemsDao {

	@Autowired
	private JdbcTemplate jdbc; // always goes at top of DAO

	public List<Items> findAll() {
		
		String sql= "SELECT * FROM items"; // no variable ? in the query, so no parameters in the return
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Items.class)); // returns a list of rooms
	}
	
	public Items findById(Long id) {
		String sql = "SELECT * FROM items WHERE id = ?"; // one variable ? in the query, so 1 parameter in the return
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Items.class), id); // returns a single row
	}
	
	public void update(Items items) {
		// Use .update for SQL INSERT, UPDATE, and DELETE
		// All the parameters after the first specify values to fill in the ?s in the SQL.
		String sqlUpdate = "UPDATE items SET name=?, description=?, quantity=?, price=? WHERE id=?"; // standard sql update, 4 variables
		jdbc.update(sqlUpdate, items.getName(), items.getDescription(), items.getQuantity(), items.getPrice(), items.getId());
	}
	
	public void create(Items items) {
		String sqlCreate = "INSERT INTO items (name, description, quantity, price) VALUES (?, ?, ?, ?)";
		jdbc.update(sqlCreate, items.getName(), items.getDescription(), items.getQuantity(), items.getPrice());
	}
	
	
}
