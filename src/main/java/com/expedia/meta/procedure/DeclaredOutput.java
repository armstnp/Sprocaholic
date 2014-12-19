package com.expedia.meta.procedure;

public interface DeclaredOutput<DeclarationContainer, DefinitionContainer, InjectionContainer, DeclarationException
		extends Throwable, InjectionException extends Throwable>{
	DeclarationContainer declareIn(final DeclarationContainer declarationContainer) throws DeclarationException;

	<NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(
			final DefinitionContainer definitionContainer,
			final NewInjectionContainer injectionContainer
	) throws InjectionException;
}
