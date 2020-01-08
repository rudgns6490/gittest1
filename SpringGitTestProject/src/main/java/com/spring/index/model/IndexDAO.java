package com.spring.index.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//=== #32. DAO 선언 ===
@Repository
public class IndexDAO implements InterIndexDAO {

	// === #33. 의존객체 주입하기(DI: Dependency Injection) ===
	@Autowired   // Type에 따라 알아서 Bean 을 주입해준다.
	private SqlSessionTemplate sqlsession;
}
