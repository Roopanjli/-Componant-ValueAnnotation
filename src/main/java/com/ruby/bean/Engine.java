package com.ruby.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eng")
public class Engine 
{  
	@Value("345")
   private int id;
	@Value("Robotic")
   private String type;
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
	
}
