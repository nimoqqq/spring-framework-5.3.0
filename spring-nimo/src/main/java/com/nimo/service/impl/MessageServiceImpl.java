package com.nimo.service.impl;

import com.nimo.service.MessageService;

/**
 * @program: spring
 * @ClassName: MessageServiceImpl
 * @description:
 * @author: chuf
 * @create: 2022-01-03 21:56
 **/
public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "hello world";
	}
}
