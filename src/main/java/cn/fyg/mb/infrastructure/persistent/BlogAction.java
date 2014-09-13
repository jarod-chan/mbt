package cn.fyg.mb.infrastructure.persistent;

import java.util.List;

import cn.fyg.mb.domain.blog.Blog;
import cn.fyg.mb.infrastructure.persistent.tag.Mapper;

@Mapper
public interface BlogAction {
	
	
	/**
	 * 一对多查询
	 * @return
	 */
	List<Blog> find1N();

}
