package com.expedia.meta.procedure.sql.inputs.named;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class StringInput extends CallableStatementInput<String>{
	public StringInput(final String parameterName, final String value){
		super(parameterName, value);
	}

	@Override
	protected void setValue(final CallableStatement statement, final String parameterName, final String value)
			throws SQLException{
		statement.setString(parameterName, value);
	}
}
