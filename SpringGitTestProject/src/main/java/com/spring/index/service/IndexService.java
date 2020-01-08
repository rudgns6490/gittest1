package com.spring.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.index.model.InterIndexDAO;

//=== #31. Service 선언 ===
@Service 
public class IndexService implements InterIndexService {

	// === #34. 의존객체 주입하기(DI: Dependency Injection) ===
		@Autowired   // Type에 따라 알아서 Bean 을 주입해준다.
		private InterIndexDAO dao;

}
