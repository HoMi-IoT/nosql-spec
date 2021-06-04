package org.homi.plugins.dbs.nosqlspec.record;

import java.util.ArrayList;
import java.util.List;

public class FieldList implements IStorageComponent{
	
	private static final long serialVersionUID = 3897006711473584124L;
	private List<IStorageComponent> list;

	
	public FieldList() {
		
		list = new ArrayList<IStorageComponent>();
	}
	
	public void addComponent(IStorageComponent c) {
		this.list.add(c);
	}

	public List<IStorageComponent> getList() {
		return this.list;
	}

	@Override
	public <R> R accept(IStorageComponentVisitor<R> qv) {
		return qv.visit(this);
	}

}
