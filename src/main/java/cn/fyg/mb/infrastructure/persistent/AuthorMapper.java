package cn.fyg.mb.infrastructure.persistent;

import java.util.List;
import java.util.Map;

import cn.fyg.mb.domain.author.Author;
import cn.fyg.mb.infrastructure.persistent.tag.Mapper;

@Mapper
public interface AuthorMapper {
	
	void save(Author author);
	
	List<Map<String,Object>> all();

}
