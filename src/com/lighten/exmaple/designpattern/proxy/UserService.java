package com.lighten.exmaple.designpattern.proxy;

/**
 * 
 * 目标对象实现的接口，用JDK来生成代理对象一定要实现一个接口 
 * 
 * @author light
 *
 */
public interface UserService {
	
	    /** 
	     * 目标方法  
	     */  
	    public abstract void add();  
	  
}
