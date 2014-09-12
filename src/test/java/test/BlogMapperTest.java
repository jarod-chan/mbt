package test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.common.H;
import cn.fyg.mb.domain.author.Author;
import cn.fyg.mb.domain.blog.Blog;
import cn.fyg.mb.infrastructure.persistent.BlogMapper;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BlogMapperTest {
	
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
	
	@Test
	public void update(){
		Blog blog= blogMapper.find(1);
		if(blog!=null){
			blog.setTitle("new title");
			Author author=new Author();
			author.setId(10);
			blog.setAuthor(author);
			blogMapper.update(blog);
			H.p(blog);
		}
	}
	
	/*使用关联查询来获得关联属性*/
	@Test
	public void findWithAuthor(){
		Blog blog= blogMapper.findWithAuthor(1);
		H.p(blog);
	}
	
	/*两个一对多，由联合查询获得*/
	@Test
	public void find1_N(){
		List<Blog> find1_N = this.blogMapper.find1_N();
		for (Blog blog : find1_N) {
			H.p(blog);
		}
	}
	
	/*使用分布查询来获得关联对象*/
	@Test
	public void findWithAuthor2(){
		Blog blog= blogMapper.findWithAuthor2(1);
		H.p(blog);
	}
	
	/*使用分布查询来获得对象集合*/
	@Test
	public void all2(){
		List<Blog> blogs = this.blogMapper.all2();
		for (Blog blog : blogs) {
			H.p(blog);
		}
	}
	

}
