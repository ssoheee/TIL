package mini.orderm;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mini.frame3.Biz3;
import mini.frame3.Dao3;
import mini.vo.Orderm;



@Service("ombiz")
public class OrdermBiz implements Biz3<Integer, String, Orderm> {
	
	@Resource(name="omdao")
	Dao3<Integer, String, Orderm> dao1;
	
	@Override
	public void register(Orderm v) throws Exception {
		dao1.insert(v);
		
	}

	@Override
	public void modify(Orderm v) throws Exception {
		dao1.update(v);
		
	}

	@Override
	public void remove(Integer i) throws Exception {
		dao1.delete(i);
		
	}

	@Override
	public ArrayList<Orderm> get(String s) throws Exception {
		
		return dao1.select(s);
	}

	@Override
	public ArrayList<Orderm> get() throws Exception {
	
		return dao1.select();
	}

}
