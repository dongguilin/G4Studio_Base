package org.g4studio.core.orm.xibatis.sqlmap.engine.mapping.statement;

import org.g4studio.core.orm.xibatis.sqlmap.client.event.RowHandler;
import org.g4studio.core.orm.xibatis.sqlmap.engine.scope.StatementScope;
import org.g4studio.core.orm.xibatis.sqlmap.engine.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;

public class InsertStatement extends MappedStatement {

	private SelectKeyStatement selectKeyStatement;

	public StatementType getStatementType() {
		return StatementType.INSERT;
	}

	public Object executeQueryForObject(StatementScope statementScope, Transaction trans, Object parameterObject,
			Object resultObject) throws SQLException {
		throw new SQLException("Insert statements cannot be executed as a query.");
	}

	public List executeQueryForList(StatementScope statementScope, Transaction trans, Object parameterObject,
			int skipResults, int maxResults) throws SQLException {
		throw new SQLException("Insert statements cannot be executed as a query.");
	}

	public void executeQueryWithRowHandler(StatementScope statementScope, Transaction trans, Object parameterObject,
			RowHandler rowHandler) throws SQLException {
		throw new SQLException("Update statements cannot be executed as a query.");
	}

	public SelectKeyStatement getSelectKeyStatement() {
		return selectKeyStatement;
	}

	public void setSelectKeyStatement(SelectKeyStatement selectKeyStatement) {
		this.selectKeyStatement = selectKeyStatement;
	}
}
