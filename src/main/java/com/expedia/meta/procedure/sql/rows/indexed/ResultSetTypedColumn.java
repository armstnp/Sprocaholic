package com.expedia.meta.procedure.sql.rows.indexed;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ResultSetTypedColumn<ColumnType, InjectionContainer> extends ResultSetColumn<InjectionContainer>{
	public ResultSetTypedColumn(final int columnIndex){
		super(columnIndex);
	}

	@Override
	public <NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFromColumn(
			ResultSet resultSet,
			int columnIndex,
			NewInjectionContainer injectionContainer
	) throws SQLException{
		return inject(extract(resultSet, columnIndex), injectionContainer);
	}

	protected abstract ColumnType extract(final ResultSet resultSet, final int columnIndex) throws SQLException;

	protected abstract <NewInjectionContainer extends InjectionContainer> NewInjectionContainer inject(
			final ColumnType value,
			final NewInjectionContainer injectionContainer
	);
}
