package com.expedia.meta.procedure.sql.outparams.named;

import com.expedia.meta.procedure.DeclaredOutput;

import java.sql.CallableStatement;
import java.sql.SQLException;

public abstract class CallableStatementOutputParam<ParamType, InjectionContainer>
		implements DeclaredOutput<CallableStatement, CallableStatement, InjectionContainer, SQLException,
		SQLException>{
	private final String parameterName;
	private final int sqlType;

	protected CallableStatementOutputParam(final String parameterName, final int sqlType){
		this.parameterName = parameterName;
		this.sqlType = sqlType;
	}

	@Override
	public CallableStatement declareIn(CallableStatement statement) throws SQLException{
		statement.registerOutParameter(parameterName, sqlType);
		return statement;
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(
			final CallableStatement statement,
			final NewInjectionContainer injectionContainer
	) throws SQLException{
		return inject(extract(statement, parameterName), injectionContainer);
	}

	protected abstract ParamType extract(final CallableStatement statement, final String parameterName)
			throws SQLException;

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer inject(
			final ParamType value,
			final NewInjectionContainer injectionContainer
	);
}
