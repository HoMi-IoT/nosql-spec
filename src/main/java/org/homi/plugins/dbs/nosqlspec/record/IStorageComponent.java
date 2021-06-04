package org.homi.plugins.dbs.nosqlspec.record;

import java.io.Serializable;

public interface IStorageComponent extends Serializable{
	
	public <R> R accept(IStorageComponentVisitor<R> qv);

}
