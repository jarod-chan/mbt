package cn.fyg.mb.infrastructure.persistent;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.fyg.mb.domain.user.User;
import cn.fyg.mb.domain.user.UserRepository;

@Component
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User save(User user) {
		this.userMapper.save(user);
		return userMapper.find(user.getKey_());
	}

	@Override
	public void delete(String key_) {
		this.userMapper.delete(key_);
	}

	@Override
	public List<HashMap<String, Object>> getAll() {
		return this.userMapper.getAll();
	}

	@Override
	public User find(String key) {
		return this.userMapper.find(key);
	}

}
