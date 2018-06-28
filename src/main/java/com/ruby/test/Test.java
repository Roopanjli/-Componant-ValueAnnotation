package com.ruby.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ruby.bean.Vehicle;

public class Test {
public static void main(String[] args) {
	ApplicationContext context= new FileSystemXmlApplicationContext("src/main/java/com/ruby/cfg/ApplicationContext.xml");
	Vehicle vehi=context.getBean("vehi",Vehicle.class);
	System.out.println(vehi);
	Vehicle vehi1=context.getBean("vehi",Vehicle.class);
	System.out.println(vehi1);
}
}
