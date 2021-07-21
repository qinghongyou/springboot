package com.xiao.security.utils;

import java.util.ArrayList;
import java.util.List;

public class TestArray {
	
	public static void main(String[] args) {
		//String[] ids = {};
		List<String> lists = new ArrayList<String> ();
		lists.add("11111");
		lists.add("22222");
		String[] ids = lists.toArray(new String[lists.size()]);
		System.out.println(ids.toString());
	}

}
