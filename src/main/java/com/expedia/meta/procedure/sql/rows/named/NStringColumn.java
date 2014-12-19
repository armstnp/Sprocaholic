package com.expedia.meta.procedure.sql.rows.named;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class NStringColumn<InjectionContainer> extends ResultSetTypedColumn<String, InjectionContainer>{
	public NStringColumn(String columnName){
		super(columnName);
	}

	@Override
	protected String extract(ResultSet resultSet, String columnName) throws SQLException{
		return resultSet.getNString(columnName);
	}
}
