package org.homi.plugins.dbs.nosqlspec.query;

import java.io.Serializable;
import java.util.List;

public abstract class QueryBuilder {
	
	public static final IQueryComponent eq(String key, Object value) {
		return new EqualityQueryComponent(key, value);
	}
	
	public static final IQueryComponent and(IQueryComponent...queryComponents) {
		return new AndQueryComponent(queryComponents);
	}
	
	public static final IQueryComponent or(IQueryComponent...queryComponents) {
		return new OrQueryComponent(queryComponents);
	}
	
	public static final <T extends Serializable & Comparable<T>> IQueryComponent in(String key, List<T> values) {
		return new InQueryComponent<T>(key, (T[]) values.toArray());
	}

	public static final <T extends Serializable & Comparable<T>> IQueryComponent in(String key, T[] values) {
		return new InQueryComponent<T>(key, values);
	}
}
