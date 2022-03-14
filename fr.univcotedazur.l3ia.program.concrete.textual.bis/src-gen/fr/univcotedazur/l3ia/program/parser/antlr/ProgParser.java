/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.program.parser.antlr;

import com.google.inject.Inject;
import fr.univcotedazur.l3ia.program.parser.antlr.internal.InternalProgParser;
import fr.univcotedazur.l3ia.program.services.ProgGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ProgParser extends AbstractAntlrParser {

	@Inject
	private ProgGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProgParser createParser(XtextTokenStream stream) {
		return new InternalProgParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public ProgGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProgGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}