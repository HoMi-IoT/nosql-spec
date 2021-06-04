package org.homi.plugins.dbs.nosqlspec.record;

import java.util.HashMap;
import java.util.Map;

public class Record implements IStorageComponent{
	
	private Map<String, IStorageComponent> fields;
	
	public Record() {
		fields = new HashMap<String, IStorageComponent>();
	}
	
	private static final long serialVersionUID = -4884993885982117396L;

	public void addField(String k, IStorageComponent c) {
		this.fields.put(k, c);
	}

	public Map<String, IStorageComponent> getFields() {
		return this.fields;
	}

	@Override
	public <R> R accept(IStorageComponentVisitor<R> qv) {
		return qv.visit(this);
	}

}
