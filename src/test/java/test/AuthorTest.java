package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.common.H;

import cn.fyg.mb.domain.Author;
import cn.fyg.mb.domain.AuthorMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AuthorTest {
	
	@Autowired
	AuthorMapper authorMapper;
	
	@Test
	public void save(){
		Author author=new Author();
		author.setName("张三");
		this.authorMapper.save(author);
		H.p(author);
	}

}
