package com.techstar.webwervice;

public class HelloServiceNew {
	public String sayHelloNew(){  
        return "hello";  
    }             
    public String sayHelloToPersonNew(String name){       
        if(name==null){  
            name = "nobody";  
        }             
        return "hello,"+name;  
    }  
    public void updateData(String data){  
        System.out.println(data+"更新");  
    }  
}
