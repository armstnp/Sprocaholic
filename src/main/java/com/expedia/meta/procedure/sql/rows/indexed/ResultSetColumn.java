package com.expedia.meta.procedure.sql.rows.indexed;

import com.expedia.meta.procedure.UndeclaredOutput;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ResultSetColumn<InjectionContainer>
		implements UndeclaredOutput<ResultSet, InjectionContainer, SQLException>{
	private final int columnIndex;

	public ResultSetColumn(final int columnIndex){
		this.columnIndex = columnIndex;
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(
			ResultSet resultSet,
			NewInjectionContainer injectionContainer
	)
			throws SQLException{
		return injectDefinitionFromColumn(resultSet, columnIndex, injectionContainer);
	}

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer
	injectDefinitionFromColumn(ResultSet resultSet, int columnIndex, NewInjectionContainer injectionContainer)
			throws SQLException;
}
