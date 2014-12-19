package com.expedia.meta.procedure.sql.outparams.named;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class NVarCharOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<String, InjectionContainer>{
	public NVarCharOutputParam(final String parameterName){
		super(parameterName, Types.NVARCHAR);
	}

	@Override
	protected String extract(final CallableStatement statement, final String parameterName) throws SQLException{
		return statement.getNString(parameterName);
	}
}
