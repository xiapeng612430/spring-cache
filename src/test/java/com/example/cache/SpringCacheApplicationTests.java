package com.example.cache;

import com.example.cache.entity.User;
import com.example.cache.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCacheApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	void contextLoads() {
		User user = userMapper.selectById(1);
		System.out.println(user);
	}

}
