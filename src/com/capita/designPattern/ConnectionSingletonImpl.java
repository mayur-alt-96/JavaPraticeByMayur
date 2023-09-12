package com.capita.designPattern;

class ConnectionSingleton{
	
	public static ConnectionSingleton connectionSingleton;
	
	public static ConnectionSingleton getConnection() {
		
		if(null == connectionSingleton) {
			connectionSingleton = new ConnectionSingleton();
			return connectionSingleton;
		}
		return connectionSingleton;
	}
}

public class ConnectionSingletonImpl {
	
	public static void main(String[] args) {
		
		System.out.println(ConnectionSingleton.getConnection().hashCode());
		System.out.println(ConnectionSingleton.getConnection().hashCode());
	}
	
	

}
