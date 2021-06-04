package org.homi.plugins.dbs.nosqlspec.query;

public interface IQueryVisitor<R> {
	public R visit(OrQueryComponent qc);
	public R visit(AndQueryComponent qc);
	public R visit(EqualityQueryComponent qc);
}
