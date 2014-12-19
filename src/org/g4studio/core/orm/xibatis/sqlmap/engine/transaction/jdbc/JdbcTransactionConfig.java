package org.g4studio.core.orm.xibatis.sqlmap.engine.transaction.jdbc;

import org.g4studio.core.orm.xibatis.sqlmap.engine.transaction.BaseTransactionConfig;
import org.g4studio.core.orm.xibatis.sqlmap.engine.transaction.Transaction;
import org.g4studio.core.orm.xibatis.sqlmap.engine.transaction.TransactionException;

import java.sql.SQLException;
import java.util.Properties;

public class JdbcTransactionConfig extends BaseTransactionConfig {

	public Transaction newTransaction(int transactionIsolation) throws SQLException, TransactionException {
		return new JdbcTransaction(dataSource, transactionIsolation);
	}

	public void setProperties(Properties props) throws SQLException, TransactionException {
	}

}
