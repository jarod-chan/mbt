package cn.fyg.mb.domain.user;

import java.util.HashMap;
import java.util.List;


public interface UserRepository {
	
	List<HashMap<String,Object>> getAll();
	
	User find(String key);
	
	User save(User user);

	void delete(String key_);

}
