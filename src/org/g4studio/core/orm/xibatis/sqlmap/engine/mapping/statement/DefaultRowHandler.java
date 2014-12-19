package org.g4studio.core.orm.xibatis.sqlmap.engine.mapping.statement;

import org.g4studio.core.orm.xibatis.sqlmap.client.event.RowHandler;

import java.util.ArrayList;
import java.util.List;

public class DefaultRowHandler implements RowHandler {

	private List list = new ArrayList();

	public void handleRow(Object valueObject) {
		list.add(valueObject);
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

}
