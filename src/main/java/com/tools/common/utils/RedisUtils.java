package com.tools.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lijia
 *
 */
@Component
public class RedisUtils {
	
	
	@Autowired
	private StringRedisTemplate  redisTemplate;
	
	
	
	public String get(String key) {
		return redisTemplate.opsForValue().get(key);
	}
	
	
	public void setString(String key,String data) {
		redisTemplate.opsForValue().set(key, data);
	}
	
	
	
	
	

}
