/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.term_project.ui.internal.Term_projectActivator;

public class Term_projectUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Term_projectActivator.getInstance().getInjector("org.xtext.example.Term_project");
	}

}
