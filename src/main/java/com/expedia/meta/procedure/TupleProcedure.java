package com.expedia.meta.procedure;

public interface
TupleProcedure<
		DeclarationContainer,
		DefinitionContainer,
		TupleType,
		DeclarationException extends Throwable,
		DefinitionException extends Throwable,
		ExecutionException extends Throwable>
		extends Procedure<TupleType, ExecutionException>{
	TupleProcedure<DeclarationContainer, DefinitionContainer, TupleType, DeclarationException, DefinitionException,
			ExecutionException>
	declareOutputs(final DeclaredOutput<
			DeclarationContainer,
			DefinitionContainer,
			TupleType,
			DeclarationException,
			ExecutionException>... outputDeclarations);
}
