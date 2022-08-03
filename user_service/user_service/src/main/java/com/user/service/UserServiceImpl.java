package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	
	List<User> list =List.of(
			new User(1311L,"Durgesh Tiwari","2345678")
		,	new User(1312L,"Aniket Tiwari","99999999")
		,	new User(1314L,"Ravi Tiwari","3333333")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
		
	}

}
  