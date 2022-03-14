/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.program.ui;

import com.google.inject.Injector;
import fr.univcotedazur.l3ia.program.concrete.textual.bis.ui.internal.BisActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ProgExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(BisActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		BisActivator activator = BisActivator.getInstance();
		return activator != null ? activator.getInjector(BisActivator.FR_UNIVCOTEDAZUR_L3IA_PROGRAM_PROG) : null;
	}

}
