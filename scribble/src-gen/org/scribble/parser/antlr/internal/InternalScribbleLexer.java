package org.scribble.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScribbleLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=6;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int RULE_RPA=9;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_RCB=13;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMA=8;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_LPA=7;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_LT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_COLON=14;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_LCB=12;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_GT=11;
    public static final int RULE_INT=15;
    public static final int RULE_WS=18;
    public static final int RULE_SEMI=5;

    // delegates
    // delegators

    public InternalScribbleLexer() {;} 
    public InternalScribbleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalScribbleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:11:7: ( 'include' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:11:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:12:7: ( 'global' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:12:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:13:7: ( 'protocol' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:13:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:14:7: ( 'role' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:14:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:15:7: ( 'instantiates' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:15:9: 'instantiates'
            {
            match("instantiates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:16:7: ( 'import' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:16:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:17:7: ( 'from' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:17:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:18:7: ( 'as' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:18:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:19:7: ( 'sig' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:19:9: 'sig'
            {
            match("sig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:20:7: ( 'spawns' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:20:9: 'spawns'
            {
            match("spawns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:21:7: ( 'do' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:22:7: ( 'interruptible' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:22:9: 'interruptible'
            {
            match("interruptible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:23:7: ( 'by' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:23:9: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:24:7: ( 'with' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:24:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:25:7: ( 'continue' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:25:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:26:7: ( 'rec' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:26:9: 'rec'
            {
            match("rec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:27:7: ( 'parallel' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:27:9: 'parallel'
            {
            match("parallel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:28:7: ( 'and' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:28:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:29:7: ( 'choice' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:29:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:30:7: ( 'at' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:30:9: 'at'
            {
            match("at"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:31:7: ( 'or' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:31:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:32:7: ( 'to' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:32:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_LCB"
    public final void mRULE_LCB() throws RecognitionException {
        try {
            int _type = RULE_LCB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1806:10: ( '{' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1806:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCB"

    // $ANTLR start "RULE_RCB"
    public final void mRULE_RCB() throws RecognitionException {
        try {
            int _type = RULE_RCB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1808:10: ( '}' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1808:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCB"

    // $ANTLR start "RULE_LPA"
    public final void mRULE_LPA() throws RecognitionException {
        try {
            int _type = RULE_LPA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1810:10: ( '(' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1810:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPA"

    // $ANTLR start "RULE_RPA"
    public final void mRULE_RPA() throws RecognitionException {
        try {
            int _type = RULE_RPA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1812:10: ( ')' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1812:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPA"

    // $ANTLR start "RULE_SEMI"
    public final void mRULE_SEMI() throws RecognitionException {
        try {
            int _type = RULE_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1814:11: ( ';' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1814:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1816:12: ( ':' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1816:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1818:12: ( ',' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1818:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1820:9: ( '>' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1820:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1822:9: ( '<' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1822:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1824:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1824:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1824:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1824:11: '^'
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

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1824:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1826:10: ( ( '0' .. '9' )+ )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1826:12: ( '0' .. '9' )+
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1826:12: ( '0' .. '9' )+
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
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1826:13: '0' .. '9'
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1828:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1830:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1830:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1830:24: ( options {greedy=false; } : . )*
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
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1830:52: .
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:41: ( '\\r' )? '\\n'
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1832:41: '\\r'
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1834:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1834:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1834:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:
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
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1836:16: ( . )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1836:18: .
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
        // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_LCB | RULE_RCB | RULE_LPA | RULE_RPA | RULE_SEMI | RULE_COLON | RULE_COMMA | RULE_GT | RULE_LT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:142: RULE_LCB
                {
                mRULE_LCB(); 

                }
                break;
            case 24 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:151: RULE_RCB
                {
                mRULE_RCB(); 

                }
                break;
            case 25 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:160: RULE_LPA
                {
                mRULE_LPA(); 

                }
                break;
            case 26 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:169: RULE_RPA
                {
                mRULE_RPA(); 

                }
                break;
            case 27 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:178: RULE_SEMI
                {
                mRULE_SEMI(); 

                }
                break;
            case 28 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:188: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 29 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:199: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 30 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:210: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 31 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:218: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 32 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\15\41\11\uffff\1\36\2\uffff\3\36\2\uffff\2\41\1\uffff"+
        "\6\41\1\114\1\41\1\116\2\41\1\121\1\122\3\41\1\126\1\127\16\uffff"+
        "\10\41\1\140\1\41\1\uffff\1\142\1\uffff\1\143\1\41\2\uffff\3\41"+
        "\2\uffff\7\41\1\157\1\uffff\1\160\2\uffff\1\41\1\162\11\41\2\uffff"+
        "\1\41\1\uffff\5\41\1\u0082\1\u0083\2\41\1\u0086\1\41\1\u0088\1\u0089"+
        "\2\41\2\uffff\2\41\1\uffff\1\41\2\uffff\2\41\1\u0091\1\u0092\1\u0093"+
        "\2\41\3\uffff\4\41\1\u009a\1\41\1\uffff\1\u009c\1\uffff";
    static final String DFA12_eofS =
        "\u009d\uffff";
    static final String DFA12_minS =
        "\1\0\1\155\1\154\1\141\1\145\1\162\1\156\1\151\1\157\1\171\1\151"+
        "\1\150\1\162\1\157\11\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\143"+
        "\1\160\1\uffff\2\157\1\162\1\154\1\143\1\157\1\60\1\144\1\60\1\147"+
        "\1\141\2\60\1\164\1\156\1\157\2\60\16\uffff\1\154\1\164\1\145\1"+
        "\157\1\142\1\164\1\141\1\145\1\60\1\155\1\uffff\1\60\1\uffff\1\60"+
        "\1\167\2\uffff\1\150\1\164\1\151\2\uffff\1\165\1\141\2\162\1\141"+
        "\1\157\1\154\1\60\1\uffff\1\60\2\uffff\1\156\1\60\1\151\1\143\1"+
        "\144\1\156\1\162\1\164\1\154\1\143\1\154\2\uffff\1\163\1\uffff\1"+
        "\156\2\145\1\164\1\165\2\60\1\157\1\145\1\60\1\165\2\60\1\151\1"+
        "\160\2\uffff\2\154\1\uffff\1\145\2\uffff\1\141\1\164\3\60\1\164"+
        "\1\151\3\uffff\1\145\1\142\1\163\1\154\1\60\1\145\1\uffff\1\60\1"+
        "\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\154\1\162\1\157\1\162\1\164\1\160\1\157\1\171"+
        "\1\151\1\157\1\162\1\157\11\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff"+
        "\1\164\1\160\1\uffff\2\157\1\162\1\154\1\143\1\157\1\172\1\144\1"+
        "\172\1\147\1\141\2\172\1\164\1\156\1\157\2\172\16\uffff\1\154\1"+
        "\164\1\145\1\157\1\142\1\164\1\141\1\145\1\172\1\155\1\uffff\1\172"+
        "\1\uffff\1\172\1\167\2\uffff\1\150\1\164\1\151\2\uffff\1\165\1\141"+
        "\2\162\1\141\1\157\1\154\1\172\1\uffff\1\172\2\uffff\1\156\1\172"+
        "\1\151\1\143\1\144\1\156\1\162\1\164\1\154\1\143\1\154\2\uffff\1"+
        "\163\1\uffff\1\156\2\145\1\164\1\165\2\172\1\157\1\145\1\172\1\165"+
        "\2\172\1\151\1\160\2\uffff\2\154\1\uffff\1\145\2\uffff\1\141\1\164"+
        "\3\172\1\164\1\151\3\uffff\1\145\1\142\1\163\1\154\1\172\1\145\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\16\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff"+
        "\1\40\1\41\3\uffff\1\45\1\46\2\uffff\1\40\22\uffff\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45\12\uffff"+
        "\1\10\1\uffff\1\24\2\uffff\1\13\1\15\3\uffff\1\25\1\26\10\uffff"+
        "\1\20\1\uffff\1\22\1\11\13\uffff\1\4\1\7\1\uffff\1\16\17\uffff\1"+
        "\6\1\2\2\uffff\1\12\1\uffff\1\23\1\1\7\uffff\1\3\1\21\1\17\6\uffff"+
        "\1\5\1\uffff\1\14";
    static final String DFA12_specialS =
        "\1\2\31\uffff\1\1\1\0\u0081\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\4\36\1\33\1\20\1"+
            "\21\2\36\1\24\2\36\1\34\12\31\1\23\1\22\1\26\1\36\1\25\2\36"+
            "\32\30\3\36\1\27\1\30\1\36\1\6\1\11\1\13\1\10\1\30\1\5\1\2\1"+
            "\30\1\1\5\30\1\14\1\3\1\30\1\4\1\7\1\15\2\30\1\12\3\30\1\16"+
            "\1\36\1\17\uff82\36",
            "\1\40\1\37",
            "\1\42",
            "\1\44\20\uffff\1\43",
            "\1\46\11\uffff\1\45",
            "\1\47",
            "\1\51\4\uffff\1\50\1\52",
            "\1\53\6\uffff\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\61\6\uffff\1\60",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\1\102\17\uffff\1\103\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\115",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\117",
            "\1\120",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\141",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0084",
            "\1\u0085",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009b",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_LCB | RULE_RCB | RULE_LPA | RULE_RPA | RULE_SEMI | RULE_COLON | RULE_COMMA | RULE_GT | RULE_LT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFF')) ) {s = 62;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 62;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='g') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='r') ) {s = 4;}

                        else if ( (LA12_0=='f') ) {s = 5;}

                        else if ( (LA12_0=='a') ) {s = 6;}

                        else if ( (LA12_0=='s') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='b') ) {s = 9;}

                        else if ( (LA12_0=='w') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='o') ) {s = 12;}

                        else if ( (LA12_0=='t') ) {s = 13;}

                        else if ( (LA12_0=='{') ) {s = 14;}

                        else if ( (LA12_0=='}') ) {s = 15;}

                        else if ( (LA12_0=='(') ) {s = 16;}

                        else if ( (LA12_0==')') ) {s = 17;}

                        else if ( (LA12_0==';') ) {s = 18;}

                        else if ( (LA12_0==':') ) {s = 19;}

                        else if ( (LA12_0==',') ) {s = 20;}

                        else if ( (LA12_0=='>') ) {s = 21;}

                        else if ( (LA12_0=='<') ) {s = 22;}

                        else if ( (LA12_0=='^') ) {s = 23;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 24;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 25;}

                        else if ( (LA12_0=='\"') ) {s = 26;}

                        else if ( (LA12_0=='\'') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 29;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0=='='||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 30;}

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