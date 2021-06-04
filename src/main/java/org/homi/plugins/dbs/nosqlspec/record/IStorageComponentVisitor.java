package org.homi.plugins.dbs.nosqlspec.record;

import java.io.Serializable;

public interface IStorageComponentVisitor<R> {
	public R visit(FieldList fieldList);
	public R visit(Record record);
	public <T extends Serializable> R visit(Value<T> value);
}
