package org.homi.plugins.dbs.nosqlspec.query;

public class OrQueryComponent implements IQueryComponent {

	private static final long serialVersionUID = -6091467385532532514L;
	private IQueryComponent[] queryComponents;

	public OrQueryComponent(IQueryComponent[] queryComponents) {
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
