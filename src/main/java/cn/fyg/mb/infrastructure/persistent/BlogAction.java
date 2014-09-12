package cn.fyg.mb.infrastructure.persistent;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.fyg.mb.domain.blog.Blog;

@Repository
public interface BlogAction {
	
	
	/**
	 * 一对多查询
	 * @return
	 */
	List<Blog> find1N();

}
