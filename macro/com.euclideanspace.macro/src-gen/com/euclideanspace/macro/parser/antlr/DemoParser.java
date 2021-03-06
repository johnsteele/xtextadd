/*
* generated by Xtext
*/
package com.euclideanspace.macro.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.euclideanspace.macro.services.DemoGrammarAccess;

public class DemoParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DemoGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.euclideanspace.macro.parser.antlr.internal.InternalDemoParser createParser(XtextTokenStream stream) {
		return new com.euclideanspace.macro.parser.antlr.internal.InternalDemoParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public DemoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DemoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
