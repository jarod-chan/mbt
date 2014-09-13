package cn.fyg.mb.domain.author;

import java.util.List;
import java.util.Map;

import cn.fyg.mb.infrastructure.persistent.tag.Mapper;

@Mapper
public interface AuthorRepository {
	
	List<Map<String,Object>> all();
	
}
