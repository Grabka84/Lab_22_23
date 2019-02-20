package co.grandcircus.lab.Coffee_Shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.lab.Coffee_Shop.entity.Users;

@Repository
public class UsersDao {

	@Autowired
	private JdbcTemplate jdbc; // always goes at top of DAO

	public List<Users> findAll() {
	
		String sql= "SELECT * FROM users"; // no variable ? in the query, so no parameters in the return
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Users.class)); // returns a list of rooms
	}
	
	public Users findById(Long id) {
		String sql = "SELECT * FROM users WHERE id = ?"; // one variable ? in the query, so 1 parameter in the return
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Users.class), id); // returns a single row
	}
	
	public void update(Users users) {
		// Use .update for SQL INSERT, UPDATE, and DELETE
		String sqlUpdate = "UPDATE users SET firstName=?, lastName=?, phoneNum=?, userEmail=?, userYear=?, gender=? WHERE id=?"; // standard sql update
		jdbc.update(sqlUpdate, users.getFirstName(), users.getLastName(), users.getPhoneNum(), users.getUserEmail(), users.getUserYear(), users.getGender(), users.getId());
	}
	
	public void create(Users users) {
		String sqlCreate = "INSERT INTO users (firstName, lastName, phoneNum, userEmail, userYear, gender) VALUES (?, ?, ?, ?, ?, ?)";
		jdbc.update(sqlCreate, users.getFirstName(), users.getLastName(), users.getPhoneNum(), users.getUserEmail(), users.getUserYear(), users.getGender());
	}
	
	
}
