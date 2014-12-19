package com.expedia.meta.procedure.sql.outparams.indexed;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class VarCharOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<String, InjectionContainer>{
	public VarCharOutputParam(final int parameterIndex){
		super(parameterIndex, Types.VARCHAR);
	}

	@Override
	protected String extract(final CallableStatement statement, final int parameterIndex) throws SQLException{
		return statement.getString(parameterIndex);
	}
}
