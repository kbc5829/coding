package com.bns.thumbsup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bns.thumbsup.repository.UserRepository;
import com.bns.thumbsup.vo.User;

//컨트롤러에서 받은 데이터로 쿼리를 수행하여, 나온 결과를 다시 컨트롤러에 전달
//UserRepository 객체를 주입받으며,
//sava()는 Insert쿼리를 수행하고, findAll()은 select쿼리를 수행한다.

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void userInsert(User user) {
		userRepository.save(user);
	}
	
	public Iterable<User> userSelect(){
		return userRepository.findAll();
	}
	// 회원가입 서비스
	public int userReg_service(UserVO userVO) {

		int resultCnt = 0;

		userDao = userSqlSessin.getMapper(UserDaoInterface.class);
		try {
			resultCnt = userDao.regUser(userVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
