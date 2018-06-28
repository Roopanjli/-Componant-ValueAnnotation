package com.ruby.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component("vehi")
public class Vehicle {
	@Autowired
	private Engine engine;

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + "]";
	}

}
