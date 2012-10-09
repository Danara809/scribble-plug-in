package org.scribble.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.scribble.services.ScribbleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScribbleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SEMI", "RULE_ID", "RULE_LPA", "RULE_COMMA", "RULE_RPA", "RULE_LT", "RULE_GT", "RULE_LCB", "RULE_RCB", "RULE_COLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'global'", "'protocol'", "'role'", "'instantiates'", "'import'", "'from'", "'as'", "'sig'", "'spawns'", "'do'", "'interruptible'", "'by'", "'with'", "'continue'", "'rec'", "'parallel'", "'and'", "'choice'", "'at'", "'or'", "'to'"
    };
    public static final int RULE_ID=6;
    public static final int T__40=40;
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
    public static final int RULE_COLON=14;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int RULE_LCB=12;
    public static final int T__34=34;
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


        public InternalScribbleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScribbleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScribbleParser.tokenNames; }
    public String getGrammarFileName() { return "../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g"; }



     	private ScribbleGrammarAccess grammarAccess;
     	
        public InternalScribbleParser(TokenStream input, ScribbleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ScribbleProgram";	
       	}
       	
       	@Override
       	protected ScribbleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScribbleProgram"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:67:1: entryRuleScribbleProgram returns [EObject current=null] : iv_ruleScribbleProgram= ruleScribbleProgram EOF ;
    public final EObject entryRuleScribbleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScribbleProgram = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:68:2: (iv_ruleScribbleProgram= ruleScribbleProgram EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:69:2: iv_ruleScribbleProgram= ruleScribbleProgram EOF
            {
             newCompositeNode(grammarAccess.getScribbleProgramRule()); 
            pushFollow(FOLLOW_ruleScribbleProgram_in_entryRuleScribbleProgram75);
            iv_ruleScribbleProgram=ruleScribbleProgram();

            state._fsp--;

             current =iv_ruleScribbleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScribbleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScribbleProgram"


    // $ANTLR start "ruleScribbleProgram"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:76:1: ruleScribbleProgram returns [EObject current=null] : ( ( (lv_includeDecl_0_0= ruleIncludeDecl ) )* ( (lv_typeDecl_1_0= ruleTypeDecl ) )* ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+ ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )* ) ;
    public final EObject ruleScribbleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_includeDecl_0_0 = null;

        EObject lv_typeDecl_1_0 = null;

        EObject lv_globalProtocolDecl_2_0 = null;

        EObject lv_instGlobalProtocolDecl_3_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:79:28: ( ( ( (lv_includeDecl_0_0= ruleIncludeDecl ) )* ( (lv_typeDecl_1_0= ruleTypeDecl ) )* ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+ ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )* ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:80:1: ( ( (lv_includeDecl_0_0= ruleIncludeDecl ) )* ( (lv_typeDecl_1_0= ruleTypeDecl ) )* ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+ ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )* )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:80:1: ( ( (lv_includeDecl_0_0= ruleIncludeDecl ) )* ( (lv_typeDecl_1_0= ruleTypeDecl ) )* ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+ ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )* )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:80:2: ( (lv_includeDecl_0_0= ruleIncludeDecl ) )* ( (lv_typeDecl_1_0= ruleTypeDecl ) )* ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+ ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )*
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:80:2: ( (lv_includeDecl_0_0= ruleIncludeDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:81:1: (lv_includeDecl_0_0= ruleIncludeDecl )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:81:1: (lv_includeDecl_0_0= ruleIncludeDecl )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:82:3: lv_includeDecl_0_0= ruleIncludeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScribbleProgramAccess().getIncludeDeclIncludeDeclParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludeDecl_in_ruleScribbleProgram131);
            	    lv_includeDecl_0_0=ruleIncludeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScribbleProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includeDecl",
            	            		lv_includeDecl_0_0, 
            	            		"IncludeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:98:3: ( (lv_typeDecl_1_0= ruleTypeDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:99:1: (lv_typeDecl_1_0= ruleTypeDecl )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:99:1: (lv_typeDecl_1_0= ruleTypeDecl )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:100:3: lv_typeDecl_1_0= ruleTypeDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScribbleProgramAccess().getTypeDeclTypeDeclParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDecl_in_ruleScribbleProgram153);
            	    lv_typeDecl_1_0=ruleTypeDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScribbleProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeDecl",
            	            		lv_typeDecl_1_0, 
            	            		"TypeDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:116:3: ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:117:1: (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:117:1: (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:118:3: lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclGlobalProtocolDeclParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalProtocolDecl_in_ruleScribbleProgram175);
            	    lv_globalProtocolDecl_2_0=ruleGlobalProtocolDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScribbleProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"globalProtocolDecl",
            	            		lv_globalProtocolDecl_2_0, 
            	            		"GlobalProtocolDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:134:3: ( (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:135:1: (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:135:1: (lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:136:3: lv_instGlobalProtocolDecl_3_0= ruleInstGlobalProtocolDecl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScribbleProgramAccess().getInstGlobalProtocolDeclInstGlobalProtocolDeclParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstGlobalProtocolDecl_in_ruleScribbleProgram197);
            	    lv_instGlobalProtocolDecl_3_0=ruleInstGlobalProtocolDecl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScribbleProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instGlobalProtocolDecl",
            	            		lv_instGlobalProtocolDecl_3_0, 
            	            		"InstGlobalProtocolDecl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScribbleProgram"


    // $ANTLR start "entryRuleIncludeDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:160:1: entryRuleIncludeDecl returns [EObject current=null] : iv_ruleIncludeDecl= ruleIncludeDecl EOF ;
    public final EObject entryRuleIncludeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDecl = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:161:2: (iv_ruleIncludeDecl= ruleIncludeDecl EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:162:2: iv_ruleIncludeDecl= ruleIncludeDecl EOF
            {
             newCompositeNode(grammarAccess.getIncludeDeclRule()); 
            pushFollow(FOLLOW_ruleIncludeDecl_in_entryRuleIncludeDecl234);
            iv_ruleIncludeDecl=ruleIncludeDecl();

            state._fsp--;

             current =iv_ruleIncludeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDecl244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludeDecl"


    // $ANTLR start "ruleIncludeDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:169:1: ruleIncludeDecl returns [EObject current=null] : (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ) ;
    public final EObject ruleIncludeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token this_SEMI_2=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:172:28: ( (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:173:1: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:173:1: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:173:3: otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) this_SEMI_2= RULE_SEMI
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIncludeDecl281); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludeDeclAccess().getIncludeKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:177:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:178:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:178:1: (lv_importURI_1_0= RULE_STRING )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:179:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIncludeDecl298); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeDeclAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleIncludeDecl314); 
             
                newLeafNode(this_SEMI_2, grammarAccess.getIncludeDeclAccess().getSEMITerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludeDecl"


    // $ANTLR start "entryRuleInstGlobalProtocolDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:207:1: entryRuleInstGlobalProtocolDecl returns [EObject current=null] : iv_ruleInstGlobalProtocolDecl= ruleInstGlobalProtocolDecl EOF ;
    public final EObject entryRuleInstGlobalProtocolDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstGlobalProtocolDecl = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:208:2: (iv_ruleInstGlobalProtocolDecl= ruleInstGlobalProtocolDecl EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:209:2: iv_ruleInstGlobalProtocolDecl= ruleInstGlobalProtocolDecl EOF
            {
             newCompositeNode(grammarAccess.getInstGlobalProtocolDeclRule()); 
            pushFollow(FOLLOW_ruleInstGlobalProtocolDecl_in_entryRuleInstGlobalProtocolDecl349);
            iv_ruleInstGlobalProtocolDecl=ruleInstGlobalProtocolDecl();

            state._fsp--;

             current =iv_ruleInstGlobalProtocolDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstGlobalProtocolDecl359); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstGlobalProtocolDecl"


    // $ANTLR start "ruleInstGlobalProtocolDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:216:1: ruleInstGlobalProtocolDecl returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) this_LPA_3= RULE_LPA otherlv_4= 'role' ( (lv_roles_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )* this_RPA_9= RULE_RPA otherlv_10= 'instantiates' ( (lv_instantiatedProtocol_11_0= RULE_ID ) ) this_SEMI_12= RULE_SEMI ) ;
    public final EObject ruleInstGlobalProtocolDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token this_LPA_3=null;
        Token otherlv_4=null;
        Token lv_roles_5_0=null;
        Token this_COMMA_6=null;
        Token otherlv_7=null;
        Token lv_roles_8_0=null;
        Token this_RPA_9=null;
        Token otherlv_10=null;
        Token lv_instantiatedProtocol_11_0=null;
        Token this_SEMI_12=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:219:28: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) this_LPA_3= RULE_LPA otherlv_4= 'role' ( (lv_roles_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )* this_RPA_9= RULE_RPA otherlv_10= 'instantiates' ( (lv_instantiatedProtocol_11_0= RULE_ID ) ) this_SEMI_12= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:220:1: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) this_LPA_3= RULE_LPA otherlv_4= 'role' ( (lv_roles_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )* this_RPA_9= RULE_RPA otherlv_10= 'instantiates' ( (lv_instantiatedProtocol_11_0= RULE_ID ) ) this_SEMI_12= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:220:1: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) this_LPA_3= RULE_LPA otherlv_4= 'role' ( (lv_roles_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )* this_RPA_9= RULE_RPA otherlv_10= 'instantiates' ( (lv_instantiatedProtocol_11_0= RULE_ID ) ) this_SEMI_12= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:220:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) this_LPA_3= RULE_LPA otherlv_4= 'role' ( (lv_roles_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )* this_RPA_9= RULE_RPA otherlv_10= 'instantiates' ( (lv_instantiatedProtocol_11_0= RULE_ID ) ) this_SEMI_12= RULE_SEMI
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInstGlobalProtocolDecl396); 

                	newLeafNode(otherlv_0, grammarAccess.getInstGlobalProtocolDeclAccess().getGlobalKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInstGlobalProtocolDecl408); 

                	newLeafNode(otherlv_1, grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolKeyword_1());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:228:1: ( (lv_protocolName_2_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:229:1: (lv_protocolName_2_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:229:1: (lv_protocolName_2_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:230:3: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl425); 

            			newLeafNode(lv_protocolName_2_0, grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstGlobalProtocolDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"protocolName",
                    		lv_protocolName_2_0, 
                    		"ID");
            	    

            }


            }

            this_LPA_3=(Token)match(input,RULE_LPA,FOLLOW_RULE_LPA_in_ruleInstGlobalProtocolDecl441); 
             
                newLeafNode(this_LPA_3, grammarAccess.getInstGlobalProtocolDeclAccess().getLPATerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleInstGlobalProtocolDecl452); 

                	newLeafNode(otherlv_4, grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_4());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:254:1: ( (lv_roles_5_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:255:1: (lv_roles_5_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:255:1: (lv_roles_5_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:256:3: lv_roles_5_0= RULE_ID
            {
            lv_roles_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl469); 

            			newLeafNode(lv_roles_5_0, grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstGlobalProtocolDeclRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"roles",
                    		lv_roles_5_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:272:2: (this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:272:3: this_COMMA_6= RULE_COMMA otherlv_7= 'role' ( (lv_roles_8_0= RULE_ID ) )
            	    {
            	    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInstGlobalProtocolDecl486); 
            	     
            	        newLeafNode(this_COMMA_6, grammarAccess.getInstGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_6_0()); 
            	        
            	    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleInstGlobalProtocolDecl497); 

            	        	newLeafNode(otherlv_7, grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_6_1());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:280:1: ( (lv_roles_8_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:281:1: (lv_roles_8_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:281:1: (lv_roles_8_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:282:3: lv_roles_8_0= RULE_ID
            	    {
            	    lv_roles_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl514); 

            	    			newLeafNode(lv_roles_8_0, grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_6_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInstGlobalProtocolDeclRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"roles",
            	            		lv_roles_8_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_RPA_9=(Token)match(input,RULE_RPA,FOLLOW_RULE_RPA_in_ruleInstGlobalProtocolDecl532); 
             
                newLeafNode(this_RPA_9, grammarAccess.getInstGlobalProtocolDeclAccess().getRPATerminalRuleCall_7()); 
                
            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleInstGlobalProtocolDecl543); 

                	newLeafNode(otherlv_10, grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatesKeyword_8());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:306:1: ( (lv_instantiatedProtocol_11_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:307:1: (lv_instantiatedProtocol_11_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:307:1: (lv_instantiatedProtocol_11_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:308:3: lv_instantiatedProtocol_11_0= RULE_ID
            {
            lv_instantiatedProtocol_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl560); 

            			newLeafNode(lv_instantiatedProtocol_11_0, grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatedProtocolIDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstGlobalProtocolDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"instantiatedProtocol",
                    		lv_instantiatedProtocol_11_0, 
                    		"ID");
            	    

            }


            }

            this_SEMI_12=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleInstGlobalProtocolDecl576); 
             
                newLeafNode(this_SEMI_12, grammarAccess.getInstGlobalProtocolDeclAccess().getSEMITerminalRuleCall_10()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstGlobalProtocolDecl"


    // $ANTLR start "entryRuleTypeDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:336:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:337:2: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:338:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl611);
            iv_ruleTypeDecl=ruleTypeDecl();

            state._fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:345:1: ruleTypeDecl returns [EObject current=null] : (otherlv_0= 'import' ( (lv_typeName_1_0= RULE_ID ) ) otherlv_2= 'from' this_LT_3= RULE_LT ( (lv_schema_4_0= RULE_ID ) ) this_GT_5= RULE_GT ( (lv_file_6_0= RULE_ID ) ) (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? this_SEMI_9= RULE_SEMI ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_typeName_1_0=null;
        Token otherlv_2=null;
        Token this_LT_3=null;
        Token lv_schema_4_0=null;
        Token this_GT_5=null;
        Token lv_file_6_0=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        Token this_SEMI_9=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:348:28: ( (otherlv_0= 'import' ( (lv_typeName_1_0= RULE_ID ) ) otherlv_2= 'from' this_LT_3= RULE_LT ( (lv_schema_4_0= RULE_ID ) ) this_GT_5= RULE_GT ( (lv_file_6_0= RULE_ID ) ) (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? this_SEMI_9= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:349:1: (otherlv_0= 'import' ( (lv_typeName_1_0= RULE_ID ) ) otherlv_2= 'from' this_LT_3= RULE_LT ( (lv_schema_4_0= RULE_ID ) ) this_GT_5= RULE_GT ( (lv_file_6_0= RULE_ID ) ) (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? this_SEMI_9= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:349:1: (otherlv_0= 'import' ( (lv_typeName_1_0= RULE_ID ) ) otherlv_2= 'from' this_LT_3= RULE_LT ( (lv_schema_4_0= RULE_ID ) ) this_GT_5= RULE_GT ( (lv_file_6_0= RULE_ID ) ) (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? this_SEMI_9= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:349:3: otherlv_0= 'import' ( (lv_typeName_1_0= RULE_ID ) ) otherlv_2= 'from' this_LT_3= RULE_LT ( (lv_schema_4_0= RULE_ID ) ) this_GT_5= RULE_GT ( (lv_file_6_0= RULE_ID ) ) (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? this_SEMI_9= RULE_SEMI
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTypeDecl658); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeDeclAccess().getImportKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:353:1: ( (lv_typeName_1_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:354:1: (lv_typeName_1_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:354:1: (lv_typeName_1_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:355:3: lv_typeName_1_0= RULE_ID
            {
            lv_typeName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl675); 

            			newLeafNode(lv_typeName_1_0, grammarAccess.getTypeDeclAccess().getTypeNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"typeName",
                    		lv_typeName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleTypeDecl692); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDeclAccess().getFromKeyword_2());
                
            this_LT_3=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleTypeDecl703); 
             
                newLeafNode(this_LT_3, grammarAccess.getTypeDeclAccess().getLTTerminalRuleCall_3()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:379:1: ( (lv_schema_4_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:380:1: (lv_schema_4_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:380:1: (lv_schema_4_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:381:3: lv_schema_4_0= RULE_ID
            {
            lv_schema_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl719); 

            			newLeafNode(lv_schema_4_0, grammarAccess.getTypeDeclAccess().getSchemaIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"schema",
                    		lv_schema_4_0, 
                    		"ID");
            	    

            }


            }

            this_GT_5=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleTypeDecl735); 
             
                newLeafNode(this_GT_5, grammarAccess.getTypeDeclAccess().getGTTerminalRuleCall_5()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:401:1: ( (lv_file_6_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:402:1: (lv_file_6_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:402:1: (lv_file_6_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:403:3: lv_file_6_0= RULE_ID
            {
            lv_file_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl751); 

            			newLeafNode(lv_file_6_0, grammarAccess.getTypeDeclAccess().getFileIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"file",
                    		lv_file_6_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:419:2: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:419:4: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleTypeDecl769); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeDeclAccess().getAsKeyword_7_0());
                        
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:423:1: ( (lv_alias_8_0= RULE_ID ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:424:1: (lv_alias_8_0= RULE_ID )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:424:1: (lv_alias_8_0= RULE_ID )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:425:3: lv_alias_8_0= RULE_ID
                    {
                    lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDecl786); 

                    			newLeafNode(lv_alias_8_0, grammarAccess.getTypeDeclAccess().getAliasIDTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            this_SEMI_9=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleTypeDecl804); 
             
                newLeafNode(this_SEMI_9, grammarAccess.getTypeDeclAccess().getSEMITerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleGlobalProtocolDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:453:1: entryRuleGlobalProtocolDecl returns [EObject current=null] : iv_ruleGlobalProtocolDecl= ruleGlobalProtocolDecl EOF ;
    public final EObject entryRuleGlobalProtocolDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalProtocolDecl = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:454:2: (iv_ruleGlobalProtocolDecl= ruleGlobalProtocolDecl EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:455:2: iv_ruleGlobalProtocolDecl= ruleGlobalProtocolDecl EOF
            {
             newCompositeNode(grammarAccess.getGlobalProtocolDeclRule()); 
            pushFollow(FOLLOW_ruleGlobalProtocolDecl_in_entryRuleGlobalProtocolDecl839);
            iv_ruleGlobalProtocolDecl=ruleGlobalProtocolDecl();

            state._fsp--;

             current =iv_ruleGlobalProtocolDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalProtocolDecl849); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalProtocolDecl"


    // $ANTLR start "ruleGlobalProtocolDecl"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:462:1: ruleGlobalProtocolDecl returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )? this_RPA_16= RULE_RPA ( (lv_body_17_0= ruleGlobalInteractionBlock ) ) ) ;
    public final EObject ruleGlobalProtocolDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_protocolName_2_0=null;
        Token this_LT_3=null;
        Token otherlv_4=null;
        Token lv_parameters_5_0=null;
        Token this_COMMA_6=null;
        Token otherlv_7=null;
        Token lv_parameters_8_0=null;
        Token this_GT_9=null;
        Token this_LPA_10=null;
        Token otherlv_11=null;
        Token lv_roles_12_0=null;
        Token this_COMMA_13=null;
        Token otherlv_14=null;
        Token lv_roles_15_0=null;
        Token this_RPA_16=null;
        EObject lv_body_17_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:465:28: ( (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )? this_RPA_16= RULE_RPA ( (lv_body_17_0= ruleGlobalInteractionBlock ) ) ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:466:1: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )? this_RPA_16= RULE_RPA ( (lv_body_17_0= ruleGlobalInteractionBlock ) ) )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:466:1: (otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )? this_RPA_16= RULE_RPA ( (lv_body_17_0= ruleGlobalInteractionBlock ) ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:466:3: otherlv_0= 'global' otherlv_1= 'protocol' ( (lv_protocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )? this_RPA_16= RULE_RPA ( (lv_body_17_0= ruleGlobalInteractionBlock ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleGlobalProtocolDecl886); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalProtocolDeclAccess().getGlobalKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleGlobalProtocolDecl898); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalProtocolDeclAccess().getProtocolKeyword_1());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:474:1: ( (lv_protocolName_2_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:475:1: (lv_protocolName_2_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:475:1: (lv_protocolName_2_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:476:3: lv_protocolName_2_0= RULE_ID
            {
            lv_protocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl915); 

            			newLeafNode(lv_protocolName_2_0, grammarAccess.getGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalProtocolDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"protocolName",
                    		lv_protocolName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:492:2: (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:492:3: this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT
                    {
                    this_LT_3=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleGlobalProtocolDecl932); 
                     
                        newLeafNode(this_LT_3, grammarAccess.getGlobalProtocolDeclAccess().getLTTerminalRuleCall_3_0()); 
                        
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleGlobalProtocolDecl943); 

                        	newLeafNode(otherlv_4, grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_1());
                        
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:500:1: ( (lv_parameters_5_0= RULE_ID ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:501:1: (lv_parameters_5_0= RULE_ID )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:501:1: (lv_parameters_5_0= RULE_ID )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:502:3: lv_parameters_5_0= RULE_ID
                    {
                    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl960); 

                    			newLeafNode(lv_parameters_5_0, grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlobalProtocolDeclRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:518:2: (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:518:3: this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) )
                    	    {
                    	    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleGlobalProtocolDecl977); 
                    	     
                    	        newLeafNode(this_COMMA_6, grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_3_3_0()); 
                    	        
                    	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleGlobalProtocolDecl988); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_3_1());
                    	        
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:526:1: ( (lv_parameters_8_0= RULE_ID ) )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:527:1: (lv_parameters_8_0= RULE_ID )
                    	    {
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:527:1: (lv_parameters_8_0= RULE_ID )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:528:3: lv_parameters_8_0= RULE_ID
                    	    {
                    	    lv_parameters_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1005); 

                    	    			newLeafNode(lv_parameters_8_0, grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGlobalProtocolDeclRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_GT_9=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleGlobalProtocolDecl1023); 
                     
                        newLeafNode(this_GT_9, grammarAccess.getGlobalProtocolDeclAccess().getGTTerminalRuleCall_3_4()); 
                        

                    }
                    break;

            }

            this_LPA_10=(Token)match(input,RULE_LPA,FOLLOW_RULE_LPA_in_ruleGlobalProtocolDecl1035); 
             
                newLeafNode(this_LPA_10, grammarAccess.getGlobalProtocolDeclAccess().getLPATerminalRuleCall_4()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:552:1: (otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:552:3: otherlv_11= 'role' ( (lv_roles_12_0= RULE_ID ) ) (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )*
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleGlobalProtocolDecl1047); 

                        	newLeafNode(otherlv_11, grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_0());
                        
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:556:1: ( (lv_roles_12_0= RULE_ID ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:557:1: (lv_roles_12_0= RULE_ID )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:557:1: (lv_roles_12_0= RULE_ID )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:558:3: lv_roles_12_0= RULE_ID
                    {
                    lv_roles_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1064); 

                    			newLeafNode(lv_roles_12_0, grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGlobalProtocolDeclRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"roles",
                            		lv_roles_12_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:574:2: (this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:574:3: this_COMMA_13= RULE_COMMA otherlv_14= 'role' ( (lv_roles_15_0= RULE_ID ) )
                    	    {
                    	    this_COMMA_13=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleGlobalProtocolDecl1081); 
                    	     
                    	        newLeafNode(this_COMMA_13, grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_5_2_0()); 
                    	        
                    	    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleGlobalProtocolDecl1092); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_2_1());
                    	        
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:582:1: ( (lv_roles_15_0= RULE_ID ) )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:583:1: (lv_roles_15_0= RULE_ID )
                    	    {
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:583:1: (lv_roles_15_0= RULE_ID )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:584:3: lv_roles_15_0= RULE_ID
                    	    {
                    	    lv_roles_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1109); 

                    	    			newLeafNode(lv_roles_15_0, grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGlobalProtocolDeclRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"roles",
                    	            		lv_roles_15_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPA_16=(Token)match(input,RULE_RPA,FOLLOW_RULE_RPA_in_ruleGlobalProtocolDecl1129); 
             
                newLeafNode(this_RPA_16, grammarAccess.getGlobalProtocolDeclAccess().getRPATerminalRuleCall_6()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:604:1: ( (lv_body_17_0= ruleGlobalInteractionBlock ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:605:1: (lv_body_17_0= ruleGlobalInteractionBlock )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:605:1: (lv_body_17_0= ruleGlobalInteractionBlock )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:606:3: lv_body_17_0= ruleGlobalInteractionBlock
            {
             
            	        newCompositeNode(grammarAccess.getGlobalProtocolDeclAccess().getBodyGlobalInteractionBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleGlobalProtocolDecl1149);
            lv_body_17_0=ruleGlobalInteractionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalProtocolDeclRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_17_0, 
                    		"GlobalInteractionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalProtocolDecl"


    // $ANTLR start "entryRuleGlobalInteractionBlock"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:630:1: entryRuleGlobalInteractionBlock returns [EObject current=null] : iv_ruleGlobalInteractionBlock= ruleGlobalInteractionBlock EOF ;
    public final EObject entryRuleGlobalInteractionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalInteractionBlock = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:631:2: (iv_ruleGlobalInteractionBlock= ruleGlobalInteractionBlock EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:632:2: iv_ruleGlobalInteractionBlock= ruleGlobalInteractionBlock EOF
            {
             newCompositeNode(grammarAccess.getGlobalInteractionBlockRule()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_entryRuleGlobalInteractionBlock1185);
            iv_ruleGlobalInteractionBlock=ruleGlobalInteractionBlock();

            state._fsp--;

             current =iv_ruleGlobalInteractionBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInteractionBlock1195); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalInteractionBlock"


    // $ANTLR start "ruleGlobalInteractionBlock"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:639:1: ruleGlobalInteractionBlock returns [EObject current=null] : (this_LCB_0= RULE_LCB ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+ this_RCB_2= RULE_RCB ) ;
    public final EObject ruleGlobalInteractionBlock() throws RecognitionException {
        EObject current = null;

        Token this_LCB_0=null;
        Token this_RCB_2=null;
        EObject lv_interactionsequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:642:28: ( (this_LCB_0= RULE_LCB ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+ this_RCB_2= RULE_RCB ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:643:1: (this_LCB_0= RULE_LCB ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+ this_RCB_2= RULE_RCB )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:643:1: (this_LCB_0= RULE_LCB ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+ this_RCB_2= RULE_RCB )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:643:2: this_LCB_0= RULE_LCB ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+ this_RCB_2= RULE_RCB
            {
            this_LCB_0=(Token)match(input,RULE_LCB,FOLLOW_RULE_LCB_in_ruleGlobalInteractionBlock1231); 
             
                newLeafNode(this_LCB_0, grammarAccess.getGlobalInteractionBlockAccess().getLCBTerminalRuleCall_0()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:647:1: ( (lv_interactionsequence_1_0= ruleGlobalInteraction ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=30 && LA11_0<=31)||(LA11_0>=34 && LA11_0<=36)||LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:648:1: (lv_interactionsequence_1_0= ruleGlobalInteraction )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:648:1: (lv_interactionsequence_1_0= ruleGlobalInteraction )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:649:3: lv_interactionsequence_1_0= ruleGlobalInteraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceGlobalInteractionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalInteraction_in_ruleGlobalInteractionBlock1251);
            	    lv_interactionsequence_1_0=ruleGlobalInteraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGlobalInteractionBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interactionsequence",
            	            		lv_interactionsequence_1_0, 
            	            		"GlobalInteraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            this_RCB_2=(Token)match(input,RULE_RCB,FOLLOW_RULE_RCB_in_ruleGlobalInteractionBlock1263); 
             
                newLeafNode(this_RCB_2, grammarAccess.getGlobalInteractionBlockAccess().getRCBTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalInteractionBlock"


    // $ANTLR start "entryRuleGlobalInteraction"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:677:1: entryRuleGlobalInteraction returns [EObject current=null] : iv_ruleGlobalInteraction= ruleGlobalInteraction EOF ;
    public final EObject entryRuleGlobalInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalInteraction = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:678:2: (iv_ruleGlobalInteraction= ruleGlobalInteraction EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:679:2: iv_ruleGlobalInteraction= ruleGlobalInteraction EOF
            {
             newCompositeNode(grammarAccess.getGlobalInteractionRule()); 
            pushFollow(FOLLOW_ruleGlobalInteraction_in_entryRuleGlobalInteraction1298);
            iv_ruleGlobalInteraction=ruleGlobalInteraction();

            state._fsp--;

             current =iv_ruleGlobalInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInteraction1308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalInteraction"


    // $ANTLR start "ruleGlobalInteraction"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:686:1: ruleGlobalInteraction returns [EObject current=null] : (this_Message_0= ruleMessage | this_Choice_1= ruleChoice | this_Parallel_2= ruleParallel | this_Recursion_3= ruleRecursion | this_Continue_4= ruleContinue | this_Interruptible_5= ruleInterruptible | this_Do_6= ruleDo | this_Spawn_7= ruleSpawn ) ;
    public final EObject ruleGlobalInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_Message_0 = null;

        EObject this_Choice_1 = null;

        EObject this_Parallel_2 = null;

        EObject this_Recursion_3 = null;

        EObject this_Continue_4 = null;

        EObject this_Interruptible_5 = null;

        EObject this_Do_6 = null;

        EObject this_Spawn_7 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:689:28: ( (this_Message_0= ruleMessage | this_Choice_1= ruleChoice | this_Parallel_2= ruleParallel | this_Recursion_3= ruleRecursion | this_Continue_4= ruleContinue | this_Interruptible_5= ruleInterruptible | this_Do_6= ruleDo | this_Spawn_7= ruleSpawn ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:690:1: (this_Message_0= ruleMessage | this_Choice_1= ruleChoice | this_Parallel_2= ruleParallel | this_Recursion_3= ruleRecursion | this_Continue_4= ruleContinue | this_Interruptible_5= ruleInterruptible | this_Do_6= ruleDo | this_Spawn_7= ruleSpawn )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:690:1: (this_Message_0= ruleMessage | this_Choice_1= ruleChoice | this_Parallel_2= ruleParallel | this_Recursion_3= ruleRecursion | this_Continue_4= ruleContinue | this_Interruptible_5= ruleInterruptible | this_Do_6= ruleDo | this_Spawn_7= ruleSpawn )
            int alt12=8;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:691:5: this_Message_0= ruleMessage
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getMessageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMessage_in_ruleGlobalInteraction1355);
                    this_Message_0=ruleMessage();

                    state._fsp--;

                     
                            current = this_Message_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:701:5: this_Choice_1= ruleChoice
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getChoiceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChoice_in_ruleGlobalInteraction1382);
                    this_Choice_1=ruleChoice();

                    state._fsp--;

                     
                            current = this_Choice_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:711:5: this_Parallel_2= ruleParallel
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getParallelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParallel_in_ruleGlobalInteraction1409);
                    this_Parallel_2=ruleParallel();

                    state._fsp--;

                     
                            current = this_Parallel_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:721:5: this_Recursion_3= ruleRecursion
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getRecursionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRecursion_in_ruleGlobalInteraction1436);
                    this_Recursion_3=ruleRecursion();

                    state._fsp--;

                     
                            current = this_Recursion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:731:5: this_Continue_4= ruleContinue
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getContinueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleContinue_in_ruleGlobalInteraction1463);
                    this_Continue_4=ruleContinue();

                    state._fsp--;

                     
                            current = this_Continue_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:741:5: this_Interruptible_5= ruleInterruptible
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getInterruptibleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleInterruptible_in_ruleGlobalInteraction1490);
                    this_Interruptible_5=ruleInterruptible();

                    state._fsp--;

                     
                            current = this_Interruptible_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:751:5: this_Do_6= ruleDo
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getDoParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDo_in_ruleGlobalInteraction1517);
                    this_Do_6=ruleDo();

                    state._fsp--;

                     
                            current = this_Do_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:761:5: this_Spawn_7= ruleSpawn
                    {
                     
                            newCompositeNode(grammarAccess.getGlobalInteractionAccess().getSpawnParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleSpawn_in_ruleGlobalInteraction1544);
                    this_Spawn_7=ruleSpawn();

                    state._fsp--;

                     
                            current = this_Spawn_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalInteraction"


    // $ANTLR start "entryRuleSpawn"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:777:1: entryRuleSpawn returns [EObject current=null] : iv_ruleSpawn= ruleSpawn EOF ;
    public final EObject entryRuleSpawn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpawn = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:778:2: (iv_ruleSpawn= ruleSpawn EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:779:2: iv_ruleSpawn= ruleSpawn EOF
            {
             newCompositeNode(grammarAccess.getSpawnRule()); 
            pushFollow(FOLLOW_ruleSpawn_in_entryRuleSpawn1579);
            iv_ruleSpawn=ruleSpawn();

            state._fsp--;

             current =iv_ruleSpawn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpawn1589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpawn"


    // $ANTLR start "ruleSpawn"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:786:1: ruleSpawn returns [EObject current=null] : ( ( (lv_roleName_0_0= RULE_ID ) ) otherlv_1= 'spawns' ( (lv_targetProtocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA ( (lv_currentRoles_11_0= RULE_ID ) ) otherlv_12= 'as' ( (lv_targetRoles_13_0= RULE_ID ) ) (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )* this_RPA_18= RULE_RPA this_SEMI_19= RULE_SEMI ) ;
    public final EObject ruleSpawn() throws RecognitionException {
        EObject current = null;

        Token lv_roleName_0_0=null;
        Token otherlv_1=null;
        Token lv_targetProtocolName_2_0=null;
        Token this_LT_3=null;
        Token otherlv_4=null;
        Token lv_parameters_5_0=null;
        Token this_COMMA_6=null;
        Token otherlv_7=null;
        Token lv_parameters_8_0=null;
        Token this_GT_9=null;
        Token this_LPA_10=null;
        Token lv_currentRoles_11_0=null;
        Token otherlv_12=null;
        Token lv_targetRoles_13_0=null;
        Token this_COMMA_14=null;
        Token lv_currentRoles_15_0=null;
        Token otherlv_16=null;
        Token lv_targetRoles_17_0=null;
        Token this_RPA_18=null;
        Token this_SEMI_19=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:789:28: ( ( ( (lv_roleName_0_0= RULE_ID ) ) otherlv_1= 'spawns' ( (lv_targetProtocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA ( (lv_currentRoles_11_0= RULE_ID ) ) otherlv_12= 'as' ( (lv_targetRoles_13_0= RULE_ID ) ) (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )* this_RPA_18= RULE_RPA this_SEMI_19= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:790:1: ( ( (lv_roleName_0_0= RULE_ID ) ) otherlv_1= 'spawns' ( (lv_targetProtocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA ( (lv_currentRoles_11_0= RULE_ID ) ) otherlv_12= 'as' ( (lv_targetRoles_13_0= RULE_ID ) ) (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )* this_RPA_18= RULE_RPA this_SEMI_19= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:790:1: ( ( (lv_roleName_0_0= RULE_ID ) ) otherlv_1= 'spawns' ( (lv_targetProtocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA ( (lv_currentRoles_11_0= RULE_ID ) ) otherlv_12= 'as' ( (lv_targetRoles_13_0= RULE_ID ) ) (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )* this_RPA_18= RULE_RPA this_SEMI_19= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:790:2: ( (lv_roleName_0_0= RULE_ID ) ) otherlv_1= 'spawns' ( (lv_targetProtocolName_2_0= RULE_ID ) ) (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )? this_LPA_10= RULE_LPA ( (lv_currentRoles_11_0= RULE_ID ) ) otherlv_12= 'as' ( (lv_targetRoles_13_0= RULE_ID ) ) (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )* this_RPA_18= RULE_RPA this_SEMI_19= RULE_SEMI
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:790:2: ( (lv_roleName_0_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:791:1: (lv_roleName_0_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:791:1: (lv_roleName_0_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:792:3: lv_roleName_0_0= RULE_ID
            {
            lv_roleName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1631); 

            			newLeafNode(lv_roleName_0_0, grammarAccess.getSpawnAccess().getRoleNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpawnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"roleName",
                    		lv_roleName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSpawn1648); 

                	newLeafNode(otherlv_1, grammarAccess.getSpawnAccess().getSpawnsKeyword_1());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:812:1: ( (lv_targetProtocolName_2_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:813:1: (lv_targetProtocolName_2_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:813:1: (lv_targetProtocolName_2_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:814:3: lv_targetProtocolName_2_0= RULE_ID
            {
            lv_targetProtocolName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1665); 

            			newLeafNode(lv_targetProtocolName_2_0, grammarAccess.getSpawnAccess().getTargetProtocolNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpawnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetProtocolName",
                    		lv_targetProtocolName_2_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:830:2: (this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:830:3: this_LT_3= RULE_LT otherlv_4= 'sig' ( (lv_parameters_5_0= RULE_ID ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )* this_GT_9= RULE_GT
                    {
                    this_LT_3=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleSpawn1682); 
                     
                        newLeafNode(this_LT_3, grammarAccess.getSpawnAccess().getLTTerminalRuleCall_3_0()); 
                        
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSpawn1693); 

                        	newLeafNode(otherlv_4, grammarAccess.getSpawnAccess().getSigKeyword_3_1());
                        
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:838:1: ( (lv_parameters_5_0= RULE_ID ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:839:1: (lv_parameters_5_0= RULE_ID )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:839:1: (lv_parameters_5_0= RULE_ID )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:840:3: lv_parameters_5_0= RULE_ID
                    {
                    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1710); 

                    			newLeafNode(lv_parameters_5_0, grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpawnRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:856:2: (this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:856:3: this_COMMA_6= RULE_COMMA otherlv_7= 'sig' ( (lv_parameters_8_0= RULE_ID ) )
                    	    {
                    	    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSpawn1727); 
                    	     
                    	        newLeafNode(this_COMMA_6, grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_3_3_0()); 
                    	        
                    	    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleSpawn1738); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSpawnAccess().getSigKeyword_3_3_1());
                    	        
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:864:1: ( (lv_parameters_8_0= RULE_ID ) )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:865:1: (lv_parameters_8_0= RULE_ID )
                    	    {
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:865:1: (lv_parameters_8_0= RULE_ID )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:866:3: lv_parameters_8_0= RULE_ID
                    	    {
                    	    lv_parameters_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1755); 

                    	    			newLeafNode(lv_parameters_8_0, grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSpawnRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_8_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    this_GT_9=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleSpawn1773); 
                     
                        newLeafNode(this_GT_9, grammarAccess.getSpawnAccess().getGTTerminalRuleCall_3_4()); 
                        

                    }
                    break;

            }

            this_LPA_10=(Token)match(input,RULE_LPA,FOLLOW_RULE_LPA_in_ruleSpawn1785); 
             
                newLeafNode(this_LPA_10, grammarAccess.getSpawnAccess().getLPATerminalRuleCall_4()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:890:1: ( (lv_currentRoles_11_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:891:1: (lv_currentRoles_11_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:891:1: (lv_currentRoles_11_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:892:3: lv_currentRoles_11_0= RULE_ID
            {
            lv_currentRoles_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1801); 

            			newLeafNode(lv_currentRoles_11_0, grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpawnRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"currentRoles",
                    		lv_currentRoles_11_0, 
                    		"ID");
            	    

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleSpawn1818); 

                	newLeafNode(otherlv_12, grammarAccess.getSpawnAccess().getAsKeyword_6());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:912:1: ( (lv_targetRoles_13_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:913:1: (lv_targetRoles_13_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:913:1: (lv_targetRoles_13_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:914:3: lv_targetRoles_13_0= RULE_ID
            {
            lv_targetRoles_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1835); 

            			newLeafNode(lv_targetRoles_13_0, grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpawnRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"targetRoles",
                    		lv_targetRoles_13_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:930:2: (this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:930:3: this_COMMA_14= RULE_COMMA ( (lv_currentRoles_15_0= RULE_ID ) ) otherlv_16= 'as' ( (lv_targetRoles_17_0= RULE_ID ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleSpawn1852); 
            	     
            	        newLeafNode(this_COMMA_14, grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_8_0()); 
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:934:1: ( (lv_currentRoles_15_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:935:1: (lv_currentRoles_15_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:935:1: (lv_currentRoles_15_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:936:3: lv_currentRoles_15_0= RULE_ID
            	    {
            	    lv_currentRoles_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1868); 

            	    			newLeafNode(lv_currentRoles_15_0, grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_8_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSpawnRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"currentRoles",
            	            		lv_currentRoles_15_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleSpawn1885); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSpawnAccess().getAsKeyword_8_2());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:956:1: ( (lv_targetRoles_17_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:957:1: (lv_targetRoles_17_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:957:1: (lv_targetRoles_17_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:958:3: lv_targetRoles_17_0= RULE_ID
            	    {
            	    lv_targetRoles_17_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpawn1902); 

            	    			newLeafNode(lv_targetRoles_17_0, grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_8_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSpawnRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"targetRoles",
            	            		lv_targetRoles_17_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            this_RPA_18=(Token)match(input,RULE_RPA,FOLLOW_RULE_RPA_in_ruleSpawn1920); 
             
                newLeafNode(this_RPA_18, grammarAccess.getSpawnAccess().getRPATerminalRuleCall_9()); 
                
            this_SEMI_19=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleSpawn1930); 
             
                newLeafNode(this_SEMI_19, grammarAccess.getSpawnAccess().getSEMITerminalRuleCall_10()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpawn"


    // $ANTLR start "entryRuleDo"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:990:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:991:2: (iv_ruleDo= ruleDo EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:992:2: iv_ruleDo= ruleDo EOF
            {
             newCompositeNode(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_ruleDo_in_entryRuleDo1965);
            iv_ruleDo=ruleDo();

            state._fsp--;

             current =iv_ruleDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo1975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDo"


    // $ANTLR start "ruleDo"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:999:1: ruleDo returns [EObject current=null] : (otherlv_0= 'do' ( (lv_targetProtocolName_1_0= RULE_ID ) ) (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )? this_LPA_7= RULE_LPA ( (lv_currentRoles_8_0= RULE_ID ) ) otherlv_9= 'as' ( (lv_targetRoles_10_0= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )* this_RPA_15= RULE_RPA this_SEMI_16= RULE_SEMI ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetProtocolName_1_0=null;
        Token this_LT_2=null;
        Token this_COMMA_4=null;
        Token this_GT_6=null;
        Token this_LPA_7=null;
        Token lv_currentRoles_8_0=null;
        Token otherlv_9=null;
        Token lv_targetRoles_10_0=null;
        Token this_COMMA_11=null;
        Token lv_currentRoles_12_0=null;
        Token otherlv_13=null;
        Token lv_targetRoles_14_0=null;
        Token this_RPA_15=null;
        Token this_SEMI_16=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1002:28: ( (otherlv_0= 'do' ( (lv_targetProtocolName_1_0= RULE_ID ) ) (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )? this_LPA_7= RULE_LPA ( (lv_currentRoles_8_0= RULE_ID ) ) otherlv_9= 'as' ( (lv_targetRoles_10_0= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )* this_RPA_15= RULE_RPA this_SEMI_16= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1003:1: (otherlv_0= 'do' ( (lv_targetProtocolName_1_0= RULE_ID ) ) (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )? this_LPA_7= RULE_LPA ( (lv_currentRoles_8_0= RULE_ID ) ) otherlv_9= 'as' ( (lv_targetRoles_10_0= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )* this_RPA_15= RULE_RPA this_SEMI_16= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1003:1: (otherlv_0= 'do' ( (lv_targetProtocolName_1_0= RULE_ID ) ) (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )? this_LPA_7= RULE_LPA ( (lv_currentRoles_8_0= RULE_ID ) ) otherlv_9= 'as' ( (lv_targetRoles_10_0= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )* this_RPA_15= RULE_RPA this_SEMI_16= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1003:3: otherlv_0= 'do' ( (lv_targetProtocolName_1_0= RULE_ID ) ) (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )? this_LPA_7= RULE_LPA ( (lv_currentRoles_8_0= RULE_ID ) ) otherlv_9= 'as' ( (lv_targetRoles_10_0= RULE_ID ) ) (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )* this_RPA_15= RULE_RPA this_SEMI_16= RULE_SEMI
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDo2012); 

                	newLeafNode(otherlv_0, grammarAccess.getDoAccess().getDoKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1007:1: ( (lv_targetProtocolName_1_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1008:1: (lv_targetProtocolName_1_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1008:1: (lv_targetProtocolName_1_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1009:3: lv_targetProtocolName_1_0= RULE_ID
            {
            lv_targetProtocolName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDo2029); 

            			newLeafNode(lv_targetProtocolName_1_0, grammarAccess.getDoAccess().getTargetProtocolNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetProtocolName",
                    		lv_targetProtocolName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1025:2: (this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1025:3: this_LT_2= RULE_LT ( (lv_arguments_3_0= ruleMessageSignature ) ) (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )* this_GT_6= RULE_GT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleDo2046); 
                     
                        newLeafNode(this_LT_2, grammarAccess.getDoAccess().getLTTerminalRuleCall_2_0()); 
                        
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1029:1: ( (lv_arguments_3_0= ruleMessageSignature ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1030:1: (lv_arguments_3_0= ruleMessageSignature )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1030:1: (lv_arguments_3_0= ruleMessageSignature )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1031:3: lv_arguments_3_0= ruleMessageSignature
                    {
                     
                    	        newCompositeNode(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMessageSignature_in_ruleDo2066);
                    lv_arguments_3_0=ruleMessageSignature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDoRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_3_0, 
                            		"MessageSignature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1047:2: (this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1047:3: this_COMMA_4= RULE_COMMA ( (lv_arguments_5_0= ruleMessageSignature ) )
                    	    {
                    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDo2078); 
                    	     
                    	        newLeafNode(this_COMMA_4, grammarAccess.getDoAccess().getCOMMATerminalRuleCall_2_2_0()); 
                    	        
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1051:1: ( (lv_arguments_5_0= ruleMessageSignature ) )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1052:1: (lv_arguments_5_0= ruleMessageSignature )
                    	    {
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1052:1: (lv_arguments_5_0= ruleMessageSignature )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1053:3: lv_arguments_5_0= ruleMessageSignature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessageSignature_in_ruleDo2098);
                    	    lv_arguments_5_0=ruleMessageSignature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_5_0, 
                    	            		"MessageSignature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    this_GT_6=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleDo2111); 
                     
                        newLeafNode(this_GT_6, grammarAccess.getDoAccess().getGTTerminalRuleCall_2_3()); 
                        

                    }
                    break;

            }

            this_LPA_7=(Token)match(input,RULE_LPA,FOLLOW_RULE_LPA_in_ruleDo2123); 
             
                newLeafNode(this_LPA_7, grammarAccess.getDoAccess().getLPATerminalRuleCall_3()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1077:1: ( (lv_currentRoles_8_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1078:1: (lv_currentRoles_8_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1078:1: (lv_currentRoles_8_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1079:3: lv_currentRoles_8_0= RULE_ID
            {
            lv_currentRoles_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDo2139); 

            			newLeafNode(lv_currentRoles_8_0, grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"currentRoles",
                    		lv_currentRoles_8_0, 
                    		"ID");
            	    

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleDo2156); 

                	newLeafNode(otherlv_9, grammarAccess.getDoAccess().getAsKeyword_5());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1099:1: ( (lv_targetRoles_10_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1100:1: (lv_targetRoles_10_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1100:1: (lv_targetRoles_10_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1101:3: lv_targetRoles_10_0= RULE_ID
            {
            lv_targetRoles_10_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDo2173); 

            			newLeafNode(lv_targetRoles_10_0, grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"targetRoles",
                    		lv_targetRoles_10_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1117:2: (this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1117:3: this_COMMA_11= RULE_COMMA ( (lv_currentRoles_12_0= RULE_ID ) ) otherlv_13= 'as' ( (lv_targetRoles_14_0= RULE_ID ) )
            	    {
            	    this_COMMA_11=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDo2190); 
            	     
            	        newLeafNode(this_COMMA_11, grammarAccess.getDoAccess().getCOMMATerminalRuleCall_7_0()); 
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1121:1: ( (lv_currentRoles_12_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1122:1: (lv_currentRoles_12_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1122:1: (lv_currentRoles_12_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1123:3: lv_currentRoles_12_0= RULE_ID
            	    {
            	    lv_currentRoles_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDo2206); 

            	    			newLeafNode(lv_currentRoles_12_0, grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_7_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDoRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"currentRoles",
            	            		lv_currentRoles_12_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleDo2223); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDoAccess().getAsKeyword_7_2());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1143:1: ( (lv_targetRoles_14_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1144:1: (lv_targetRoles_14_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1144:1: (lv_targetRoles_14_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1145:3: lv_targetRoles_14_0= RULE_ID
            	    {
            	    lv_targetRoles_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDo2240); 

            	    			newLeafNode(lv_targetRoles_14_0, grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_7_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDoRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"targetRoles",
            	            		lv_targetRoles_14_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            this_RPA_15=(Token)match(input,RULE_RPA,FOLLOW_RULE_RPA_in_ruleDo2258); 
             
                newLeafNode(this_RPA_15, grammarAccess.getDoAccess().getRPATerminalRuleCall_8()); 
                
            this_SEMI_16=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleDo2268); 
             
                newLeafNode(this_SEMI_16, grammarAccess.getDoAccess().getSEMITerminalRuleCall_9()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDo"


    // $ANTLR start "entryRuleInterruptible"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1177:1: entryRuleInterruptible returns [EObject current=null] : iv_ruleInterruptible= ruleInterruptible EOF ;
    public final EObject entryRuleInterruptible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterruptible = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1178:2: (iv_ruleInterruptible= ruleInterruptible EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1179:2: iv_ruleInterruptible= ruleInterruptible EOF
            {
             newCompositeNode(grammarAccess.getInterruptibleRule()); 
            pushFollow(FOLLOW_ruleInterruptible_in_entryRuleInterruptible2303);
            iv_ruleInterruptible=ruleInterruptible();

            state._fsp--;

             current =iv_ruleInterruptible; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterruptible2313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterruptible"


    // $ANTLR start "ruleInterruptible"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1186:1: ruleInterruptible returns [EObject current=null] : (otherlv_0= 'interruptible' ( (lv_body_1_0= ruleGlobalInteractionBlock ) ) otherlv_2= 'by' ( (lv_roleNames_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_signatures_5_0= ruleMessageSignature ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )* this_SEMI_11= RULE_SEMI ) ;
    public final EObject ruleInterruptible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_roleNames_3_0=null;
        Token otherlv_4=null;
        Token this_COMMA_6=null;
        Token otherlv_7=null;
        Token lv_roleNames_8_0=null;
        Token otherlv_9=null;
        Token this_SEMI_11=null;
        EObject lv_body_1_0 = null;

        EObject lv_signatures_5_0 = null;

        EObject lv_signatures_10_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1189:28: ( (otherlv_0= 'interruptible' ( (lv_body_1_0= ruleGlobalInteractionBlock ) ) otherlv_2= 'by' ( (lv_roleNames_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_signatures_5_0= ruleMessageSignature ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )* this_SEMI_11= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1190:1: (otherlv_0= 'interruptible' ( (lv_body_1_0= ruleGlobalInteractionBlock ) ) otherlv_2= 'by' ( (lv_roleNames_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_signatures_5_0= ruleMessageSignature ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )* this_SEMI_11= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1190:1: (otherlv_0= 'interruptible' ( (lv_body_1_0= ruleGlobalInteractionBlock ) ) otherlv_2= 'by' ( (lv_roleNames_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_signatures_5_0= ruleMessageSignature ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )* this_SEMI_11= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1190:3: otherlv_0= 'interruptible' ( (lv_body_1_0= ruleGlobalInteractionBlock ) ) otherlv_2= 'by' ( (lv_roleNames_3_0= RULE_ID ) ) otherlv_4= 'with' ( (lv_signatures_5_0= ruleMessageSignature ) ) (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )* this_SEMI_11= RULE_SEMI
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInterruptible2350); 

                	newLeafNode(otherlv_0, grammarAccess.getInterruptibleAccess().getInterruptibleKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1194:1: ( (lv_body_1_0= ruleGlobalInteractionBlock ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1195:1: (lv_body_1_0= ruleGlobalInteractionBlock )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1195:1: (lv_body_1_0= ruleGlobalInteractionBlock )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1196:3: lv_body_1_0= ruleGlobalInteractionBlock
            {
             
            	        newCompositeNode(grammarAccess.getInterruptibleAccess().getBodyGlobalInteractionBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleInterruptible2371);
            lv_body_1_0=ruleGlobalInteractionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterruptibleRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_1_0, 
                    		"GlobalInteractionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleInterruptible2383); 

                	newLeafNode(otherlv_2, grammarAccess.getInterruptibleAccess().getByKeyword_2());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1216:1: ( (lv_roleNames_3_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1217:1: (lv_roleNames_3_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1217:1: (lv_roleNames_3_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1218:3: lv_roleNames_3_0= RULE_ID
            {
            lv_roleNames_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterruptible2400); 

            			newLeafNode(lv_roleNames_3_0, grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterruptibleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"roleNames",
                    		lv_roleNames_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleInterruptible2417); 

                	newLeafNode(otherlv_4, grammarAccess.getInterruptibleAccess().getWithKeyword_4());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1238:1: ( (lv_signatures_5_0= ruleMessageSignature ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1239:1: (lv_signatures_5_0= ruleMessageSignature )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1239:1: (lv_signatures_5_0= ruleMessageSignature )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1240:3: lv_signatures_5_0= ruleMessageSignature
            {
             
            	        newCompositeNode(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageSignature_in_ruleInterruptible2438);
            lv_signatures_5_0=ruleMessageSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterruptibleRule());
            	        }
                   		add(
                   			current, 
                   			"signatures",
                    		lv_signatures_5_0, 
                    		"MessageSignature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1256:2: (this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1256:3: this_COMMA_6= RULE_COMMA otherlv_7= 'by' ( (lv_roleNames_8_0= RULE_ID ) ) otherlv_9= 'with' ( (lv_signatures_10_0= ruleMessageSignature ) )
            	    {
            	    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleInterruptible2450); 
            	     
            	        newLeafNode(this_COMMA_6, grammarAccess.getInterruptibleAccess().getCOMMATerminalRuleCall_6_0()); 
            	        
            	    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleInterruptible2461); 

            	        	newLeafNode(otherlv_7, grammarAccess.getInterruptibleAccess().getByKeyword_6_1());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1264:1: ( (lv_roleNames_8_0= RULE_ID ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1265:1: (lv_roleNames_8_0= RULE_ID )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1265:1: (lv_roleNames_8_0= RULE_ID )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1266:3: lv_roleNames_8_0= RULE_ID
            	    {
            	    lv_roleNames_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterruptible2478); 

            	    			newLeafNode(lv_roleNames_8_0, grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_6_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInterruptibleRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"roleNames",
            	            		lv_roleNames_8_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleInterruptible2495); 

            	        	newLeafNode(otherlv_9, grammarAccess.getInterruptibleAccess().getWithKeyword_6_3());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1286:1: ( (lv_signatures_10_0= ruleMessageSignature ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1287:1: (lv_signatures_10_0= ruleMessageSignature )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1287:1: (lv_signatures_10_0= ruleMessageSignature )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1288:3: lv_signatures_10_0= ruleMessageSignature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_6_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageSignature_in_ruleInterruptible2516);
            	    lv_signatures_10_0=ruleMessageSignature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterruptibleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"signatures",
            	            		lv_signatures_10_0, 
            	            		"MessageSignature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            this_SEMI_11=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleInterruptible2529); 
             
                newLeafNode(this_SEMI_11, grammarAccess.getInterruptibleAccess().getSEMITerminalRuleCall_7()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterruptible"


    // $ANTLR start "entryRuleContinue"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1316:1: entryRuleContinue returns [EObject current=null] : iv_ruleContinue= ruleContinue EOF ;
    public final EObject entryRuleContinue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinue = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1317:2: (iv_ruleContinue= ruleContinue EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1318:2: iv_ruleContinue= ruleContinue EOF
            {
             newCompositeNode(grammarAccess.getContinueRule()); 
            pushFollow(FOLLOW_ruleContinue_in_entryRuleContinue2564);
            iv_ruleContinue=ruleContinue();

            state._fsp--;

             current =iv_ruleContinue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinue2574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinue"


    // $ANTLR start "ruleContinue"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1325:1: ruleContinue returns [EObject current=null] : (otherlv_0= 'continue' ( (lv_loopName_1_0= RULE_ID ) ) this_SEMI_2= RULE_SEMI ) ;
    public final EObject ruleContinue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_loopName_1_0=null;
        Token this_SEMI_2=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1328:28: ( (otherlv_0= 'continue' ( (lv_loopName_1_0= RULE_ID ) ) this_SEMI_2= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1329:1: (otherlv_0= 'continue' ( (lv_loopName_1_0= RULE_ID ) ) this_SEMI_2= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1329:1: (otherlv_0= 'continue' ( (lv_loopName_1_0= RULE_ID ) ) this_SEMI_2= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1329:3: otherlv_0= 'continue' ( (lv_loopName_1_0= RULE_ID ) ) this_SEMI_2= RULE_SEMI
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleContinue2611); 

                	newLeafNode(otherlv_0, grammarAccess.getContinueAccess().getContinueKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1333:1: ( (lv_loopName_1_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1334:1: (lv_loopName_1_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1334:1: (lv_loopName_1_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1335:3: lv_loopName_1_0= RULE_ID
            {
            lv_loopName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContinue2628); 

            			newLeafNode(lv_loopName_1_0, grammarAccess.getContinueAccess().getLoopNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContinueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"loopName",
                    		lv_loopName_1_0, 
                    		"ID");
            	    

            }


            }

            this_SEMI_2=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleContinue2644); 
             
                newLeafNode(this_SEMI_2, grammarAccess.getContinueAccess().getSEMITerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinue"


    // $ANTLR start "entryRuleRecursion"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1363:1: entryRuleRecursion returns [EObject current=null] : iv_ruleRecursion= ruleRecursion EOF ;
    public final EObject entryRuleRecursion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursion = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1364:2: (iv_ruleRecursion= ruleRecursion EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1365:2: iv_ruleRecursion= ruleRecursion EOF
            {
             newCompositeNode(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_ruleRecursion_in_entryRuleRecursion2679);
            iv_ruleRecursion=ruleRecursion();

            state._fsp--;

             current =iv_ruleRecursion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecursion2689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1372:1: ruleRecursion returns [EObject current=null] : (otherlv_0= 'rec' ( (lv_loopName_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleGlobalInteractionBlock ) ) ) ;
    public final EObject ruleRecursion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_loopName_1_0=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1375:28: ( (otherlv_0= 'rec' ( (lv_loopName_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleGlobalInteractionBlock ) ) ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1376:1: (otherlv_0= 'rec' ( (lv_loopName_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleGlobalInteractionBlock ) ) )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1376:1: (otherlv_0= 'rec' ( (lv_loopName_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleGlobalInteractionBlock ) ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1376:3: otherlv_0= 'rec' ( (lv_loopName_1_0= RULE_ID ) ) ( (lv_body_2_0= ruleGlobalInteractionBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleRecursion2726); 

                	newLeafNode(otherlv_0, grammarAccess.getRecursionAccess().getRecKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1380:1: ( (lv_loopName_1_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1381:1: (lv_loopName_1_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1381:1: (lv_loopName_1_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1382:3: lv_loopName_1_0= RULE_ID
            {
            lv_loopName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecursion2743); 

            			newLeafNode(lv_loopName_1_0, grammarAccess.getRecursionAccess().getLoopNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecursionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"loopName",
                    		lv_loopName_1_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1398:2: ( (lv_body_2_0= ruleGlobalInteractionBlock ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1399:1: (lv_body_2_0= ruleGlobalInteractionBlock )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1399:1: (lv_body_2_0= ruleGlobalInteractionBlock )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1400:3: lv_body_2_0= ruleGlobalInteractionBlock
            {
             
            	        newCompositeNode(grammarAccess.getRecursionAccess().getBodyGlobalInteractionBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleRecursion2769);
            lv_body_2_0=ruleGlobalInteractionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecursionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"GlobalInteractionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleParallel"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1424:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1425:2: (iv_ruleParallel= ruleParallel EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1426:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel2805);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel2815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1433:1: ruleParallel returns [EObject current=null] : (otherlv_0= 'parallel' ( (lv_branches_1_0= ruleGlobalInteractionBlock ) ) (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )* ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_branches_1_0 = null;

        EObject lv_branches_3_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1436:28: ( (otherlv_0= 'parallel' ( (lv_branches_1_0= ruleGlobalInteractionBlock ) ) (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )* ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1437:1: (otherlv_0= 'parallel' ( (lv_branches_1_0= ruleGlobalInteractionBlock ) ) (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )* )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1437:1: (otherlv_0= 'parallel' ( (lv_branches_1_0= ruleGlobalInteractionBlock ) ) (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )* )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1437:3: otherlv_0= 'parallel' ( (lv_branches_1_0= ruleGlobalInteractionBlock ) ) (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleParallel2852); 

                	newLeafNode(otherlv_0, grammarAccess.getParallelAccess().getParallelKeyword_0());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1441:1: ( (lv_branches_1_0= ruleGlobalInteractionBlock ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1442:1: (lv_branches_1_0= ruleGlobalInteractionBlock )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1442:1: (lv_branches_1_0= ruleGlobalInteractionBlock )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1443:3: lv_branches_1_0= ruleGlobalInteractionBlock
            {
             
            	        newCompositeNode(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleParallel2873);
            lv_branches_1_0=ruleGlobalInteractionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	        }
                   		add(
                   			current, 
                   			"branches",
                    		lv_branches_1_0, 
                    		"GlobalInteractionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1459:2: (otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1459:4: otherlv_2= 'and' ( (lv_branches_3_0= ruleGlobalInteractionBlock ) )
            	    {
            	    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleParallel2886); 

            	        	newLeafNode(otherlv_2, grammarAccess.getParallelAccess().getAndKeyword_2_0());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1463:1: ( (lv_branches_3_0= ruleGlobalInteractionBlock ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1464:1: (lv_branches_3_0= ruleGlobalInteractionBlock )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1464:1: (lv_branches_3_0= ruleGlobalInteractionBlock )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1465:3: lv_branches_3_0= ruleGlobalInteractionBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleParallel2907);
            	    lv_branches_3_0=ruleGlobalInteractionBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParallelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"branches",
            	            		lv_branches_3_0, 
            	            		"GlobalInteractionBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1489:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1490:2: (iv_ruleChoice= ruleChoice EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1491:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice2945);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice2955); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1498:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_ID ) ) ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )* ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_role_2_0=null;
        Token otherlv_4=null;
        EObject lv_branches_3_0 = null;

        EObject lv_branches_5_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1501:28: ( (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_ID ) ) ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )* ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1502:1: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_ID ) ) ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )* )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1502:1: (otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_ID ) ) ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )* )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1502:3: otherlv_0= 'choice' otherlv_1= 'at' ( (lv_role_2_0= RULE_ID ) ) ( (lv_branches_3_0= ruleGlobalInteractionBlock ) ) (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )*
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleChoice2992); 

                	newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleChoice3004); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getAtKeyword_1());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1510:1: ( (lv_role_2_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1511:1: (lv_role_2_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1511:1: (lv_role_2_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1512:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice3021); 

            			newLeafNode(lv_role_2_0, grammarAccess.getChoiceAccess().getRoleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"role",
                    		lv_role_2_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1528:2: ( (lv_branches_3_0= ruleGlobalInteractionBlock ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1529:1: (lv_branches_3_0= ruleGlobalInteractionBlock )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1529:1: (lv_branches_3_0= ruleGlobalInteractionBlock )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1530:3: lv_branches_3_0= ruleGlobalInteractionBlock
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleChoice3047);
            lv_branches_3_0=ruleGlobalInteractionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		add(
                   			current, 
                   			"branches",
                    		lv_branches_3_0, 
                    		"GlobalInteractionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1546:2: (otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1546:4: otherlv_4= 'or' ( (lv_branches_5_0= ruleGlobalInteractionBlock ) )
            	    {
            	    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleChoice3060); 

            	        	newLeafNode(otherlv_4, grammarAccess.getChoiceAccess().getOrKeyword_4_0());
            	        
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1550:1: ( (lv_branches_5_0= ruleGlobalInteractionBlock ) )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1551:1: (lv_branches_5_0= ruleGlobalInteractionBlock )
            	    {
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1551:1: (lv_branches_5_0= ruleGlobalInteractionBlock )
            	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1552:3: lv_branches_5_0= ruleGlobalInteractionBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_ruleChoice3081);
            	    lv_branches_5_0=ruleGlobalInteractionBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"branches",
            	            		lv_branches_5_0, 
            	            		"GlobalInteractionBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMessage"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1576:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1577:2: (iv_ruleMessage= ruleMessage EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1578:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage3119);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage3129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1585:1: ruleMessage returns [EObject current=null] : ( ( (lv_signature_0_0= ruleMessageSignature ) ) otherlv_1= 'from' ( (lv_sender_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_receiver_4_0= RULE_ID ) ) this_SEMI_5= RULE_SEMI ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_sender_2_0=null;
        Token otherlv_3=null;
        Token lv_receiver_4_0=null;
        Token this_SEMI_5=null;
        EObject lv_signature_0_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1588:28: ( ( ( (lv_signature_0_0= ruleMessageSignature ) ) otherlv_1= 'from' ( (lv_sender_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_receiver_4_0= RULE_ID ) ) this_SEMI_5= RULE_SEMI ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1589:1: ( ( (lv_signature_0_0= ruleMessageSignature ) ) otherlv_1= 'from' ( (lv_sender_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_receiver_4_0= RULE_ID ) ) this_SEMI_5= RULE_SEMI )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1589:1: ( ( (lv_signature_0_0= ruleMessageSignature ) ) otherlv_1= 'from' ( (lv_sender_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_receiver_4_0= RULE_ID ) ) this_SEMI_5= RULE_SEMI )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1589:2: ( (lv_signature_0_0= ruleMessageSignature ) ) otherlv_1= 'from' ( (lv_sender_2_0= RULE_ID ) ) otherlv_3= 'to' ( (lv_receiver_4_0= RULE_ID ) ) this_SEMI_5= RULE_SEMI
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1589:2: ( (lv_signature_0_0= ruleMessageSignature ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1590:1: (lv_signature_0_0= ruleMessageSignature )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1590:1: (lv_signature_0_0= ruleMessageSignature )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1591:3: lv_signature_0_0= ruleMessageSignature
            {
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getSignatureMessageSignatureParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageSignature_in_ruleMessage3175);
            lv_signature_0_0=ruleMessageSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	        }
                   		set(
                   			current, 
                   			"signature",
                    		lv_signature_0_0, 
                    		"MessageSignature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleMessage3187); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getFromKeyword_1());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1611:1: ( (lv_sender_2_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1612:1: (lv_sender_2_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1612:1: (lv_sender_2_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1613:3: lv_sender_2_0= RULE_ID
            {
            lv_sender_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage3204); 

            			newLeafNode(lv_sender_2_0, grammarAccess.getMessageAccess().getSenderIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sender",
                    		lv_sender_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleMessage3221); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getToKeyword_3());
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1633:1: ( (lv_receiver_4_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1634:1: (lv_receiver_4_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1634:1: (lv_receiver_4_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1635:3: lv_receiver_4_0= RULE_ID
            {
            lv_receiver_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage3238); 

            			newLeafNode(lv_receiver_4_0, grammarAccess.getMessageAccess().getReceiverIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"receiver",
                    		lv_receiver_4_0, 
                    		"ID");
            	    

            }


            }

            this_SEMI_5=(Token)match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_ruleMessage3254); 
             
                newLeafNode(this_SEMI_5, grammarAccess.getMessageAccess().getSEMITerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageSignature"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1663:1: entryRuleMessageSignature returns [EObject current=null] : iv_ruleMessageSignature= ruleMessageSignature EOF ;
    public final EObject entryRuleMessageSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageSignature = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1664:2: (iv_ruleMessageSignature= ruleMessageSignature EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1665:2: iv_ruleMessageSignature= ruleMessageSignature EOF
            {
             newCompositeNode(grammarAccess.getMessageSignatureRule()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_entryRuleMessageSignature3289);
            iv_ruleMessageSignature=ruleMessageSignature();

            state._fsp--;

             current =iv_ruleMessageSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSignature3299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageSignature"


    // $ANTLR start "ruleMessageSignature"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1672:1: ruleMessageSignature returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_ID ) ) this_LPA_1= RULE_LPA ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )? this_RPA_5= RULE_RPA ) ;
    public final EObject ruleMessageSignature() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token this_LPA_1=null;
        Token this_COMMA_3=null;
        Token this_RPA_5=null;
        EObject lv_payloadTypes_2_0 = null;

        EObject lv_payloadTypes_4_0 = null;


         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1675:28: ( ( ( (lv_operator_0_0= RULE_ID ) ) this_LPA_1= RULE_LPA ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )? this_RPA_5= RULE_RPA ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1676:1: ( ( (lv_operator_0_0= RULE_ID ) ) this_LPA_1= RULE_LPA ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )? this_RPA_5= RULE_RPA )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1676:1: ( ( (lv_operator_0_0= RULE_ID ) ) this_LPA_1= RULE_LPA ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )? this_RPA_5= RULE_RPA )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1676:2: ( (lv_operator_0_0= RULE_ID ) ) this_LPA_1= RULE_LPA ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )? this_RPA_5= RULE_RPA
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1676:2: ( (lv_operator_0_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1677:1: (lv_operator_0_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1677:1: (lv_operator_0_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1678:3: lv_operator_0_0= RULE_ID
            {
            lv_operator_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessageSignature3341); 

            			newLeafNode(lv_operator_0_0, grammarAccess.getMessageSignatureAccess().getOperatorIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageSignatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"ID");
            	    

            }


            }

            this_LPA_1=(Token)match(input,RULE_LPA,FOLLOW_RULE_LPA_in_ruleMessageSignature3357); 
             
                newLeafNode(this_LPA_1, grammarAccess.getMessageSignatureAccess().getLPATerminalRuleCall_1()); 
                
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1698:1: ( ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1698:2: ( (lv_payloadTypes_2_0= rulePayloadType ) ) (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )*
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1698:2: ( (lv_payloadTypes_2_0= rulePayloadType ) )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1699:1: (lv_payloadTypes_2_0= rulePayloadType )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1699:1: (lv_payloadTypes_2_0= rulePayloadType )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1700:3: lv_payloadTypes_2_0= rulePayloadType
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePayloadType_in_ruleMessageSignature3378);
                    lv_payloadTypes_2_0=rulePayloadType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageSignatureRule());
                    	        }
                           		add(
                           			current, 
                           			"payloadTypes",
                            		lv_payloadTypes_2_0, 
                            		"PayloadType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1716:2: (this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1716:3: this_COMMA_3= RULE_COMMA ( (lv_payloadTypes_4_0= rulePayloadType ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMessageSignature3390); 
                    	     
                    	        newLeafNode(this_COMMA_3, grammarAccess.getMessageSignatureAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1720:1: ( (lv_payloadTypes_4_0= rulePayloadType ) )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1721:1: (lv_payloadTypes_4_0= rulePayloadType )
                    	    {
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1721:1: (lv_payloadTypes_4_0= rulePayloadType )
                    	    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1722:3: lv_payloadTypes_4_0= rulePayloadType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePayloadType_in_ruleMessageSignature3410);
                    	    lv_payloadTypes_4_0=rulePayloadType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageSignatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"payloadTypes",
                    	            		lv_payloadTypes_4_0, 
                    	            		"PayloadType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPA_5=(Token)match(input,RULE_RPA,FOLLOW_RULE_RPA_in_ruleMessageSignature3425); 
             
                newLeafNode(this_RPA_5, grammarAccess.getMessageSignatureAccess().getRPATerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageSignature"


    // $ANTLR start "entryRulePayloadType"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1750:1: entryRulePayloadType returns [EObject current=null] : iv_rulePayloadType= rulePayloadType EOF ;
    public final EObject entryRulePayloadType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePayloadType = null;


        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1751:2: (iv_rulePayloadType= rulePayloadType EOF )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1752:2: iv_rulePayloadType= rulePayloadType EOF
            {
             newCompositeNode(grammarAccess.getPayloadTypeRule()); 
            pushFollow(FOLLOW_rulePayloadType_in_entryRulePayloadType3460);
            iv_rulePayloadType=rulePayloadType();

            state._fsp--;

             current =iv_rulePayloadType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePayloadType3470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePayloadType"


    // $ANTLR start "rulePayloadType"
    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1759:1: rulePayloadType returns [EObject current=null] : ( ( (lv_payload_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_ID ) )? ) ;
    public final EObject rulePayloadType() throws RecognitionException {
        EObject current = null;

        Token lv_payload_0_0=null;
        Token lv_dataType_1_0=null;

         enterRule(); 
            
        try {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1762:28: ( ( ( (lv_payload_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_ID ) )? ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1763:1: ( ( (lv_payload_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_ID ) )? )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1763:1: ( ( (lv_payload_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_ID ) )? )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1763:2: ( (lv_payload_0_0= RULE_ID ) ) ( (lv_dataType_1_0= RULE_ID ) )?
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1763:2: ( (lv_payload_0_0= RULE_ID ) )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1764:1: (lv_payload_0_0= RULE_ID )
            {
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1764:1: (lv_payload_0_0= RULE_ID )
            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1765:3: lv_payload_0_0= RULE_ID
            {
            lv_payload_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePayloadType3512); 

            			newLeafNode(lv_payload_0_0, grammarAccess.getPayloadTypeAccess().getPayloadIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPayloadTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"payload",
                    		lv_payload_0_0, 
                    		"ID");
            	    

            }


            }

            // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1781:2: ( (lv_dataType_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1782:1: (lv_dataType_1_0= RULE_ID )
                    {
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1782:1: (lv_dataType_1_0= RULE_ID )
                    // ../scribble/src-gen/org/scribble/parser/antlr/internal/InternalScribble.g:1783:3: lv_dataType_1_0= RULE_ID
                    {
                    lv_dataType_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePayloadType3534); 

                    			newLeafNode(lv_dataType_1_0, grammarAccess.getPayloadTypeAccess().getDataTypeIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPayloadTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dataType",
                            		lv_dataType_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePayloadType"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\1\2\14\uffff";
    static final String DFA3_minS =
        "\1\25\1\26\1\uffff\1\6\1\7\1\uffff\1\11\1\6\1\10\1\27\1\14\1\6"+
        "\1\10";
    static final String DFA3_maxS =
        "\1\25\1\26\1\uffff\1\6\1\12\1\uffff\1\27\1\6\1\11\1\27\1\30\1\6"+
        "\1\11";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\6\2\uffff\1\5",
            "",
            "\1\5\15\uffff\1\7",
            "\1\10",
            "\1\11\1\12",
            "\1\13",
            "\1\5\13\uffff\1\2",
            "\1\14",
            "\1\11\1\12"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 116:3: ( (lv_globalProtocolDecl_2_0= ruleGlobalProtocolDecl ) )+";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\6\1\7\10\uffff";
    static final String DFA12_maxS =
        "\1\46\1\35\10\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\27\uffff\1\7\1\6\2\uffff\1\5\1\4\1\3\1\uffff\1\2",
            "\1\11\25\uffff\1\10",
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
            return "690:1: (this_Message_0= ruleMessage | this_Choice_1= ruleChoice | this_Parallel_2= ruleParallel | this_Recursion_3= ruleRecursion | this_Continue_4= ruleContinue | this_Interruptible_5= ruleInterruptible | this_Do_6= ruleDo | this_Spawn_7= ruleSpawn )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScribbleProgram_in_entryRuleScribbleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScribbleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDecl_in_ruleScribbleProgram131 = new BitSet(new long[]{0x0000000002300000L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleScribbleProgram153 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_ruleGlobalProtocolDecl_in_ruleScribbleProgram175 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_ruleInstGlobalProtocolDecl_in_ruleScribbleProgram197 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleIncludeDecl_in_entryRuleIncludeDecl234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDecl244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIncludeDecl281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDecl298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleIncludeDecl314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstGlobalProtocolDecl_in_entryRuleInstGlobalProtocolDecl349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstGlobalProtocolDecl359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInstGlobalProtocolDecl396 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInstGlobalProtocolDecl408 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPA_in_ruleInstGlobalProtocolDecl441 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstGlobalProtocolDecl452 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl469 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInstGlobalProtocolDecl486 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstGlobalProtocolDecl497 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl514 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RPA_in_ruleInstGlobalProtocolDecl532 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInstGlobalProtocolDecl543 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstGlobalProtocolDecl560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleInstGlobalProtocolDecl576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypeDecl658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl675 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTypeDecl692 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleTypeDecl703 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl719 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleTypeDecl735 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl751 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_27_in_ruleTypeDecl769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDecl786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleTypeDecl804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalProtocolDecl_in_entryRuleGlobalProtocolDecl839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalProtocolDecl849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGlobalProtocolDecl886 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGlobalProtocolDecl898 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl915 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleGlobalProtocolDecl932 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGlobalProtocolDecl943 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl960 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleGlobalProtocolDecl977 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGlobalProtocolDecl988 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1005 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleGlobalProtocolDecl1023 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPA_in_ruleGlobalProtocolDecl1035 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_23_in_ruleGlobalProtocolDecl1047 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1064 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleGlobalProtocolDecl1081 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGlobalProtocolDecl1092 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalProtocolDecl1109 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RPA_in_ruleGlobalProtocolDecl1129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleGlobalProtocolDecl1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_entryRuleGlobalInteractionBlock1185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInteractionBlock1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCB_in_ruleGlobalInteractionBlock1231 = new BitSet(new long[]{0x0000005CC0000040L});
    public static final BitSet FOLLOW_ruleGlobalInteraction_in_ruleGlobalInteractionBlock1251 = new BitSet(new long[]{0x0000005CC0002040L});
    public static final BitSet FOLLOW_RULE_RCB_in_ruleGlobalInteractionBlock1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteraction_in_entryRuleGlobalInteraction1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInteraction1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleGlobalInteraction1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleGlobalInteraction1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_ruleGlobalInteraction1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecursion_in_ruleGlobalInteraction1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinue_in_ruleGlobalInteraction1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterruptible_in_ruleGlobalInteraction1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_ruleGlobalInteraction1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpawn_in_ruleGlobalInteraction1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpawn_in_entryRuleSpawn1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpawn1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSpawn1648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1665 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleSpawn1682 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSpawn1693 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1710 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSpawn1727 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSpawn1738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1755 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleSpawn1773 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPA_in_ruleSpawn1785 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSpawn1818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1835 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleSpawn1852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1868 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSpawn1885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpawn1902 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RPA_in_ruleSpawn1920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleSpawn1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_entryRuleDo1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDo2012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDo2029 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleDo2046 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_ruleDo2066 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDo2078 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_ruleDo2098 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleDo2111 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPA_in_ruleDo2123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDo2139 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDo2156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDo2173 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDo2190 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDo2206 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDo2223 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDo2240 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RPA_in_ruleDo2258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleDo2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterruptible_in_entryRuleInterruptible2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterruptible2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInterruptible2350 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleInterruptible2371 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterruptible2383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterruptible2400 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInterruptible2417 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_ruleInterruptible2438 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleInterruptible2450 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleInterruptible2461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterruptible2478 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInterruptible2495 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_ruleInterruptible2516 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleInterruptible2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinue_in_entryRuleContinue2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinue2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContinue2611 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContinue2628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleContinue2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecursion_in_entryRuleRecursion2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecursion2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRecursion2726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecursion2743 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleRecursion2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel2805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleParallel2852 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleParallel2873 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleParallel2886 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleParallel2907 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleChoice2992 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleChoice3004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice3021 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleChoice3047 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleChoice3060 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_ruleChoice3081 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage3119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_ruleMessage3175 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMessage3187 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage3204 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMessage3221 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage3238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SEMI_in_ruleMessage3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_entryRuleMessageSignature3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSignature3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessageSignature3341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPA_in_ruleMessageSignature3357 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rulePayloadType_in_ruleMessageSignature3378 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMessageSignature3390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rulePayloadType_in_ruleMessageSignature3410 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_RPA_in_ruleMessageSignature3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePayloadType_in_entryRulePayloadType3460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePayloadType3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePayloadType3512 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePayloadType3534 = new BitSet(new long[]{0x0000000000000002L});

}