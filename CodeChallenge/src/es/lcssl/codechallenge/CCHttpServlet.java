package es.lcssl.codechallenge;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


/**
 * empty implementation to build the unit tests.
 * @author luis
 *
 */
public class CCHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 9175008819048034854L;
	
	private static final ServletException unimp = new ServletException(
			"UNIMPLEMENTED");
	private final Gson i_parser;
	
	public CCHttpServlet() {
		i_parser = new Gson();
	}
	
	public CCHttpServlet(Gson parser) {
		i_parser = parser;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		throw unimp;
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		throw unimp;
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init() throws ServletException {
		throw unimp;
	}

}
