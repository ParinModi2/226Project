package com.movieproject.implementation;

import com.movieproject.dao.interfaces.DemoInterface;

public class DemoImpl implements DemoInterface{

	@Override
	public String printWelcomeMessage(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name+", Welcome !!!!";
	}

}
