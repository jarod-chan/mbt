package cn.fyg.mb.infrastructure.persistent;

import java.util.List;
import java.util.Map;

import cn.fyg.mb.domain.author.Author;

public interface AuthorMapper {
	
	void save(Author author);
	
	List<Map<String,Object>> all();

}
