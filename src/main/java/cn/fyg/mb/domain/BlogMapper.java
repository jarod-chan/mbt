package cn.fyg.mb.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BlogMapper {
	
	Blog find(int id);

	void save(Blog blog);
	
	List<Blog> all();
	
	void update(Blog blog);
	
	Blog findWithAuthor(int id);
	
	Blog findWithAuthor2(int id);
	
	List<Blog> all2();
	
	List<Blog> find1_N();
}
