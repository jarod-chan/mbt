package cn.fyg.mb.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface BlogAction {
	
	
	/**
	 * 一对多查询
	 * @return
	 */
	List<Blog> find1N();

}
