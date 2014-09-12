package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.common.H;

import cn.fyg.mb.domain.Blog;
import cn.fyg.mb.domain.BlogAction;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogActionTest {
	@Autowired
	BlogAction blogAction;
	
	
	/**
	 * 一对多关系，分布查询
	 */
	@Test
	public void find1N(){
		List<Blog> blogs=this.blogAction.find1N();
		for (Blog blog : blogs) {
			H.p(blog);
		}
	}
}
