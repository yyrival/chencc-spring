package com.chencc.spring.service.impl;

import com.chencc.spring.framework.annotation.CCService;
import com.chencc.spring.service.IDemoService;

/**
 * 核心业务逻辑
 */
@CCService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "This is ChenCC, Your Name is " + name;
	}

}
