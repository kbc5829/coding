package com.bns.thumbsup.repository;

import org.springframework.data.repository.CrudRepository;

import com.bns.thumbsup.vo.User;

//하나의 테이블이라고 생각하면 편함
//CrudRepository 인터페이스를 상속받아
//제네릭 타입 중 첫번째는 VO(테이블 컬럼이 매핑되어있는 클래스),
//두번째는 User테이블의 기본키 타입을 넣는다.

public interface UserRepository extends CrudRepository<User, Integer>{
	
}