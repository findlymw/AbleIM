package com.ablesky.im.test;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	@Before
	public void beforeTest() {
		println("-------���Կ�ʼ--------");
	}
	
	@After
	public void afterTest() {
		println("-------���Խ���--------");
	} 

	public void println(String str) {
		 System.out.println(str);
	}
}
