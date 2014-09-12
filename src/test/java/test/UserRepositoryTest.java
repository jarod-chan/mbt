package test;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.fyg.mb.domain.user.User;
import cn.fyg.mb.domain.user.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserRepositoryTest {
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void test(){
		List<HashMap<String,Object>> list=userRepository.getAll();
		System.out.println(list.size());
		for(HashMap<String,Object> map:list){
			System.out.println(map.get("uuid"));
			System.out.println(map.get("realname"));
		}
	}
	

	
	@Test
	public void testSave(){
		User user=new User();
		user.setKey_("key3");
		user.setRealname("realname3");
		userRepository.save(user);
		
		user=userRepository.find("key3");
		assertNotNull(user);
		
		userRepository.delete("key3");
	}
	

}
