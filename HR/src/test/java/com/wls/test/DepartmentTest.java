package com.wls.test;

import com.wls.entity.Department;
import com.wls.service.DepartmentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepartmentTest {

	@SuppressWarnings("resource")
	@Test
	public void selectById(){
		String xmlPath="spring/spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		DepartmentService service = (DepartmentService) context.getBean("departmentService");
		Department department = service.selectByNumber(2001);
		System.out.println(department.toString());
	}
}
