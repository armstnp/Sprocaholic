package com.expedia.meta.procedure.sql.outparams.indexed;

import com.expedia.meta.procedure.DeclaredOutput;

import java.sql.CallableStatement;
import java.sql.SQLException;

public abstract class CallableStatementOutputParam<ParamType, InjectionContainer>
		implements DeclaredOutput<CallableStatement, CallableStatement, InjectionContainer, SQLException,
		SQLException>{
	private final int parameterIndex;
	private final int sqlType;

	protected CallableStatementOutputParam(final int parameterIndex, final int sqlType){
		this.parameterIndex = parameterIndex;
		this.sqlType = sqlType;
	}

	@Override
	public CallableStatement declareIn(CallableStatement statement) throws SQLException{
		statement.registerOutParameter(parameterIndex, sqlType);
		return statement;
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(
			final CallableStatement statement,
			final NewInjectionContainer injectionContainer
	) throws SQLException{
		return inject(extract(statement, parameterIndex), injectionContainer);
	}

	protected abstract ParamType extract(final CallableStatement statement, final int parameterIndex)
			throws SQLException;

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer inject(final ParamType value, final NewInjectionContainer injectionContainer);
}
