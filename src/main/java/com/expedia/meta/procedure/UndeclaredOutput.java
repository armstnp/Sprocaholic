package com.expedia.meta.procedure;

public interface UndeclaredOutput<DefinitionContainer, InjectionContainer, InjectionException extends Throwable>{
	<NewInjectionContainer extends InjectionContainer> NewInjectionContainer injectDefinitionFrom(
			final DefinitionContainer definitionContainer,
			final NewInjectionContainer injectionContainer
	) throws InjectionException;
}
