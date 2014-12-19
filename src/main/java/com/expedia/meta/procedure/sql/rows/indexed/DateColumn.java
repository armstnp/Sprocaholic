package com.expedia.meta.procedure.sql.rows.indexed;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DateColumn<InjectionContainer> extends ResultSetTypedColumn<Date, InjectionContainer>{
	public DateColumn(int columnIndex){
		super(columnIndex);
	}

	@Override
	protected Date extract(ResultSet resultSet, int columnIndex) throws SQLException{
		return resultSet.getDate(columnIndex);
	}
}
