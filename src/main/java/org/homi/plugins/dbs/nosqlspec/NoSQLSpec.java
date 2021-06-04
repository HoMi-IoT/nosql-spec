package org.homi.plugins.dbs.nosqlspec;
import java.util.List;

import org.homi.plugin.specification.ISpecification;
import org.homi.plugin.specification.SpecificationID;
import org.homi.plugin.specification.types.TypeDef;
import org.homi.plugins.dbs.nosqlspec.query.IQueryComponent;
import org.homi.plugins.dbs.nosqlspec.query.QueryBuilder;
import org.homi.plugins.dbs.nosqlspec.record.FieldList;
import org.homi.plugins.dbs.nosqlspec.record.Record;

import static org.homi.plugin.specification.SpecificationHelper.*;
import static org.homi.plugin.specification.Constraints.*;

class Types {
	public static TypeDef<?> RECORD = defineSerializableType(Record.class, notNull());
	public static TypeDef<?> QUERY = defineSerializableType(IQueryComponent.class);
	public static TypeDef<?> QUERY_RESULT = defineSerializableType(FieldList.class, notNull());
	public static TypeDef<?> COLLECTION_NAME = defineType(String.class, notNull(), minLength(5));
	public static TypeDef<?> AFFECTED_COUNT = defineType(Integer.class, notNull(), (count)->{return count>=0;} );
//	public static TypeDef<?> CLASSLOADER = defineType(ClassLoader.class, notNull());
}

@SpecificationID(id = "NoSQLSpec")
public enum NoSQLSpec implements ISpecification{
	QUERY( Types.QUERY_RESULT, Types.COLLECTION_NAME, Types.QUERY),
	STORE( Types.AFFECTED_COUNT, Types.COLLECTION_NAME, Types.RECORD),
	DELETE( Types.AFFECTED_COUNT, Types.COLLECTION_NAME, Types.QUERY),
	UPDATE( Types.AFFECTED_COUNT, Types.COLLECTION_NAME, Types.QUERY, Types.RECORD);

	private List<TypeDef<?>> parameterTypes;
	private TypeDef<?> returnType;
	
	NoSQLSpec(Object returnType, Object...parameterTypes ) {
		try {
			this.returnType = processType(returnType);
			this.parameterTypes = processTypes(parameterTypes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		QueryBuilder.and(QueryBuilder.eq("", 1), QueryBuilder.or(QueryBuilder.eq("", 1), QueryBuilder.eq("", 1)));
		
	}
	
	@Override
	public List<TypeDef<?>> getParameterTypes() {
		return this.parameterTypes;
	}
	
	@Override
	public TypeDef<?> getReturnType() {
		return this.returnType;
	}
	
}
