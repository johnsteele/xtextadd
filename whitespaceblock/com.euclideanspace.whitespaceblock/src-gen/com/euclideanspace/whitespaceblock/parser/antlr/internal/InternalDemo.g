/*
* generated by Xtext
*/
grammar InternalDemo;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.euclideanspace.whitespaceblock.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.euclideanspace.whitespaceblock.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;

}

@parser::members {

 	private DemoGrammarAccess grammarAccess;
 	
    public InternalDemoParser(TokenStream input, DemoGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected DemoGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
	    }
		lv_contents_0_0=ruleRecurse		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"contents",
        		lv_contents_0_0, 
        		"Recurse");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleRecurse
entryRuleRecurse returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");
	}
	:
	{ newCompositeNode(grammarAccess.getRecurseRule()); }
	 iv_ruleRecurse=ruleRecurse 
	 { $current=$iv_ruleRecurse.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Recurse
ruleRecurse returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION");
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRecurseAccess().getRecurseAction_0(),
            $current);
    }
)((
(
		lv_n_1_0=RULE_ID
		{
			newLeafNode(lv_n_1_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRecurseRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"n",
        		lv_n_1_0, 
        		"ID");
	    }

)
)
    |(this_BEGIN_2=RULE_BEGIN
    { 
    newLeafNode(this_BEGIN_2, grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_1_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_1_1_0()); 
	    }
		lv_r_3_0=ruleRecurse		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRecurseRule());
	        }
       		add(
       			$current, 
       			"r",
        		lv_r_3_0, 
        		"Recurse");
	        afterParserOrEnumRuleCall();
	    }

)
)this_END_4=RULE_END
    { 
    newLeafNode(this_END_4, grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_1_2()); 
    }
))+)
;
finally {
	myHiddenTokenState.restore();
}





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_BEGIN : '{|';

RULE_END : '|}';

RULE_LINECONTINUATION : '\\';

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


