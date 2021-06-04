package org.homi.plugins.dbs.nosqlspec.query;

public class AndQueryComponent implements IQueryComponent{

	private static final long serialVersionUID = -5631719746756557125L;
	private IQueryComponent[] queryComponents;

	public AndQueryComponent(IQueryComponent[] queryComponents) {
		this.queryComponents = queryComponents;
	}

	public IQueryComponent[] getQueryComponents() {
		return queryComponents;
	}
	
	@Override
	public <R> R accept(IQueryVisitor<R> qv) {
		return qv.visit(this);
	}

}
