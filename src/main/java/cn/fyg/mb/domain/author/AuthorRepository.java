package cn.fyg.mb.domain.author;

import java.util.List;
import java.util.Map;

public interface AuthorRepository {
	
	List<Map<String,Object>> all();
	
}
