package cn.fyg.mb.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BlogMapper {
	
	Blog find(int id);

	void save(Blog blog);
	
	List<Blog> all();
}
