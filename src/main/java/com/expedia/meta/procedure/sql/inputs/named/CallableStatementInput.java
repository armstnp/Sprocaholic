package com.expedia.meta.procedure.sql.inputs.named;

import com.expedia.meta.procedure.Input;

import java.sql.CallableStatement;
import java.sql.SQLException;

public abstract class CallableStatementInput<DefinitionType> implements Input<CallableStatement, SQLException>{
	private final String parameterName;
	private final DefinitionType value;
	protected CallableStatementInput(final String parameterName, final DefinitionType value){
		assert parameterName != null;
		this.parameterName = parameterName;
		this.value = value;
	}

	@Override
	public CallableStatement defineIn(final CallableStatement statement) throws SQLException{
		setValue(statement, parameterName, value);
		return statement;
	}

	protected abstract void setValue(
			final CallableStatement statement,
			final String parameterName,
			final DefinitionType value
	) throws SQLException;
}
