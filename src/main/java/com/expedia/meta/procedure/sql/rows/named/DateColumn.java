package com.expedia.meta.procedure.sql.rows.named;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DateColumn<InjectionContainer> extends ResultSetTypedColumn<Date, InjectionContainer>{
	public DateColumn(String columnName){
		super(columnName);
	}

	@Override
	protected Date extract(ResultSet resultSet, String columnName) throws SQLException{
		return resultSet.getDate(columnName);
	}
}
