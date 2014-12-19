package com.expedia.meta.procedure.sql.rows.named;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class IntegerColumn<InjectionContainer> extends ResultSetTypedColumn<Integer, InjectionContainer>{
	public IntegerColumn(String columnName){
		super(columnName);
	}

	@Override
	protected Integer extract(ResultSet resultSet, String columnName) throws SQLException{
		Integer result = resultSet.getInt(columnName);
		return resultSet.wasNull() ? null : result;
	}
}
