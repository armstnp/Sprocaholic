package com.expedia.meta.procedure.sql.rows.indexed;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class StringColumn<InjectionContainer> extends ResultSetTypedColumn<String, InjectionContainer>{
	public StringColumn(int columnIndex){
		super(columnIndex);
	}

	@Override
	protected String extract(ResultSet resultSet, int columnIndex) throws SQLException{
		return resultSet.getString(columnIndex);
	}
}
