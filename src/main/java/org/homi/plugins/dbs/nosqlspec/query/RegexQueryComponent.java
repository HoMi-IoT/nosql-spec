package org.homi.plugins.dbs.nosqlspec.query;

public class RegexQueryComponent implements IQueryComponent {

	private static final long serialVersionUID = 6112917252696561928L;
	private String key;
	private String value;

	public RegexQueryComponent(String key, String value) {
		this.key = key;
		this.value = value;
	}

	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public <R> R accept(IQueryVisitor<R> qv) {
		return qv.visit(this);
	}

}
