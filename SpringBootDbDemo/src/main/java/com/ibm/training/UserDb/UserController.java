package com.ibm.training.UserDb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;

	@RequestMapping(method=RequestMethod.GET, value="/user/{id}")
	public List<User> getUser(@PathVariable("id") String id)	{
		return userDao.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/users")
	public List<User> getAllUsers()	{
		return userDao.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/user/add")
	public int addUser(@RequestBody User user)	{
		return userDao.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/user/delete/{id}")
	public int removeUser(@PathVariable("id") String id)	{
		return userDao.removeUser(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/user/update/fname/{id}")
	public int updateUserFirstName(@PathVariable("id") String id, @RequestBody User user){
		return userDao.updateUser(id, "first_name", user.getFirstName());
	}
}
