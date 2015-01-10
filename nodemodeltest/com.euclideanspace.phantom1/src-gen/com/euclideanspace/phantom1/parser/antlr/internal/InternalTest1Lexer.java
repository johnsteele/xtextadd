package com.euclideanspace.phantom1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTest1Lexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_KW_CCURLY=6;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_KW_SEMICOLON=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_KW_OCURLY=5;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalTest1Lexer() {;} 
    public InternalTest1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTest1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g"; }

    // $ANTLR start "RULE_KW_OCURLY"
    public final void mRULE_KW_OCURLY() throws RecognitionException {
        try {
            int _type = RULE_KW_OCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:175:16: ( '{' )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:175:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_OCURLY"

    // $ANTLR start "RULE_KW_CCURLY"
    public final void mRULE_KW_CCURLY() throws RecognitionException {
        try {
            int _type = RULE_KW_CCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:177:16: ( '}' )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:177:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_CCURLY"

    // $ANTLR start "RULE_KW_SEMICOLON"
    public final void mRULE_KW_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_KW_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:179:19: ( ';' )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:179:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KW_SEMICOLON"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:181:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:181:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:181:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:181:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:181:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:183:10: ( ( '0' .. '9' )+ )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:183:12: ( '0' .. '9' )+
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:183:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:183:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:185:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:187:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:187:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:187:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:187:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:41: ( '\\r' )? '\\n'
                    {
                    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:189:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:191:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:193:16: ( . )
            // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:193:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:8: ( RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_SEMICOLON | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=10;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:10: RULE_KW_OCURLY
                {
                mRULE_KW_OCURLY(); 

                }
                break;
            case 2 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:25: RULE_KW_CCURLY
                {
                mRULE_KW_CCURLY(); 

                }
                break;
            case 3 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:40: RULE_KW_SEMICOLON
                {
                mRULE_KW_SEMICOLON(); 

                }
                break;
            case 4 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:58: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 5 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:66: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 6 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:75: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 7 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:87: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:103: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:119: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // ../com.euclideanspace.phantom1/src-gen/com/euclideanspace/phantom1/parser/antlr/internal/InternalTest1.g:1:127: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\4\uffff\1\13\2\uffff\3\13\13\uffff";
    static final String DFA12_eofS =
        "\25\uffff";
    static final String DFA12_minS =
        "\1\0\3\uffff\1\101\2\uffff\2\0\1\52\13\uffff";
    static final String DFA12_maxS =
        "\1\uffff\3\uffff\1\172\2\uffff\2\uffff\1\57\13\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\3\uffff\1\11\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA12_specialS =
        "\1\2\6\uffff\1\0\1\1\14\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\12\1\13\1\7\4\13\1\10\7\13\1\11\12\6\1\13\1\3\5\13\32\5\3\13\1\4\1\5\1\13\32\5\1\1\1\13\1\2\uff82\13",
            "",
            "",
            "",
            "\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\0\21",
            "\0\21",
            "\1\22\4\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_KW_OCURLY | RULE_KW_CCURLY | RULE_KW_SEMICOLON | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_7 = input.LA(1);

                        s = -1;
                        if ( ((LA12_7>='\u0000' && LA12_7<='\uFFFF')) ) {s = 17;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 17;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='{') ) {s = 1;}

                        else if ( (LA12_0=='}') ) {s = 2;}

                        else if ( (LA12_0==';') ) {s = 3;}

                        else if ( (LA12_0=='^') ) {s = 4;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 5;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 6;}

                        else if ( (LA12_0=='\"') ) {s = 7;}

                        else if ( (LA12_0=='\'') ) {s = 8;}

                        else if ( (LA12_0=='/') ) {s = 9;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 10;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}