package com.expedia.meta.procedure.sql.inputs.indexed;

import com.expedia.meta.procedure.Input;

import java.sql.CallableStatement;
import java.sql.SQLException;

public abstract class CallableStatementInput<DefinitionType> implements Input<CallableStatement, SQLException>{
	private final int parameterIndex;
	private final DefinitionType value;
	protected CallableStatementInput(final int parameterIndex, final DefinitionType value){
		assert parameterIndex >= 0;
		this.parameterIndex = parameterIndex;
		this.value = value;
	}

	@Override
	public CallableStatement defineIn(final CallableStatement statement) throws SQLException{
		setValue(statement, parameterIndex, value);
		return statement;
	}

	protected abstract void setValue(
			final CallableStatement statement,
			final int parameterIndex,
			final DefinitionType value
	) throws SQLException;
}
