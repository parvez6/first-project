package com.example.demo.condition;

public class EnableProdDataSource implements DataSourceConfig {

	@Override
	public void makeConnection() {
		System.out.println("connection establed by prodDataSource");
		
	}

}
