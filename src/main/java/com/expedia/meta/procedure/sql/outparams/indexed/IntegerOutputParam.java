package com.expedia.meta.procedure.sql.outparams.indexed;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class IntegerOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<Integer, InjectionContainer>{
	public IntegerOutputParam(final int parameterIndex){
		super(parameterIndex, Types.INTEGER);
	}

	@Override
	protected Integer extract(final CallableStatement statement, final int parameterIndex) throws SQLException{
		Integer result = statement.getInt(parameterIndex);
		return statement.wasNull() ? null : result;
	}
}
