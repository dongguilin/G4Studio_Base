package org.g4studio.core.orm.xibatis.common.logging.jakarta;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JakartaCommonsLoggingImpl implements org.g4studio.core.orm.xibatis.common.logging.Log {

	private Log log;

	public JakartaCommonsLoggingImpl(Class clazz) {
		log = LogFactory.getLog(clazz);
	}

	public boolean isDebugEnabled() {
		return log.isDebugEnabled();
	}

	public void error(String s, Throwable e) {
		log.error(s, e);
	}

	public void error(String s) {
		log.error(s);
	}

	public void debug(String s) {
		log.debug(s);
	}

	public void warn(String s) {
		log.warn(s);
	}

}
