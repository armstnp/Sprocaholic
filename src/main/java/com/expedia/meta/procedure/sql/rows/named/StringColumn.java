package com.expedia.meta.procedure.sql.rows.named;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class StringColumn<InjectionContainer> extends ResultSetTypedColumn<String, InjectionContainer>{
	public StringColumn(String columnName){
		super(columnName);
	}

	@Override
	protected String extract(ResultSet resultSet, String columnName) throws SQLException{
		return resultSet.getString(columnName);
	}
}
