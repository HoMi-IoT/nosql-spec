package org.homi.plugins.dbs.nosqlspec.query;

public class ContainsQueryComponent implements IQueryComponent {

	private static final long serialVersionUID = 5394356287052941097L;
	private IQueryComponent query;
	private String key;
	
	public ContainsQueryComponent(String key, IQueryComponent query) {
		this.key = key;
		this.query = query;
	}
	
	public String getKey() {
		return key;
	}
	
	public IQueryComponent getQuery() {
		return query;
	}
	
	@Override
	public <R> R accept(IQueryVisitor<R> qv) {
		return qv.visit(this);
	}

}
