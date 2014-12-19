package com.expedia.meta.procedure.sql.outparams.named;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;

public abstract class DateOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<Date, InjectionContainer>{
	public DateOutputParam(final String parameterName){
		super(parameterName, Types.DATE);
	}

	@Override
	protected Date extract(final CallableStatement statement, final String parameterName) throws SQLException{
		return statement.getDate(parameterName);
	}
}
