package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.common.H;
import cn.fyg.mb.domain.author.Author;
import cn.fyg.mb.infrastructure.persistent.AuthorMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AuthorMapperTest {
	
	@Autowired
	AuthorMapper authorMapper;
	
	@Test
	public void save(){
		Author author=new Author();
		author.setName("张三");
		this.authorMapper.save(author);
		H.p(author);
	}
	
	@Test
	public void all(){
		List<Map<String,Object>> all = this.authorMapper.all();
		for (Map<String,Object> map : all) {
			H.ptl(map.get("id"));
			H.ptl(map.get("name"));
		}
	}

}
