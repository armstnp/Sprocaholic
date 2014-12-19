package com.expedia.meta.procedure.sql.outparams.indexed;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

public abstract class NVarCharOutputParam<InjectionContainer>
		extends CallableStatementOutputParam<String, InjectionContainer>{
	public NVarCharOutputParam(final int parameterIndex){
		super(parameterIndex, Types.NVARCHAR);
	}

	@Override
	protected String extract(final CallableStatement statement, final int parameterIndex) throws SQLException{
		return statement.getNString(parameterIndex);
	}
}
