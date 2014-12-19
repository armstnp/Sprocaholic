package com.expedia.meta.procedure.sql.outparams.named;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class VarCharOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<String, InjectionContainer>{
	public VarCharOutputParam(final String parameterName){
		super(parameterName, Types.VARCHAR);
	}

	@Override
	protected String extract(final CallableStatement statement, final String parameterName) throws SQLException{
		return statement.getString(parameterName);
	}
}
