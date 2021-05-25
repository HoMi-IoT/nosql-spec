package org.homi.plugins.dbs.nosqlspec;
import org.homi.plugin.specification.*;
public enum NoSQLSpec implements ISpecification{
	QUERY( Object.class, new SerializableTypeDef<>(Query.class)),
	STORE( Boolean.class, String.class, new SerializableTypeDef<>(Record.class)),
	DELETE( Boolean.class, Query.class, true),
	UPDATE( Boolean.class, String.class, String.class, Object.class);


	private TypeDef<?>[] parameterTypes;
	private TypeDef<?> returnType;
	NoSQLSpec(Object returnType, Object...parameterTypes ) {
		try {
			this.returnType = SpecificationHelper.processType(returnType);
			this.parameterTypes = new TypeDef<?>[parameterTypes.length];
			
			for(int i =0; i<parameterTypes.length; i++) {
				this.parameterTypes[i] = SpecificationHelper.processType(parameterTypes[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public TypeDef<?>[] getParameterTypes() {
		return this.parameterTypes;
	}
	
	@Override
	public TypeDef<?> getReturnType() {
		return this.returnType;
	}
	

}
