package com.chencc.spring.action;

import com.chencc.spring.framework.annotation.CCAutowired;
import com.chencc.spring.framework.annotation.CCController;
import com.chencc.spring.framework.annotation.CCRequestMapping;
import com.chencc.spring.framework.annotation.CCRequestParam;
import com.chencc.spring.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@CCController
@CCRequestMapping("/demo")
public class DemoAction {

  	@CCAutowired
	private IDemoService demoService;

	@CCRequestMapping("/query.*")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @CCRequestParam("name") String name){
		String result = "Hello,This is ChenCC,Your Name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@CCRequestMapping("/sum")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@CCRequestParam("a") Integer a, @CCRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@CCRequestMapping("/fuck")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@CCRequestParam("a") Double a, @CCRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@CCRequestMapping("/remove")
	public String  remove(@CCRequestParam("id") Integer id){
		return "" + id;
	}

}
