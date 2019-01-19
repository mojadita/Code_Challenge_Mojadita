/*
 * TestCCHttpServlet.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 18/1/2019 19:38:27
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * @author luis
 *
 */
public class TestCCHttpServlet {

	private CCHttpServlet iut;
	
	@Test(expected=ServletException.class)
	public void testDoPostFailContentType() throws ServletException, IOException {
		iut = new CCHttpServlet();
		HttpServletRequest req = EasyMock.createMock(HttpServletRequest.class);
		HttpServletResponse resp = EasyMock.createMock(HttpServletResponse.class);
		/* we expect the call to doPost() to ask for the content-type http request field */
		EasyMock.expect(req.getContentType()).andReturn("text/html");  /* invalid, correct should be text/json */
		EasyMock.replay(req);
        iut.init();
        iut.doPost(req, resp);
    }
}
