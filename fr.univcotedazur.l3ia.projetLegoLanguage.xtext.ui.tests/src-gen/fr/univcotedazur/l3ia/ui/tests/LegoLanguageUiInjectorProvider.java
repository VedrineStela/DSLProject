/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.ui.tests;

import com.google.inject.Injector;
import fr.univcotedazur.l3ia.projetLegoLanguage.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class LegoLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("fr.univcotedazur.l3ia.LegoLanguage");
	}

}
