/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.parser.antlr;

import com.google.inject.Inject;
import fr.univcotedazur.l3ia.parser.antlr.internal.InternalLegoLanguageParser;
import fr.univcotedazur.l3ia.services.LegoLanguageGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LegoLanguageParser extends AbstractAntlrParser {

	@Inject
	private LegoLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLegoLanguageParser createParser(XtextTokenStream stream) {
		return new InternalLegoLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Lego";
	}

	public LegoLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LegoLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}