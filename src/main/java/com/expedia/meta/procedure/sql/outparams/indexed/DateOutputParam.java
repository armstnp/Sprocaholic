package com.expedia.meta.procedure.sql.outparams.indexed;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;

public abstract class DateOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<Date, InjectionContainer>{
	public DateOutputParam(final int parameterIndex){
		super(parameterIndex, Types.DATE);
	}

	@Override
	protected Date extract(final CallableStatement statement, final int parameterIndex) throws SQLException{
		return statement.getDate(parameterIndex);
	}
}
