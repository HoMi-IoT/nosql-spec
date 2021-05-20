package org.homi.plugins.dbs.nosqlspec;
import org.homi.plugin.specification.*;
public enum NoSQLSpec implements ISpecification{
	QUERY(new ParameterType<>(Object.class), new ParameterType<>(Query.class, true)),
	STORE(new ParameterType<>(Boolean.class), new ParameterType<>(String.class), new ParameterType<>(Record.class, true)),
	DELETE(new ParameterType<>(Boolean.class), new ParameterType<>(Query.class, true)),
	UPDATE(new ParameterType<>(Boolean.class), new ParameterType<>(String.class), new ParameterType<>(String.class), new ParameterType<>(Object.class));

	ParameterType<?> returnType;
	ParameterType<?>[] parameters;
 
	NoSQLSpec(ParameterType<?> returnType, ParameterType<?> ...params ) {
		this.returnType = returnType;
		this.parameters = params;
		
	}

	@Override
	public ParameterType<?>[] getParameterTypes() {
		
		return this.parameters;
	}

	@Override
	public ParameterType<?> getReturnType() {
	
		return this.returnType;
	}


}
