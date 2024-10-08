/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.term_project.ui.internal.Term_projectActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Term_projectExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Term_projectActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Term_projectActivator activator = Term_projectActivator.getInstance();
		return activator != null ? activator.getInjector(Term_projectActivator.ORG_XTEXT_EXAMPLE_TERM_PROJECT) : null;
	}

}
