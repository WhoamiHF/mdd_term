/*
 * generated by Xtext 2.36.0
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.parser.antlr.internal.InternalTerm_projectParser;
import org.xtext.example.services.Term_projectGrammarAccess;

public class Term_projectParser extends AbstractAntlrParser {

	@Inject
	private Term_projectGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTerm_projectParser createParser(XtextTokenStream stream) {
		return new InternalTerm_projectParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Term_projectGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Term_projectGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
