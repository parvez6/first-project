package com.example.demo.condition;

public class EnableDevDataSource implements DataSourceConfig {

	@Override
	public void makeConnection() {
		System.out.println("connection establed by EnableDevDataSource");
		
	}

}
