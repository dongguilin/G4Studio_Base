package org.g4studio.core.orm.xibatis.common.beans;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class SetFieldInvoker implements Invoker {
	private Field field;
	private String name;

	public SetFieldInvoker(Field field) {
		this.field = field;
		this.name = "(" + field.getName() + ")";
	}

	public Object invoke(Object target, Object[] args) throws IllegalAccessException, InvocationTargetException {
		field.set(target, args[0]);
		return null;
	}

	public String getName() {
		return name;
	}
}
