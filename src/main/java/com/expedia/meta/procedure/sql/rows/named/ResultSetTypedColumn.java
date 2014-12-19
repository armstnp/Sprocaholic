package com.expedia.meta.procedure.sql.rows.named;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ResultSetTypedColumn<ColumnType, InjectionContainer> extends ResultSetColumn<InjectionContainer>{
	public ResultSetTypedColumn(final String columnName){
		super(columnName);
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFromColumn(
			ResultSet resultSet,
			String columnName,
			NewInjectionContainer injectionContainer
	)
			throws SQLException{
		return inject(extract(resultSet, columnName), injectionContainer);
	}

	protected abstract ColumnType extract(final ResultSet resultSet, final String columnName) throws SQLException;

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer inject(
			final ColumnType value,
			final NewInjectionContainer injectionContainer
	);
}
