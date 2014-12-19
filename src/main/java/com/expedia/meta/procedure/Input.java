package com.expedia.meta.procedure;

public interface Input<DefinitionContainer, DefinitionException extends Throwable>{
	DefinitionContainer defineIn(final DefinitionContainer definitionContainer) throws DefinitionException;
}
