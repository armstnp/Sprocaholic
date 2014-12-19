package com.expedia.meta.procedure.sql.inputs.indexed;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class StringInput extends CallableStatementInput<String>{
	public StringInput(final int parameterIndex, final String value){
		super(parameterIndex, value);
	}

	@Override
	protected void setValue(final CallableStatement statement, final int parameterIndex, final String value)
			throws SQLException{
		statement.setString(parameterIndex, value);
	}
}
