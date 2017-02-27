package com.training;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Resource resource=new ClassPathResource("applicationcontext.xml");
		// BeanFactory factory= new XmlBeanFactory(resource);
		// Student student=(Student)factory.getBean("studentbean");
		// student.showDetails();
		//
		// Employee emp=(Employee)factory.getBean("empbean");
		// emp.showDetails();
		//
/*		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");*/
//		Student student = (Student) context.getBean("studentbean");
//		student.showDetails();
//
//		Employee emp = (Employee) context.getBean("empbean");
//		emp.showDetails();
//		
//		Question q = (Question) context.getBean("question");
//		q.displayaInfo();
		
//		OnlineTest ot = (OnlineTest) context.getBean("onlineTest");
//		ot.display();

//		Employee emp = (Employee) context.getBean("employee");
//		emp.showDetails();
		
/*		HelloWorld hw = (HelloWorld) context.getBean("hworld");
		hw.displayMsg();*/
		
		ConfigurableApplicationContext cac =new ClassPathXmlApplicationContext("applicationcontext.xml");
/*		cac.start();
		HelloWorld hw = (HelloWorld) cac.getBean("hworld");
		hw.displayMsg();
		cac.stop();*/
		
		CustomEventPublisher cep=(CustomEventPublisher)cac.getBean("customEventPublisher");
		cep.publish();
		cep.publish();
	}
}
