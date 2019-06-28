package com.ibm.training.UserDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<User> getUser(String id)	{
		String query = "select * from user_table where user_id=?";
		
		return this.jdbcTemplate.query(query, new Object[] {id}, new UserMap());
	}
	
	public List<User> getAllUsers()	{
		String query = "select * from user_table";
		
		return this.jdbcTemplate.query(query, new UserMap());
	}
	
	public int addUser(User user)	{
		String query = "insert into user_table values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try	{
			return this.jdbcTemplate.update(query, 
				new Object[] {
					user.getUserId(), user.getFirstName(), user.getLastName(), user.getMobileNo(), user.getGovtIdType(),
					user.getGovtIdNo(), user.getDrivingLicenseNo(), user.getUsername(), user.getPassword(), user.getEmail(),
					user.getWallet()
				}
			);
		}
		catch(Exception sqle)	{
			System.out.println("id is already present");
			return 0;
		}
	}
	
	public int removeUser(String id)	{
		String query = "delete from user_table where user_id=?";
		
		try	{
			return this.jdbcTemplate.update(query, new Object[] {id});
		}
		catch(Exception sqle)	{
			System.out.println("id can't be deleted");
			return 0;
		}
	}
	
	public int updateUser(String id, String whatToUpdate, String value)	{
		String query = String.format("update user_table set %s=? where user_id=?", whatToUpdate);
		
		try	{
			return this.jdbcTemplate.update(query, new Object[] {value, id});
		}
		catch(Exception sqle)	{
			System.out.println("Can't update the given parameter");
			return 0;
		}
	}
	
	class UserMap implements RowMapper<User>	{
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new User(rs.getString("user_id"), rs.getString("first_name"), rs.getString("last_name"),
					rs.getString("mobile_num"), rs.getString("govt_id_type"), rs.getString("govt_id_no"), 
					rs.getString("driving_license_no"), rs.getString("user_name"), rs.getString("password"),
					rs.getString("email"), rs.getString("wallet"));
		}
	}
}
