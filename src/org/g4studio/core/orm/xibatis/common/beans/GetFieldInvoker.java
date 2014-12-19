package org.g4studio.core.orm.xibatis.common.beans;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetFieldInvoker implements Invoker {
	private Field field;
	private String name;

	public GetFieldInvoker(Field field) {
		this.field = field;
		this.name = "(" + field.getName() + ")";
	}

	public Object invoke(Object target, Object[] args) throws IllegalAccessException, InvocationTargetException {
		return field.get(target);
	}

	public String getName() {
		return name;
	}
}
