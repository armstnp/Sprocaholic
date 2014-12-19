package com.expedia.meta.procedure;

public interface Procedure<ResolvedValueType, ExecutionException extends Throwable>{
	ResolvedValueType execute() throws ExecutionException;
}
