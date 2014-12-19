package org.g4studio.core.orm.xibatis.sqlmap.engine.datasource;

import org.g4studio.core.orm.xibatis.common.jdbc.DbcpConfiguration;

import javax.sql.DataSource;
import java.util.Map;

/**
 * DataSourceFactory implementation for DBCP
 */
public class DbcpDataSourceFactory implements DataSourceFactory {

	private DataSource dataSource;

	public void initialize(Map map) {
		DbcpConfiguration dbcp = new DbcpConfiguration(map);
		dataSource = dbcp.getDataSource();
	}

	public DataSource getDataSource() {
		return dataSource;
	}

}
