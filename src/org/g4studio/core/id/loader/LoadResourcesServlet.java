package org.g4studio.core.id.loader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * LoadResourcesServlet
 * 
 * @author XiongChun
 * @since 2010-03-17
 * @see HttpServlet
 */
public class LoadResourcesServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void init() throws ServletException {
		final String WEB_HOME = this.getServletContext().getRealPath("/");
		ResourcesLoader.load(WEB_HOME);
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		getServletContext().log(
				"Attempt to call service method on LoadResourcesServlet as [" +
				request.getRequestURI() + "] was ignored");
		response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	}
	

}
