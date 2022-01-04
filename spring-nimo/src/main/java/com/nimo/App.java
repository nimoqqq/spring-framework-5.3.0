package com.nimo;

import com.nimo.service.MessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @ClassName: App
 * @description:
 * @author: chuf
 * @create: 2022-01-03 21:58
 **/
public class App {
	public static void main(String[] args) {
		final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dependency-lookup-context.xml");
		System.out.println("context 启动成功");
		final MessageService bean = applicationContext.getBean(MessageService.class);
		System.out.println(bean.getMessage());
	}
}
