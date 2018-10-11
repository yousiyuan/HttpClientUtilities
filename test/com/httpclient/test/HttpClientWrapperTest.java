package com.httpclient.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import cn.lnson.util.HttpClientWrapper;

public class HttpClientWrapperTest {

	@Test
	public void test1() {
		Map<Integer, String> response = HttpClientWrapper.doGet("https://www.baidu.com/");
		System.out.println("响应状态码：" + response.keySet().toArray()[0]);
		System.out.println("响应内容：\r\n" + response.values().toArray()[0]);
	}

	@Test
	public void test2() throws UnsupportedEncodingException {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("kw", URLEncoder.encode("回忆天边", "utf-8"));
		Map<Integer, String> response = HttpClientWrapper.doGet("http://xinwen.eastday.com/search/index.html", map);
		System.out.println("响应状态码：" + response.keySet().toArray()[0]);
		System.out.println("响应内容：\r\n" + response.values().toArray()[0]);
	}

}
