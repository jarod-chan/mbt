package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.fyg.mb.domain.author.AuthorRepository;

import test.common.H;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AuthorRepositoryTest {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Test
	public void all(){
		List<Map<String,Object>> all = this.authorRepository.all();
		for (Map<String,Object> map : all) {
			H.ptl(map.get("id"));
			H.ptl(map.get("name"));
		}
	}

}
