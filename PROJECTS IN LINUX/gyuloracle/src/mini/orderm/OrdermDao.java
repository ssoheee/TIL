package mini.orderm;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mini.frame3.Dao3;
import mini.mapper.OrdermMapper;
import mini.vo.Orderm;


@Repository("omdao")
public class OrdermDao implements Dao3<Integer, String, Orderm> {

	@Autowired
	OrdermMapper omm;
	
	@Override
	public void insert(Orderm v) throws Exception {
		omm.insert(v);
		
	}

	@Override
	public void update(Orderm v) throws Exception {
		omm.update(v);
		
	}

	@Override
	public void delete(Integer i) throws Exception {
		omm.delete(i);
		
	}

	@Override
	public ArrayList<Orderm> select(String s) throws Exception {
	
		return omm.select(s);
	}

	@Override
	public ArrayList<Orderm> select() throws Exception {
		
		return omm.selectall();
	}

	
}
