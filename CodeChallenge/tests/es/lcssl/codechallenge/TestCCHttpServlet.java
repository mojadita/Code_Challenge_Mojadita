/*
 * TestCCHttpServlet.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 18/1/2019 19:38:27
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

import javax.servlet.ServletException;

import org.jmock.Mockery;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

/**
 * @author luis
 *
 */
public class TestCCHttpServlet {

	private Mockery ctx = new Mockery();
	private CCHttpServlet iut;
	Gson m_parser;
	
	String json_post = "{\n" + 
          "\"reference\":\"ABCD123456\",\n" +
          "  \"parcels\" : [\n" +
          "  {\n" +
          "    \"weight\":1,\n" +
          "    \"width\": 10,\n" +
          "    \"height\": 10,\n" +
          "    \"lenght\": 10\n" +
          "  },\n" +
          "  {\n" +
          "    \"weight\":2,\n" +
          "    \"width\": 20,\n" +
          "    \"height\": 20,\n" +
          "    \"lenght\": 20\n" +
          "  }\n" +
          "  ]\n" +
          "}\n";
	
	@Before
	public void prepare() {
		iut = new CCHttpServlet(m_parser);
	}
	
	@Test
	public void testInit() throws ServletException {
		iut.init();
	}
	
	@Test
	public void testDoPost() throws ServletException {
        iut.init();
    }
}
