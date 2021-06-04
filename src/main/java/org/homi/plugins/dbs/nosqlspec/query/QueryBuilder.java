package org.homi.plugins.dbs.nosqlspec.query;

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
	
}
