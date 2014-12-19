package com.expedia.meta.procedure.sql.outparams.named;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class IntegerOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<Integer, InjectionContainer>{
	public IntegerOutputParam(final String parameterName){
		super(parameterName, Types.INTEGER);
	}

	@Override
	protected Integer extract(final CallableStatement statement, final String parameterName) throws SQLException{
		return statement.getInt(parameterName);
	}
}
