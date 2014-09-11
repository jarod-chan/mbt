package cn.fyg.mb.domain;

import java.util.List;
import java.util.Map;

public interface AuthorMapper {
	
	void save(Author author);
	
	List<Map<String,Object>> all();

}
