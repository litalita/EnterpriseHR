package com.wls.test;

import java.util.Date;
import java.util.List;

import com.wls.entity.Move;
import com.wls.service.MoveService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MoveTest {

	@SuppressWarnings("resource")
	@Test
	public void test(){
		String xmlPath="spring/spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		MoveService service = (MoveService) context.getBean("changeService");
		Move move = new Move();
		move.setEmployeeNumber(123);
		move.setAfter(123);
		move.setBefore(123);
		move.setTime(new Date());
		service.insert(move);
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test2(){
		String xmlPath="spring/spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		MoveService service = (MoveService) context.getBean("moveService");
		List<Move> list = service.selectList();
		for(Move move : list){
			System.out.println(move.toString());
		}
	}
}
