package org.g4studio.core.orm.xibatis.sqlmap.engine.type;

import org.g4studio.core.orm.xibatis.sqlmap.client.SqlMapException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatter {
	public static Date format(String format, String datetime) {
		try {
			return new SimpleDateFormat(format).parse(datetime);
		} catch (ParseException e) {
			throw new SqlMapException("Error parsing default null value date.  Format must be '" + format
					+ "'. Cause: " + e);
		}
	}

}
