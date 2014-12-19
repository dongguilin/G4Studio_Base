package org.g4studio.demo.web.other.rpc.httpinvoker;

import org.g4studio.core.metatype.BaseDomain;
import org.g4studio.core.metatype.Dto;

/**
 * Httpinvoker接口
 * 
 * @author XiongChun
 * @since 2010-10-13
 * @see BaseDomain
 */
public interface HelloWorldService {
	/**
	 * sayHello
	 * @param text
	 * @return
	 */
	public String sayHello(String text);
	
	/**
	 * 查询一条结算明细测试数据
	 * @param jsbh
	 * @return XML字符串
	 */
	public Dto queryBalanceInfo(String jsbh);
	
}
