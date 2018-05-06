package com.lighten.exmaple.designpattern.proxy;

public class ProxyTest {
	
	public static void testProxy(){
		
	  UserService userService = new UserServiceImpl();  
       // 实例化InvocationHandler  
      MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);  
        // 根据目标对象生成代理对象  
      UserService proxy = (UserService) invocationHandler.getProxy();  
          
       // 调用代理对象的方法  
       proxy.add(); 
	}
	
	public static void main(String[] args) {
		testProxy();
	}

}
