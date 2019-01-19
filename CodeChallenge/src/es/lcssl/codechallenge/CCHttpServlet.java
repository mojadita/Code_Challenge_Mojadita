package es.lcssl.codechallenge;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * empty implementation to build the unit tests.
 * 
 * @author luis
 *
 */
public class CCHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 9175008819048034854L;

	public CCHttpServlet() {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void destroy() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void init() throws ServletException {
		throw new UnsupportedOperationException();
	}

}
