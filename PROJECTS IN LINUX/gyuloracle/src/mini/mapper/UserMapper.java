package mini.mapper;

import java.util.ArrayList;

import mini.vo.User;

public interface UserMapper {
	public void insert(User obj);
	public void delete(String obj);
	public void update(User obj);
	public User select(String obj);
	public ArrayList<User> selectall();
}



