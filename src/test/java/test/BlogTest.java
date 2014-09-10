package test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.common.H;
import cn.fyg.mb.domain.Blog;
import cn.fyg.mb.domain.BlogMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogTest {
	
	@Autowired
	BlogMapper blogMapper;
	
	@Test
	public void find(){
		Blog blog = blogMapper.find(1);
		H.p(blog);
	}
	
	@Test
	public void save(){
		Blog blog =new Blog();
		blog.setTitle("标题");
		blog.setContext("内容");
		blog.setCreate_at(new Date());
		blogMapper.save(blog);
		H.p(blog);
	}
	
	@Test
	public void all(){
		List<Blog> all = blogMapper.all();
		for (Blog blog : all) {
			H.p(blog);
		}
	}

}
