package org.homi.plugins.dbs.nosqlspec.query;

public class EqualityQueryComponent implements IQueryComponent {

	private static final long serialVersionUID = 1364536285216196485L;
	private Object value;
	private String key;

	public EqualityQueryComponent(String key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	

	@Override
	public <R> R accept(IQueryVisitor<R> qv) {
		return qv.visit(this);
	}

}
