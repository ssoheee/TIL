package mini.mapper;

import java.util.ArrayList;

import mini.vo.Orderm;

public interface OrdermMapper {
	
	public void insert(Orderm obj);
	public void delete(int obj);
	public void update(Orderm obj);
	public ArrayList<Orderm> select(String obj);
	public ArrayList<Orderm> selectall();
	

}
