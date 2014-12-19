package com.expedia.meta.procedure.sql.rows.indexed;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultSetRow<InjectionContainer>{
	private final List<ResultSetColumn<? super InjectionContainer>> columns;

	public ResultSetRow(){
		this(new ArrayList<ResultSetColumn<? super InjectionContainer>>());
	}

	private ResultSetRow(List<ResultSetColumn<? super InjectionContainer>> columns){
		this.columns = columns;
	}

	public <NewInjectionContainer extends InjectionContainer> ResultSetRow<NewInjectionContainer> addColumns(
			final ResultSetColumn<NewInjectionContainer>... additionalColumns){
		List<ResultSetColumn<? super NewInjectionContainer>> columnsCopy = new ArrayList<>();
		for(ResultSetColumn<? super InjectionContainer> column : columns){
			columnsCopy.add(column);
		}

		Collections.addAll(columnsCopy, additionalColumns);

		return new ResultSetRow<>(columnsCopy);
	}

	public InjectionContainer injectRow(ResultSet resultSet, InjectionContainer injectionContainer) throws SQLException{
		for(ResultSetColumn<? super InjectionContainer> column : columns){
			injectionContainer = column.injectDefinitionFrom(resultSet, injectionContainer);
		}
		return injectionContainer;
	}
}
