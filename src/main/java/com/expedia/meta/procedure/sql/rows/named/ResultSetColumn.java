package com.expedia.meta.procedure.sql.rows.named;

import com.expedia.meta.procedure.UndeclaredOutput;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ResultSetColumn<InjectionContainer>
		implements UndeclaredOutput<ResultSet, InjectionContainer, SQLException>{
	private final String columnName;

	public ResultSetColumn(final String columnName){
		this.columnName = columnName;
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(ResultSet resultSet, NewInjectionContainer injectionContainer)
			throws SQLException{
		return injectDefinitionFromColumn(resultSet, columnName, injectionContainer);
	}

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer
	injectDefinitionFromColumn(ResultSet resultSet, String columnName, NewInjectionContainer injectionContainer)
			throws SQLException;
}
