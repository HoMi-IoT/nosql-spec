package org.homi.plugins.dbs.nosqlspec;

import java.util.HashMap;
import java.util.Map;

public class Record implements Component{
	
	private Map<String, Component> fields;
	
	public Record() {
		fields = new HashMap<String, Component>();
	}
	
	private static final long serialVersionUID = -4884993885982117396L;

	public void addField(String k, Component c) {
		this.fields.put(k, c);
	}

	@Override
	public <R> R getValue() {
		return (R) fields;
	}
	
	@Override
	public String printComponent(int indent) {
		StringBuilder sb = new StringBuilder();
		sb.append("{\n");
		for(Map.Entry<String, Component> entry : fields.entrySet()) {
			sb.append(this.indent(indent));
			sb.append(entry.getKey() + ": " + entry.getValue().printComponent(indent + 1));
			sb.append("\n");
		}
		sb.append(this.indent(indent)+"}");
		return sb.toString();
		
	}

}
