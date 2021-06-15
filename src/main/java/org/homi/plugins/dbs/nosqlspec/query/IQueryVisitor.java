package org.homi.plugins.dbs.nosqlspec.query;

import java.io.Serializable;

public interface IQueryVisitor<R> {
	public R visit(OrQueryComponent qc);
	public R visit(AndQueryComponent qc);
	public R visit(EqualityQueryComponent qc);
	public R visit(RegexQueryComponent qc);
	public R visit(ContainsQueryComponent qc);
	public <T extends Serializable & Comparable<T>> R visit(InQueryComponent<T> inQueryComponent);
}
