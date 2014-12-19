package com.expedia.meta.procedure.sql.rows.indexed;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class IntegerColumn<InjectionContainer> extends ResultSetTypedColumn<Integer, InjectionContainer>{
	public IntegerColumn(int columnIndex){
		super(columnIndex);
	}

	@Override
	protected Integer extract(ResultSet resultSet, int columnIndex) throws SQLException{
		Integer result = resultSet.getInt(columnIndex);
		return resultSet.wasNull() ? null : result;
	}
}
