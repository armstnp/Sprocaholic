package com.expedia.meta.procedure.sql.inputs.indexed;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class IntegerInput extends CallableStatementInput<Integer>{
	public IntegerInput(final int parameterIndex, final Integer value){
		super(parameterIndex, value);
	}

	@Override
	protected void setValue(final CallableStatement statement, final int parameterIndex, final Integer value)
			throws SQLException{
		statement.setInt(parameterIndex, value);
	}
}
