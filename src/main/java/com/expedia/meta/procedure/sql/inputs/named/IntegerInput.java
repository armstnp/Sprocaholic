package com.expedia.meta.procedure.sql.inputs.named;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class IntegerInput extends CallableStatementInput<Integer>{
	public IntegerInput(final String parameterName, final Integer value){
		super(parameterName, value);
	}

	@Override
	protected void setValue(final CallableStatement statement, final String parameterName, final Integer value)
			throws SQLException{
		statement.setInt(parameterName, value);
	}
}
