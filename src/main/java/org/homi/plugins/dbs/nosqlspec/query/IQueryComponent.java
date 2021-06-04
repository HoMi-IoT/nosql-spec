package org.homi.plugins.dbs.nosqlspec.query;

import java.io.Serializable;

public interface IQueryComponent extends Serializable{
	
	public <R> R accept(IQueryVisitor<R> qv);

}
