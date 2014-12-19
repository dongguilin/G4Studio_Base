package org.g4studio.core.web;

import org.g4studio.core.mvc.xstruts.action.ActionServlet;

import javax.servlet.ServletException;

/**
 * ActionServlet基类
 * @author XiongChun
 * @since 2009-09-03
 * @see ActionServlet
 */
public class BaseActionServlet extends ActionServlet{
	public BaseActionServlet(){}
	
	/**
     * @param 
     * @return void
	 */
	public void init() throws ServletException{
		super.init();
	}
}
