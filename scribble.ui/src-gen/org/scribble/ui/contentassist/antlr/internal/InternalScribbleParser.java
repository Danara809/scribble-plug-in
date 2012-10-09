package org.scribble.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.scribble.services.ScribbleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScribbleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMI", "RULE_LPA", "RULE_RPA", "RULE_COMMA", "RULE_LT", "RULE_GT", "RULE_LCB", "RULE_RCB", "RULE_STRING", "RULE_ID", "RULE_COLON", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'global'", "'protocol'", "'role'", "'instantiates'", "'import'", "'from'", "'as'", "'sig'", "'spawns'", "'do'", "'interruptible'", "'by'", "'with'", "'continue'", "'rec'", "'parallel'", "'and'", "'choice'", "'at'", "'or'", "'to'"
    };
    public static final int RULE_ID=13;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int RULE_RPA=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_RCB=11;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMA=7;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_LPA=5;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_LT=8;
    public static final int T__30=30;
    public static final int RULE_COLON=14;
    public static final int T__31=31;
    public static final int RULE_STRING=12;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int RULE_LCB=10;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_GT=9;
    public static final int RULE_INT=15;
    public static final int RULE_WS=18;
    public static final int RULE_SEMI=4;

    // delegates
    // delegators


        public InternalScribbleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScribbleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScribbleParser.tokenNames; }
    public String getGrammarFileName() { return "../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g"; }


     
     	private ScribbleGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ScribbleGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleScribbleProgram"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:60:1: entryRuleScribbleProgram : ruleScribbleProgram EOF ;
    public final void entryRuleScribbleProgram() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:61:1: ( ruleScribbleProgram EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:62:1: ruleScribbleProgram EOF
            {
             before(grammarAccess.getScribbleProgramRule()); 
            pushFollow(FOLLOW_ruleScribbleProgram_in_entryRuleScribbleProgram61);
            ruleScribbleProgram();

            state._fsp--;

             after(grammarAccess.getScribbleProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScribbleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScribbleProgram"


    // $ANTLR start "ruleScribbleProgram"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:69:1: ruleScribbleProgram : ( ( rule__ScribbleProgram__Group__0 ) ) ;
    public final void ruleScribbleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:73:2: ( ( ( rule__ScribbleProgram__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:74:1: ( ( rule__ScribbleProgram__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:74:1: ( ( rule__ScribbleProgram__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:75:1: ( rule__ScribbleProgram__Group__0 )
            {
             before(grammarAccess.getScribbleProgramAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:76:1: ( rule__ScribbleProgram__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:76:2: rule__ScribbleProgram__Group__0
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__Group__0_in_ruleScribbleProgram94);
            rule__ScribbleProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScribbleProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScribbleProgram"


    // $ANTLR start "entryRuleIncludeDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:88:1: entryRuleIncludeDecl : ruleIncludeDecl EOF ;
    public final void entryRuleIncludeDecl() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:89:1: ( ruleIncludeDecl EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:90:1: ruleIncludeDecl EOF
            {
             before(grammarAccess.getIncludeDeclRule()); 
            pushFollow(FOLLOW_ruleIncludeDecl_in_entryRuleIncludeDecl121);
            ruleIncludeDecl();

            state._fsp--;

             after(grammarAccess.getIncludeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludeDecl128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncludeDecl"


    // $ANTLR start "ruleIncludeDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:97:1: ruleIncludeDecl : ( ( rule__IncludeDecl__Group__0 ) ) ;
    public final void ruleIncludeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:101:2: ( ( ( rule__IncludeDecl__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:102:1: ( ( rule__IncludeDecl__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:102:1: ( ( rule__IncludeDecl__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:103:1: ( rule__IncludeDecl__Group__0 )
            {
             before(grammarAccess.getIncludeDeclAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:104:1: ( rule__IncludeDecl__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:104:2: rule__IncludeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__IncludeDecl__Group__0_in_ruleIncludeDecl154);
            rule__IncludeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludeDecl"


    // $ANTLR start "entryRuleInstGlobalProtocolDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:116:1: entryRuleInstGlobalProtocolDecl : ruleInstGlobalProtocolDecl EOF ;
    public final void entryRuleInstGlobalProtocolDecl() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:117:1: ( ruleInstGlobalProtocolDecl EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:118:1: ruleInstGlobalProtocolDecl EOF
            {
             before(grammarAccess.getInstGlobalProtocolDeclRule()); 
            pushFollow(FOLLOW_ruleInstGlobalProtocolDecl_in_entryRuleInstGlobalProtocolDecl181);
            ruleInstGlobalProtocolDecl();

            state._fsp--;

             after(grammarAccess.getInstGlobalProtocolDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstGlobalProtocolDecl188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstGlobalProtocolDecl"


    // $ANTLR start "ruleInstGlobalProtocolDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:125:1: ruleInstGlobalProtocolDecl : ( ( rule__InstGlobalProtocolDecl__Group__0 ) ) ;
    public final void ruleInstGlobalProtocolDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:129:2: ( ( ( rule__InstGlobalProtocolDecl__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:130:1: ( ( rule__InstGlobalProtocolDecl__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:130:1: ( ( rule__InstGlobalProtocolDecl__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:131:1: ( rule__InstGlobalProtocolDecl__Group__0 )
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:132:1: ( rule__InstGlobalProtocolDecl__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:132:2: rule__InstGlobalProtocolDecl__Group__0
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__0_in_ruleInstGlobalProtocolDecl214);
            rule__InstGlobalProtocolDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstGlobalProtocolDecl"


    // $ANTLR start "entryRuleTypeDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:144:1: entryRuleTypeDecl : ruleTypeDecl EOF ;
    public final void entryRuleTypeDecl() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:145:1: ( ruleTypeDecl EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:146:1: ruleTypeDecl EOF
            {
             before(grammarAccess.getTypeDeclRule()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl241);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getTypeDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDecl"


    // $ANTLR start "ruleTypeDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:153:1: ruleTypeDecl : ( ( rule__TypeDecl__Group__0 ) ) ;
    public final void ruleTypeDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:157:2: ( ( ( rule__TypeDecl__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:158:1: ( ( rule__TypeDecl__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:158:1: ( ( rule__TypeDecl__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:159:1: ( rule__TypeDecl__Group__0 )
            {
             before(grammarAccess.getTypeDeclAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:160:1: ( rule__TypeDecl__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:160:2: rule__TypeDecl__Group__0
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl274);
            rule__TypeDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDecl"


    // $ANTLR start "entryRuleGlobalProtocolDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:172:1: entryRuleGlobalProtocolDecl : ruleGlobalProtocolDecl EOF ;
    public final void entryRuleGlobalProtocolDecl() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:173:1: ( ruleGlobalProtocolDecl EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:174:1: ruleGlobalProtocolDecl EOF
            {
             before(grammarAccess.getGlobalProtocolDeclRule()); 
            pushFollow(FOLLOW_ruleGlobalProtocolDecl_in_entryRuleGlobalProtocolDecl301);
            ruleGlobalProtocolDecl();

            state._fsp--;

             after(grammarAccess.getGlobalProtocolDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalProtocolDecl308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalProtocolDecl"


    // $ANTLR start "ruleGlobalProtocolDecl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:181:1: ruleGlobalProtocolDecl : ( ( rule__GlobalProtocolDecl__Group__0 ) ) ;
    public final void ruleGlobalProtocolDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:185:2: ( ( ( rule__GlobalProtocolDecl__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:186:1: ( ( rule__GlobalProtocolDecl__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:186:1: ( ( rule__GlobalProtocolDecl__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:187:1: ( rule__GlobalProtocolDecl__Group__0 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:188:1: ( rule__GlobalProtocolDecl__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:188:2: rule__GlobalProtocolDecl__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__0_in_ruleGlobalProtocolDecl334);
            rule__GlobalProtocolDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalProtocolDecl"


    // $ANTLR start "entryRuleGlobalInteractionBlock"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:200:1: entryRuleGlobalInteractionBlock : ruleGlobalInteractionBlock EOF ;
    public final void entryRuleGlobalInteractionBlock() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:201:1: ( ruleGlobalInteractionBlock EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:202:1: ruleGlobalInteractionBlock EOF
            {
             before(grammarAccess.getGlobalInteractionBlockRule()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_entryRuleGlobalInteractionBlock361);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getGlobalInteractionBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInteractionBlock368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalInteractionBlock"


    // $ANTLR start "ruleGlobalInteractionBlock"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:209:1: ruleGlobalInteractionBlock : ( ( rule__GlobalInteractionBlock__Group__0 ) ) ;
    public final void ruleGlobalInteractionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:213:2: ( ( ( rule__GlobalInteractionBlock__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:214:1: ( ( rule__GlobalInteractionBlock__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:214:1: ( ( rule__GlobalInteractionBlock__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:215:1: ( rule__GlobalInteractionBlock__Group__0 )
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:216:1: ( rule__GlobalInteractionBlock__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:216:2: rule__GlobalInteractionBlock__Group__0
            {
            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__0_in_ruleGlobalInteractionBlock394);
            rule__GlobalInteractionBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInteractionBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalInteractionBlock"


    // $ANTLR start "entryRuleGlobalInteraction"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:228:1: entryRuleGlobalInteraction : ruleGlobalInteraction EOF ;
    public final void entryRuleGlobalInteraction() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:229:1: ( ruleGlobalInteraction EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:230:1: ruleGlobalInteraction EOF
            {
             before(grammarAccess.getGlobalInteractionRule()); 
            pushFollow(FOLLOW_ruleGlobalInteraction_in_entryRuleGlobalInteraction421);
            ruleGlobalInteraction();

            state._fsp--;

             after(grammarAccess.getGlobalInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalInteraction428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalInteraction"


    // $ANTLR start "ruleGlobalInteraction"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:237:1: ruleGlobalInteraction : ( ( rule__GlobalInteraction__Alternatives ) ) ;
    public final void ruleGlobalInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:241:2: ( ( ( rule__GlobalInteraction__Alternatives ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:242:1: ( ( rule__GlobalInteraction__Alternatives ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:242:1: ( ( rule__GlobalInteraction__Alternatives ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:243:1: ( rule__GlobalInteraction__Alternatives )
            {
             before(grammarAccess.getGlobalInteractionAccess().getAlternatives()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:244:1: ( rule__GlobalInteraction__Alternatives )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:244:2: rule__GlobalInteraction__Alternatives
            {
            pushFollow(FOLLOW_rule__GlobalInteraction__Alternatives_in_ruleGlobalInteraction454);
            rule__GlobalInteraction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInteractionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalInteraction"


    // $ANTLR start "entryRuleSpawn"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:256:1: entryRuleSpawn : ruleSpawn EOF ;
    public final void entryRuleSpawn() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:257:1: ( ruleSpawn EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:258:1: ruleSpawn EOF
            {
             before(grammarAccess.getSpawnRule()); 
            pushFollow(FOLLOW_ruleSpawn_in_entryRuleSpawn481);
            ruleSpawn();

            state._fsp--;

             after(grammarAccess.getSpawnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpawn488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpawn"


    // $ANTLR start "ruleSpawn"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:265:1: ruleSpawn : ( ( rule__Spawn__Group__0 ) ) ;
    public final void ruleSpawn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:269:2: ( ( ( rule__Spawn__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:270:1: ( ( rule__Spawn__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:270:1: ( ( rule__Spawn__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:271:1: ( rule__Spawn__Group__0 )
            {
             before(grammarAccess.getSpawnAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:272:1: ( rule__Spawn__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:272:2: rule__Spawn__Group__0
            {
            pushFollow(FOLLOW_rule__Spawn__Group__0_in_ruleSpawn514);
            rule__Spawn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpawn"


    // $ANTLR start "entryRuleDo"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:284:1: entryRuleDo : ruleDo EOF ;
    public final void entryRuleDo() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:285:1: ( ruleDo EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:286:1: ruleDo EOF
            {
             before(grammarAccess.getDoRule()); 
            pushFollow(FOLLOW_ruleDo_in_entryRuleDo541);
            ruleDo();

            state._fsp--;

             after(grammarAccess.getDoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDo"


    // $ANTLR start "ruleDo"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:293:1: ruleDo : ( ( rule__Do__Group__0 ) ) ;
    public final void ruleDo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:297:2: ( ( ( rule__Do__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:298:1: ( ( rule__Do__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:298:1: ( ( rule__Do__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:299:1: ( rule__Do__Group__0 )
            {
             before(grammarAccess.getDoAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:300:1: ( rule__Do__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:300:2: rule__Do__Group__0
            {
            pushFollow(FOLLOW_rule__Do__Group__0_in_ruleDo574);
            rule__Do__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDo"


    // $ANTLR start "entryRuleInterruptible"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:312:1: entryRuleInterruptible : ruleInterruptible EOF ;
    public final void entryRuleInterruptible() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:313:1: ( ruleInterruptible EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:314:1: ruleInterruptible EOF
            {
             before(grammarAccess.getInterruptibleRule()); 
            pushFollow(FOLLOW_ruleInterruptible_in_entryRuleInterruptible601);
            ruleInterruptible();

            state._fsp--;

             after(grammarAccess.getInterruptibleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterruptible608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterruptible"


    // $ANTLR start "ruleInterruptible"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:321:1: ruleInterruptible : ( ( rule__Interruptible__Group__0 ) ) ;
    public final void ruleInterruptible() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:325:2: ( ( ( rule__Interruptible__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:326:1: ( ( rule__Interruptible__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:326:1: ( ( rule__Interruptible__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:327:1: ( rule__Interruptible__Group__0 )
            {
             before(grammarAccess.getInterruptibleAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:328:1: ( rule__Interruptible__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:328:2: rule__Interruptible__Group__0
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__0_in_ruleInterruptible634);
            rule__Interruptible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterruptible"


    // $ANTLR start "entryRuleContinue"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:340:1: entryRuleContinue : ruleContinue EOF ;
    public final void entryRuleContinue() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:341:1: ( ruleContinue EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:342:1: ruleContinue EOF
            {
             before(grammarAccess.getContinueRule()); 
            pushFollow(FOLLOW_ruleContinue_in_entryRuleContinue661);
            ruleContinue();

            state._fsp--;

             after(grammarAccess.getContinueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContinue668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContinue"


    // $ANTLR start "ruleContinue"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:349:1: ruleContinue : ( ( rule__Continue__Group__0 ) ) ;
    public final void ruleContinue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:353:2: ( ( ( rule__Continue__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:354:1: ( ( rule__Continue__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:354:1: ( ( rule__Continue__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:355:1: ( rule__Continue__Group__0 )
            {
             before(grammarAccess.getContinueAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:356:1: ( rule__Continue__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:356:2: rule__Continue__Group__0
            {
            pushFollow(FOLLOW_rule__Continue__Group__0_in_ruleContinue694);
            rule__Continue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContinueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContinue"


    // $ANTLR start "entryRuleRecursion"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:368:1: entryRuleRecursion : ruleRecursion EOF ;
    public final void entryRuleRecursion() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:369:1: ( ruleRecursion EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:370:1: ruleRecursion EOF
            {
             before(grammarAccess.getRecursionRule()); 
            pushFollow(FOLLOW_ruleRecursion_in_entryRuleRecursion721);
            ruleRecursion();

            state._fsp--;

             after(grammarAccess.getRecursionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecursion728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecursion"


    // $ANTLR start "ruleRecursion"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:377:1: ruleRecursion : ( ( rule__Recursion__Group__0 ) ) ;
    public final void ruleRecursion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:381:2: ( ( ( rule__Recursion__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:382:1: ( ( rule__Recursion__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:382:1: ( ( rule__Recursion__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:383:1: ( rule__Recursion__Group__0 )
            {
             before(grammarAccess.getRecursionAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:384:1: ( rule__Recursion__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:384:2: rule__Recursion__Group__0
            {
            pushFollow(FOLLOW_rule__Recursion__Group__0_in_ruleRecursion754);
            rule__Recursion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecursion"


    // $ANTLR start "entryRuleParallel"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:396:1: entryRuleParallel : ruleParallel EOF ;
    public final void entryRuleParallel() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:397:1: ( ruleParallel EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:398:1: ruleParallel EOF
            {
             before(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_ruleParallel_in_entryRuleParallel781);
            ruleParallel();

            state._fsp--;

             after(grammarAccess.getParallelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallel788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:405:1: ruleParallel : ( ( rule__Parallel__Group__0 ) ) ;
    public final void ruleParallel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:409:2: ( ( ( rule__Parallel__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:410:1: ( ( rule__Parallel__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:410:1: ( ( rule__Parallel__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:411:1: ( rule__Parallel__Group__0 )
            {
             before(grammarAccess.getParallelAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:412:1: ( rule__Parallel__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:412:2: rule__Parallel__Group__0
            {
            pushFollow(FOLLOW_rule__Parallel__Group__0_in_ruleParallel814);
            rule__Parallel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleChoice"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:424:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:425:1: ( ruleChoice EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:426:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice841);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:433:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:437:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:438:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:438:1: ( ( rule__Choice__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:439:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:440:1: ( rule__Choice__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:440:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice874);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleMessage"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:452:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:453:1: ( ruleMessage EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:454:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage901);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:461:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:465:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:466:1: ( ( rule__Message__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:466:1: ( ( rule__Message__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:467:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:468:1: ( rule__Message__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:468:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage934);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageSignature"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:480:1: entryRuleMessageSignature : ruleMessageSignature EOF ;
    public final void entryRuleMessageSignature() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:481:1: ( ruleMessageSignature EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:482:1: ruleMessageSignature EOF
            {
             before(grammarAccess.getMessageSignatureRule()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_entryRuleMessageSignature961);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getMessageSignatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSignature968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMessageSignature"


    // $ANTLR start "ruleMessageSignature"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:489:1: ruleMessageSignature : ( ( rule__MessageSignature__Group__0 ) ) ;
    public final void ruleMessageSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:493:2: ( ( ( rule__MessageSignature__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:494:1: ( ( rule__MessageSignature__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:494:1: ( ( rule__MessageSignature__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:495:1: ( rule__MessageSignature__Group__0 )
            {
             before(grammarAccess.getMessageSignatureAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:496:1: ( rule__MessageSignature__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:496:2: rule__MessageSignature__Group__0
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group__0_in_ruleMessageSignature994);
            rule__MessageSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageSignature"


    // $ANTLR start "entryRulePayloadType"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:508:1: entryRulePayloadType : rulePayloadType EOF ;
    public final void entryRulePayloadType() throws RecognitionException {
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:509:1: ( rulePayloadType EOF )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:510:1: rulePayloadType EOF
            {
             before(grammarAccess.getPayloadTypeRule()); 
            pushFollow(FOLLOW_rulePayloadType_in_entryRulePayloadType1021);
            rulePayloadType();

            state._fsp--;

             after(grammarAccess.getPayloadTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePayloadType1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePayloadType"


    // $ANTLR start "rulePayloadType"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:517:1: rulePayloadType : ( ( rule__PayloadType__Group__0 ) ) ;
    public final void rulePayloadType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:521:2: ( ( ( rule__PayloadType__Group__0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:522:1: ( ( rule__PayloadType__Group__0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:522:1: ( ( rule__PayloadType__Group__0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:523:1: ( rule__PayloadType__Group__0 )
            {
             before(grammarAccess.getPayloadTypeAccess().getGroup()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:524:1: ( rule__PayloadType__Group__0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:524:2: rule__PayloadType__Group__0
            {
            pushFollow(FOLLOW_rule__PayloadType__Group__0_in_rulePayloadType1054);
            rule__PayloadType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePayloadType"


    // $ANTLR start "rule__GlobalInteraction__Alternatives"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:536:1: rule__GlobalInteraction__Alternatives : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleParallel ) | ( ruleRecursion ) | ( ruleContinue ) | ( ruleInterruptible ) | ( ruleDo ) | ( ruleSpawn ) );
    public final void rule__GlobalInteraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:540:1: ( ( ruleMessage ) | ( ruleChoice ) | ( ruleParallel ) | ( ruleRecursion ) | ( ruleContinue ) | ( ruleInterruptible ) | ( ruleDo ) | ( ruleSpawn ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:541:1: ( ruleMessage )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:541:1: ( ruleMessage )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:542:1: ruleMessage
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getMessageParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMessage_in_rule__GlobalInteraction__Alternatives1090);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getMessageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:547:6: ( ruleChoice )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:547:6: ( ruleChoice )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:548:1: ruleChoice
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getChoiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChoice_in_rule__GlobalInteraction__Alternatives1107);
                    ruleChoice();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getChoiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:553:6: ( ruleParallel )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:553:6: ( ruleParallel )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:554:1: ruleParallel
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getParallelParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleParallel_in_rule__GlobalInteraction__Alternatives1124);
                    ruleParallel();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getParallelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:559:6: ( ruleRecursion )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:559:6: ( ruleRecursion )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:560:1: ruleRecursion
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getRecursionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRecursion_in_rule__GlobalInteraction__Alternatives1141);
                    ruleRecursion();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getRecursionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:565:6: ( ruleContinue )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:565:6: ( ruleContinue )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:566:1: ruleContinue
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getContinueParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleContinue_in_rule__GlobalInteraction__Alternatives1158);
                    ruleContinue();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getContinueParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:571:6: ( ruleInterruptible )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:571:6: ( ruleInterruptible )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:572:1: ruleInterruptible
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getInterruptibleParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleInterruptible_in_rule__GlobalInteraction__Alternatives1175);
                    ruleInterruptible();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getInterruptibleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:577:6: ( ruleDo )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:577:6: ( ruleDo )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:578:1: ruleDo
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getDoParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDo_in_rule__GlobalInteraction__Alternatives1192);
                    ruleDo();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getDoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:583:6: ( ruleSpawn )
                    {
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:583:6: ( ruleSpawn )
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:584:1: ruleSpawn
                    {
                     before(grammarAccess.getGlobalInteractionAccess().getSpawnParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleSpawn_in_rule__GlobalInteraction__Alternatives1209);
                    ruleSpawn();

                    state._fsp--;

                     after(grammarAccess.getGlobalInteractionAccess().getSpawnParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteraction__Alternatives"


    // $ANTLR start "rule__ScribbleProgram__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:596:1: rule__ScribbleProgram__Group__0 : rule__ScribbleProgram__Group__0__Impl rule__ScribbleProgram__Group__1 ;
    public final void rule__ScribbleProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:600:1: ( rule__ScribbleProgram__Group__0__Impl rule__ScribbleProgram__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:601:2: rule__ScribbleProgram__Group__0__Impl rule__ScribbleProgram__Group__1
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__Group__0__Impl_in_rule__ScribbleProgram__Group__01239);
            rule__ScribbleProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScribbleProgram__Group__1_in_rule__ScribbleProgram__Group__01242);
            rule__ScribbleProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__0"


    // $ANTLR start "rule__ScribbleProgram__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:608:1: rule__ScribbleProgram__Group__0__Impl : ( ( rule__ScribbleProgram__IncludeDeclAssignment_0 )* ) ;
    public final void rule__ScribbleProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:612:1: ( ( ( rule__ScribbleProgram__IncludeDeclAssignment_0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:613:1: ( ( rule__ScribbleProgram__IncludeDeclAssignment_0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:613:1: ( ( rule__ScribbleProgram__IncludeDeclAssignment_0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:614:1: ( rule__ScribbleProgram__IncludeDeclAssignment_0 )*
            {
             before(grammarAccess.getScribbleProgramAccess().getIncludeDeclAssignment_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:615:1: ( rule__ScribbleProgram__IncludeDeclAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:615:2: rule__ScribbleProgram__IncludeDeclAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ScribbleProgram__IncludeDeclAssignment_0_in_rule__ScribbleProgram__Group__0__Impl1269);
            	    rule__ScribbleProgram__IncludeDeclAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getScribbleProgramAccess().getIncludeDeclAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__0__Impl"


    // $ANTLR start "rule__ScribbleProgram__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:625:1: rule__ScribbleProgram__Group__1 : rule__ScribbleProgram__Group__1__Impl rule__ScribbleProgram__Group__2 ;
    public final void rule__ScribbleProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:629:1: ( rule__ScribbleProgram__Group__1__Impl rule__ScribbleProgram__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:630:2: rule__ScribbleProgram__Group__1__Impl rule__ScribbleProgram__Group__2
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__Group__1__Impl_in_rule__ScribbleProgram__Group__11300);
            rule__ScribbleProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScribbleProgram__Group__2_in_rule__ScribbleProgram__Group__11303);
            rule__ScribbleProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__1"


    // $ANTLR start "rule__ScribbleProgram__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:637:1: rule__ScribbleProgram__Group__1__Impl : ( ( rule__ScribbleProgram__TypeDeclAssignment_1 )* ) ;
    public final void rule__ScribbleProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:641:1: ( ( ( rule__ScribbleProgram__TypeDeclAssignment_1 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:642:1: ( ( rule__ScribbleProgram__TypeDeclAssignment_1 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:642:1: ( ( rule__ScribbleProgram__TypeDeclAssignment_1 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:643:1: ( rule__ScribbleProgram__TypeDeclAssignment_1 )*
            {
             before(grammarAccess.getScribbleProgramAccess().getTypeDeclAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:644:1: ( rule__ScribbleProgram__TypeDeclAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:644:2: rule__ScribbleProgram__TypeDeclAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ScribbleProgram__TypeDeclAssignment_1_in_rule__ScribbleProgram__Group__1__Impl1330);
            	    rule__ScribbleProgram__TypeDeclAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getScribbleProgramAccess().getTypeDeclAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__1__Impl"


    // $ANTLR start "rule__ScribbleProgram__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:654:1: rule__ScribbleProgram__Group__2 : rule__ScribbleProgram__Group__2__Impl rule__ScribbleProgram__Group__3 ;
    public final void rule__ScribbleProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:658:1: ( rule__ScribbleProgram__Group__2__Impl rule__ScribbleProgram__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:659:2: rule__ScribbleProgram__Group__2__Impl rule__ScribbleProgram__Group__3
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__Group__2__Impl_in_rule__ScribbleProgram__Group__21361);
            rule__ScribbleProgram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScribbleProgram__Group__3_in_rule__ScribbleProgram__Group__21364);
            rule__ScribbleProgram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__2"


    // $ANTLR start "rule__ScribbleProgram__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:666:1: rule__ScribbleProgram__Group__2__Impl : ( ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) ) ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* ) ) ;
    public final void rule__ScribbleProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:670:1: ( ( ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) ) ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:671:1: ( ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) ) ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:671:1: ( ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) ) ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:672:1: ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) ) ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:672:1: ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:673:1: ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )
            {
             before(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:674:1: ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:674:2: rule__ScribbleProgram__GlobalProtocolDeclAssignment_2
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__GlobalProtocolDeclAssignment_2_in_rule__ScribbleProgram__Group__2__Impl1393);
            rule__ScribbleProgram__GlobalProtocolDeclAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclAssignment_2()); 

            }

            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:677:1: ( ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:678:1: ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )*
            {
             before(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:679:1: ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:679:2: rule__ScribbleProgram__GlobalProtocolDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ScribbleProgram__GlobalProtocolDeclAssignment_2_in_rule__ScribbleProgram__Group__2__Impl1405);
            	    rule__ScribbleProgram__GlobalProtocolDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__2__Impl"


    // $ANTLR start "rule__ScribbleProgram__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:690:1: rule__ScribbleProgram__Group__3 : rule__ScribbleProgram__Group__3__Impl ;
    public final void rule__ScribbleProgram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:694:1: ( rule__ScribbleProgram__Group__3__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:695:2: rule__ScribbleProgram__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ScribbleProgram__Group__3__Impl_in_rule__ScribbleProgram__Group__31438);
            rule__ScribbleProgram__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__3"


    // $ANTLR start "rule__ScribbleProgram__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:701:1: rule__ScribbleProgram__Group__3__Impl : ( ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )* ) ;
    public final void rule__ScribbleProgram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:705:1: ( ( ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:706:1: ( ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:706:1: ( ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:707:1: ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )*
            {
             before(grammarAccess.getScribbleProgramAccess().getInstGlobalProtocolDeclAssignment_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:708:1: ( rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:708:2: rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3_in_rule__ScribbleProgram__Group__3__Impl1465);
            	    rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getScribbleProgramAccess().getInstGlobalProtocolDeclAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__Group__3__Impl"


    // $ANTLR start "rule__IncludeDecl__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:726:1: rule__IncludeDecl__Group__0 : rule__IncludeDecl__Group__0__Impl rule__IncludeDecl__Group__1 ;
    public final void rule__IncludeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:730:1: ( rule__IncludeDecl__Group__0__Impl rule__IncludeDecl__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:731:2: rule__IncludeDecl__Group__0__Impl rule__IncludeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__IncludeDecl__Group__0__Impl_in_rule__IncludeDecl__Group__01504);
            rule__IncludeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeDecl__Group__1_in_rule__IncludeDecl__Group__01507);
            rule__IncludeDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__0"


    // $ANTLR start "rule__IncludeDecl__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:738:1: rule__IncludeDecl__Group__0__Impl : ( 'include' ) ;
    public final void rule__IncludeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:742:1: ( ( 'include' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:743:1: ( 'include' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:743:1: ( 'include' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:744:1: 'include'
            {
             before(grammarAccess.getIncludeDeclAccess().getIncludeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__IncludeDecl__Group__0__Impl1535); 
             after(grammarAccess.getIncludeDeclAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__0__Impl"


    // $ANTLR start "rule__IncludeDecl__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:757:1: rule__IncludeDecl__Group__1 : rule__IncludeDecl__Group__1__Impl rule__IncludeDecl__Group__2 ;
    public final void rule__IncludeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:761:1: ( rule__IncludeDecl__Group__1__Impl rule__IncludeDecl__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:762:2: rule__IncludeDecl__Group__1__Impl rule__IncludeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__IncludeDecl__Group__1__Impl_in_rule__IncludeDecl__Group__11566);
            rule__IncludeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IncludeDecl__Group__2_in_rule__IncludeDecl__Group__11569);
            rule__IncludeDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__1"


    // $ANTLR start "rule__IncludeDecl__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:769:1: rule__IncludeDecl__Group__1__Impl : ( ( rule__IncludeDecl__ImportURIAssignment_1 ) ) ;
    public final void rule__IncludeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:773:1: ( ( ( rule__IncludeDecl__ImportURIAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:774:1: ( ( rule__IncludeDecl__ImportURIAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:774:1: ( ( rule__IncludeDecl__ImportURIAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:775:1: ( rule__IncludeDecl__ImportURIAssignment_1 )
            {
             before(grammarAccess.getIncludeDeclAccess().getImportURIAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:776:1: ( rule__IncludeDecl__ImportURIAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:776:2: rule__IncludeDecl__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__IncludeDecl__ImportURIAssignment_1_in_rule__IncludeDecl__Group__1__Impl1596);
            rule__IncludeDecl__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeDeclAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__1__Impl"


    // $ANTLR start "rule__IncludeDecl__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:786:1: rule__IncludeDecl__Group__2 : rule__IncludeDecl__Group__2__Impl ;
    public final void rule__IncludeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:790:1: ( rule__IncludeDecl__Group__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:791:2: rule__IncludeDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IncludeDecl__Group__2__Impl_in_rule__IncludeDecl__Group__21626);
            rule__IncludeDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__2"


    // $ANTLR start "rule__IncludeDecl__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:797:1: rule__IncludeDecl__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__IncludeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:801:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:802:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:802:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:803:1: RULE_SEMI
            {
             before(grammarAccess.getIncludeDeclAccess().getSEMITerminalRuleCall_2()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__IncludeDecl__Group__2__Impl1653); 
             after(grammarAccess.getIncludeDeclAccess().getSEMITerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__Group__2__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:820:1: rule__InstGlobalProtocolDecl__Group__0 : rule__InstGlobalProtocolDecl__Group__0__Impl rule__InstGlobalProtocolDecl__Group__1 ;
    public final void rule__InstGlobalProtocolDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:824:1: ( rule__InstGlobalProtocolDecl__Group__0__Impl rule__InstGlobalProtocolDecl__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:825:2: rule__InstGlobalProtocolDecl__Group__0__Impl rule__InstGlobalProtocolDecl__Group__1
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__0__Impl_in_rule__InstGlobalProtocolDecl__Group__01688);
            rule__InstGlobalProtocolDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__1_in_rule__InstGlobalProtocolDecl__Group__01691);
            rule__InstGlobalProtocolDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__0"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:832:1: rule__InstGlobalProtocolDecl__Group__0__Impl : ( 'global' ) ;
    public final void rule__InstGlobalProtocolDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:836:1: ( ( 'global' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:837:1: ( 'global' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:837:1: ( 'global' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:838:1: 'global'
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getGlobalKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__InstGlobalProtocolDecl__Group__0__Impl1719); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__0__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:851:1: rule__InstGlobalProtocolDecl__Group__1 : rule__InstGlobalProtocolDecl__Group__1__Impl rule__InstGlobalProtocolDecl__Group__2 ;
    public final void rule__InstGlobalProtocolDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:855:1: ( rule__InstGlobalProtocolDecl__Group__1__Impl rule__InstGlobalProtocolDecl__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:856:2: rule__InstGlobalProtocolDecl__Group__1__Impl rule__InstGlobalProtocolDecl__Group__2
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__1__Impl_in_rule__InstGlobalProtocolDecl__Group__11750);
            rule__InstGlobalProtocolDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__2_in_rule__InstGlobalProtocolDecl__Group__11753);
            rule__InstGlobalProtocolDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__1"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:863:1: rule__InstGlobalProtocolDecl__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__InstGlobalProtocolDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:867:1: ( ( 'protocol' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:868:1: ( 'protocol' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:868:1: ( 'protocol' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:869:1: 'protocol'
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__InstGlobalProtocolDecl__Group__1__Impl1781); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__1__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:882:1: rule__InstGlobalProtocolDecl__Group__2 : rule__InstGlobalProtocolDecl__Group__2__Impl rule__InstGlobalProtocolDecl__Group__3 ;
    public final void rule__InstGlobalProtocolDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:886:1: ( rule__InstGlobalProtocolDecl__Group__2__Impl rule__InstGlobalProtocolDecl__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:887:2: rule__InstGlobalProtocolDecl__Group__2__Impl rule__InstGlobalProtocolDecl__Group__3
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__2__Impl_in_rule__InstGlobalProtocolDecl__Group__21812);
            rule__InstGlobalProtocolDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__3_in_rule__InstGlobalProtocolDecl__Group__21815);
            rule__InstGlobalProtocolDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__2"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:894:1: rule__InstGlobalProtocolDecl__Group__2__Impl : ( ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 ) ) ;
    public final void rule__InstGlobalProtocolDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:898:1: ( ( ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:899:1: ( ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:899:1: ( ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:900:1: ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolNameAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:901:1: ( rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:901:2: rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2_in_rule__InstGlobalProtocolDecl__Group__2__Impl1842);
            rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__2__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:911:1: rule__InstGlobalProtocolDecl__Group__3 : rule__InstGlobalProtocolDecl__Group__3__Impl rule__InstGlobalProtocolDecl__Group__4 ;
    public final void rule__InstGlobalProtocolDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:915:1: ( rule__InstGlobalProtocolDecl__Group__3__Impl rule__InstGlobalProtocolDecl__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:916:2: rule__InstGlobalProtocolDecl__Group__3__Impl rule__InstGlobalProtocolDecl__Group__4
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__3__Impl_in_rule__InstGlobalProtocolDecl__Group__31872);
            rule__InstGlobalProtocolDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__4_in_rule__InstGlobalProtocolDecl__Group__31875);
            rule__InstGlobalProtocolDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__3"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:923:1: rule__InstGlobalProtocolDecl__Group__3__Impl : ( RULE_LPA ) ;
    public final void rule__InstGlobalProtocolDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:927:1: ( ( RULE_LPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:928:1: ( RULE_LPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:928:1: ( RULE_LPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:929:1: RULE_LPA
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getLPATerminalRuleCall_3()); 
            match(input,RULE_LPA,FOLLOW_RULE_LPA_in_rule__InstGlobalProtocolDecl__Group__3__Impl1902); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getLPATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__3__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:940:1: rule__InstGlobalProtocolDecl__Group__4 : rule__InstGlobalProtocolDecl__Group__4__Impl rule__InstGlobalProtocolDecl__Group__5 ;
    public final void rule__InstGlobalProtocolDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:944:1: ( rule__InstGlobalProtocolDecl__Group__4__Impl rule__InstGlobalProtocolDecl__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:945:2: rule__InstGlobalProtocolDecl__Group__4__Impl rule__InstGlobalProtocolDecl__Group__5
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__4__Impl_in_rule__InstGlobalProtocolDecl__Group__41931);
            rule__InstGlobalProtocolDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__5_in_rule__InstGlobalProtocolDecl__Group__41934);
            rule__InstGlobalProtocolDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__4"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:952:1: rule__InstGlobalProtocolDecl__Group__4__Impl : ( 'role' ) ;
    public final void rule__InstGlobalProtocolDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:956:1: ( ( 'role' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:957:1: ( 'role' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:957:1: ( 'role' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:958:1: 'role'
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__InstGlobalProtocolDecl__Group__4__Impl1962); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__4__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:971:1: rule__InstGlobalProtocolDecl__Group__5 : rule__InstGlobalProtocolDecl__Group__5__Impl rule__InstGlobalProtocolDecl__Group__6 ;
    public final void rule__InstGlobalProtocolDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:975:1: ( rule__InstGlobalProtocolDecl__Group__5__Impl rule__InstGlobalProtocolDecl__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:976:2: rule__InstGlobalProtocolDecl__Group__5__Impl rule__InstGlobalProtocolDecl__Group__6
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__5__Impl_in_rule__InstGlobalProtocolDecl__Group__51993);
            rule__InstGlobalProtocolDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__6_in_rule__InstGlobalProtocolDecl__Group__51996);
            rule__InstGlobalProtocolDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__5"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:983:1: rule__InstGlobalProtocolDecl__Group__5__Impl : ( ( rule__InstGlobalProtocolDecl__RolesAssignment_5 ) ) ;
    public final void rule__InstGlobalProtocolDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:987:1: ( ( ( rule__InstGlobalProtocolDecl__RolesAssignment_5 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:988:1: ( ( rule__InstGlobalProtocolDecl__RolesAssignment_5 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:988:1: ( ( rule__InstGlobalProtocolDecl__RolesAssignment_5 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:989:1: ( rule__InstGlobalProtocolDecl__RolesAssignment_5 )
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesAssignment_5()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:990:1: ( rule__InstGlobalProtocolDecl__RolesAssignment_5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:990:2: rule__InstGlobalProtocolDecl__RolesAssignment_5
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__RolesAssignment_5_in_rule__InstGlobalProtocolDecl__Group__5__Impl2023);
            rule__InstGlobalProtocolDecl__RolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__5__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1000:1: rule__InstGlobalProtocolDecl__Group__6 : rule__InstGlobalProtocolDecl__Group__6__Impl rule__InstGlobalProtocolDecl__Group__7 ;
    public final void rule__InstGlobalProtocolDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1004:1: ( rule__InstGlobalProtocolDecl__Group__6__Impl rule__InstGlobalProtocolDecl__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1005:2: rule__InstGlobalProtocolDecl__Group__6__Impl rule__InstGlobalProtocolDecl__Group__7
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__6__Impl_in_rule__InstGlobalProtocolDecl__Group__62053);
            rule__InstGlobalProtocolDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__7_in_rule__InstGlobalProtocolDecl__Group__62056);
            rule__InstGlobalProtocolDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__6"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1012:1: rule__InstGlobalProtocolDecl__Group__6__Impl : ( ( rule__InstGlobalProtocolDecl__Group_6__0 )* ) ;
    public final void rule__InstGlobalProtocolDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1016:1: ( ( ( rule__InstGlobalProtocolDecl__Group_6__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1017:1: ( ( rule__InstGlobalProtocolDecl__Group_6__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1017:1: ( ( rule__InstGlobalProtocolDecl__Group_6__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1018:1: ( rule__InstGlobalProtocolDecl__Group_6__0 )*
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getGroup_6()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1019:1: ( rule__InstGlobalProtocolDecl__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1019:2: rule__InstGlobalProtocolDecl__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__0_in_rule__InstGlobalProtocolDecl__Group__6__Impl2083);
            	    rule__InstGlobalProtocolDecl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__6__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1029:1: rule__InstGlobalProtocolDecl__Group__7 : rule__InstGlobalProtocolDecl__Group__7__Impl rule__InstGlobalProtocolDecl__Group__8 ;
    public final void rule__InstGlobalProtocolDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1033:1: ( rule__InstGlobalProtocolDecl__Group__7__Impl rule__InstGlobalProtocolDecl__Group__8 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1034:2: rule__InstGlobalProtocolDecl__Group__7__Impl rule__InstGlobalProtocolDecl__Group__8
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__7__Impl_in_rule__InstGlobalProtocolDecl__Group__72114);
            rule__InstGlobalProtocolDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__8_in_rule__InstGlobalProtocolDecl__Group__72117);
            rule__InstGlobalProtocolDecl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__7"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1041:1: rule__InstGlobalProtocolDecl__Group__7__Impl : ( RULE_RPA ) ;
    public final void rule__InstGlobalProtocolDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1045:1: ( ( RULE_RPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1046:1: ( RULE_RPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1046:1: ( RULE_RPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1047:1: RULE_RPA
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRPATerminalRuleCall_7()); 
            match(input,RULE_RPA,FOLLOW_RULE_RPA_in_rule__InstGlobalProtocolDecl__Group__7__Impl2144); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRPATerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__7__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__8"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1058:1: rule__InstGlobalProtocolDecl__Group__8 : rule__InstGlobalProtocolDecl__Group__8__Impl rule__InstGlobalProtocolDecl__Group__9 ;
    public final void rule__InstGlobalProtocolDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1062:1: ( rule__InstGlobalProtocolDecl__Group__8__Impl rule__InstGlobalProtocolDecl__Group__9 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1063:2: rule__InstGlobalProtocolDecl__Group__8__Impl rule__InstGlobalProtocolDecl__Group__9
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__8__Impl_in_rule__InstGlobalProtocolDecl__Group__82173);
            rule__InstGlobalProtocolDecl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__9_in_rule__InstGlobalProtocolDecl__Group__82176);
            rule__InstGlobalProtocolDecl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__8"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__8__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1070:1: rule__InstGlobalProtocolDecl__Group__8__Impl : ( 'instantiates' ) ;
    public final void rule__InstGlobalProtocolDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1074:1: ( ( 'instantiates' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1075:1: ( 'instantiates' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1075:1: ( 'instantiates' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1076:1: 'instantiates'
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatesKeyword_8()); 
            match(input,24,FOLLOW_24_in_rule__InstGlobalProtocolDecl__Group__8__Impl2204); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__8__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__9"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1089:1: rule__InstGlobalProtocolDecl__Group__9 : rule__InstGlobalProtocolDecl__Group__9__Impl rule__InstGlobalProtocolDecl__Group__10 ;
    public final void rule__InstGlobalProtocolDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1093:1: ( rule__InstGlobalProtocolDecl__Group__9__Impl rule__InstGlobalProtocolDecl__Group__10 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1094:2: rule__InstGlobalProtocolDecl__Group__9__Impl rule__InstGlobalProtocolDecl__Group__10
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__9__Impl_in_rule__InstGlobalProtocolDecl__Group__92235);
            rule__InstGlobalProtocolDecl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__10_in_rule__InstGlobalProtocolDecl__Group__92238);
            rule__InstGlobalProtocolDecl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__9"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__9__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1101:1: rule__InstGlobalProtocolDecl__Group__9__Impl : ( ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 ) ) ;
    public final void rule__InstGlobalProtocolDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1105:1: ( ( ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1106:1: ( ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1106:1: ( ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1107:1: ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 )
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatedProtocolAssignment_9()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1108:1: ( rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1108:2: rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9_in_rule__InstGlobalProtocolDecl__Group__9__Impl2265);
            rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatedProtocolAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__9__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__10"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1118:1: rule__InstGlobalProtocolDecl__Group__10 : rule__InstGlobalProtocolDecl__Group__10__Impl ;
    public final void rule__InstGlobalProtocolDecl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1122:1: ( rule__InstGlobalProtocolDecl__Group__10__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1123:2: rule__InstGlobalProtocolDecl__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group__10__Impl_in_rule__InstGlobalProtocolDecl__Group__102295);
            rule__InstGlobalProtocolDecl__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__10"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group__10__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1129:1: rule__InstGlobalProtocolDecl__Group__10__Impl : ( RULE_SEMI ) ;
    public final void rule__InstGlobalProtocolDecl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1133:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1134:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1134:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1135:1: RULE_SEMI
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getSEMITerminalRuleCall_10()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__InstGlobalProtocolDecl__Group__10__Impl2322); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getSEMITerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group__10__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1168:1: rule__InstGlobalProtocolDecl__Group_6__0 : rule__InstGlobalProtocolDecl__Group_6__0__Impl rule__InstGlobalProtocolDecl__Group_6__1 ;
    public final void rule__InstGlobalProtocolDecl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1172:1: ( rule__InstGlobalProtocolDecl__Group_6__0__Impl rule__InstGlobalProtocolDecl__Group_6__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1173:2: rule__InstGlobalProtocolDecl__Group_6__0__Impl rule__InstGlobalProtocolDecl__Group_6__1
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__0__Impl_in_rule__InstGlobalProtocolDecl__Group_6__02373);
            rule__InstGlobalProtocolDecl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__1_in_rule__InstGlobalProtocolDecl__Group_6__02376);
            rule__InstGlobalProtocolDecl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__0"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1180:1: rule__InstGlobalProtocolDecl__Group_6__0__Impl : ( RULE_COMMA ) ;
    public final void rule__InstGlobalProtocolDecl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1184:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1185:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1185:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1186:1: RULE_COMMA
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_6_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__InstGlobalProtocolDecl__Group_6__0__Impl2403); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__0__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1197:1: rule__InstGlobalProtocolDecl__Group_6__1 : rule__InstGlobalProtocolDecl__Group_6__1__Impl rule__InstGlobalProtocolDecl__Group_6__2 ;
    public final void rule__InstGlobalProtocolDecl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1201:1: ( rule__InstGlobalProtocolDecl__Group_6__1__Impl rule__InstGlobalProtocolDecl__Group_6__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1202:2: rule__InstGlobalProtocolDecl__Group_6__1__Impl rule__InstGlobalProtocolDecl__Group_6__2
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__1__Impl_in_rule__InstGlobalProtocolDecl__Group_6__12432);
            rule__InstGlobalProtocolDecl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__2_in_rule__InstGlobalProtocolDecl__Group_6__12435);
            rule__InstGlobalProtocolDecl__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__1"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1209:1: rule__InstGlobalProtocolDecl__Group_6__1__Impl : ( 'role' ) ;
    public final void rule__InstGlobalProtocolDecl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1213:1: ( ( 'role' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1214:1: ( 'role' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1214:1: ( 'role' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1215:1: 'role'
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_6_1()); 
            match(input,23,FOLLOW_23_in_rule__InstGlobalProtocolDecl__Group_6__1__Impl2463); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRoleKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__1__Impl"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1228:1: rule__InstGlobalProtocolDecl__Group_6__2 : rule__InstGlobalProtocolDecl__Group_6__2__Impl ;
    public final void rule__InstGlobalProtocolDecl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1232:1: ( rule__InstGlobalProtocolDecl__Group_6__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1233:2: rule__InstGlobalProtocolDecl__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__Group_6__2__Impl_in_rule__InstGlobalProtocolDecl__Group_6__22494);
            rule__InstGlobalProtocolDecl__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__2"


    // $ANTLR start "rule__InstGlobalProtocolDecl__Group_6__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1239:1: rule__InstGlobalProtocolDecl__Group_6__2__Impl : ( ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 ) ) ;
    public final void rule__InstGlobalProtocolDecl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1243:1: ( ( ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1244:1: ( ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1244:1: ( ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1245:1: ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 )
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesAssignment_6_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1246:1: ( rule__InstGlobalProtocolDecl__RolesAssignment_6_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1246:2: rule__InstGlobalProtocolDecl__RolesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__InstGlobalProtocolDecl__RolesAssignment_6_2_in_rule__InstGlobalProtocolDecl__Group_6__2__Impl2521);
            rule__InstGlobalProtocolDecl__RolesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__Group_6__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1262:1: rule__TypeDecl__Group__0 : rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 ;
    public final void rule__TypeDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1266:1: ( rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1267:2: rule__TypeDecl__Group__0__Impl rule__TypeDecl__Group__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02557);
            rule__TypeDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02560);
            rule__TypeDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0"


    // $ANTLR start "rule__TypeDecl__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1274:1: rule__TypeDecl__Group__0__Impl : ( 'import' ) ;
    public final void rule__TypeDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1278:1: ( ( 'import' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1279:1: ( 'import' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1279:1: ( 'import' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1280:1: 'import'
            {
             before(grammarAccess.getTypeDeclAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__TypeDecl__Group__0__Impl2588); 
             after(grammarAccess.getTypeDeclAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1293:1: rule__TypeDecl__Group__1 : rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 ;
    public final void rule__TypeDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1297:1: ( rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1298:2: rule__TypeDecl__Group__1__Impl rule__TypeDecl__Group__2
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12619);
            rule__TypeDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12622);
            rule__TypeDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1"


    // $ANTLR start "rule__TypeDecl__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1305:1: rule__TypeDecl__Group__1__Impl : ( ( rule__TypeDecl__TypeNameAssignment_1 ) ) ;
    public final void rule__TypeDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1309:1: ( ( ( rule__TypeDecl__TypeNameAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1310:1: ( ( rule__TypeDecl__TypeNameAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1310:1: ( ( rule__TypeDecl__TypeNameAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1311:1: ( rule__TypeDecl__TypeNameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getTypeNameAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1312:1: ( rule__TypeDecl__TypeNameAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1312:2: rule__TypeDecl__TypeNameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__TypeNameAssignment_1_in_rule__TypeDecl__Group__1__Impl2649);
            rule__TypeDecl__TypeNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getTypeNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__1__Impl"


    // $ANTLR start "rule__TypeDecl__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1322:1: rule__TypeDecl__Group__2 : rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 ;
    public final void rule__TypeDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1326:1: ( rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1327:2: rule__TypeDecl__Group__2__Impl rule__TypeDecl__Group__3
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22679);
            rule__TypeDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22682);
            rule__TypeDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2"


    // $ANTLR start "rule__TypeDecl__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1334:1: rule__TypeDecl__Group__2__Impl : ( 'from' ) ;
    public final void rule__TypeDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1338:1: ( ( 'from' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1339:1: ( 'from' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1339:1: ( 'from' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1340:1: 'from'
            {
             before(grammarAccess.getTypeDeclAccess().getFromKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__TypeDecl__Group__2__Impl2710); 
             after(grammarAccess.getTypeDeclAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__2__Impl"


    // $ANTLR start "rule__TypeDecl__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1353:1: rule__TypeDecl__Group__3 : rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 ;
    public final void rule__TypeDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1357:1: ( rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1358:2: rule__TypeDecl__Group__3__Impl rule__TypeDecl__Group__4
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32741);
            rule__TypeDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32744);
            rule__TypeDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3"


    // $ANTLR start "rule__TypeDecl__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1365:1: rule__TypeDecl__Group__3__Impl : ( RULE_LT ) ;
    public final void rule__TypeDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1369:1: ( ( RULE_LT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1370:1: ( RULE_LT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1370:1: ( RULE_LT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1371:1: RULE_LT
            {
             before(grammarAccess.getTypeDeclAccess().getLTTerminalRuleCall_3()); 
            match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__TypeDecl__Group__3__Impl2771); 
             after(grammarAccess.getTypeDeclAccess().getLTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__3__Impl"


    // $ANTLR start "rule__TypeDecl__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1382:1: rule__TypeDecl__Group__4 : rule__TypeDecl__Group__4__Impl rule__TypeDecl__Group__5 ;
    public final void rule__TypeDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1386:1: ( rule__TypeDecl__Group__4__Impl rule__TypeDecl__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1387:2: rule__TypeDecl__Group__4__Impl rule__TypeDecl__Group__5
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42800);
            rule__TypeDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__5_in_rule__TypeDecl__Group__42803);
            rule__TypeDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__4"


    // $ANTLR start "rule__TypeDecl__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1394:1: rule__TypeDecl__Group__4__Impl : ( ( rule__TypeDecl__SchemaAssignment_4 ) ) ;
    public final void rule__TypeDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1398:1: ( ( ( rule__TypeDecl__SchemaAssignment_4 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1399:1: ( ( rule__TypeDecl__SchemaAssignment_4 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1399:1: ( ( rule__TypeDecl__SchemaAssignment_4 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1400:1: ( rule__TypeDecl__SchemaAssignment_4 )
            {
             before(grammarAccess.getTypeDeclAccess().getSchemaAssignment_4()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1401:1: ( rule__TypeDecl__SchemaAssignment_4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1401:2: rule__TypeDecl__SchemaAssignment_4
            {
            pushFollow(FOLLOW_rule__TypeDecl__SchemaAssignment_4_in_rule__TypeDecl__Group__4__Impl2830);
            rule__TypeDecl__SchemaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getSchemaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__4__Impl"


    // $ANTLR start "rule__TypeDecl__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1411:1: rule__TypeDecl__Group__5 : rule__TypeDecl__Group__5__Impl rule__TypeDecl__Group__6 ;
    public final void rule__TypeDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1415:1: ( rule__TypeDecl__Group__5__Impl rule__TypeDecl__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1416:2: rule__TypeDecl__Group__5__Impl rule__TypeDecl__Group__6
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__5__Impl_in_rule__TypeDecl__Group__52860);
            rule__TypeDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__6_in_rule__TypeDecl__Group__52863);
            rule__TypeDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__5"


    // $ANTLR start "rule__TypeDecl__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1423:1: rule__TypeDecl__Group__5__Impl : ( RULE_GT ) ;
    public final void rule__TypeDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1427:1: ( ( RULE_GT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1428:1: ( RULE_GT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1428:1: ( RULE_GT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1429:1: RULE_GT
            {
             before(grammarAccess.getTypeDeclAccess().getGTTerminalRuleCall_5()); 
            match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__TypeDecl__Group__5__Impl2890); 
             after(grammarAccess.getTypeDeclAccess().getGTTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__5__Impl"


    // $ANTLR start "rule__TypeDecl__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1440:1: rule__TypeDecl__Group__6 : rule__TypeDecl__Group__6__Impl rule__TypeDecl__Group__7 ;
    public final void rule__TypeDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1444:1: ( rule__TypeDecl__Group__6__Impl rule__TypeDecl__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1445:2: rule__TypeDecl__Group__6__Impl rule__TypeDecl__Group__7
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__6__Impl_in_rule__TypeDecl__Group__62919);
            rule__TypeDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__7_in_rule__TypeDecl__Group__62922);
            rule__TypeDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__6"


    // $ANTLR start "rule__TypeDecl__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1452:1: rule__TypeDecl__Group__6__Impl : ( ( rule__TypeDecl__FileAssignment_6 ) ) ;
    public final void rule__TypeDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1456:1: ( ( ( rule__TypeDecl__FileAssignment_6 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1457:1: ( ( rule__TypeDecl__FileAssignment_6 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1457:1: ( ( rule__TypeDecl__FileAssignment_6 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1458:1: ( rule__TypeDecl__FileAssignment_6 )
            {
             before(grammarAccess.getTypeDeclAccess().getFileAssignment_6()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1459:1: ( rule__TypeDecl__FileAssignment_6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1459:2: rule__TypeDecl__FileAssignment_6
            {
            pushFollow(FOLLOW_rule__TypeDecl__FileAssignment_6_in_rule__TypeDecl__Group__6__Impl2949);
            rule__TypeDecl__FileAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getFileAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__6__Impl"


    // $ANTLR start "rule__TypeDecl__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1469:1: rule__TypeDecl__Group__7 : rule__TypeDecl__Group__7__Impl rule__TypeDecl__Group__8 ;
    public final void rule__TypeDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1473:1: ( rule__TypeDecl__Group__7__Impl rule__TypeDecl__Group__8 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1474:2: rule__TypeDecl__Group__7__Impl rule__TypeDecl__Group__8
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__7__Impl_in_rule__TypeDecl__Group__72979);
            rule__TypeDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group__8_in_rule__TypeDecl__Group__72982);
            rule__TypeDecl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__7"


    // $ANTLR start "rule__TypeDecl__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1481:1: rule__TypeDecl__Group__7__Impl : ( ( rule__TypeDecl__Group_7__0 )? ) ;
    public final void rule__TypeDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1485:1: ( ( ( rule__TypeDecl__Group_7__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1486:1: ( ( rule__TypeDecl__Group_7__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1486:1: ( ( rule__TypeDecl__Group_7__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1487:1: ( rule__TypeDecl__Group_7__0 )?
            {
             before(grammarAccess.getTypeDeclAccess().getGroup_7()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1488:1: ( rule__TypeDecl__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1488:2: rule__TypeDecl__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__TypeDecl__Group_7__0_in_rule__TypeDecl__Group__7__Impl3009);
                    rule__TypeDecl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__7__Impl"


    // $ANTLR start "rule__TypeDecl__Group__8"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1498:1: rule__TypeDecl__Group__8 : rule__TypeDecl__Group__8__Impl ;
    public final void rule__TypeDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1502:1: ( rule__TypeDecl__Group__8__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1503:2: rule__TypeDecl__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group__8__Impl_in_rule__TypeDecl__Group__83040);
            rule__TypeDecl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__8"


    // $ANTLR start "rule__TypeDecl__Group__8__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1509:1: rule__TypeDecl__Group__8__Impl : ( RULE_SEMI ) ;
    public final void rule__TypeDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1513:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1514:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1514:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1515:1: RULE_SEMI
            {
             before(grammarAccess.getTypeDeclAccess().getSEMITerminalRuleCall_8()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__TypeDecl__Group__8__Impl3067); 
             after(grammarAccess.getTypeDeclAccess().getSEMITerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group__8__Impl"


    // $ANTLR start "rule__TypeDecl__Group_7__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1544:1: rule__TypeDecl__Group_7__0 : rule__TypeDecl__Group_7__0__Impl rule__TypeDecl__Group_7__1 ;
    public final void rule__TypeDecl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1548:1: ( rule__TypeDecl__Group_7__0__Impl rule__TypeDecl__Group_7__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1549:2: rule__TypeDecl__Group_7__0__Impl rule__TypeDecl__Group_7__1
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_7__0__Impl_in_rule__TypeDecl__Group_7__03114);
            rule__TypeDecl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeDecl__Group_7__1_in_rule__TypeDecl__Group_7__03117);
            rule__TypeDecl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_7__0"


    // $ANTLR start "rule__TypeDecl__Group_7__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1556:1: rule__TypeDecl__Group_7__0__Impl : ( 'as' ) ;
    public final void rule__TypeDecl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1560:1: ( ( 'as' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1561:1: ( 'as' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1561:1: ( 'as' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1562:1: 'as'
            {
             before(grammarAccess.getTypeDeclAccess().getAsKeyword_7_0()); 
            match(input,27,FOLLOW_27_in_rule__TypeDecl__Group_7__0__Impl3145); 
             after(grammarAccess.getTypeDeclAccess().getAsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_7__0__Impl"


    // $ANTLR start "rule__TypeDecl__Group_7__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1575:1: rule__TypeDecl__Group_7__1 : rule__TypeDecl__Group_7__1__Impl ;
    public final void rule__TypeDecl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1579:1: ( rule__TypeDecl__Group_7__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1580:2: rule__TypeDecl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeDecl__Group_7__1__Impl_in_rule__TypeDecl__Group_7__13176);
            rule__TypeDecl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_7__1"


    // $ANTLR start "rule__TypeDecl__Group_7__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1586:1: rule__TypeDecl__Group_7__1__Impl : ( ( rule__TypeDecl__AliasAssignment_7_1 ) ) ;
    public final void rule__TypeDecl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1590:1: ( ( ( rule__TypeDecl__AliasAssignment_7_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1591:1: ( ( rule__TypeDecl__AliasAssignment_7_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1591:1: ( ( rule__TypeDecl__AliasAssignment_7_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1592:1: ( rule__TypeDecl__AliasAssignment_7_1 )
            {
             before(grammarAccess.getTypeDeclAccess().getAliasAssignment_7_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1593:1: ( rule__TypeDecl__AliasAssignment_7_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1593:2: rule__TypeDecl__AliasAssignment_7_1
            {
            pushFollow(FOLLOW_rule__TypeDecl__AliasAssignment_7_1_in_rule__TypeDecl__Group_7__1__Impl3203);
            rule__TypeDecl__AliasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclAccess().getAliasAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__Group_7__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1607:1: rule__GlobalProtocolDecl__Group__0 : rule__GlobalProtocolDecl__Group__0__Impl rule__GlobalProtocolDecl__Group__1 ;
    public final void rule__GlobalProtocolDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1611:1: ( rule__GlobalProtocolDecl__Group__0__Impl rule__GlobalProtocolDecl__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1612:2: rule__GlobalProtocolDecl__Group__0__Impl rule__GlobalProtocolDecl__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__0__Impl_in_rule__GlobalProtocolDecl__Group__03237);
            rule__GlobalProtocolDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__1_in_rule__GlobalProtocolDecl__Group__03240);
            rule__GlobalProtocolDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__0"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1619:1: rule__GlobalProtocolDecl__Group__0__Impl : ( 'global' ) ;
    public final void rule__GlobalProtocolDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1623:1: ( ( 'global' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1624:1: ( 'global' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1624:1: ( 'global' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1625:1: 'global'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGlobalKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__GlobalProtocolDecl__Group__0__Impl3268); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__0__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1638:1: rule__GlobalProtocolDecl__Group__1 : rule__GlobalProtocolDecl__Group__1__Impl rule__GlobalProtocolDecl__Group__2 ;
    public final void rule__GlobalProtocolDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1642:1: ( rule__GlobalProtocolDecl__Group__1__Impl rule__GlobalProtocolDecl__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1643:2: rule__GlobalProtocolDecl__Group__1__Impl rule__GlobalProtocolDecl__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__1__Impl_in_rule__GlobalProtocolDecl__Group__13299);
            rule__GlobalProtocolDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__2_in_rule__GlobalProtocolDecl__Group__13302);
            rule__GlobalProtocolDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__1"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1650:1: rule__GlobalProtocolDecl__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__GlobalProtocolDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1654:1: ( ( 'protocol' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1655:1: ( 'protocol' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1655:1: ( 'protocol' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1656:1: 'protocol'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getProtocolKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__GlobalProtocolDecl__Group__1__Impl3330); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getProtocolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1669:1: rule__GlobalProtocolDecl__Group__2 : rule__GlobalProtocolDecl__Group__2__Impl rule__GlobalProtocolDecl__Group__3 ;
    public final void rule__GlobalProtocolDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1673:1: ( rule__GlobalProtocolDecl__Group__2__Impl rule__GlobalProtocolDecl__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1674:2: rule__GlobalProtocolDecl__Group__2__Impl rule__GlobalProtocolDecl__Group__3
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__2__Impl_in_rule__GlobalProtocolDecl__Group__23361);
            rule__GlobalProtocolDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__3_in_rule__GlobalProtocolDecl__Group__23364);
            rule__GlobalProtocolDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__2"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1681:1: rule__GlobalProtocolDecl__Group__2__Impl : ( ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 ) ) ;
    public final void rule__GlobalProtocolDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1685:1: ( ( ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1686:1: ( ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1686:1: ( ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1687:1: ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getProtocolNameAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1688:1: ( rule__GlobalProtocolDecl__ProtocolNameAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1688:2: rule__GlobalProtocolDecl__ProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__ProtocolNameAssignment_2_in_rule__GlobalProtocolDecl__Group__2__Impl3391);
            rule__GlobalProtocolDecl__ProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getProtocolNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__2__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1698:1: rule__GlobalProtocolDecl__Group__3 : rule__GlobalProtocolDecl__Group__3__Impl rule__GlobalProtocolDecl__Group__4 ;
    public final void rule__GlobalProtocolDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1702:1: ( rule__GlobalProtocolDecl__Group__3__Impl rule__GlobalProtocolDecl__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1703:2: rule__GlobalProtocolDecl__Group__3__Impl rule__GlobalProtocolDecl__Group__4
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__3__Impl_in_rule__GlobalProtocolDecl__Group__33421);
            rule__GlobalProtocolDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__4_in_rule__GlobalProtocolDecl__Group__33424);
            rule__GlobalProtocolDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__3"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1710:1: rule__GlobalProtocolDecl__Group__3__Impl : ( ( rule__GlobalProtocolDecl__Group_3__0 )? ) ;
    public final void rule__GlobalProtocolDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1714:1: ( ( ( rule__GlobalProtocolDecl__Group_3__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1715:1: ( ( rule__GlobalProtocolDecl__Group_3__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1715:1: ( ( rule__GlobalProtocolDecl__Group_3__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1716:1: ( rule__GlobalProtocolDecl__Group_3__0 )?
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1717:1: ( rule__GlobalProtocolDecl__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_LT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1717:2: rule__GlobalProtocolDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__0_in_rule__GlobalProtocolDecl__Group__3__Impl3451);
                    rule__GlobalProtocolDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__3__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1727:1: rule__GlobalProtocolDecl__Group__4 : rule__GlobalProtocolDecl__Group__4__Impl rule__GlobalProtocolDecl__Group__5 ;
    public final void rule__GlobalProtocolDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1731:1: ( rule__GlobalProtocolDecl__Group__4__Impl rule__GlobalProtocolDecl__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1732:2: rule__GlobalProtocolDecl__Group__4__Impl rule__GlobalProtocolDecl__Group__5
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__4__Impl_in_rule__GlobalProtocolDecl__Group__43482);
            rule__GlobalProtocolDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__5_in_rule__GlobalProtocolDecl__Group__43485);
            rule__GlobalProtocolDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__4"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1739:1: rule__GlobalProtocolDecl__Group__4__Impl : ( RULE_LPA ) ;
    public final void rule__GlobalProtocolDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1743:1: ( ( RULE_LPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1744:1: ( RULE_LPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1744:1: ( RULE_LPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1745:1: RULE_LPA
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getLPATerminalRuleCall_4()); 
            match(input,RULE_LPA,FOLLOW_RULE_LPA_in_rule__GlobalProtocolDecl__Group__4__Impl3512); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getLPATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__4__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1756:1: rule__GlobalProtocolDecl__Group__5 : rule__GlobalProtocolDecl__Group__5__Impl rule__GlobalProtocolDecl__Group__6 ;
    public final void rule__GlobalProtocolDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1760:1: ( rule__GlobalProtocolDecl__Group__5__Impl rule__GlobalProtocolDecl__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1761:2: rule__GlobalProtocolDecl__Group__5__Impl rule__GlobalProtocolDecl__Group__6
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__5__Impl_in_rule__GlobalProtocolDecl__Group__53541);
            rule__GlobalProtocolDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__6_in_rule__GlobalProtocolDecl__Group__53544);
            rule__GlobalProtocolDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__5"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1768:1: rule__GlobalProtocolDecl__Group__5__Impl : ( ( rule__GlobalProtocolDecl__Group_5__0 )? ) ;
    public final void rule__GlobalProtocolDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1772:1: ( ( ( rule__GlobalProtocolDecl__Group_5__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1773:1: ( ( rule__GlobalProtocolDecl__Group_5__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1773:1: ( ( rule__GlobalProtocolDecl__Group_5__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1774:1: ( rule__GlobalProtocolDecl__Group_5__0 )?
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGroup_5()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1775:1: ( rule__GlobalProtocolDecl__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1775:2: rule__GlobalProtocolDecl__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__0_in_rule__GlobalProtocolDecl__Group__5__Impl3571);
                    rule__GlobalProtocolDecl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__5__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1785:1: rule__GlobalProtocolDecl__Group__6 : rule__GlobalProtocolDecl__Group__6__Impl rule__GlobalProtocolDecl__Group__7 ;
    public final void rule__GlobalProtocolDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1789:1: ( rule__GlobalProtocolDecl__Group__6__Impl rule__GlobalProtocolDecl__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1790:2: rule__GlobalProtocolDecl__Group__6__Impl rule__GlobalProtocolDecl__Group__7
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__6__Impl_in_rule__GlobalProtocolDecl__Group__63602);
            rule__GlobalProtocolDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__7_in_rule__GlobalProtocolDecl__Group__63605);
            rule__GlobalProtocolDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__6"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1797:1: rule__GlobalProtocolDecl__Group__6__Impl : ( RULE_RPA ) ;
    public final void rule__GlobalProtocolDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1801:1: ( ( RULE_RPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1802:1: ( RULE_RPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1802:1: ( RULE_RPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1803:1: RULE_RPA
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRPATerminalRuleCall_6()); 
            match(input,RULE_RPA,FOLLOW_RULE_RPA_in_rule__GlobalProtocolDecl__Group__6__Impl3632); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getRPATerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__6__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1814:1: rule__GlobalProtocolDecl__Group__7 : rule__GlobalProtocolDecl__Group__7__Impl ;
    public final void rule__GlobalProtocolDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1818:1: ( rule__GlobalProtocolDecl__Group__7__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1819:2: rule__GlobalProtocolDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group__7__Impl_in_rule__GlobalProtocolDecl__Group__73661);
            rule__GlobalProtocolDecl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__7"


    // $ANTLR start "rule__GlobalProtocolDecl__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1825:1: rule__GlobalProtocolDecl__Group__7__Impl : ( ( rule__GlobalProtocolDecl__BodyAssignment_7 ) ) ;
    public final void rule__GlobalProtocolDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1829:1: ( ( ( rule__GlobalProtocolDecl__BodyAssignment_7 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1830:1: ( ( rule__GlobalProtocolDecl__BodyAssignment_7 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1830:1: ( ( rule__GlobalProtocolDecl__BodyAssignment_7 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1831:1: ( rule__GlobalProtocolDecl__BodyAssignment_7 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getBodyAssignment_7()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1832:1: ( rule__GlobalProtocolDecl__BodyAssignment_7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1832:2: rule__GlobalProtocolDecl__BodyAssignment_7
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__BodyAssignment_7_in_rule__GlobalProtocolDecl__Group__7__Impl3688);
            rule__GlobalProtocolDecl__BodyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group__7__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1858:1: rule__GlobalProtocolDecl__Group_3__0 : rule__GlobalProtocolDecl__Group_3__0__Impl rule__GlobalProtocolDecl__Group_3__1 ;
    public final void rule__GlobalProtocolDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1862:1: ( rule__GlobalProtocolDecl__Group_3__0__Impl rule__GlobalProtocolDecl__Group_3__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1863:2: rule__GlobalProtocolDecl__Group_3__0__Impl rule__GlobalProtocolDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__0__Impl_in_rule__GlobalProtocolDecl__Group_3__03734);
            rule__GlobalProtocolDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__1_in_rule__GlobalProtocolDecl__Group_3__03737);
            rule__GlobalProtocolDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__0"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1870:1: rule__GlobalProtocolDecl__Group_3__0__Impl : ( RULE_LT ) ;
    public final void rule__GlobalProtocolDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1874:1: ( ( RULE_LT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1875:1: ( RULE_LT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1875:1: ( RULE_LT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1876:1: RULE_LT
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getLTTerminalRuleCall_3_0()); 
            match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__GlobalProtocolDecl__Group_3__0__Impl3764); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getLTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__0__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1887:1: rule__GlobalProtocolDecl__Group_3__1 : rule__GlobalProtocolDecl__Group_3__1__Impl rule__GlobalProtocolDecl__Group_3__2 ;
    public final void rule__GlobalProtocolDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1891:1: ( rule__GlobalProtocolDecl__Group_3__1__Impl rule__GlobalProtocolDecl__Group_3__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1892:2: rule__GlobalProtocolDecl__Group_3__1__Impl rule__GlobalProtocolDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__1__Impl_in_rule__GlobalProtocolDecl__Group_3__13793);
            rule__GlobalProtocolDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__2_in_rule__GlobalProtocolDecl__Group_3__13796);
            rule__GlobalProtocolDecl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__1"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1899:1: rule__GlobalProtocolDecl__Group_3__1__Impl : ( 'sig' ) ;
    public final void rule__GlobalProtocolDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1903:1: ( ( 'sig' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1904:1: ( 'sig' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1904:1: ( 'sig' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1905:1: 'sig'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_1()); 
            match(input,28,FOLLOW_28_in_rule__GlobalProtocolDecl__Group_3__1__Impl3824); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1918:1: rule__GlobalProtocolDecl__Group_3__2 : rule__GlobalProtocolDecl__Group_3__2__Impl rule__GlobalProtocolDecl__Group_3__3 ;
    public final void rule__GlobalProtocolDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1922:1: ( rule__GlobalProtocolDecl__Group_3__2__Impl rule__GlobalProtocolDecl__Group_3__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1923:2: rule__GlobalProtocolDecl__Group_3__2__Impl rule__GlobalProtocolDecl__Group_3__3
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__2__Impl_in_rule__GlobalProtocolDecl__Group_3__23855);
            rule__GlobalProtocolDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__3_in_rule__GlobalProtocolDecl__Group_3__23858);
            rule__GlobalProtocolDecl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__2"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1930:1: rule__GlobalProtocolDecl__Group_3__2__Impl : ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 ) ) ;
    public final void rule__GlobalProtocolDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1934:1: ( ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1935:1: ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1935:1: ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1936:1: ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1937:1: ( rule__GlobalProtocolDecl__ParametersAssignment_3_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1937:2: rule__GlobalProtocolDecl__ParametersAssignment_3_2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__ParametersAssignment_3_2_in_rule__GlobalProtocolDecl__Group_3__2__Impl3885);
            rule__GlobalProtocolDecl__ParametersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__2__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1947:1: rule__GlobalProtocolDecl__Group_3__3 : rule__GlobalProtocolDecl__Group_3__3__Impl rule__GlobalProtocolDecl__Group_3__4 ;
    public final void rule__GlobalProtocolDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1951:1: ( rule__GlobalProtocolDecl__Group_3__3__Impl rule__GlobalProtocolDecl__Group_3__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1952:2: rule__GlobalProtocolDecl__Group_3__3__Impl rule__GlobalProtocolDecl__Group_3__4
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__3__Impl_in_rule__GlobalProtocolDecl__Group_3__33915);
            rule__GlobalProtocolDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__4_in_rule__GlobalProtocolDecl__Group_3__33918);
            rule__GlobalProtocolDecl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__3"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1959:1: rule__GlobalProtocolDecl__Group_3__3__Impl : ( ( rule__GlobalProtocolDecl__Group_3_3__0 )* ) ;
    public final void rule__GlobalProtocolDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1963:1: ( ( ( rule__GlobalProtocolDecl__Group_3_3__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1964:1: ( ( rule__GlobalProtocolDecl__Group_3_3__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1964:1: ( ( rule__GlobalProtocolDecl__Group_3_3__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1965:1: ( rule__GlobalProtocolDecl__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1966:1: ( rule__GlobalProtocolDecl__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1966:2: rule__GlobalProtocolDecl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__0_in_rule__GlobalProtocolDecl__Group_3__3__Impl3945);
            	    rule__GlobalProtocolDecl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGlobalProtocolDeclAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__3__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1976:1: rule__GlobalProtocolDecl__Group_3__4 : rule__GlobalProtocolDecl__Group_3__4__Impl ;
    public final void rule__GlobalProtocolDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1980:1: ( rule__GlobalProtocolDecl__Group_3__4__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1981:2: rule__GlobalProtocolDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3__4__Impl_in_rule__GlobalProtocolDecl__Group_3__43976);
            rule__GlobalProtocolDecl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__4"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1987:1: rule__GlobalProtocolDecl__Group_3__4__Impl : ( RULE_GT ) ;
    public final void rule__GlobalProtocolDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1991:1: ( ( RULE_GT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1992:1: ( RULE_GT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1992:1: ( RULE_GT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:1993:1: RULE_GT
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGTTerminalRuleCall_3_4()); 
            match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__GlobalProtocolDecl__Group_3__4__Impl4003); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getGTTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3__4__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2014:1: rule__GlobalProtocolDecl__Group_3_3__0 : rule__GlobalProtocolDecl__Group_3_3__0__Impl rule__GlobalProtocolDecl__Group_3_3__1 ;
    public final void rule__GlobalProtocolDecl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2018:1: ( rule__GlobalProtocolDecl__Group_3_3__0__Impl rule__GlobalProtocolDecl__Group_3_3__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2019:2: rule__GlobalProtocolDecl__Group_3_3__0__Impl rule__GlobalProtocolDecl__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__0__Impl_in_rule__GlobalProtocolDecl__Group_3_3__04042);
            rule__GlobalProtocolDecl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__1_in_rule__GlobalProtocolDecl__Group_3_3__04045);
            rule__GlobalProtocolDecl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__0"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2026:1: rule__GlobalProtocolDecl__Group_3_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__GlobalProtocolDecl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2030:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2031:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2031:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2032:1: RULE_COMMA
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_3_3_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__GlobalProtocolDecl__Group_3_3__0__Impl4072); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__0__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2043:1: rule__GlobalProtocolDecl__Group_3_3__1 : rule__GlobalProtocolDecl__Group_3_3__1__Impl rule__GlobalProtocolDecl__Group_3_3__2 ;
    public final void rule__GlobalProtocolDecl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2047:1: ( rule__GlobalProtocolDecl__Group_3_3__1__Impl rule__GlobalProtocolDecl__Group_3_3__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2048:2: rule__GlobalProtocolDecl__Group_3_3__1__Impl rule__GlobalProtocolDecl__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__1__Impl_in_rule__GlobalProtocolDecl__Group_3_3__14101);
            rule__GlobalProtocolDecl__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__2_in_rule__GlobalProtocolDecl__Group_3_3__14104);
            rule__GlobalProtocolDecl__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__1"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2055:1: rule__GlobalProtocolDecl__Group_3_3__1__Impl : ( 'sig' ) ;
    public final void rule__GlobalProtocolDecl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2059:1: ( ( 'sig' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2060:1: ( 'sig' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2060:1: ( 'sig' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2061:1: 'sig'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_3_1()); 
            match(input,28,FOLLOW_28_in_rule__GlobalProtocolDecl__Group_3_3__1__Impl4132); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getSigKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2074:1: rule__GlobalProtocolDecl__Group_3_3__2 : rule__GlobalProtocolDecl__Group_3_3__2__Impl ;
    public final void rule__GlobalProtocolDecl__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2078:1: ( rule__GlobalProtocolDecl__Group_3_3__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2079:2: rule__GlobalProtocolDecl__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_3_3__2__Impl_in_rule__GlobalProtocolDecl__Group_3_3__24163);
            rule__GlobalProtocolDecl__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__2"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_3_3__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2085:1: rule__GlobalProtocolDecl__Group_3_3__2__Impl : ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 ) ) ;
    public final void rule__GlobalProtocolDecl__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2089:1: ( ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2090:1: ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2090:1: ( ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2091:1: ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_3_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2092:1: ( rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2092:2: rule__GlobalProtocolDecl__ParametersAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__ParametersAssignment_3_3_2_in_rule__GlobalProtocolDecl__Group_3_3__2__Impl4190);
            rule__GlobalProtocolDecl__ParametersAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getParametersAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_3_3__2__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2108:1: rule__GlobalProtocolDecl__Group_5__0 : rule__GlobalProtocolDecl__Group_5__0__Impl rule__GlobalProtocolDecl__Group_5__1 ;
    public final void rule__GlobalProtocolDecl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2112:1: ( rule__GlobalProtocolDecl__Group_5__0__Impl rule__GlobalProtocolDecl__Group_5__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2113:2: rule__GlobalProtocolDecl__Group_5__0__Impl rule__GlobalProtocolDecl__Group_5__1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__0__Impl_in_rule__GlobalProtocolDecl__Group_5__04226);
            rule__GlobalProtocolDecl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__1_in_rule__GlobalProtocolDecl__Group_5__04229);
            rule__GlobalProtocolDecl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__0"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2120:1: rule__GlobalProtocolDecl__Group_5__0__Impl : ( 'role' ) ;
    public final void rule__GlobalProtocolDecl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2124:1: ( ( 'role' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2125:1: ( 'role' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2125:1: ( 'role' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2126:1: 'role'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__GlobalProtocolDecl__Group_5__0__Impl4257); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__0__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2139:1: rule__GlobalProtocolDecl__Group_5__1 : rule__GlobalProtocolDecl__Group_5__1__Impl rule__GlobalProtocolDecl__Group_5__2 ;
    public final void rule__GlobalProtocolDecl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2143:1: ( rule__GlobalProtocolDecl__Group_5__1__Impl rule__GlobalProtocolDecl__Group_5__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2144:2: rule__GlobalProtocolDecl__Group_5__1__Impl rule__GlobalProtocolDecl__Group_5__2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__1__Impl_in_rule__GlobalProtocolDecl__Group_5__14288);
            rule__GlobalProtocolDecl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__2_in_rule__GlobalProtocolDecl__Group_5__14291);
            rule__GlobalProtocolDecl__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__1"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2151:1: rule__GlobalProtocolDecl__Group_5__1__Impl : ( ( rule__GlobalProtocolDecl__RolesAssignment_5_1 ) ) ;
    public final void rule__GlobalProtocolDecl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2155:1: ( ( ( rule__GlobalProtocolDecl__RolesAssignment_5_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2156:1: ( ( rule__GlobalProtocolDecl__RolesAssignment_5_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2156:1: ( ( rule__GlobalProtocolDecl__RolesAssignment_5_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2157:1: ( rule__GlobalProtocolDecl__RolesAssignment_5_1 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_5_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2158:1: ( rule__GlobalProtocolDecl__RolesAssignment_5_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2158:2: rule__GlobalProtocolDecl__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__RolesAssignment_5_1_in_rule__GlobalProtocolDecl__Group_5__1__Impl4318);
            rule__GlobalProtocolDecl__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2168:1: rule__GlobalProtocolDecl__Group_5__2 : rule__GlobalProtocolDecl__Group_5__2__Impl ;
    public final void rule__GlobalProtocolDecl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2172:1: ( rule__GlobalProtocolDecl__Group_5__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2173:2: rule__GlobalProtocolDecl__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5__2__Impl_in_rule__GlobalProtocolDecl__Group_5__24348);
            rule__GlobalProtocolDecl__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__2"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2179:1: rule__GlobalProtocolDecl__Group_5__2__Impl : ( ( rule__GlobalProtocolDecl__Group_5_2__0 )* ) ;
    public final void rule__GlobalProtocolDecl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2183:1: ( ( ( rule__GlobalProtocolDecl__Group_5_2__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2184:1: ( ( rule__GlobalProtocolDecl__Group_5_2__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2184:1: ( ( rule__GlobalProtocolDecl__Group_5_2__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2185:1: ( rule__GlobalProtocolDecl__Group_5_2__0 )*
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getGroup_5_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2186:1: ( rule__GlobalProtocolDecl__Group_5_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2186:2: rule__GlobalProtocolDecl__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__0_in_rule__GlobalProtocolDecl__Group_5__2__Impl4375);
            	    rule__GlobalProtocolDecl__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGlobalProtocolDeclAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5__2__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2202:1: rule__GlobalProtocolDecl__Group_5_2__0 : rule__GlobalProtocolDecl__Group_5_2__0__Impl rule__GlobalProtocolDecl__Group_5_2__1 ;
    public final void rule__GlobalProtocolDecl__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2206:1: ( rule__GlobalProtocolDecl__Group_5_2__0__Impl rule__GlobalProtocolDecl__Group_5_2__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2207:2: rule__GlobalProtocolDecl__Group_5_2__0__Impl rule__GlobalProtocolDecl__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__0__Impl_in_rule__GlobalProtocolDecl__Group_5_2__04412);
            rule__GlobalProtocolDecl__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__1_in_rule__GlobalProtocolDecl__Group_5_2__04415);
            rule__GlobalProtocolDecl__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__0"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2214:1: rule__GlobalProtocolDecl__Group_5_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__GlobalProtocolDecl__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2218:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2219:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2219:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2220:1: RULE_COMMA
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_5_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__GlobalProtocolDecl__Group_5_2__0__Impl4442); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getCOMMATerminalRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__0__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2231:1: rule__GlobalProtocolDecl__Group_5_2__1 : rule__GlobalProtocolDecl__Group_5_2__1__Impl rule__GlobalProtocolDecl__Group_5_2__2 ;
    public final void rule__GlobalProtocolDecl__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2235:1: ( rule__GlobalProtocolDecl__Group_5_2__1__Impl rule__GlobalProtocolDecl__Group_5_2__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2236:2: rule__GlobalProtocolDecl__Group_5_2__1__Impl rule__GlobalProtocolDecl__Group_5_2__2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__1__Impl_in_rule__GlobalProtocolDecl__Group_5_2__14471);
            rule__GlobalProtocolDecl__Group_5_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__2_in_rule__GlobalProtocolDecl__Group_5_2__14474);
            rule__GlobalProtocolDecl__Group_5_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__1"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2243:1: rule__GlobalProtocolDecl__Group_5_2__1__Impl : ( 'role' ) ;
    public final void rule__GlobalProtocolDecl__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2247:1: ( ( 'role' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2248:1: ( 'role' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2248:1: ( 'role' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2249:1: 'role'
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_2_1()); 
            match(input,23,FOLLOW_23_in_rule__GlobalProtocolDecl__Group_5_2__1__Impl4502); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getRoleKeyword_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__1__Impl"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2262:1: rule__GlobalProtocolDecl__Group_5_2__2 : rule__GlobalProtocolDecl__Group_5_2__2__Impl ;
    public final void rule__GlobalProtocolDecl__Group_5_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2266:1: ( rule__GlobalProtocolDecl__Group_5_2__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2267:2: rule__GlobalProtocolDecl__Group_5_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__Group_5_2__2__Impl_in_rule__GlobalProtocolDecl__Group_5_2__24533);
            rule__GlobalProtocolDecl__Group_5_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__2"


    // $ANTLR start "rule__GlobalProtocolDecl__Group_5_2__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2273:1: rule__GlobalProtocolDecl__Group_5_2__2__Impl : ( ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 ) ) ;
    public final void rule__GlobalProtocolDecl__Group_5_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2277:1: ( ( ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2278:1: ( ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2278:1: ( ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2279:1: ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 )
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_5_2_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2280:1: ( rule__GlobalProtocolDecl__RolesAssignment_5_2_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2280:2: rule__GlobalProtocolDecl__RolesAssignment_5_2_2
            {
            pushFollow(FOLLOW_rule__GlobalProtocolDecl__RolesAssignment_5_2_2_in_rule__GlobalProtocolDecl__Group_5_2__2__Impl4560);
            rule__GlobalProtocolDecl__RolesAssignment_5_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalProtocolDeclAccess().getRolesAssignment_5_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__Group_5_2__2__Impl"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2296:1: rule__GlobalInteractionBlock__Group__0 : rule__GlobalInteractionBlock__Group__0__Impl rule__GlobalInteractionBlock__Group__1 ;
    public final void rule__GlobalInteractionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2300:1: ( rule__GlobalInteractionBlock__Group__0__Impl rule__GlobalInteractionBlock__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2301:2: rule__GlobalInteractionBlock__Group__0__Impl rule__GlobalInteractionBlock__Group__1
            {
            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__0__Impl_in_rule__GlobalInteractionBlock__Group__04596);
            rule__GlobalInteractionBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__1_in_rule__GlobalInteractionBlock__Group__04599);
            rule__GlobalInteractionBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__0"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2308:1: rule__GlobalInteractionBlock__Group__0__Impl : ( RULE_LCB ) ;
    public final void rule__GlobalInteractionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2312:1: ( ( RULE_LCB ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2313:1: ( RULE_LCB )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2313:1: ( RULE_LCB )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2314:1: RULE_LCB
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getLCBTerminalRuleCall_0()); 
            match(input,RULE_LCB,FOLLOW_RULE_LCB_in_rule__GlobalInteractionBlock__Group__0__Impl4626); 
             after(grammarAccess.getGlobalInteractionBlockAccess().getLCBTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__0__Impl"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2325:1: rule__GlobalInteractionBlock__Group__1 : rule__GlobalInteractionBlock__Group__1__Impl rule__GlobalInteractionBlock__Group__2 ;
    public final void rule__GlobalInteractionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2329:1: ( rule__GlobalInteractionBlock__Group__1__Impl rule__GlobalInteractionBlock__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2330:2: rule__GlobalInteractionBlock__Group__1__Impl rule__GlobalInteractionBlock__Group__2
            {
            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__1__Impl_in_rule__GlobalInteractionBlock__Group__14655);
            rule__GlobalInteractionBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__2_in_rule__GlobalInteractionBlock__Group__14658);
            rule__GlobalInteractionBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__1"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2337:1: rule__GlobalInteractionBlock__Group__1__Impl : ( ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) ) ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* ) ) ;
    public final void rule__GlobalInteractionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2341:1: ( ( ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) ) ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2342:1: ( ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) ) ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2342:1: ( ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) ) ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2343:1: ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) ) ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2343:1: ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2344:1: ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2345:1: ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2345:2: rule__GlobalInteractionBlock__InteractionsequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__GlobalInteractionBlock__InteractionsequenceAssignment_1_in_rule__GlobalInteractionBlock__Group__1__Impl4687);
            rule__GlobalInteractionBlock__InteractionsequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceAssignment_1()); 

            }

            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2348:1: ( ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2349:1: ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )*
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2350:1: ( rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=30 && LA12_0<=31)||(LA12_0>=34 && LA12_0<=36)||LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2350:2: rule__GlobalInteractionBlock__InteractionsequenceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__GlobalInteractionBlock__InteractionsequenceAssignment_1_in_rule__GlobalInteractionBlock__Group__1__Impl4699);
            	    rule__GlobalInteractionBlock__InteractionsequenceAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__1__Impl"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2361:1: rule__GlobalInteractionBlock__Group__2 : rule__GlobalInteractionBlock__Group__2__Impl ;
    public final void rule__GlobalInteractionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2365:1: ( rule__GlobalInteractionBlock__Group__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2366:2: rule__GlobalInteractionBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GlobalInteractionBlock__Group__2__Impl_in_rule__GlobalInteractionBlock__Group__24732);
            rule__GlobalInteractionBlock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__2"


    // $ANTLR start "rule__GlobalInteractionBlock__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2372:1: rule__GlobalInteractionBlock__Group__2__Impl : ( RULE_RCB ) ;
    public final void rule__GlobalInteractionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2376:1: ( ( RULE_RCB ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2377:1: ( RULE_RCB )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2377:1: ( RULE_RCB )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2378:1: RULE_RCB
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getRCBTerminalRuleCall_2()); 
            match(input,RULE_RCB,FOLLOW_RULE_RCB_in_rule__GlobalInteractionBlock__Group__2__Impl4759); 
             after(grammarAccess.getGlobalInteractionBlockAccess().getRCBTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__Group__2__Impl"


    // $ANTLR start "rule__Spawn__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2395:1: rule__Spawn__Group__0 : rule__Spawn__Group__0__Impl rule__Spawn__Group__1 ;
    public final void rule__Spawn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2399:1: ( rule__Spawn__Group__0__Impl rule__Spawn__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2400:2: rule__Spawn__Group__0__Impl rule__Spawn__Group__1
            {
            pushFollow(FOLLOW_rule__Spawn__Group__0__Impl_in_rule__Spawn__Group__04794);
            rule__Spawn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__1_in_rule__Spawn__Group__04797);
            rule__Spawn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__0"


    // $ANTLR start "rule__Spawn__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2407:1: rule__Spawn__Group__0__Impl : ( ( rule__Spawn__RoleNameAssignment_0 ) ) ;
    public final void rule__Spawn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2411:1: ( ( ( rule__Spawn__RoleNameAssignment_0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2412:1: ( ( rule__Spawn__RoleNameAssignment_0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2412:1: ( ( rule__Spawn__RoleNameAssignment_0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2413:1: ( rule__Spawn__RoleNameAssignment_0 )
            {
             before(grammarAccess.getSpawnAccess().getRoleNameAssignment_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2414:1: ( rule__Spawn__RoleNameAssignment_0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2414:2: rule__Spawn__RoleNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Spawn__RoleNameAssignment_0_in_rule__Spawn__Group__0__Impl4824);
            rule__Spawn__RoleNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getRoleNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__0__Impl"


    // $ANTLR start "rule__Spawn__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2424:1: rule__Spawn__Group__1 : rule__Spawn__Group__1__Impl rule__Spawn__Group__2 ;
    public final void rule__Spawn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2428:1: ( rule__Spawn__Group__1__Impl rule__Spawn__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2429:2: rule__Spawn__Group__1__Impl rule__Spawn__Group__2
            {
            pushFollow(FOLLOW_rule__Spawn__Group__1__Impl_in_rule__Spawn__Group__14854);
            rule__Spawn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__2_in_rule__Spawn__Group__14857);
            rule__Spawn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__1"


    // $ANTLR start "rule__Spawn__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2436:1: rule__Spawn__Group__1__Impl : ( 'spawns' ) ;
    public final void rule__Spawn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2440:1: ( ( 'spawns' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2441:1: ( 'spawns' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2441:1: ( 'spawns' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2442:1: 'spawns'
            {
             before(grammarAccess.getSpawnAccess().getSpawnsKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Spawn__Group__1__Impl4885); 
             after(grammarAccess.getSpawnAccess().getSpawnsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__1__Impl"


    // $ANTLR start "rule__Spawn__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2455:1: rule__Spawn__Group__2 : rule__Spawn__Group__2__Impl rule__Spawn__Group__3 ;
    public final void rule__Spawn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2459:1: ( rule__Spawn__Group__2__Impl rule__Spawn__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2460:2: rule__Spawn__Group__2__Impl rule__Spawn__Group__3
            {
            pushFollow(FOLLOW_rule__Spawn__Group__2__Impl_in_rule__Spawn__Group__24916);
            rule__Spawn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__3_in_rule__Spawn__Group__24919);
            rule__Spawn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__2"


    // $ANTLR start "rule__Spawn__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2467:1: rule__Spawn__Group__2__Impl : ( ( rule__Spawn__TargetProtocolNameAssignment_2 ) ) ;
    public final void rule__Spawn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2471:1: ( ( ( rule__Spawn__TargetProtocolNameAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2472:1: ( ( rule__Spawn__TargetProtocolNameAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2472:1: ( ( rule__Spawn__TargetProtocolNameAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2473:1: ( rule__Spawn__TargetProtocolNameAssignment_2 )
            {
             before(grammarAccess.getSpawnAccess().getTargetProtocolNameAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2474:1: ( rule__Spawn__TargetProtocolNameAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2474:2: rule__Spawn__TargetProtocolNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Spawn__TargetProtocolNameAssignment_2_in_rule__Spawn__Group__2__Impl4946);
            rule__Spawn__TargetProtocolNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getTargetProtocolNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__2__Impl"


    // $ANTLR start "rule__Spawn__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2484:1: rule__Spawn__Group__3 : rule__Spawn__Group__3__Impl rule__Spawn__Group__4 ;
    public final void rule__Spawn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2488:1: ( rule__Spawn__Group__3__Impl rule__Spawn__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2489:2: rule__Spawn__Group__3__Impl rule__Spawn__Group__4
            {
            pushFollow(FOLLOW_rule__Spawn__Group__3__Impl_in_rule__Spawn__Group__34976);
            rule__Spawn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__4_in_rule__Spawn__Group__34979);
            rule__Spawn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__3"


    // $ANTLR start "rule__Spawn__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2496:1: rule__Spawn__Group__3__Impl : ( ( rule__Spawn__Group_3__0 )? ) ;
    public final void rule__Spawn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2500:1: ( ( ( rule__Spawn__Group_3__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2501:1: ( ( rule__Spawn__Group_3__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2501:1: ( ( rule__Spawn__Group_3__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2502:1: ( rule__Spawn__Group_3__0 )?
            {
             before(grammarAccess.getSpawnAccess().getGroup_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2503:1: ( rule__Spawn__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2503:2: rule__Spawn__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Spawn__Group_3__0_in_rule__Spawn__Group__3__Impl5006);
                    rule__Spawn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpawnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__3__Impl"


    // $ANTLR start "rule__Spawn__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2513:1: rule__Spawn__Group__4 : rule__Spawn__Group__4__Impl rule__Spawn__Group__5 ;
    public final void rule__Spawn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2517:1: ( rule__Spawn__Group__4__Impl rule__Spawn__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2518:2: rule__Spawn__Group__4__Impl rule__Spawn__Group__5
            {
            pushFollow(FOLLOW_rule__Spawn__Group__4__Impl_in_rule__Spawn__Group__45037);
            rule__Spawn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__5_in_rule__Spawn__Group__45040);
            rule__Spawn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__4"


    // $ANTLR start "rule__Spawn__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2525:1: rule__Spawn__Group__4__Impl : ( RULE_LPA ) ;
    public final void rule__Spawn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2529:1: ( ( RULE_LPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2530:1: ( RULE_LPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2530:1: ( RULE_LPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2531:1: RULE_LPA
            {
             before(grammarAccess.getSpawnAccess().getLPATerminalRuleCall_4()); 
            match(input,RULE_LPA,FOLLOW_RULE_LPA_in_rule__Spawn__Group__4__Impl5067); 
             after(grammarAccess.getSpawnAccess().getLPATerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__4__Impl"


    // $ANTLR start "rule__Spawn__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2542:1: rule__Spawn__Group__5 : rule__Spawn__Group__5__Impl rule__Spawn__Group__6 ;
    public final void rule__Spawn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2546:1: ( rule__Spawn__Group__5__Impl rule__Spawn__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2547:2: rule__Spawn__Group__5__Impl rule__Spawn__Group__6
            {
            pushFollow(FOLLOW_rule__Spawn__Group__5__Impl_in_rule__Spawn__Group__55096);
            rule__Spawn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__6_in_rule__Spawn__Group__55099);
            rule__Spawn__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__5"


    // $ANTLR start "rule__Spawn__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2554:1: rule__Spawn__Group__5__Impl : ( ( rule__Spawn__CurrentRolesAssignment_5 ) ) ;
    public final void rule__Spawn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2558:1: ( ( ( rule__Spawn__CurrentRolesAssignment_5 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2559:1: ( ( rule__Spawn__CurrentRolesAssignment_5 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2559:1: ( ( rule__Spawn__CurrentRolesAssignment_5 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2560:1: ( rule__Spawn__CurrentRolesAssignment_5 )
            {
             before(grammarAccess.getSpawnAccess().getCurrentRolesAssignment_5()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2561:1: ( rule__Spawn__CurrentRolesAssignment_5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2561:2: rule__Spawn__CurrentRolesAssignment_5
            {
            pushFollow(FOLLOW_rule__Spawn__CurrentRolesAssignment_5_in_rule__Spawn__Group__5__Impl5126);
            rule__Spawn__CurrentRolesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getCurrentRolesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__5__Impl"


    // $ANTLR start "rule__Spawn__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2571:1: rule__Spawn__Group__6 : rule__Spawn__Group__6__Impl rule__Spawn__Group__7 ;
    public final void rule__Spawn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2575:1: ( rule__Spawn__Group__6__Impl rule__Spawn__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2576:2: rule__Spawn__Group__6__Impl rule__Spawn__Group__7
            {
            pushFollow(FOLLOW_rule__Spawn__Group__6__Impl_in_rule__Spawn__Group__65156);
            rule__Spawn__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__7_in_rule__Spawn__Group__65159);
            rule__Spawn__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__6"


    // $ANTLR start "rule__Spawn__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2583:1: rule__Spawn__Group__6__Impl : ( 'as' ) ;
    public final void rule__Spawn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2587:1: ( ( 'as' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2588:1: ( 'as' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2588:1: ( 'as' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2589:1: 'as'
            {
             before(grammarAccess.getSpawnAccess().getAsKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Spawn__Group__6__Impl5187); 
             after(grammarAccess.getSpawnAccess().getAsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__6__Impl"


    // $ANTLR start "rule__Spawn__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2602:1: rule__Spawn__Group__7 : rule__Spawn__Group__7__Impl rule__Spawn__Group__8 ;
    public final void rule__Spawn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2606:1: ( rule__Spawn__Group__7__Impl rule__Spawn__Group__8 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2607:2: rule__Spawn__Group__7__Impl rule__Spawn__Group__8
            {
            pushFollow(FOLLOW_rule__Spawn__Group__7__Impl_in_rule__Spawn__Group__75218);
            rule__Spawn__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__8_in_rule__Spawn__Group__75221);
            rule__Spawn__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__7"


    // $ANTLR start "rule__Spawn__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2614:1: rule__Spawn__Group__7__Impl : ( ( rule__Spawn__TargetRolesAssignment_7 ) ) ;
    public final void rule__Spawn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2618:1: ( ( ( rule__Spawn__TargetRolesAssignment_7 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2619:1: ( ( rule__Spawn__TargetRolesAssignment_7 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2619:1: ( ( rule__Spawn__TargetRolesAssignment_7 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2620:1: ( rule__Spawn__TargetRolesAssignment_7 )
            {
             before(grammarAccess.getSpawnAccess().getTargetRolesAssignment_7()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2621:1: ( rule__Spawn__TargetRolesAssignment_7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2621:2: rule__Spawn__TargetRolesAssignment_7
            {
            pushFollow(FOLLOW_rule__Spawn__TargetRolesAssignment_7_in_rule__Spawn__Group__7__Impl5248);
            rule__Spawn__TargetRolesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getTargetRolesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__7__Impl"


    // $ANTLR start "rule__Spawn__Group__8"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2631:1: rule__Spawn__Group__8 : rule__Spawn__Group__8__Impl rule__Spawn__Group__9 ;
    public final void rule__Spawn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2635:1: ( rule__Spawn__Group__8__Impl rule__Spawn__Group__9 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2636:2: rule__Spawn__Group__8__Impl rule__Spawn__Group__9
            {
            pushFollow(FOLLOW_rule__Spawn__Group__8__Impl_in_rule__Spawn__Group__85278);
            rule__Spawn__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__9_in_rule__Spawn__Group__85281);
            rule__Spawn__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__8"


    // $ANTLR start "rule__Spawn__Group__8__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2643:1: rule__Spawn__Group__8__Impl : ( ( rule__Spawn__Group_8__0 )* ) ;
    public final void rule__Spawn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2647:1: ( ( ( rule__Spawn__Group_8__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2648:1: ( ( rule__Spawn__Group_8__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2648:1: ( ( rule__Spawn__Group_8__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2649:1: ( rule__Spawn__Group_8__0 )*
            {
             before(grammarAccess.getSpawnAccess().getGroup_8()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2650:1: ( rule__Spawn__Group_8__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2650:2: rule__Spawn__Group_8__0
            	    {
            	    pushFollow(FOLLOW_rule__Spawn__Group_8__0_in_rule__Spawn__Group__8__Impl5308);
            	    rule__Spawn__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSpawnAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__8__Impl"


    // $ANTLR start "rule__Spawn__Group__9"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2660:1: rule__Spawn__Group__9 : rule__Spawn__Group__9__Impl rule__Spawn__Group__10 ;
    public final void rule__Spawn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2664:1: ( rule__Spawn__Group__9__Impl rule__Spawn__Group__10 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2665:2: rule__Spawn__Group__9__Impl rule__Spawn__Group__10
            {
            pushFollow(FOLLOW_rule__Spawn__Group__9__Impl_in_rule__Spawn__Group__95339);
            rule__Spawn__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group__10_in_rule__Spawn__Group__95342);
            rule__Spawn__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__9"


    // $ANTLR start "rule__Spawn__Group__9__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2672:1: rule__Spawn__Group__9__Impl : ( RULE_RPA ) ;
    public final void rule__Spawn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2676:1: ( ( RULE_RPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2677:1: ( RULE_RPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2677:1: ( RULE_RPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2678:1: RULE_RPA
            {
             before(grammarAccess.getSpawnAccess().getRPATerminalRuleCall_9()); 
            match(input,RULE_RPA,FOLLOW_RULE_RPA_in_rule__Spawn__Group__9__Impl5369); 
             after(grammarAccess.getSpawnAccess().getRPATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__9__Impl"


    // $ANTLR start "rule__Spawn__Group__10"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2689:1: rule__Spawn__Group__10 : rule__Spawn__Group__10__Impl ;
    public final void rule__Spawn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2693:1: ( rule__Spawn__Group__10__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2694:2: rule__Spawn__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Spawn__Group__10__Impl_in_rule__Spawn__Group__105398);
            rule__Spawn__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__10"


    // $ANTLR start "rule__Spawn__Group__10__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2700:1: rule__Spawn__Group__10__Impl : ( RULE_SEMI ) ;
    public final void rule__Spawn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2704:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2705:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2705:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2706:1: RULE_SEMI
            {
             before(grammarAccess.getSpawnAccess().getSEMITerminalRuleCall_10()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__Spawn__Group__10__Impl5425); 
             after(grammarAccess.getSpawnAccess().getSEMITerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group__10__Impl"


    // $ANTLR start "rule__Spawn__Group_3__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2739:1: rule__Spawn__Group_3__0 : rule__Spawn__Group_3__0__Impl rule__Spawn__Group_3__1 ;
    public final void rule__Spawn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2743:1: ( rule__Spawn__Group_3__0__Impl rule__Spawn__Group_3__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2744:2: rule__Spawn__Group_3__0__Impl rule__Spawn__Group_3__1
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3__0__Impl_in_rule__Spawn__Group_3__05476);
            rule__Spawn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3__1_in_rule__Spawn__Group_3__05479);
            rule__Spawn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__0"


    // $ANTLR start "rule__Spawn__Group_3__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2751:1: rule__Spawn__Group_3__0__Impl : ( RULE_LT ) ;
    public final void rule__Spawn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2755:1: ( ( RULE_LT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2756:1: ( RULE_LT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2756:1: ( RULE_LT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2757:1: RULE_LT
            {
             before(grammarAccess.getSpawnAccess().getLTTerminalRuleCall_3_0()); 
            match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__Spawn__Group_3__0__Impl5506); 
             after(grammarAccess.getSpawnAccess().getLTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__0__Impl"


    // $ANTLR start "rule__Spawn__Group_3__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2768:1: rule__Spawn__Group_3__1 : rule__Spawn__Group_3__1__Impl rule__Spawn__Group_3__2 ;
    public final void rule__Spawn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2772:1: ( rule__Spawn__Group_3__1__Impl rule__Spawn__Group_3__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2773:2: rule__Spawn__Group_3__1__Impl rule__Spawn__Group_3__2
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3__1__Impl_in_rule__Spawn__Group_3__15535);
            rule__Spawn__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3__2_in_rule__Spawn__Group_3__15538);
            rule__Spawn__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__1"


    // $ANTLR start "rule__Spawn__Group_3__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2780:1: rule__Spawn__Group_3__1__Impl : ( 'sig' ) ;
    public final void rule__Spawn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2784:1: ( ( 'sig' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2785:1: ( 'sig' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2785:1: ( 'sig' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2786:1: 'sig'
            {
             before(grammarAccess.getSpawnAccess().getSigKeyword_3_1()); 
            match(input,28,FOLLOW_28_in_rule__Spawn__Group_3__1__Impl5566); 
             after(grammarAccess.getSpawnAccess().getSigKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__1__Impl"


    // $ANTLR start "rule__Spawn__Group_3__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2799:1: rule__Spawn__Group_3__2 : rule__Spawn__Group_3__2__Impl rule__Spawn__Group_3__3 ;
    public final void rule__Spawn__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2803:1: ( rule__Spawn__Group_3__2__Impl rule__Spawn__Group_3__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2804:2: rule__Spawn__Group_3__2__Impl rule__Spawn__Group_3__3
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3__2__Impl_in_rule__Spawn__Group_3__25597);
            rule__Spawn__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3__3_in_rule__Spawn__Group_3__25600);
            rule__Spawn__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__2"


    // $ANTLR start "rule__Spawn__Group_3__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2811:1: rule__Spawn__Group_3__2__Impl : ( ( rule__Spawn__ParametersAssignment_3_2 ) ) ;
    public final void rule__Spawn__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2815:1: ( ( ( rule__Spawn__ParametersAssignment_3_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2816:1: ( ( rule__Spawn__ParametersAssignment_3_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2816:1: ( ( rule__Spawn__ParametersAssignment_3_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2817:1: ( rule__Spawn__ParametersAssignment_3_2 )
            {
             before(grammarAccess.getSpawnAccess().getParametersAssignment_3_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2818:1: ( rule__Spawn__ParametersAssignment_3_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2818:2: rule__Spawn__ParametersAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Spawn__ParametersAssignment_3_2_in_rule__Spawn__Group_3__2__Impl5627);
            rule__Spawn__ParametersAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getParametersAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__2__Impl"


    // $ANTLR start "rule__Spawn__Group_3__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2828:1: rule__Spawn__Group_3__3 : rule__Spawn__Group_3__3__Impl rule__Spawn__Group_3__4 ;
    public final void rule__Spawn__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2832:1: ( rule__Spawn__Group_3__3__Impl rule__Spawn__Group_3__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2833:2: rule__Spawn__Group_3__3__Impl rule__Spawn__Group_3__4
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3__3__Impl_in_rule__Spawn__Group_3__35657);
            rule__Spawn__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3__4_in_rule__Spawn__Group_3__35660);
            rule__Spawn__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__3"


    // $ANTLR start "rule__Spawn__Group_3__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2840:1: rule__Spawn__Group_3__3__Impl : ( ( rule__Spawn__Group_3_3__0 )* ) ;
    public final void rule__Spawn__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2844:1: ( ( ( rule__Spawn__Group_3_3__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2845:1: ( ( rule__Spawn__Group_3_3__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2845:1: ( ( rule__Spawn__Group_3_3__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2846:1: ( rule__Spawn__Group_3_3__0 )*
            {
             before(grammarAccess.getSpawnAccess().getGroup_3_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2847:1: ( rule__Spawn__Group_3_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2847:2: rule__Spawn__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Spawn__Group_3_3__0_in_rule__Spawn__Group_3__3__Impl5687);
            	    rule__Spawn__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSpawnAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__3__Impl"


    // $ANTLR start "rule__Spawn__Group_3__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2857:1: rule__Spawn__Group_3__4 : rule__Spawn__Group_3__4__Impl ;
    public final void rule__Spawn__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2861:1: ( rule__Spawn__Group_3__4__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2862:2: rule__Spawn__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3__4__Impl_in_rule__Spawn__Group_3__45718);
            rule__Spawn__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__4"


    // $ANTLR start "rule__Spawn__Group_3__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2868:1: rule__Spawn__Group_3__4__Impl : ( RULE_GT ) ;
    public final void rule__Spawn__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2872:1: ( ( RULE_GT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2873:1: ( RULE_GT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2873:1: ( RULE_GT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2874:1: RULE_GT
            {
             before(grammarAccess.getSpawnAccess().getGTTerminalRuleCall_3_4()); 
            match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__Spawn__Group_3__4__Impl5745); 
             after(grammarAccess.getSpawnAccess().getGTTerminalRuleCall_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3__4__Impl"


    // $ANTLR start "rule__Spawn__Group_3_3__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2895:1: rule__Spawn__Group_3_3__0 : rule__Spawn__Group_3_3__0__Impl rule__Spawn__Group_3_3__1 ;
    public final void rule__Spawn__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2899:1: ( rule__Spawn__Group_3_3__0__Impl rule__Spawn__Group_3_3__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2900:2: rule__Spawn__Group_3_3__0__Impl rule__Spawn__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3_3__0__Impl_in_rule__Spawn__Group_3_3__05784);
            rule__Spawn__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3_3__1_in_rule__Spawn__Group_3_3__05787);
            rule__Spawn__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__0"


    // $ANTLR start "rule__Spawn__Group_3_3__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2907:1: rule__Spawn__Group_3_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Spawn__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2911:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2912:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2912:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2913:1: RULE_COMMA
            {
             before(grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_3_3_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Spawn__Group_3_3__0__Impl5814); 
             after(grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__0__Impl"


    // $ANTLR start "rule__Spawn__Group_3_3__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2924:1: rule__Spawn__Group_3_3__1 : rule__Spawn__Group_3_3__1__Impl rule__Spawn__Group_3_3__2 ;
    public final void rule__Spawn__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2928:1: ( rule__Spawn__Group_3_3__1__Impl rule__Spawn__Group_3_3__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2929:2: rule__Spawn__Group_3_3__1__Impl rule__Spawn__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3_3__1__Impl_in_rule__Spawn__Group_3_3__15843);
            rule__Spawn__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_3_3__2_in_rule__Spawn__Group_3_3__15846);
            rule__Spawn__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__1"


    // $ANTLR start "rule__Spawn__Group_3_3__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2936:1: rule__Spawn__Group_3_3__1__Impl : ( 'sig' ) ;
    public final void rule__Spawn__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2940:1: ( ( 'sig' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2941:1: ( 'sig' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2941:1: ( 'sig' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2942:1: 'sig'
            {
             before(grammarAccess.getSpawnAccess().getSigKeyword_3_3_1()); 
            match(input,28,FOLLOW_28_in_rule__Spawn__Group_3_3__1__Impl5874); 
             after(grammarAccess.getSpawnAccess().getSigKeyword_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__1__Impl"


    // $ANTLR start "rule__Spawn__Group_3_3__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2955:1: rule__Spawn__Group_3_3__2 : rule__Spawn__Group_3_3__2__Impl ;
    public final void rule__Spawn__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2959:1: ( rule__Spawn__Group_3_3__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2960:2: rule__Spawn__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Spawn__Group_3_3__2__Impl_in_rule__Spawn__Group_3_3__25905);
            rule__Spawn__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__2"


    // $ANTLR start "rule__Spawn__Group_3_3__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2966:1: rule__Spawn__Group_3_3__2__Impl : ( ( rule__Spawn__ParametersAssignment_3_3_2 ) ) ;
    public final void rule__Spawn__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2970:1: ( ( ( rule__Spawn__ParametersAssignment_3_3_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2971:1: ( ( rule__Spawn__ParametersAssignment_3_3_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2971:1: ( ( rule__Spawn__ParametersAssignment_3_3_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2972:1: ( rule__Spawn__ParametersAssignment_3_3_2 )
            {
             before(grammarAccess.getSpawnAccess().getParametersAssignment_3_3_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2973:1: ( rule__Spawn__ParametersAssignment_3_3_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2973:2: rule__Spawn__ParametersAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__Spawn__ParametersAssignment_3_3_2_in_rule__Spawn__Group_3_3__2__Impl5932);
            rule__Spawn__ParametersAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getParametersAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_3_3__2__Impl"


    // $ANTLR start "rule__Spawn__Group_8__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2989:1: rule__Spawn__Group_8__0 : rule__Spawn__Group_8__0__Impl rule__Spawn__Group_8__1 ;
    public final void rule__Spawn__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2993:1: ( rule__Spawn__Group_8__0__Impl rule__Spawn__Group_8__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:2994:2: rule__Spawn__Group_8__0__Impl rule__Spawn__Group_8__1
            {
            pushFollow(FOLLOW_rule__Spawn__Group_8__0__Impl_in_rule__Spawn__Group_8__05968);
            rule__Spawn__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_8__1_in_rule__Spawn__Group_8__05971);
            rule__Spawn__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__0"


    // $ANTLR start "rule__Spawn__Group_8__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3001:1: rule__Spawn__Group_8__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Spawn__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3005:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3006:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3006:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3007:1: RULE_COMMA
            {
             before(grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_8_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Spawn__Group_8__0__Impl5998); 
             after(grammarAccess.getSpawnAccess().getCOMMATerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__0__Impl"


    // $ANTLR start "rule__Spawn__Group_8__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3018:1: rule__Spawn__Group_8__1 : rule__Spawn__Group_8__1__Impl rule__Spawn__Group_8__2 ;
    public final void rule__Spawn__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3022:1: ( rule__Spawn__Group_8__1__Impl rule__Spawn__Group_8__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3023:2: rule__Spawn__Group_8__1__Impl rule__Spawn__Group_8__2
            {
            pushFollow(FOLLOW_rule__Spawn__Group_8__1__Impl_in_rule__Spawn__Group_8__16027);
            rule__Spawn__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_8__2_in_rule__Spawn__Group_8__16030);
            rule__Spawn__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__1"


    // $ANTLR start "rule__Spawn__Group_8__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3030:1: rule__Spawn__Group_8__1__Impl : ( ( rule__Spawn__CurrentRolesAssignment_8_1 ) ) ;
    public final void rule__Spawn__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3034:1: ( ( ( rule__Spawn__CurrentRolesAssignment_8_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3035:1: ( ( rule__Spawn__CurrentRolesAssignment_8_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3035:1: ( ( rule__Spawn__CurrentRolesAssignment_8_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3036:1: ( rule__Spawn__CurrentRolesAssignment_8_1 )
            {
             before(grammarAccess.getSpawnAccess().getCurrentRolesAssignment_8_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3037:1: ( rule__Spawn__CurrentRolesAssignment_8_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3037:2: rule__Spawn__CurrentRolesAssignment_8_1
            {
            pushFollow(FOLLOW_rule__Spawn__CurrentRolesAssignment_8_1_in_rule__Spawn__Group_8__1__Impl6057);
            rule__Spawn__CurrentRolesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getCurrentRolesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__1__Impl"


    // $ANTLR start "rule__Spawn__Group_8__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3047:1: rule__Spawn__Group_8__2 : rule__Spawn__Group_8__2__Impl rule__Spawn__Group_8__3 ;
    public final void rule__Spawn__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3051:1: ( rule__Spawn__Group_8__2__Impl rule__Spawn__Group_8__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3052:2: rule__Spawn__Group_8__2__Impl rule__Spawn__Group_8__3
            {
            pushFollow(FOLLOW_rule__Spawn__Group_8__2__Impl_in_rule__Spawn__Group_8__26087);
            rule__Spawn__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spawn__Group_8__3_in_rule__Spawn__Group_8__26090);
            rule__Spawn__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__2"


    // $ANTLR start "rule__Spawn__Group_8__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3059:1: rule__Spawn__Group_8__2__Impl : ( 'as' ) ;
    public final void rule__Spawn__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3063:1: ( ( 'as' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3064:1: ( 'as' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3064:1: ( 'as' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3065:1: 'as'
            {
             before(grammarAccess.getSpawnAccess().getAsKeyword_8_2()); 
            match(input,27,FOLLOW_27_in_rule__Spawn__Group_8__2__Impl6118); 
             after(grammarAccess.getSpawnAccess().getAsKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__2__Impl"


    // $ANTLR start "rule__Spawn__Group_8__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3078:1: rule__Spawn__Group_8__3 : rule__Spawn__Group_8__3__Impl ;
    public final void rule__Spawn__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3082:1: ( rule__Spawn__Group_8__3__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3083:2: rule__Spawn__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Spawn__Group_8__3__Impl_in_rule__Spawn__Group_8__36149);
            rule__Spawn__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__3"


    // $ANTLR start "rule__Spawn__Group_8__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3089:1: rule__Spawn__Group_8__3__Impl : ( ( rule__Spawn__TargetRolesAssignment_8_3 ) ) ;
    public final void rule__Spawn__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3093:1: ( ( ( rule__Spawn__TargetRolesAssignment_8_3 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3094:1: ( ( rule__Spawn__TargetRolesAssignment_8_3 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3094:1: ( ( rule__Spawn__TargetRolesAssignment_8_3 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3095:1: ( rule__Spawn__TargetRolesAssignment_8_3 )
            {
             before(grammarAccess.getSpawnAccess().getTargetRolesAssignment_8_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3096:1: ( rule__Spawn__TargetRolesAssignment_8_3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3096:2: rule__Spawn__TargetRolesAssignment_8_3
            {
            pushFollow(FOLLOW_rule__Spawn__TargetRolesAssignment_8_3_in_rule__Spawn__Group_8__3__Impl6176);
            rule__Spawn__TargetRolesAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getSpawnAccess().getTargetRolesAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__Group_8__3__Impl"


    // $ANTLR start "rule__Do__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3114:1: rule__Do__Group__0 : rule__Do__Group__0__Impl rule__Do__Group__1 ;
    public final void rule__Do__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3118:1: ( rule__Do__Group__0__Impl rule__Do__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3119:2: rule__Do__Group__0__Impl rule__Do__Group__1
            {
            pushFollow(FOLLOW_rule__Do__Group__0__Impl_in_rule__Do__Group__06214);
            rule__Do__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__1_in_rule__Do__Group__06217);
            rule__Do__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__0"


    // $ANTLR start "rule__Do__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3126:1: rule__Do__Group__0__Impl : ( 'do' ) ;
    public final void rule__Do__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3130:1: ( ( 'do' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3131:1: ( 'do' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3131:1: ( 'do' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3132:1: 'do'
            {
             before(grammarAccess.getDoAccess().getDoKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Do__Group__0__Impl6245); 
             after(grammarAccess.getDoAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__0__Impl"


    // $ANTLR start "rule__Do__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3145:1: rule__Do__Group__1 : rule__Do__Group__1__Impl rule__Do__Group__2 ;
    public final void rule__Do__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3149:1: ( rule__Do__Group__1__Impl rule__Do__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3150:2: rule__Do__Group__1__Impl rule__Do__Group__2
            {
            pushFollow(FOLLOW_rule__Do__Group__1__Impl_in_rule__Do__Group__16276);
            rule__Do__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__2_in_rule__Do__Group__16279);
            rule__Do__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__1"


    // $ANTLR start "rule__Do__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3157:1: rule__Do__Group__1__Impl : ( ( rule__Do__TargetProtocolNameAssignment_1 ) ) ;
    public final void rule__Do__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3161:1: ( ( ( rule__Do__TargetProtocolNameAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3162:1: ( ( rule__Do__TargetProtocolNameAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3162:1: ( ( rule__Do__TargetProtocolNameAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3163:1: ( rule__Do__TargetProtocolNameAssignment_1 )
            {
             before(grammarAccess.getDoAccess().getTargetProtocolNameAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3164:1: ( rule__Do__TargetProtocolNameAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3164:2: rule__Do__TargetProtocolNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Do__TargetProtocolNameAssignment_1_in_rule__Do__Group__1__Impl6306);
            rule__Do__TargetProtocolNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getTargetProtocolNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__1__Impl"


    // $ANTLR start "rule__Do__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3174:1: rule__Do__Group__2 : rule__Do__Group__2__Impl rule__Do__Group__3 ;
    public final void rule__Do__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3178:1: ( rule__Do__Group__2__Impl rule__Do__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3179:2: rule__Do__Group__2__Impl rule__Do__Group__3
            {
            pushFollow(FOLLOW_rule__Do__Group__2__Impl_in_rule__Do__Group__26336);
            rule__Do__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__3_in_rule__Do__Group__26339);
            rule__Do__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__2"


    // $ANTLR start "rule__Do__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3186:1: rule__Do__Group__2__Impl : ( ( rule__Do__Group_2__0 )? ) ;
    public final void rule__Do__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3190:1: ( ( ( rule__Do__Group_2__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3191:1: ( ( rule__Do__Group_2__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3191:1: ( ( rule__Do__Group_2__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3192:1: ( rule__Do__Group_2__0 )?
            {
             before(grammarAccess.getDoAccess().getGroup_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3193:1: ( rule__Do__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_LT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3193:2: rule__Do__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Do__Group_2__0_in_rule__Do__Group__2__Impl6366);
                    rule__Do__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__2__Impl"


    // $ANTLR start "rule__Do__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3203:1: rule__Do__Group__3 : rule__Do__Group__3__Impl rule__Do__Group__4 ;
    public final void rule__Do__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3207:1: ( rule__Do__Group__3__Impl rule__Do__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3208:2: rule__Do__Group__3__Impl rule__Do__Group__4
            {
            pushFollow(FOLLOW_rule__Do__Group__3__Impl_in_rule__Do__Group__36397);
            rule__Do__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__4_in_rule__Do__Group__36400);
            rule__Do__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__3"


    // $ANTLR start "rule__Do__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3215:1: rule__Do__Group__3__Impl : ( RULE_LPA ) ;
    public final void rule__Do__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3219:1: ( ( RULE_LPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3220:1: ( RULE_LPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3220:1: ( RULE_LPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3221:1: RULE_LPA
            {
             before(grammarAccess.getDoAccess().getLPATerminalRuleCall_3()); 
            match(input,RULE_LPA,FOLLOW_RULE_LPA_in_rule__Do__Group__3__Impl6427); 
             after(grammarAccess.getDoAccess().getLPATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__3__Impl"


    // $ANTLR start "rule__Do__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3232:1: rule__Do__Group__4 : rule__Do__Group__4__Impl rule__Do__Group__5 ;
    public final void rule__Do__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3236:1: ( rule__Do__Group__4__Impl rule__Do__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3237:2: rule__Do__Group__4__Impl rule__Do__Group__5
            {
            pushFollow(FOLLOW_rule__Do__Group__4__Impl_in_rule__Do__Group__46456);
            rule__Do__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__5_in_rule__Do__Group__46459);
            rule__Do__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__4"


    // $ANTLR start "rule__Do__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3244:1: rule__Do__Group__4__Impl : ( ( rule__Do__CurrentRolesAssignment_4 ) ) ;
    public final void rule__Do__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3248:1: ( ( ( rule__Do__CurrentRolesAssignment_4 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3249:1: ( ( rule__Do__CurrentRolesAssignment_4 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3249:1: ( ( rule__Do__CurrentRolesAssignment_4 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3250:1: ( rule__Do__CurrentRolesAssignment_4 )
            {
             before(grammarAccess.getDoAccess().getCurrentRolesAssignment_4()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3251:1: ( rule__Do__CurrentRolesAssignment_4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3251:2: rule__Do__CurrentRolesAssignment_4
            {
            pushFollow(FOLLOW_rule__Do__CurrentRolesAssignment_4_in_rule__Do__Group__4__Impl6486);
            rule__Do__CurrentRolesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getCurrentRolesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__4__Impl"


    // $ANTLR start "rule__Do__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3261:1: rule__Do__Group__5 : rule__Do__Group__5__Impl rule__Do__Group__6 ;
    public final void rule__Do__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3265:1: ( rule__Do__Group__5__Impl rule__Do__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3266:2: rule__Do__Group__5__Impl rule__Do__Group__6
            {
            pushFollow(FOLLOW_rule__Do__Group__5__Impl_in_rule__Do__Group__56516);
            rule__Do__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__6_in_rule__Do__Group__56519);
            rule__Do__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__5"


    // $ANTLR start "rule__Do__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3273:1: rule__Do__Group__5__Impl : ( 'as' ) ;
    public final void rule__Do__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3277:1: ( ( 'as' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3278:1: ( 'as' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3278:1: ( 'as' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3279:1: 'as'
            {
             before(grammarAccess.getDoAccess().getAsKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Do__Group__5__Impl6547); 
             after(grammarAccess.getDoAccess().getAsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__5__Impl"


    // $ANTLR start "rule__Do__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3292:1: rule__Do__Group__6 : rule__Do__Group__6__Impl rule__Do__Group__7 ;
    public final void rule__Do__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3296:1: ( rule__Do__Group__6__Impl rule__Do__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3297:2: rule__Do__Group__6__Impl rule__Do__Group__7
            {
            pushFollow(FOLLOW_rule__Do__Group__6__Impl_in_rule__Do__Group__66578);
            rule__Do__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__7_in_rule__Do__Group__66581);
            rule__Do__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__6"


    // $ANTLR start "rule__Do__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3304:1: rule__Do__Group__6__Impl : ( ( rule__Do__TargetRolesAssignment_6 ) ) ;
    public final void rule__Do__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3308:1: ( ( ( rule__Do__TargetRolesAssignment_6 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3309:1: ( ( rule__Do__TargetRolesAssignment_6 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3309:1: ( ( rule__Do__TargetRolesAssignment_6 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3310:1: ( rule__Do__TargetRolesAssignment_6 )
            {
             before(grammarAccess.getDoAccess().getTargetRolesAssignment_6()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3311:1: ( rule__Do__TargetRolesAssignment_6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3311:2: rule__Do__TargetRolesAssignment_6
            {
            pushFollow(FOLLOW_rule__Do__TargetRolesAssignment_6_in_rule__Do__Group__6__Impl6608);
            rule__Do__TargetRolesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getTargetRolesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__6__Impl"


    // $ANTLR start "rule__Do__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3321:1: rule__Do__Group__7 : rule__Do__Group__7__Impl rule__Do__Group__8 ;
    public final void rule__Do__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3325:1: ( rule__Do__Group__7__Impl rule__Do__Group__8 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3326:2: rule__Do__Group__7__Impl rule__Do__Group__8
            {
            pushFollow(FOLLOW_rule__Do__Group__7__Impl_in_rule__Do__Group__76638);
            rule__Do__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__8_in_rule__Do__Group__76641);
            rule__Do__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__7"


    // $ANTLR start "rule__Do__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3333:1: rule__Do__Group__7__Impl : ( ( rule__Do__Group_7__0 )* ) ;
    public final void rule__Do__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3337:1: ( ( ( rule__Do__Group_7__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3338:1: ( ( rule__Do__Group_7__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3338:1: ( ( rule__Do__Group_7__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3339:1: ( rule__Do__Group_7__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_7()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3340:1: ( rule__Do__Group_7__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3340:2: rule__Do__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Do__Group_7__0_in_rule__Do__Group__7__Impl6668);
            	    rule__Do__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__7__Impl"


    // $ANTLR start "rule__Do__Group__8"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3350:1: rule__Do__Group__8 : rule__Do__Group__8__Impl rule__Do__Group__9 ;
    public final void rule__Do__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3354:1: ( rule__Do__Group__8__Impl rule__Do__Group__9 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3355:2: rule__Do__Group__8__Impl rule__Do__Group__9
            {
            pushFollow(FOLLOW_rule__Do__Group__8__Impl_in_rule__Do__Group__86699);
            rule__Do__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group__9_in_rule__Do__Group__86702);
            rule__Do__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__8"


    // $ANTLR start "rule__Do__Group__8__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3362:1: rule__Do__Group__8__Impl : ( RULE_RPA ) ;
    public final void rule__Do__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3366:1: ( ( RULE_RPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3367:1: ( RULE_RPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3367:1: ( RULE_RPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3368:1: RULE_RPA
            {
             before(grammarAccess.getDoAccess().getRPATerminalRuleCall_8()); 
            match(input,RULE_RPA,FOLLOW_RULE_RPA_in_rule__Do__Group__8__Impl6729); 
             after(grammarAccess.getDoAccess().getRPATerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__8__Impl"


    // $ANTLR start "rule__Do__Group__9"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3379:1: rule__Do__Group__9 : rule__Do__Group__9__Impl ;
    public final void rule__Do__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3383:1: ( rule__Do__Group__9__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3384:2: rule__Do__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Do__Group__9__Impl_in_rule__Do__Group__96758);
            rule__Do__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__9"


    // $ANTLR start "rule__Do__Group__9__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3390:1: rule__Do__Group__9__Impl : ( RULE_SEMI ) ;
    public final void rule__Do__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3394:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3395:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3395:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3396:1: RULE_SEMI
            {
             before(grammarAccess.getDoAccess().getSEMITerminalRuleCall_9()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__Do__Group__9__Impl6785); 
             after(grammarAccess.getDoAccess().getSEMITerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group__9__Impl"


    // $ANTLR start "rule__Do__Group_2__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3427:1: rule__Do__Group_2__0 : rule__Do__Group_2__0__Impl rule__Do__Group_2__1 ;
    public final void rule__Do__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3431:1: ( rule__Do__Group_2__0__Impl rule__Do__Group_2__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3432:2: rule__Do__Group_2__0__Impl rule__Do__Group_2__1
            {
            pushFollow(FOLLOW_rule__Do__Group_2__0__Impl_in_rule__Do__Group_2__06834);
            rule__Do__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_2__1_in_rule__Do__Group_2__06837);
            rule__Do__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__0"


    // $ANTLR start "rule__Do__Group_2__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3439:1: rule__Do__Group_2__0__Impl : ( RULE_LT ) ;
    public final void rule__Do__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3443:1: ( ( RULE_LT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3444:1: ( RULE_LT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3444:1: ( RULE_LT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3445:1: RULE_LT
            {
             before(grammarAccess.getDoAccess().getLTTerminalRuleCall_2_0()); 
            match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__Do__Group_2__0__Impl6864); 
             after(grammarAccess.getDoAccess().getLTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__0__Impl"


    // $ANTLR start "rule__Do__Group_2__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3456:1: rule__Do__Group_2__1 : rule__Do__Group_2__1__Impl rule__Do__Group_2__2 ;
    public final void rule__Do__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3460:1: ( rule__Do__Group_2__1__Impl rule__Do__Group_2__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3461:2: rule__Do__Group_2__1__Impl rule__Do__Group_2__2
            {
            pushFollow(FOLLOW_rule__Do__Group_2__1__Impl_in_rule__Do__Group_2__16893);
            rule__Do__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_2__2_in_rule__Do__Group_2__16896);
            rule__Do__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__1"


    // $ANTLR start "rule__Do__Group_2__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3468:1: rule__Do__Group_2__1__Impl : ( ( rule__Do__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Do__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3472:1: ( ( ( rule__Do__ArgumentsAssignment_2_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3473:1: ( ( rule__Do__ArgumentsAssignment_2_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3473:1: ( ( rule__Do__ArgumentsAssignment_2_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3474:1: ( rule__Do__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getDoAccess().getArgumentsAssignment_2_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3475:1: ( rule__Do__ArgumentsAssignment_2_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3475:2: rule__Do__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Do__ArgumentsAssignment_2_1_in_rule__Do__Group_2__1__Impl6923);
            rule__Do__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__1__Impl"


    // $ANTLR start "rule__Do__Group_2__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3485:1: rule__Do__Group_2__2 : rule__Do__Group_2__2__Impl rule__Do__Group_2__3 ;
    public final void rule__Do__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3489:1: ( rule__Do__Group_2__2__Impl rule__Do__Group_2__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3490:2: rule__Do__Group_2__2__Impl rule__Do__Group_2__3
            {
            pushFollow(FOLLOW_rule__Do__Group_2__2__Impl_in_rule__Do__Group_2__26953);
            rule__Do__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_2__3_in_rule__Do__Group_2__26956);
            rule__Do__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__2"


    // $ANTLR start "rule__Do__Group_2__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3497:1: rule__Do__Group_2__2__Impl : ( ( rule__Do__Group_2_2__0 )* ) ;
    public final void rule__Do__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3501:1: ( ( ( rule__Do__Group_2_2__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3502:1: ( ( rule__Do__Group_2_2__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3502:1: ( ( rule__Do__Group_2_2__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3503:1: ( rule__Do__Group_2_2__0 )*
            {
             before(grammarAccess.getDoAccess().getGroup_2_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3504:1: ( rule__Do__Group_2_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3504:2: rule__Do__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Do__Group_2_2__0_in_rule__Do__Group_2__2__Impl6983);
            	    rule__Do__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDoAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__2__Impl"


    // $ANTLR start "rule__Do__Group_2__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3514:1: rule__Do__Group_2__3 : rule__Do__Group_2__3__Impl ;
    public final void rule__Do__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3518:1: ( rule__Do__Group_2__3__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3519:2: rule__Do__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Do__Group_2__3__Impl_in_rule__Do__Group_2__37014);
            rule__Do__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__3"


    // $ANTLR start "rule__Do__Group_2__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3525:1: rule__Do__Group_2__3__Impl : ( RULE_GT ) ;
    public final void rule__Do__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3529:1: ( ( RULE_GT ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3530:1: ( RULE_GT )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3530:1: ( RULE_GT )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3531:1: RULE_GT
            {
             before(grammarAccess.getDoAccess().getGTTerminalRuleCall_2_3()); 
            match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__Do__Group_2__3__Impl7041); 
             after(grammarAccess.getDoAccess().getGTTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2__3__Impl"


    // $ANTLR start "rule__Do__Group_2_2__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3550:1: rule__Do__Group_2_2__0 : rule__Do__Group_2_2__0__Impl rule__Do__Group_2_2__1 ;
    public final void rule__Do__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3554:1: ( rule__Do__Group_2_2__0__Impl rule__Do__Group_2_2__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3555:2: rule__Do__Group_2_2__0__Impl rule__Do__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Do__Group_2_2__0__Impl_in_rule__Do__Group_2_2__07078);
            rule__Do__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_2_2__1_in_rule__Do__Group_2_2__07081);
            rule__Do__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2_2__0"


    // $ANTLR start "rule__Do__Group_2_2__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3562:1: rule__Do__Group_2_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Do__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3566:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3567:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3567:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3568:1: RULE_COMMA
            {
             before(grammarAccess.getDoAccess().getCOMMATerminalRuleCall_2_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Do__Group_2_2__0__Impl7108); 
             after(grammarAccess.getDoAccess().getCOMMATerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2_2__0__Impl"


    // $ANTLR start "rule__Do__Group_2_2__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3579:1: rule__Do__Group_2_2__1 : rule__Do__Group_2_2__1__Impl ;
    public final void rule__Do__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3583:1: ( rule__Do__Group_2_2__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3584:2: rule__Do__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Do__Group_2_2__1__Impl_in_rule__Do__Group_2_2__17137);
            rule__Do__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2_2__1"


    // $ANTLR start "rule__Do__Group_2_2__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3590:1: rule__Do__Group_2_2__1__Impl : ( ( rule__Do__ArgumentsAssignment_2_2_1 ) ) ;
    public final void rule__Do__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3594:1: ( ( ( rule__Do__ArgumentsAssignment_2_2_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3595:1: ( ( rule__Do__ArgumentsAssignment_2_2_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3595:1: ( ( rule__Do__ArgumentsAssignment_2_2_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3596:1: ( rule__Do__ArgumentsAssignment_2_2_1 )
            {
             before(grammarAccess.getDoAccess().getArgumentsAssignment_2_2_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3597:1: ( rule__Do__ArgumentsAssignment_2_2_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3597:2: rule__Do__ArgumentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Do__ArgumentsAssignment_2_2_1_in_rule__Do__Group_2_2__1__Impl7164);
            rule__Do__ArgumentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getArgumentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_2_2__1__Impl"


    // $ANTLR start "rule__Do__Group_7__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3611:1: rule__Do__Group_7__0 : rule__Do__Group_7__0__Impl rule__Do__Group_7__1 ;
    public final void rule__Do__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3615:1: ( rule__Do__Group_7__0__Impl rule__Do__Group_7__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3616:2: rule__Do__Group_7__0__Impl rule__Do__Group_7__1
            {
            pushFollow(FOLLOW_rule__Do__Group_7__0__Impl_in_rule__Do__Group_7__07198);
            rule__Do__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_7__1_in_rule__Do__Group_7__07201);
            rule__Do__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__0"


    // $ANTLR start "rule__Do__Group_7__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3623:1: rule__Do__Group_7__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Do__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3627:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3628:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3628:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3629:1: RULE_COMMA
            {
             before(grammarAccess.getDoAccess().getCOMMATerminalRuleCall_7_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Do__Group_7__0__Impl7228); 
             after(grammarAccess.getDoAccess().getCOMMATerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__0__Impl"


    // $ANTLR start "rule__Do__Group_7__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3640:1: rule__Do__Group_7__1 : rule__Do__Group_7__1__Impl rule__Do__Group_7__2 ;
    public final void rule__Do__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3644:1: ( rule__Do__Group_7__1__Impl rule__Do__Group_7__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3645:2: rule__Do__Group_7__1__Impl rule__Do__Group_7__2
            {
            pushFollow(FOLLOW_rule__Do__Group_7__1__Impl_in_rule__Do__Group_7__17257);
            rule__Do__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_7__2_in_rule__Do__Group_7__17260);
            rule__Do__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__1"


    // $ANTLR start "rule__Do__Group_7__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3652:1: rule__Do__Group_7__1__Impl : ( ( rule__Do__CurrentRolesAssignment_7_1 ) ) ;
    public final void rule__Do__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3656:1: ( ( ( rule__Do__CurrentRolesAssignment_7_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3657:1: ( ( rule__Do__CurrentRolesAssignment_7_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3657:1: ( ( rule__Do__CurrentRolesAssignment_7_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3658:1: ( rule__Do__CurrentRolesAssignment_7_1 )
            {
             before(grammarAccess.getDoAccess().getCurrentRolesAssignment_7_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3659:1: ( rule__Do__CurrentRolesAssignment_7_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3659:2: rule__Do__CurrentRolesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Do__CurrentRolesAssignment_7_1_in_rule__Do__Group_7__1__Impl7287);
            rule__Do__CurrentRolesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getCurrentRolesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__1__Impl"


    // $ANTLR start "rule__Do__Group_7__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3669:1: rule__Do__Group_7__2 : rule__Do__Group_7__2__Impl rule__Do__Group_7__3 ;
    public final void rule__Do__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3673:1: ( rule__Do__Group_7__2__Impl rule__Do__Group_7__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3674:2: rule__Do__Group_7__2__Impl rule__Do__Group_7__3
            {
            pushFollow(FOLLOW_rule__Do__Group_7__2__Impl_in_rule__Do__Group_7__27317);
            rule__Do__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Do__Group_7__3_in_rule__Do__Group_7__27320);
            rule__Do__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__2"


    // $ANTLR start "rule__Do__Group_7__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3681:1: rule__Do__Group_7__2__Impl : ( 'as' ) ;
    public final void rule__Do__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3685:1: ( ( 'as' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3686:1: ( 'as' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3686:1: ( 'as' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3687:1: 'as'
            {
             before(grammarAccess.getDoAccess().getAsKeyword_7_2()); 
            match(input,27,FOLLOW_27_in_rule__Do__Group_7__2__Impl7348); 
             after(grammarAccess.getDoAccess().getAsKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__2__Impl"


    // $ANTLR start "rule__Do__Group_7__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3700:1: rule__Do__Group_7__3 : rule__Do__Group_7__3__Impl ;
    public final void rule__Do__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3704:1: ( rule__Do__Group_7__3__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3705:2: rule__Do__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Do__Group_7__3__Impl_in_rule__Do__Group_7__37379);
            rule__Do__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__3"


    // $ANTLR start "rule__Do__Group_7__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3711:1: rule__Do__Group_7__3__Impl : ( ( rule__Do__TargetRolesAssignment_7_3 ) ) ;
    public final void rule__Do__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3715:1: ( ( ( rule__Do__TargetRolesAssignment_7_3 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3716:1: ( ( rule__Do__TargetRolesAssignment_7_3 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3716:1: ( ( rule__Do__TargetRolesAssignment_7_3 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3717:1: ( rule__Do__TargetRolesAssignment_7_3 )
            {
             before(grammarAccess.getDoAccess().getTargetRolesAssignment_7_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3718:1: ( rule__Do__TargetRolesAssignment_7_3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3718:2: rule__Do__TargetRolesAssignment_7_3
            {
            pushFollow(FOLLOW_rule__Do__TargetRolesAssignment_7_3_in_rule__Do__Group_7__3__Impl7406);
            rule__Do__TargetRolesAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getDoAccess().getTargetRolesAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__Group_7__3__Impl"


    // $ANTLR start "rule__Interruptible__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3736:1: rule__Interruptible__Group__0 : rule__Interruptible__Group__0__Impl rule__Interruptible__Group__1 ;
    public final void rule__Interruptible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3740:1: ( rule__Interruptible__Group__0__Impl rule__Interruptible__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3741:2: rule__Interruptible__Group__0__Impl rule__Interruptible__Group__1
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__0__Impl_in_rule__Interruptible__Group__07444);
            rule__Interruptible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__1_in_rule__Interruptible__Group__07447);
            rule__Interruptible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__0"


    // $ANTLR start "rule__Interruptible__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3748:1: rule__Interruptible__Group__0__Impl : ( 'interruptible' ) ;
    public final void rule__Interruptible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3752:1: ( ( 'interruptible' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3753:1: ( 'interruptible' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3753:1: ( 'interruptible' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3754:1: 'interruptible'
            {
             before(grammarAccess.getInterruptibleAccess().getInterruptibleKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Interruptible__Group__0__Impl7475); 
             after(grammarAccess.getInterruptibleAccess().getInterruptibleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__0__Impl"


    // $ANTLR start "rule__Interruptible__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3767:1: rule__Interruptible__Group__1 : rule__Interruptible__Group__1__Impl rule__Interruptible__Group__2 ;
    public final void rule__Interruptible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3771:1: ( rule__Interruptible__Group__1__Impl rule__Interruptible__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3772:2: rule__Interruptible__Group__1__Impl rule__Interruptible__Group__2
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__1__Impl_in_rule__Interruptible__Group__17506);
            rule__Interruptible__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__2_in_rule__Interruptible__Group__17509);
            rule__Interruptible__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__1"


    // $ANTLR start "rule__Interruptible__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3779:1: rule__Interruptible__Group__1__Impl : ( ( rule__Interruptible__BodyAssignment_1 ) ) ;
    public final void rule__Interruptible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3783:1: ( ( ( rule__Interruptible__BodyAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3784:1: ( ( rule__Interruptible__BodyAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3784:1: ( ( rule__Interruptible__BodyAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3785:1: ( rule__Interruptible__BodyAssignment_1 )
            {
             before(grammarAccess.getInterruptibleAccess().getBodyAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3786:1: ( rule__Interruptible__BodyAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3786:2: rule__Interruptible__BodyAssignment_1
            {
            pushFollow(FOLLOW_rule__Interruptible__BodyAssignment_1_in_rule__Interruptible__Group__1__Impl7536);
            rule__Interruptible__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__1__Impl"


    // $ANTLR start "rule__Interruptible__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3796:1: rule__Interruptible__Group__2 : rule__Interruptible__Group__2__Impl rule__Interruptible__Group__3 ;
    public final void rule__Interruptible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3800:1: ( rule__Interruptible__Group__2__Impl rule__Interruptible__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3801:2: rule__Interruptible__Group__2__Impl rule__Interruptible__Group__3
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__2__Impl_in_rule__Interruptible__Group__27566);
            rule__Interruptible__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__3_in_rule__Interruptible__Group__27569);
            rule__Interruptible__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__2"


    // $ANTLR start "rule__Interruptible__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3808:1: rule__Interruptible__Group__2__Impl : ( 'by' ) ;
    public final void rule__Interruptible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3812:1: ( ( 'by' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3813:1: ( 'by' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3813:1: ( 'by' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3814:1: 'by'
            {
             before(grammarAccess.getInterruptibleAccess().getByKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Interruptible__Group__2__Impl7597); 
             after(grammarAccess.getInterruptibleAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__2__Impl"


    // $ANTLR start "rule__Interruptible__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3827:1: rule__Interruptible__Group__3 : rule__Interruptible__Group__3__Impl rule__Interruptible__Group__4 ;
    public final void rule__Interruptible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3831:1: ( rule__Interruptible__Group__3__Impl rule__Interruptible__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3832:2: rule__Interruptible__Group__3__Impl rule__Interruptible__Group__4
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__3__Impl_in_rule__Interruptible__Group__37628);
            rule__Interruptible__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__4_in_rule__Interruptible__Group__37631);
            rule__Interruptible__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__3"


    // $ANTLR start "rule__Interruptible__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3839:1: rule__Interruptible__Group__3__Impl : ( ( rule__Interruptible__RoleNamesAssignment_3 ) ) ;
    public final void rule__Interruptible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3843:1: ( ( ( rule__Interruptible__RoleNamesAssignment_3 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3844:1: ( ( rule__Interruptible__RoleNamesAssignment_3 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3844:1: ( ( rule__Interruptible__RoleNamesAssignment_3 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3845:1: ( rule__Interruptible__RoleNamesAssignment_3 )
            {
             before(grammarAccess.getInterruptibleAccess().getRoleNamesAssignment_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3846:1: ( rule__Interruptible__RoleNamesAssignment_3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3846:2: rule__Interruptible__RoleNamesAssignment_3
            {
            pushFollow(FOLLOW_rule__Interruptible__RoleNamesAssignment_3_in_rule__Interruptible__Group__3__Impl7658);
            rule__Interruptible__RoleNamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getRoleNamesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__3__Impl"


    // $ANTLR start "rule__Interruptible__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3856:1: rule__Interruptible__Group__4 : rule__Interruptible__Group__4__Impl rule__Interruptible__Group__5 ;
    public final void rule__Interruptible__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3860:1: ( rule__Interruptible__Group__4__Impl rule__Interruptible__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3861:2: rule__Interruptible__Group__4__Impl rule__Interruptible__Group__5
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__4__Impl_in_rule__Interruptible__Group__47688);
            rule__Interruptible__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__5_in_rule__Interruptible__Group__47691);
            rule__Interruptible__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__4"


    // $ANTLR start "rule__Interruptible__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3868:1: rule__Interruptible__Group__4__Impl : ( 'with' ) ;
    public final void rule__Interruptible__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3872:1: ( ( 'with' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3873:1: ( 'with' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3873:1: ( 'with' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3874:1: 'with'
            {
             before(grammarAccess.getInterruptibleAccess().getWithKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Interruptible__Group__4__Impl7719); 
             after(grammarAccess.getInterruptibleAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__4__Impl"


    // $ANTLR start "rule__Interruptible__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3887:1: rule__Interruptible__Group__5 : rule__Interruptible__Group__5__Impl rule__Interruptible__Group__6 ;
    public final void rule__Interruptible__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3891:1: ( rule__Interruptible__Group__5__Impl rule__Interruptible__Group__6 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3892:2: rule__Interruptible__Group__5__Impl rule__Interruptible__Group__6
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__5__Impl_in_rule__Interruptible__Group__57750);
            rule__Interruptible__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__6_in_rule__Interruptible__Group__57753);
            rule__Interruptible__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__5"


    // $ANTLR start "rule__Interruptible__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3899:1: rule__Interruptible__Group__5__Impl : ( ( rule__Interruptible__SignaturesAssignment_5 ) ) ;
    public final void rule__Interruptible__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3903:1: ( ( ( rule__Interruptible__SignaturesAssignment_5 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3904:1: ( ( rule__Interruptible__SignaturesAssignment_5 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3904:1: ( ( rule__Interruptible__SignaturesAssignment_5 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3905:1: ( rule__Interruptible__SignaturesAssignment_5 )
            {
             before(grammarAccess.getInterruptibleAccess().getSignaturesAssignment_5()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3906:1: ( rule__Interruptible__SignaturesAssignment_5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3906:2: rule__Interruptible__SignaturesAssignment_5
            {
            pushFollow(FOLLOW_rule__Interruptible__SignaturesAssignment_5_in_rule__Interruptible__Group__5__Impl7780);
            rule__Interruptible__SignaturesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getSignaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__5__Impl"


    // $ANTLR start "rule__Interruptible__Group__6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3916:1: rule__Interruptible__Group__6 : rule__Interruptible__Group__6__Impl rule__Interruptible__Group__7 ;
    public final void rule__Interruptible__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3920:1: ( rule__Interruptible__Group__6__Impl rule__Interruptible__Group__7 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3921:2: rule__Interruptible__Group__6__Impl rule__Interruptible__Group__7
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__6__Impl_in_rule__Interruptible__Group__67810);
            rule__Interruptible__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group__7_in_rule__Interruptible__Group__67813);
            rule__Interruptible__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__6"


    // $ANTLR start "rule__Interruptible__Group__6__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3928:1: rule__Interruptible__Group__6__Impl : ( ( rule__Interruptible__Group_6__0 )* ) ;
    public final void rule__Interruptible__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3932:1: ( ( ( rule__Interruptible__Group_6__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3933:1: ( ( rule__Interruptible__Group_6__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3933:1: ( ( rule__Interruptible__Group_6__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3934:1: ( rule__Interruptible__Group_6__0 )*
            {
             before(grammarAccess.getInterruptibleAccess().getGroup_6()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3935:1: ( rule__Interruptible__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3935:2: rule__Interruptible__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Interruptible__Group_6__0_in_rule__Interruptible__Group__6__Impl7840);
            	    rule__Interruptible__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInterruptibleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__6__Impl"


    // $ANTLR start "rule__Interruptible__Group__7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3945:1: rule__Interruptible__Group__7 : rule__Interruptible__Group__7__Impl ;
    public final void rule__Interruptible__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3949:1: ( rule__Interruptible__Group__7__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3950:2: rule__Interruptible__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Interruptible__Group__7__Impl_in_rule__Interruptible__Group__77871);
            rule__Interruptible__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__7"


    // $ANTLR start "rule__Interruptible__Group__7__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3956:1: rule__Interruptible__Group__7__Impl : ( RULE_SEMI ) ;
    public final void rule__Interruptible__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3960:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3961:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3961:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3962:1: RULE_SEMI
            {
             before(grammarAccess.getInterruptibleAccess().getSEMITerminalRuleCall_7()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__Interruptible__Group__7__Impl7898); 
             after(grammarAccess.getInterruptibleAccess().getSEMITerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group__7__Impl"


    // $ANTLR start "rule__Interruptible__Group_6__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3989:1: rule__Interruptible__Group_6__0 : rule__Interruptible__Group_6__0__Impl rule__Interruptible__Group_6__1 ;
    public final void rule__Interruptible__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3993:1: ( rule__Interruptible__Group_6__0__Impl rule__Interruptible__Group_6__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:3994:2: rule__Interruptible__Group_6__0__Impl rule__Interruptible__Group_6__1
            {
            pushFollow(FOLLOW_rule__Interruptible__Group_6__0__Impl_in_rule__Interruptible__Group_6__07943);
            rule__Interruptible__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group_6__1_in_rule__Interruptible__Group_6__07946);
            rule__Interruptible__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__0"


    // $ANTLR start "rule__Interruptible__Group_6__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4001:1: rule__Interruptible__Group_6__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Interruptible__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4005:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4006:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4006:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4007:1: RULE_COMMA
            {
             before(grammarAccess.getInterruptibleAccess().getCOMMATerminalRuleCall_6_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Interruptible__Group_6__0__Impl7973); 
             after(grammarAccess.getInterruptibleAccess().getCOMMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__0__Impl"


    // $ANTLR start "rule__Interruptible__Group_6__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4018:1: rule__Interruptible__Group_6__1 : rule__Interruptible__Group_6__1__Impl rule__Interruptible__Group_6__2 ;
    public final void rule__Interruptible__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4022:1: ( rule__Interruptible__Group_6__1__Impl rule__Interruptible__Group_6__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4023:2: rule__Interruptible__Group_6__1__Impl rule__Interruptible__Group_6__2
            {
            pushFollow(FOLLOW_rule__Interruptible__Group_6__1__Impl_in_rule__Interruptible__Group_6__18002);
            rule__Interruptible__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group_6__2_in_rule__Interruptible__Group_6__18005);
            rule__Interruptible__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__1"


    // $ANTLR start "rule__Interruptible__Group_6__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4030:1: rule__Interruptible__Group_6__1__Impl : ( 'by' ) ;
    public final void rule__Interruptible__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4034:1: ( ( 'by' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4035:1: ( 'by' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4035:1: ( 'by' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4036:1: 'by'
            {
             before(grammarAccess.getInterruptibleAccess().getByKeyword_6_1()); 
            match(input,32,FOLLOW_32_in_rule__Interruptible__Group_6__1__Impl8033); 
             after(grammarAccess.getInterruptibleAccess().getByKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__1__Impl"


    // $ANTLR start "rule__Interruptible__Group_6__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4049:1: rule__Interruptible__Group_6__2 : rule__Interruptible__Group_6__2__Impl rule__Interruptible__Group_6__3 ;
    public final void rule__Interruptible__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4053:1: ( rule__Interruptible__Group_6__2__Impl rule__Interruptible__Group_6__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4054:2: rule__Interruptible__Group_6__2__Impl rule__Interruptible__Group_6__3
            {
            pushFollow(FOLLOW_rule__Interruptible__Group_6__2__Impl_in_rule__Interruptible__Group_6__28064);
            rule__Interruptible__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group_6__3_in_rule__Interruptible__Group_6__28067);
            rule__Interruptible__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__2"


    // $ANTLR start "rule__Interruptible__Group_6__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4061:1: rule__Interruptible__Group_6__2__Impl : ( ( rule__Interruptible__RoleNamesAssignment_6_2 ) ) ;
    public final void rule__Interruptible__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4065:1: ( ( ( rule__Interruptible__RoleNamesAssignment_6_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4066:1: ( ( rule__Interruptible__RoleNamesAssignment_6_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4066:1: ( ( rule__Interruptible__RoleNamesAssignment_6_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4067:1: ( rule__Interruptible__RoleNamesAssignment_6_2 )
            {
             before(grammarAccess.getInterruptibleAccess().getRoleNamesAssignment_6_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4068:1: ( rule__Interruptible__RoleNamesAssignment_6_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4068:2: rule__Interruptible__RoleNamesAssignment_6_2
            {
            pushFollow(FOLLOW_rule__Interruptible__RoleNamesAssignment_6_2_in_rule__Interruptible__Group_6__2__Impl8094);
            rule__Interruptible__RoleNamesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getRoleNamesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__2__Impl"


    // $ANTLR start "rule__Interruptible__Group_6__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4078:1: rule__Interruptible__Group_6__3 : rule__Interruptible__Group_6__3__Impl rule__Interruptible__Group_6__4 ;
    public final void rule__Interruptible__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4082:1: ( rule__Interruptible__Group_6__3__Impl rule__Interruptible__Group_6__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4083:2: rule__Interruptible__Group_6__3__Impl rule__Interruptible__Group_6__4
            {
            pushFollow(FOLLOW_rule__Interruptible__Group_6__3__Impl_in_rule__Interruptible__Group_6__38124);
            rule__Interruptible__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interruptible__Group_6__4_in_rule__Interruptible__Group_6__38127);
            rule__Interruptible__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__3"


    // $ANTLR start "rule__Interruptible__Group_6__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4090:1: rule__Interruptible__Group_6__3__Impl : ( 'with' ) ;
    public final void rule__Interruptible__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4094:1: ( ( 'with' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4095:1: ( 'with' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4095:1: ( 'with' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4096:1: 'with'
            {
             before(grammarAccess.getInterruptibleAccess().getWithKeyword_6_3()); 
            match(input,33,FOLLOW_33_in_rule__Interruptible__Group_6__3__Impl8155); 
             after(grammarAccess.getInterruptibleAccess().getWithKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__3__Impl"


    // $ANTLR start "rule__Interruptible__Group_6__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4109:1: rule__Interruptible__Group_6__4 : rule__Interruptible__Group_6__4__Impl ;
    public final void rule__Interruptible__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4113:1: ( rule__Interruptible__Group_6__4__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4114:2: rule__Interruptible__Group_6__4__Impl
            {
            pushFollow(FOLLOW_rule__Interruptible__Group_6__4__Impl_in_rule__Interruptible__Group_6__48186);
            rule__Interruptible__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__4"


    // $ANTLR start "rule__Interruptible__Group_6__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4120:1: rule__Interruptible__Group_6__4__Impl : ( ( rule__Interruptible__SignaturesAssignment_6_4 ) ) ;
    public final void rule__Interruptible__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4124:1: ( ( ( rule__Interruptible__SignaturesAssignment_6_4 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4125:1: ( ( rule__Interruptible__SignaturesAssignment_6_4 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4125:1: ( ( rule__Interruptible__SignaturesAssignment_6_4 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4126:1: ( rule__Interruptible__SignaturesAssignment_6_4 )
            {
             before(grammarAccess.getInterruptibleAccess().getSignaturesAssignment_6_4()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4127:1: ( rule__Interruptible__SignaturesAssignment_6_4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4127:2: rule__Interruptible__SignaturesAssignment_6_4
            {
            pushFollow(FOLLOW_rule__Interruptible__SignaturesAssignment_6_4_in_rule__Interruptible__Group_6__4__Impl8213);
            rule__Interruptible__SignaturesAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getInterruptibleAccess().getSignaturesAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__Group_6__4__Impl"


    // $ANTLR start "rule__Continue__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4147:1: rule__Continue__Group__0 : rule__Continue__Group__0__Impl rule__Continue__Group__1 ;
    public final void rule__Continue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4151:1: ( rule__Continue__Group__0__Impl rule__Continue__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4152:2: rule__Continue__Group__0__Impl rule__Continue__Group__1
            {
            pushFollow(FOLLOW_rule__Continue__Group__0__Impl_in_rule__Continue__Group__08253);
            rule__Continue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Continue__Group__1_in_rule__Continue__Group__08256);
            rule__Continue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__0"


    // $ANTLR start "rule__Continue__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4159:1: rule__Continue__Group__0__Impl : ( 'continue' ) ;
    public final void rule__Continue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4163:1: ( ( 'continue' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4164:1: ( 'continue' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4164:1: ( 'continue' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4165:1: 'continue'
            {
             before(grammarAccess.getContinueAccess().getContinueKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Continue__Group__0__Impl8284); 
             after(grammarAccess.getContinueAccess().getContinueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__0__Impl"


    // $ANTLR start "rule__Continue__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4178:1: rule__Continue__Group__1 : rule__Continue__Group__1__Impl rule__Continue__Group__2 ;
    public final void rule__Continue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4182:1: ( rule__Continue__Group__1__Impl rule__Continue__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4183:2: rule__Continue__Group__1__Impl rule__Continue__Group__2
            {
            pushFollow(FOLLOW_rule__Continue__Group__1__Impl_in_rule__Continue__Group__18315);
            rule__Continue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Continue__Group__2_in_rule__Continue__Group__18318);
            rule__Continue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__1"


    // $ANTLR start "rule__Continue__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4190:1: rule__Continue__Group__1__Impl : ( ( rule__Continue__LoopNameAssignment_1 ) ) ;
    public final void rule__Continue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4194:1: ( ( ( rule__Continue__LoopNameAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4195:1: ( ( rule__Continue__LoopNameAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4195:1: ( ( rule__Continue__LoopNameAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4196:1: ( rule__Continue__LoopNameAssignment_1 )
            {
             before(grammarAccess.getContinueAccess().getLoopNameAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4197:1: ( rule__Continue__LoopNameAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4197:2: rule__Continue__LoopNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Continue__LoopNameAssignment_1_in_rule__Continue__Group__1__Impl8345);
            rule__Continue__LoopNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContinueAccess().getLoopNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__1__Impl"


    // $ANTLR start "rule__Continue__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4207:1: rule__Continue__Group__2 : rule__Continue__Group__2__Impl ;
    public final void rule__Continue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4211:1: ( rule__Continue__Group__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4212:2: rule__Continue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Continue__Group__2__Impl_in_rule__Continue__Group__28375);
            rule__Continue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__2"


    // $ANTLR start "rule__Continue__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4218:1: rule__Continue__Group__2__Impl : ( RULE_SEMI ) ;
    public final void rule__Continue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4222:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4223:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4223:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4224:1: RULE_SEMI
            {
             before(grammarAccess.getContinueAccess().getSEMITerminalRuleCall_2()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__Continue__Group__2__Impl8402); 
             after(grammarAccess.getContinueAccess().getSEMITerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__Group__2__Impl"


    // $ANTLR start "rule__Recursion__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4241:1: rule__Recursion__Group__0 : rule__Recursion__Group__0__Impl rule__Recursion__Group__1 ;
    public final void rule__Recursion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4245:1: ( rule__Recursion__Group__0__Impl rule__Recursion__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4246:2: rule__Recursion__Group__0__Impl rule__Recursion__Group__1
            {
            pushFollow(FOLLOW_rule__Recursion__Group__0__Impl_in_rule__Recursion__Group__08437);
            rule__Recursion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recursion__Group__1_in_rule__Recursion__Group__08440);
            rule__Recursion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__0"


    // $ANTLR start "rule__Recursion__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4253:1: rule__Recursion__Group__0__Impl : ( 'rec' ) ;
    public final void rule__Recursion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4257:1: ( ( 'rec' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4258:1: ( 'rec' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4258:1: ( 'rec' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4259:1: 'rec'
            {
             before(grammarAccess.getRecursionAccess().getRecKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Recursion__Group__0__Impl8468); 
             after(grammarAccess.getRecursionAccess().getRecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__0__Impl"


    // $ANTLR start "rule__Recursion__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4272:1: rule__Recursion__Group__1 : rule__Recursion__Group__1__Impl rule__Recursion__Group__2 ;
    public final void rule__Recursion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4276:1: ( rule__Recursion__Group__1__Impl rule__Recursion__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4277:2: rule__Recursion__Group__1__Impl rule__Recursion__Group__2
            {
            pushFollow(FOLLOW_rule__Recursion__Group__1__Impl_in_rule__Recursion__Group__18499);
            rule__Recursion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recursion__Group__2_in_rule__Recursion__Group__18502);
            rule__Recursion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__1"


    // $ANTLR start "rule__Recursion__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4284:1: rule__Recursion__Group__1__Impl : ( ( rule__Recursion__LoopNameAssignment_1 ) ) ;
    public final void rule__Recursion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4288:1: ( ( ( rule__Recursion__LoopNameAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4289:1: ( ( rule__Recursion__LoopNameAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4289:1: ( ( rule__Recursion__LoopNameAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4290:1: ( rule__Recursion__LoopNameAssignment_1 )
            {
             before(grammarAccess.getRecursionAccess().getLoopNameAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4291:1: ( rule__Recursion__LoopNameAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4291:2: rule__Recursion__LoopNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Recursion__LoopNameAssignment_1_in_rule__Recursion__Group__1__Impl8529);
            rule__Recursion__LoopNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getLoopNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__1__Impl"


    // $ANTLR start "rule__Recursion__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4301:1: rule__Recursion__Group__2 : rule__Recursion__Group__2__Impl ;
    public final void rule__Recursion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4305:1: ( rule__Recursion__Group__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4306:2: rule__Recursion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Recursion__Group__2__Impl_in_rule__Recursion__Group__28559);
            rule__Recursion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__2"


    // $ANTLR start "rule__Recursion__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4312:1: rule__Recursion__Group__2__Impl : ( ( rule__Recursion__BodyAssignment_2 ) ) ;
    public final void rule__Recursion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4316:1: ( ( ( rule__Recursion__BodyAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4317:1: ( ( rule__Recursion__BodyAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4317:1: ( ( rule__Recursion__BodyAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4318:1: ( rule__Recursion__BodyAssignment_2 )
            {
             before(grammarAccess.getRecursionAccess().getBodyAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4319:1: ( rule__Recursion__BodyAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4319:2: rule__Recursion__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Recursion__BodyAssignment_2_in_rule__Recursion__Group__2__Impl8586);
            rule__Recursion__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecursionAccess().getBodyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__Group__2__Impl"


    // $ANTLR start "rule__Parallel__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4335:1: rule__Parallel__Group__0 : rule__Parallel__Group__0__Impl rule__Parallel__Group__1 ;
    public final void rule__Parallel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4339:1: ( rule__Parallel__Group__0__Impl rule__Parallel__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4340:2: rule__Parallel__Group__0__Impl rule__Parallel__Group__1
            {
            pushFollow(FOLLOW_rule__Parallel__Group__0__Impl_in_rule__Parallel__Group__08622);
            rule__Parallel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parallel__Group__1_in_rule__Parallel__Group__08625);
            rule__Parallel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__0"


    // $ANTLR start "rule__Parallel__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4347:1: rule__Parallel__Group__0__Impl : ( 'parallel' ) ;
    public final void rule__Parallel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4351:1: ( ( 'parallel' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4352:1: ( 'parallel' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4352:1: ( 'parallel' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4353:1: 'parallel'
            {
             before(grammarAccess.getParallelAccess().getParallelKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Parallel__Group__0__Impl8653); 
             after(grammarAccess.getParallelAccess().getParallelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__0__Impl"


    // $ANTLR start "rule__Parallel__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4366:1: rule__Parallel__Group__1 : rule__Parallel__Group__1__Impl rule__Parallel__Group__2 ;
    public final void rule__Parallel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4370:1: ( rule__Parallel__Group__1__Impl rule__Parallel__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4371:2: rule__Parallel__Group__1__Impl rule__Parallel__Group__2
            {
            pushFollow(FOLLOW_rule__Parallel__Group__1__Impl_in_rule__Parallel__Group__18684);
            rule__Parallel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parallel__Group__2_in_rule__Parallel__Group__18687);
            rule__Parallel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__1"


    // $ANTLR start "rule__Parallel__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4378:1: rule__Parallel__Group__1__Impl : ( ( rule__Parallel__BranchesAssignment_1 ) ) ;
    public final void rule__Parallel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4382:1: ( ( ( rule__Parallel__BranchesAssignment_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4383:1: ( ( rule__Parallel__BranchesAssignment_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4383:1: ( ( rule__Parallel__BranchesAssignment_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4384:1: ( rule__Parallel__BranchesAssignment_1 )
            {
             before(grammarAccess.getParallelAccess().getBranchesAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4385:1: ( rule__Parallel__BranchesAssignment_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4385:2: rule__Parallel__BranchesAssignment_1
            {
            pushFollow(FOLLOW_rule__Parallel__BranchesAssignment_1_in_rule__Parallel__Group__1__Impl8714);
            rule__Parallel__BranchesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getBranchesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__1__Impl"


    // $ANTLR start "rule__Parallel__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4395:1: rule__Parallel__Group__2 : rule__Parallel__Group__2__Impl ;
    public final void rule__Parallel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4399:1: ( rule__Parallel__Group__2__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4400:2: rule__Parallel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parallel__Group__2__Impl_in_rule__Parallel__Group__28744);
            rule__Parallel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__2"


    // $ANTLR start "rule__Parallel__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4406:1: rule__Parallel__Group__2__Impl : ( ( rule__Parallel__Group_2__0 )* ) ;
    public final void rule__Parallel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4410:1: ( ( ( rule__Parallel__Group_2__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4411:1: ( ( rule__Parallel__Group_2__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4411:1: ( ( rule__Parallel__Group_2__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4412:1: ( rule__Parallel__Group_2__0 )*
            {
             before(grammarAccess.getParallelAccess().getGroup_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4413:1: ( rule__Parallel__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4413:2: rule__Parallel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Parallel__Group_2__0_in_rule__Parallel__Group__2__Impl8771);
            	    rule__Parallel__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getParallelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group__2__Impl"


    // $ANTLR start "rule__Parallel__Group_2__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4429:1: rule__Parallel__Group_2__0 : rule__Parallel__Group_2__0__Impl rule__Parallel__Group_2__1 ;
    public final void rule__Parallel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4433:1: ( rule__Parallel__Group_2__0__Impl rule__Parallel__Group_2__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4434:2: rule__Parallel__Group_2__0__Impl rule__Parallel__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parallel__Group_2__0__Impl_in_rule__Parallel__Group_2__08808);
            rule__Parallel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parallel__Group_2__1_in_rule__Parallel__Group_2__08811);
            rule__Parallel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group_2__0"


    // $ANTLR start "rule__Parallel__Group_2__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4441:1: rule__Parallel__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__Parallel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4445:1: ( ( 'and' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4446:1: ( 'and' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4446:1: ( 'and' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4447:1: 'and'
            {
             before(grammarAccess.getParallelAccess().getAndKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Parallel__Group_2__0__Impl8839); 
             after(grammarAccess.getParallelAccess().getAndKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group_2__0__Impl"


    // $ANTLR start "rule__Parallel__Group_2__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4460:1: rule__Parallel__Group_2__1 : rule__Parallel__Group_2__1__Impl ;
    public final void rule__Parallel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4464:1: ( rule__Parallel__Group_2__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4465:2: rule__Parallel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parallel__Group_2__1__Impl_in_rule__Parallel__Group_2__18870);
            rule__Parallel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group_2__1"


    // $ANTLR start "rule__Parallel__Group_2__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4471:1: rule__Parallel__Group_2__1__Impl : ( ( rule__Parallel__BranchesAssignment_2_1 ) ) ;
    public final void rule__Parallel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4475:1: ( ( ( rule__Parallel__BranchesAssignment_2_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4476:1: ( ( rule__Parallel__BranchesAssignment_2_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4476:1: ( ( rule__Parallel__BranchesAssignment_2_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4477:1: ( rule__Parallel__BranchesAssignment_2_1 )
            {
             before(grammarAccess.getParallelAccess().getBranchesAssignment_2_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4478:1: ( rule__Parallel__BranchesAssignment_2_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4478:2: rule__Parallel__BranchesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parallel__BranchesAssignment_2_1_in_rule__Parallel__Group_2__1__Impl8897);
            rule__Parallel__BranchesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParallelAccess().getBranchesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__Group_2__1__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4492:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4496:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4497:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__08931);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__08934);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4504:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4508:1: ( ( 'choice' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4509:1: ( 'choice' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4509:1: ( 'choice' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4510:1: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Choice__Group__0__Impl8962); 
             after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4523:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4527:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4528:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__18993);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__18996);
            rule__Choice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4535:1: rule__Choice__Group__1__Impl : ( 'at' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4539:1: ( ( 'at' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4540:1: ( 'at' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4540:1: ( 'at' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4541:1: 'at'
            {
             before(grammarAccess.getChoiceAccess().getAtKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Choice__Group__1__Impl9024); 
             after(grammarAccess.getChoiceAccess().getAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4554:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4558:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4559:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__29055);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__29058);
            rule__Choice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4566:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__RoleAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4570:1: ( ( ( rule__Choice__RoleAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4571:1: ( ( rule__Choice__RoleAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4571:1: ( ( rule__Choice__RoleAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4572:1: ( rule__Choice__RoleAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4573:1: ( rule__Choice__RoleAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4573:2: rule__Choice__RoleAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__RoleAssignment_2_in_rule__Choice__Group__2__Impl9085);
            rule__Choice__RoleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getRoleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4583:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4587:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4588:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__39115);
            rule__Choice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__39118);
            rule__Choice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4595:1: rule__Choice__Group__3__Impl : ( ( rule__Choice__BranchesAssignment_3 ) ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4599:1: ( ( ( rule__Choice__BranchesAssignment_3 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4600:1: ( ( rule__Choice__BranchesAssignment_3 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4600:1: ( ( rule__Choice__BranchesAssignment_3 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4601:1: ( rule__Choice__BranchesAssignment_3 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_3()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4602:1: ( rule__Choice__BranchesAssignment_3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4602:2: rule__Choice__BranchesAssignment_3
            {
            pushFollow(FOLLOW_rule__Choice__BranchesAssignment_3_in_rule__Choice__Group__3__Impl9145);
            rule__Choice__BranchesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4612:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4616:1: ( rule__Choice__Group__4__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4617:2: rule__Choice__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__49175);
            rule__Choice__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4"


    // $ANTLR start "rule__Choice__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4623:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__Group_4__0 )* ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4627:1: ( ( ( rule__Choice__Group_4__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4628:1: ( ( rule__Choice__Group_4__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4628:1: ( ( rule__Choice__Group_4__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4629:1: ( rule__Choice__Group_4__0 )*
            {
             before(grammarAccess.getChoiceAccess().getGroup_4()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4630:1: ( rule__Choice__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4630:2: rule__Choice__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Choice__Group_4__0_in_rule__Choice__Group__4__Impl9202);
            	    rule__Choice__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getChoiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group_4__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4650:1: rule__Choice__Group_4__0 : rule__Choice__Group_4__0__Impl rule__Choice__Group_4__1 ;
    public final void rule__Choice__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4654:1: ( rule__Choice__Group_4__0__Impl rule__Choice__Group_4__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4655:2: rule__Choice__Group_4__0__Impl rule__Choice__Group_4__1
            {
            pushFollow(FOLLOW_rule__Choice__Group_4__0__Impl_in_rule__Choice__Group_4__09243);
            rule__Choice__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group_4__1_in_rule__Choice__Group_4__09246);
            rule__Choice__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_4__0"


    // $ANTLR start "rule__Choice__Group_4__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4662:1: rule__Choice__Group_4__0__Impl : ( 'or' ) ;
    public final void rule__Choice__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4666:1: ( ( 'or' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4667:1: ( 'or' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4667:1: ( 'or' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4668:1: 'or'
            {
             before(grammarAccess.getChoiceAccess().getOrKeyword_4_0()); 
            match(input,40,FOLLOW_40_in_rule__Choice__Group_4__0__Impl9274); 
             after(grammarAccess.getChoiceAccess().getOrKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_4__0__Impl"


    // $ANTLR start "rule__Choice__Group_4__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4681:1: rule__Choice__Group_4__1 : rule__Choice__Group_4__1__Impl ;
    public final void rule__Choice__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4685:1: ( rule__Choice__Group_4__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4686:2: rule__Choice__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group_4__1__Impl_in_rule__Choice__Group_4__19305);
            rule__Choice__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_4__1"


    // $ANTLR start "rule__Choice__Group_4__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4692:1: rule__Choice__Group_4__1__Impl : ( ( rule__Choice__BranchesAssignment_4_1 ) ) ;
    public final void rule__Choice__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4696:1: ( ( ( rule__Choice__BranchesAssignment_4_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4697:1: ( ( rule__Choice__BranchesAssignment_4_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4697:1: ( ( rule__Choice__BranchesAssignment_4_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4698:1: ( rule__Choice__BranchesAssignment_4_1 )
            {
             before(grammarAccess.getChoiceAccess().getBranchesAssignment_4_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4699:1: ( rule__Choice__BranchesAssignment_4_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4699:2: rule__Choice__BranchesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Choice__BranchesAssignment_4_1_in_rule__Choice__Group_4__1__Impl9332);
            rule__Choice__BranchesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getBranchesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group_4__1__Impl"


    // $ANTLR start "rule__Message__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4713:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4717:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4718:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__09366);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__1_in_rule__Message__Group__09369);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4725:1: rule__Message__Group__0__Impl : ( ( rule__Message__SignatureAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4729:1: ( ( ( rule__Message__SignatureAssignment_0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4730:1: ( ( rule__Message__SignatureAssignment_0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4730:1: ( ( rule__Message__SignatureAssignment_0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4731:1: ( rule__Message__SignatureAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getSignatureAssignment_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4732:1: ( rule__Message__SignatureAssignment_0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4732:2: rule__Message__SignatureAssignment_0
            {
            pushFollow(FOLLOW_rule__Message__SignatureAssignment_0_in_rule__Message__Group__0__Impl9396);
            rule__Message__SignatureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSignatureAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4742:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4746:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4747:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__19426);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__2_in_rule__Message__Group__19429);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4754:1: rule__Message__Group__1__Impl : ( 'from' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4758:1: ( ( 'from' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4759:1: ( 'from' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4759:1: ( 'from' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4760:1: 'from'
            {
             before(grammarAccess.getMessageAccess().getFromKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Message__Group__1__Impl9457); 
             after(grammarAccess.getMessageAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4773:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4777:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4778:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__29488);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__3_in_rule__Message__Group__29491);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4785:1: rule__Message__Group__2__Impl : ( ( rule__Message__SenderAssignment_2 ) ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4789:1: ( ( ( rule__Message__SenderAssignment_2 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4790:1: ( ( rule__Message__SenderAssignment_2 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4790:1: ( ( rule__Message__SenderAssignment_2 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4791:1: ( rule__Message__SenderAssignment_2 )
            {
             before(grammarAccess.getMessageAccess().getSenderAssignment_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4792:1: ( rule__Message__SenderAssignment_2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4792:2: rule__Message__SenderAssignment_2
            {
            pushFollow(FOLLOW_rule__Message__SenderAssignment_2_in_rule__Message__Group__2__Impl9518);
            rule__Message__SenderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getSenderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4802:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4806:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4807:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__39548);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__4_in_rule__Message__Group__39551);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4814:1: rule__Message__Group__3__Impl : ( 'to' ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4818:1: ( ( 'to' ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4819:1: ( 'to' )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4819:1: ( 'to' )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4820:1: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__Message__Group__3__Impl9579); 
             after(grammarAccess.getMessageAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4833:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4837:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4838:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__49610);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Message__Group__5_in_rule__Message__Group__49613);
            rule__Message__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4845:1: rule__Message__Group__4__Impl : ( ( rule__Message__ReceiverAssignment_4 ) ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4849:1: ( ( ( rule__Message__ReceiverAssignment_4 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4850:1: ( ( rule__Message__ReceiverAssignment_4 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4850:1: ( ( rule__Message__ReceiverAssignment_4 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4851:1: ( rule__Message__ReceiverAssignment_4 )
            {
             before(grammarAccess.getMessageAccess().getReceiverAssignment_4()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4852:1: ( rule__Message__ReceiverAssignment_4 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4852:2: rule__Message__ReceiverAssignment_4
            {
            pushFollow(FOLLOW_rule__Message__ReceiverAssignment_4_in_rule__Message__Group__4__Impl9640);
            rule__Message__ReceiverAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getReceiverAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group__5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4862:1: rule__Message__Group__5 : rule__Message__Group__5__Impl ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4866:1: ( rule__Message__Group__5__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4867:2: rule__Message__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__59670);
            rule__Message__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4873:1: rule__Message__Group__5__Impl : ( RULE_SEMI ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4877:1: ( ( RULE_SEMI ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4878:1: ( RULE_SEMI )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4878:1: ( RULE_SEMI )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4879:1: RULE_SEMI
            {
             before(grammarAccess.getMessageAccess().getSEMITerminalRuleCall_5()); 
            match(input,RULE_SEMI,FOLLOW_RULE_SEMI_in_rule__Message__Group__5__Impl9697); 
             after(grammarAccess.getMessageAccess().getSEMITerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__MessageSignature__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4902:1: rule__MessageSignature__Group__0 : rule__MessageSignature__Group__0__Impl rule__MessageSignature__Group__1 ;
    public final void rule__MessageSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4906:1: ( rule__MessageSignature__Group__0__Impl rule__MessageSignature__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4907:2: rule__MessageSignature__Group__0__Impl rule__MessageSignature__Group__1
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group__0__Impl_in_rule__MessageSignature__Group__09738);
            rule__MessageSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSignature__Group__1_in_rule__MessageSignature__Group__09741);
            rule__MessageSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__0"


    // $ANTLR start "rule__MessageSignature__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4914:1: rule__MessageSignature__Group__0__Impl : ( ( rule__MessageSignature__OperatorAssignment_0 ) ) ;
    public final void rule__MessageSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4918:1: ( ( ( rule__MessageSignature__OperatorAssignment_0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4919:1: ( ( rule__MessageSignature__OperatorAssignment_0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4919:1: ( ( rule__MessageSignature__OperatorAssignment_0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4920:1: ( rule__MessageSignature__OperatorAssignment_0 )
            {
             before(grammarAccess.getMessageSignatureAccess().getOperatorAssignment_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4921:1: ( rule__MessageSignature__OperatorAssignment_0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4921:2: rule__MessageSignature__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageSignature__OperatorAssignment_0_in_rule__MessageSignature__Group__0__Impl9768);
            rule__MessageSignature__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSignatureAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__0__Impl"


    // $ANTLR start "rule__MessageSignature__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4931:1: rule__MessageSignature__Group__1 : rule__MessageSignature__Group__1__Impl rule__MessageSignature__Group__2 ;
    public final void rule__MessageSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4935:1: ( rule__MessageSignature__Group__1__Impl rule__MessageSignature__Group__2 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4936:2: rule__MessageSignature__Group__1__Impl rule__MessageSignature__Group__2
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group__1__Impl_in_rule__MessageSignature__Group__19798);
            rule__MessageSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSignature__Group__2_in_rule__MessageSignature__Group__19801);
            rule__MessageSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__1"


    // $ANTLR start "rule__MessageSignature__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4943:1: rule__MessageSignature__Group__1__Impl : ( RULE_LPA ) ;
    public final void rule__MessageSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4947:1: ( ( RULE_LPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4948:1: ( RULE_LPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4948:1: ( RULE_LPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4949:1: RULE_LPA
            {
             before(grammarAccess.getMessageSignatureAccess().getLPATerminalRuleCall_1()); 
            match(input,RULE_LPA,FOLLOW_RULE_LPA_in_rule__MessageSignature__Group__1__Impl9828); 
             after(grammarAccess.getMessageSignatureAccess().getLPATerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__1__Impl"


    // $ANTLR start "rule__MessageSignature__Group__2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4960:1: rule__MessageSignature__Group__2 : rule__MessageSignature__Group__2__Impl rule__MessageSignature__Group__3 ;
    public final void rule__MessageSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4964:1: ( rule__MessageSignature__Group__2__Impl rule__MessageSignature__Group__3 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4965:2: rule__MessageSignature__Group__2__Impl rule__MessageSignature__Group__3
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group__2__Impl_in_rule__MessageSignature__Group__29857);
            rule__MessageSignature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSignature__Group__3_in_rule__MessageSignature__Group__29860);
            rule__MessageSignature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__2"


    // $ANTLR start "rule__MessageSignature__Group__2__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4972:1: rule__MessageSignature__Group__2__Impl : ( ( rule__MessageSignature__Group_2__0 )? ) ;
    public final void rule__MessageSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4976:1: ( ( ( rule__MessageSignature__Group_2__0 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4977:1: ( ( rule__MessageSignature__Group_2__0 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4977:1: ( ( rule__MessageSignature__Group_2__0 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4978:1: ( rule__MessageSignature__Group_2__0 )?
            {
             before(grammarAccess.getMessageSignatureAccess().getGroup_2()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4979:1: ( rule__MessageSignature__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4979:2: rule__MessageSignature__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MessageSignature__Group_2__0_in_rule__MessageSignature__Group__2__Impl9887);
                    rule__MessageSignature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageSignatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__2__Impl"


    // $ANTLR start "rule__MessageSignature__Group__3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4989:1: rule__MessageSignature__Group__3 : rule__MessageSignature__Group__3__Impl ;
    public final void rule__MessageSignature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4993:1: ( rule__MessageSignature__Group__3__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:4994:2: rule__MessageSignature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group__3__Impl_in_rule__MessageSignature__Group__39918);
            rule__MessageSignature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__3"


    // $ANTLR start "rule__MessageSignature__Group__3__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5000:1: rule__MessageSignature__Group__3__Impl : ( RULE_RPA ) ;
    public final void rule__MessageSignature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5004:1: ( ( RULE_RPA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5005:1: ( RULE_RPA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5005:1: ( RULE_RPA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5006:1: RULE_RPA
            {
             before(grammarAccess.getMessageSignatureAccess().getRPATerminalRuleCall_3()); 
            match(input,RULE_RPA,FOLLOW_RULE_RPA_in_rule__MessageSignature__Group__3__Impl9945); 
             after(grammarAccess.getMessageSignatureAccess().getRPATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group__3__Impl"


    // $ANTLR start "rule__MessageSignature__Group_2__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5025:1: rule__MessageSignature__Group_2__0 : rule__MessageSignature__Group_2__0__Impl rule__MessageSignature__Group_2__1 ;
    public final void rule__MessageSignature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5029:1: ( rule__MessageSignature__Group_2__0__Impl rule__MessageSignature__Group_2__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5030:2: rule__MessageSignature__Group_2__0__Impl rule__MessageSignature__Group_2__1
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group_2__0__Impl_in_rule__MessageSignature__Group_2__09982);
            rule__MessageSignature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSignature__Group_2__1_in_rule__MessageSignature__Group_2__09985);
            rule__MessageSignature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2__0"


    // $ANTLR start "rule__MessageSignature__Group_2__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5037:1: rule__MessageSignature__Group_2__0__Impl : ( ( rule__MessageSignature__PayloadTypesAssignment_2_0 ) ) ;
    public final void rule__MessageSignature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5041:1: ( ( ( rule__MessageSignature__PayloadTypesAssignment_2_0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5042:1: ( ( rule__MessageSignature__PayloadTypesAssignment_2_0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5042:1: ( ( rule__MessageSignature__PayloadTypesAssignment_2_0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5043:1: ( rule__MessageSignature__PayloadTypesAssignment_2_0 )
            {
             before(grammarAccess.getMessageSignatureAccess().getPayloadTypesAssignment_2_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5044:1: ( rule__MessageSignature__PayloadTypesAssignment_2_0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5044:2: rule__MessageSignature__PayloadTypesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__MessageSignature__PayloadTypesAssignment_2_0_in_rule__MessageSignature__Group_2__0__Impl10012);
            rule__MessageSignature__PayloadTypesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSignatureAccess().getPayloadTypesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2__0__Impl"


    // $ANTLR start "rule__MessageSignature__Group_2__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5054:1: rule__MessageSignature__Group_2__1 : rule__MessageSignature__Group_2__1__Impl ;
    public final void rule__MessageSignature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5058:1: ( rule__MessageSignature__Group_2__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5059:2: rule__MessageSignature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group_2__1__Impl_in_rule__MessageSignature__Group_2__110042);
            rule__MessageSignature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2__1"


    // $ANTLR start "rule__MessageSignature__Group_2__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5065:1: rule__MessageSignature__Group_2__1__Impl : ( ( rule__MessageSignature__Group_2_1__0 )* ) ;
    public final void rule__MessageSignature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5069:1: ( ( ( rule__MessageSignature__Group_2_1__0 )* ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5070:1: ( ( rule__MessageSignature__Group_2_1__0 )* )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5070:1: ( ( rule__MessageSignature__Group_2_1__0 )* )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5071:1: ( rule__MessageSignature__Group_2_1__0 )*
            {
             before(grammarAccess.getMessageSignatureAccess().getGroup_2_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5072:1: ( rule__MessageSignature__Group_2_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5072:2: rule__MessageSignature__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MessageSignature__Group_2_1__0_in_rule__MessageSignature__Group_2__1__Impl10069);
            	    rule__MessageSignature__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMessageSignatureAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2__1__Impl"


    // $ANTLR start "rule__MessageSignature__Group_2_1__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5086:1: rule__MessageSignature__Group_2_1__0 : rule__MessageSignature__Group_2_1__0__Impl rule__MessageSignature__Group_2_1__1 ;
    public final void rule__MessageSignature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5090:1: ( rule__MessageSignature__Group_2_1__0__Impl rule__MessageSignature__Group_2_1__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5091:2: rule__MessageSignature__Group_2_1__0__Impl rule__MessageSignature__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group_2_1__0__Impl_in_rule__MessageSignature__Group_2_1__010104);
            rule__MessageSignature__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSignature__Group_2_1__1_in_rule__MessageSignature__Group_2_1__010107);
            rule__MessageSignature__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2_1__0"


    // $ANTLR start "rule__MessageSignature__Group_2_1__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5098:1: rule__MessageSignature__Group_2_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__MessageSignature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5102:1: ( ( RULE_COMMA ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5103:1: ( RULE_COMMA )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5103:1: ( RULE_COMMA )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5104:1: RULE_COMMA
            {
             before(grammarAccess.getMessageSignatureAccess().getCOMMATerminalRuleCall_2_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__MessageSignature__Group_2_1__0__Impl10134); 
             after(grammarAccess.getMessageSignatureAccess().getCOMMATerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2_1__0__Impl"


    // $ANTLR start "rule__MessageSignature__Group_2_1__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5115:1: rule__MessageSignature__Group_2_1__1 : rule__MessageSignature__Group_2_1__1__Impl ;
    public final void rule__MessageSignature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5119:1: ( rule__MessageSignature__Group_2_1__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5120:2: rule__MessageSignature__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MessageSignature__Group_2_1__1__Impl_in_rule__MessageSignature__Group_2_1__110163);
            rule__MessageSignature__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2_1__1"


    // $ANTLR start "rule__MessageSignature__Group_2_1__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5126:1: rule__MessageSignature__Group_2_1__1__Impl : ( ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 ) ) ;
    public final void rule__MessageSignature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5130:1: ( ( ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5131:1: ( ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5131:1: ( ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5132:1: ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 )
            {
             before(grammarAccess.getMessageSignatureAccess().getPayloadTypesAssignment_2_1_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5133:1: ( rule__MessageSignature__PayloadTypesAssignment_2_1_1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5133:2: rule__MessageSignature__PayloadTypesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__MessageSignature__PayloadTypesAssignment_2_1_1_in_rule__MessageSignature__Group_2_1__1__Impl10190);
            rule__MessageSignature__PayloadTypesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageSignatureAccess().getPayloadTypesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__Group_2_1__1__Impl"


    // $ANTLR start "rule__PayloadType__Group__0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5147:1: rule__PayloadType__Group__0 : rule__PayloadType__Group__0__Impl rule__PayloadType__Group__1 ;
    public final void rule__PayloadType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5151:1: ( rule__PayloadType__Group__0__Impl rule__PayloadType__Group__1 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5152:2: rule__PayloadType__Group__0__Impl rule__PayloadType__Group__1
            {
            pushFollow(FOLLOW_rule__PayloadType__Group__0__Impl_in_rule__PayloadType__Group__010224);
            rule__PayloadType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PayloadType__Group__1_in_rule__PayloadType__Group__010227);
            rule__PayloadType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__Group__0"


    // $ANTLR start "rule__PayloadType__Group__0__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5159:1: rule__PayloadType__Group__0__Impl : ( ( rule__PayloadType__PayloadAssignment_0 ) ) ;
    public final void rule__PayloadType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5163:1: ( ( ( rule__PayloadType__PayloadAssignment_0 ) ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5164:1: ( ( rule__PayloadType__PayloadAssignment_0 ) )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5164:1: ( ( rule__PayloadType__PayloadAssignment_0 ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5165:1: ( rule__PayloadType__PayloadAssignment_0 )
            {
             before(grammarAccess.getPayloadTypeAccess().getPayloadAssignment_0()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5166:1: ( rule__PayloadType__PayloadAssignment_0 )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5166:2: rule__PayloadType__PayloadAssignment_0
            {
            pushFollow(FOLLOW_rule__PayloadType__PayloadAssignment_0_in_rule__PayloadType__Group__0__Impl10254);
            rule__PayloadType__PayloadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPayloadTypeAccess().getPayloadAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__Group__0__Impl"


    // $ANTLR start "rule__PayloadType__Group__1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5176:1: rule__PayloadType__Group__1 : rule__PayloadType__Group__1__Impl ;
    public final void rule__PayloadType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5180:1: ( rule__PayloadType__Group__1__Impl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5181:2: rule__PayloadType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PayloadType__Group__1__Impl_in_rule__PayloadType__Group__110284);
            rule__PayloadType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__Group__1"


    // $ANTLR start "rule__PayloadType__Group__1__Impl"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5187:1: rule__PayloadType__Group__1__Impl : ( ( rule__PayloadType__DataTypeAssignment_1 )? ) ;
    public final void rule__PayloadType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5191:1: ( ( ( rule__PayloadType__DataTypeAssignment_1 )? ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5192:1: ( ( rule__PayloadType__DataTypeAssignment_1 )? )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5192:1: ( ( rule__PayloadType__DataTypeAssignment_1 )? )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5193:1: ( rule__PayloadType__DataTypeAssignment_1 )?
            {
             before(grammarAccess.getPayloadTypeAccess().getDataTypeAssignment_1()); 
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5194:1: ( rule__PayloadType__DataTypeAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5194:2: rule__PayloadType__DataTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PayloadType__DataTypeAssignment_1_in_rule__PayloadType__Group__1__Impl10311);
                    rule__PayloadType__DataTypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPayloadTypeAccess().getDataTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__Group__1__Impl"


    // $ANTLR start "rule__ScribbleProgram__IncludeDeclAssignment_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5209:1: rule__ScribbleProgram__IncludeDeclAssignment_0 : ( ruleIncludeDecl ) ;
    public final void rule__ScribbleProgram__IncludeDeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5213:1: ( ( ruleIncludeDecl ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5214:1: ( ruleIncludeDecl )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5214:1: ( ruleIncludeDecl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5215:1: ruleIncludeDecl
            {
             before(grammarAccess.getScribbleProgramAccess().getIncludeDeclIncludeDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIncludeDecl_in_rule__ScribbleProgram__IncludeDeclAssignment_010351);
            ruleIncludeDecl();

            state._fsp--;

             after(grammarAccess.getScribbleProgramAccess().getIncludeDeclIncludeDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__IncludeDeclAssignment_0"


    // $ANTLR start "rule__ScribbleProgram__TypeDeclAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5224:1: rule__ScribbleProgram__TypeDeclAssignment_1 : ( ruleTypeDecl ) ;
    public final void rule__ScribbleProgram__TypeDeclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5228:1: ( ( ruleTypeDecl ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5229:1: ( ruleTypeDecl )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5229:1: ( ruleTypeDecl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5230:1: ruleTypeDecl
            {
             before(grammarAccess.getScribbleProgramAccess().getTypeDeclTypeDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeDecl_in_rule__ScribbleProgram__TypeDeclAssignment_110382);
            ruleTypeDecl();

            state._fsp--;

             after(grammarAccess.getScribbleProgramAccess().getTypeDeclTypeDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__TypeDeclAssignment_1"


    // $ANTLR start "rule__ScribbleProgram__GlobalProtocolDeclAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5239:1: rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 : ( ruleGlobalProtocolDecl ) ;
    public final void rule__ScribbleProgram__GlobalProtocolDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5243:1: ( ( ruleGlobalProtocolDecl ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5244:1: ( ruleGlobalProtocolDecl )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5244:1: ( ruleGlobalProtocolDecl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5245:1: ruleGlobalProtocolDecl
            {
             before(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclGlobalProtocolDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobalProtocolDecl_in_rule__ScribbleProgram__GlobalProtocolDeclAssignment_210413);
            ruleGlobalProtocolDecl();

            state._fsp--;

             after(grammarAccess.getScribbleProgramAccess().getGlobalProtocolDeclGlobalProtocolDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__GlobalProtocolDeclAssignment_2"


    // $ANTLR start "rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5254:1: rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3 : ( ruleInstGlobalProtocolDecl ) ;
    public final void rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5258:1: ( ( ruleInstGlobalProtocolDecl ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5259:1: ( ruleInstGlobalProtocolDecl )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5259:1: ( ruleInstGlobalProtocolDecl )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5260:1: ruleInstGlobalProtocolDecl
            {
             before(grammarAccess.getScribbleProgramAccess().getInstGlobalProtocolDeclInstGlobalProtocolDeclParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstGlobalProtocolDecl_in_rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_310444);
            ruleInstGlobalProtocolDecl();

            state._fsp--;

             after(grammarAccess.getScribbleProgramAccess().getInstGlobalProtocolDeclInstGlobalProtocolDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3"


    // $ANTLR start "rule__IncludeDecl__ImportURIAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5269:1: rule__IncludeDecl__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__IncludeDecl__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5273:1: ( ( RULE_STRING ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5274:1: ( RULE_STRING )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5274:1: ( RULE_STRING )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5275:1: RULE_STRING
            {
             before(grammarAccess.getIncludeDeclAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IncludeDecl__ImportURIAssignment_110475); 
             after(grammarAccess.getIncludeDeclAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncludeDecl__ImportURIAssignment_1"


    // $ANTLR start "rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5284:1: rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5288:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5289:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5289:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5290:1: RULE_ID
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__ProtocolNameAssignment_210506); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2"


    // $ANTLR start "rule__InstGlobalProtocolDecl__RolesAssignment_5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5299:1: rule__InstGlobalProtocolDecl__RolesAssignment_5 : ( RULE_ID ) ;
    public final void rule__InstGlobalProtocolDecl__RolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5303:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5304:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5304:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5305:1: RULE_ID
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__RolesAssignment_510537); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__RolesAssignment_5"


    // $ANTLR start "rule__InstGlobalProtocolDecl__RolesAssignment_6_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5314:1: rule__InstGlobalProtocolDecl__RolesAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__InstGlobalProtocolDecl__RolesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5318:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5319:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5319:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5320:1: RULE_ID
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__RolesAssignment_6_210568); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__RolesAssignment_6_2"


    // $ANTLR start "rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5329:1: rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9 : ( RULE_ID ) ;
    public final void rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5333:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5334:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5334:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5335:1: RULE_ID
            {
             before(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatedProtocolIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_910599); 
             after(grammarAccess.getInstGlobalProtocolDeclAccess().getInstantiatedProtocolIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9"


    // $ANTLR start "rule__TypeDecl__TypeNameAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5344:1: rule__TypeDecl__TypeNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__TypeNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5348:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5349:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5349:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5350:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getTypeNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__TypeNameAssignment_110630); 
             after(grammarAccess.getTypeDeclAccess().getTypeNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__TypeNameAssignment_1"


    // $ANTLR start "rule__TypeDecl__SchemaAssignment_4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5359:1: rule__TypeDecl__SchemaAssignment_4 : ( RULE_ID ) ;
    public final void rule__TypeDecl__SchemaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5363:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5364:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5364:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5365:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getSchemaIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__SchemaAssignment_410661); 
             after(grammarAccess.getTypeDeclAccess().getSchemaIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__SchemaAssignment_4"


    // $ANTLR start "rule__TypeDecl__FileAssignment_6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5374:1: rule__TypeDecl__FileAssignment_6 : ( RULE_ID ) ;
    public final void rule__TypeDecl__FileAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5378:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5379:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5379:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5380:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getFileIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__FileAssignment_610692); 
             after(grammarAccess.getTypeDeclAccess().getFileIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__FileAssignment_6"


    // $ANTLR start "rule__TypeDecl__AliasAssignment_7_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5389:1: rule__TypeDecl__AliasAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__TypeDecl__AliasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5393:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5394:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5394:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5395:1: RULE_ID
            {
             before(grammarAccess.getTypeDeclAccess().getAliasIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeDecl__AliasAssignment_7_110723); 
             after(grammarAccess.getTypeDeclAccess().getAliasIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDecl__AliasAssignment_7_1"


    // $ANTLR start "rule__GlobalProtocolDecl__ProtocolNameAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5404:1: rule__GlobalProtocolDecl__ProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocolDecl__ProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5408:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5409:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5409:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5410:1: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ProtocolNameAssignment_210754); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__ProtocolNameAssignment_2"


    // $ANTLR start "rule__GlobalProtocolDecl__ParametersAssignment_3_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5419:1: rule__GlobalProtocolDecl__ParametersAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocolDecl__ParametersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5423:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5424:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5424:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5425:1: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ParametersAssignment_3_210785); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__ParametersAssignment_3_2"


    // $ANTLR start "rule__GlobalProtocolDecl__ParametersAssignment_3_3_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5434:1: rule__GlobalProtocolDecl__ParametersAssignment_3_3_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocolDecl__ParametersAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5438:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5439:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5439:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5440:1: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ParametersAssignment_3_3_210816); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__ParametersAssignment_3_3_2"


    // $ANTLR start "rule__GlobalProtocolDecl__RolesAssignment_5_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5449:1: rule__GlobalProtocolDecl__RolesAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__GlobalProtocolDecl__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5453:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5454:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5454:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5455:1: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__RolesAssignment_5_110847); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__RolesAssignment_5_1"


    // $ANTLR start "rule__GlobalProtocolDecl__RolesAssignment_5_2_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5464:1: rule__GlobalProtocolDecl__RolesAssignment_5_2_2 : ( RULE_ID ) ;
    public final void rule__GlobalProtocolDecl__RolesAssignment_5_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5468:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5469:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5469:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5470:1: RULE_ID
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__RolesAssignment_5_2_210878); 
             after(grammarAccess.getGlobalProtocolDeclAccess().getRolesIDTerminalRuleCall_5_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__RolesAssignment_5_2_2"


    // $ANTLR start "rule__GlobalProtocolDecl__BodyAssignment_7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5479:1: rule__GlobalProtocolDecl__BodyAssignment_7 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__GlobalProtocolDecl__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5483:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5484:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5484:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5485:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getGlobalProtocolDeclAccess().getBodyGlobalInteractionBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__GlobalProtocolDecl__BodyAssignment_710909);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getGlobalProtocolDeclAccess().getBodyGlobalInteractionBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalProtocolDecl__BodyAssignment_7"


    // $ANTLR start "rule__GlobalInteractionBlock__InteractionsequenceAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5494:1: rule__GlobalInteractionBlock__InteractionsequenceAssignment_1 : ( ruleGlobalInteraction ) ;
    public final void rule__GlobalInteractionBlock__InteractionsequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5498:1: ( ( ruleGlobalInteraction ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5499:1: ( ruleGlobalInteraction )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5499:1: ( ruleGlobalInteraction )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5500:1: ruleGlobalInteraction
            {
             before(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceGlobalInteractionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGlobalInteraction_in_rule__GlobalInteractionBlock__InteractionsequenceAssignment_110940);
            ruleGlobalInteraction();

            state._fsp--;

             after(grammarAccess.getGlobalInteractionBlockAccess().getInteractionsequenceGlobalInteractionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalInteractionBlock__InteractionsequenceAssignment_1"


    // $ANTLR start "rule__Spawn__RoleNameAssignment_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5509:1: rule__Spawn__RoleNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Spawn__RoleNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5513:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5514:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5514:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5515:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getRoleNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__RoleNameAssignment_010971); 
             after(grammarAccess.getSpawnAccess().getRoleNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__RoleNameAssignment_0"


    // $ANTLR start "rule__Spawn__TargetProtocolNameAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5524:1: rule__Spawn__TargetProtocolNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Spawn__TargetProtocolNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5528:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5529:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5529:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5530:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getTargetProtocolNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__TargetProtocolNameAssignment_211002); 
             after(grammarAccess.getSpawnAccess().getTargetProtocolNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__TargetProtocolNameAssignment_2"


    // $ANTLR start "rule__Spawn__ParametersAssignment_3_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5539:1: rule__Spawn__ParametersAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Spawn__ParametersAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5543:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5544:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5544:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5545:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__ParametersAssignment_3_211033); 
             after(grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__ParametersAssignment_3_2"


    // $ANTLR start "rule__Spawn__ParametersAssignment_3_3_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5554:1: rule__Spawn__ParametersAssignment_3_3_2 : ( RULE_ID ) ;
    public final void rule__Spawn__ParametersAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5558:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5559:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5559:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5560:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__ParametersAssignment_3_3_211064); 
             after(grammarAccess.getSpawnAccess().getParametersIDTerminalRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__ParametersAssignment_3_3_2"


    // $ANTLR start "rule__Spawn__CurrentRolesAssignment_5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5569:1: rule__Spawn__CurrentRolesAssignment_5 : ( RULE_ID ) ;
    public final void rule__Spawn__CurrentRolesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5573:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5574:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5574:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5575:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__CurrentRolesAssignment_511095); 
             after(grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__CurrentRolesAssignment_5"


    // $ANTLR start "rule__Spawn__TargetRolesAssignment_7"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5584:1: rule__Spawn__TargetRolesAssignment_7 : ( RULE_ID ) ;
    public final void rule__Spawn__TargetRolesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5588:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5589:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5589:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5590:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__TargetRolesAssignment_711126); 
             after(grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__TargetRolesAssignment_7"


    // $ANTLR start "rule__Spawn__CurrentRolesAssignment_8_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5599:1: rule__Spawn__CurrentRolesAssignment_8_1 : ( RULE_ID ) ;
    public final void rule__Spawn__CurrentRolesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5603:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5604:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5604:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5605:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_8_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__CurrentRolesAssignment_8_111157); 
             after(grammarAccess.getSpawnAccess().getCurrentRolesIDTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__CurrentRolesAssignment_8_1"


    // $ANTLR start "rule__Spawn__TargetRolesAssignment_8_3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5614:1: rule__Spawn__TargetRolesAssignment_8_3 : ( RULE_ID ) ;
    public final void rule__Spawn__TargetRolesAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5618:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5619:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5619:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5620:1: RULE_ID
            {
             before(grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_8_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Spawn__TargetRolesAssignment_8_311188); 
             after(grammarAccess.getSpawnAccess().getTargetRolesIDTerminalRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spawn__TargetRolesAssignment_8_3"


    // $ANTLR start "rule__Do__TargetProtocolNameAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5629:1: rule__Do__TargetProtocolNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Do__TargetProtocolNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5633:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5634:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5634:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5635:1: RULE_ID
            {
             before(grammarAccess.getDoAccess().getTargetProtocolNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Do__TargetProtocolNameAssignment_111219); 
             after(grammarAccess.getDoAccess().getTargetProtocolNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__TargetProtocolNameAssignment_1"


    // $ANTLR start "rule__Do__ArgumentsAssignment_2_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5644:1: rule__Do__ArgumentsAssignment_2_1 : ( ruleMessageSignature ) ;
    public final void rule__Do__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5648:1: ( ( ruleMessageSignature ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5649:1: ( ruleMessageSignature )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5649:1: ( ruleMessageSignature )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5650:1: ruleMessageSignature
            {
             before(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_rule__Do__ArgumentsAssignment_2_111250);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__Do__ArgumentsAssignment_2_2_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5659:1: rule__Do__ArgumentsAssignment_2_2_1 : ( ruleMessageSignature ) ;
    public final void rule__Do__ArgumentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5663:1: ( ( ruleMessageSignature ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5664:1: ( ruleMessageSignature )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5664:1: ( ruleMessageSignature )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5665:1: ruleMessageSignature
            {
             before(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_rule__Do__ArgumentsAssignment_2_2_111281);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getDoAccess().getArgumentsMessageSignatureParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__ArgumentsAssignment_2_2_1"


    // $ANTLR start "rule__Do__CurrentRolesAssignment_4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5674:1: rule__Do__CurrentRolesAssignment_4 : ( RULE_ID ) ;
    public final void rule__Do__CurrentRolesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5678:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5679:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5679:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5680:1: RULE_ID
            {
             before(grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Do__CurrentRolesAssignment_411312); 
             after(grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__CurrentRolesAssignment_4"


    // $ANTLR start "rule__Do__TargetRolesAssignment_6"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5689:1: rule__Do__TargetRolesAssignment_6 : ( RULE_ID ) ;
    public final void rule__Do__TargetRolesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5693:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5694:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5694:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5695:1: RULE_ID
            {
             before(grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Do__TargetRolesAssignment_611343); 
             after(grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__TargetRolesAssignment_6"


    // $ANTLR start "rule__Do__CurrentRolesAssignment_7_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5704:1: rule__Do__CurrentRolesAssignment_7_1 : ( RULE_ID ) ;
    public final void rule__Do__CurrentRolesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5708:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5709:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5709:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5710:1: RULE_ID
            {
             before(grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_7_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Do__CurrentRolesAssignment_7_111374); 
             after(grammarAccess.getDoAccess().getCurrentRolesIDTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__CurrentRolesAssignment_7_1"


    // $ANTLR start "rule__Do__TargetRolesAssignment_7_3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5719:1: rule__Do__TargetRolesAssignment_7_3 : ( RULE_ID ) ;
    public final void rule__Do__TargetRolesAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5723:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5724:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5724:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5725:1: RULE_ID
            {
             before(grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_7_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Do__TargetRolesAssignment_7_311405); 
             after(grammarAccess.getDoAccess().getTargetRolesIDTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Do__TargetRolesAssignment_7_3"


    // $ANTLR start "rule__Interruptible__BodyAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5734:1: rule__Interruptible__BodyAssignment_1 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Interruptible__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5738:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5739:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5739:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5740:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getInterruptibleAccess().getBodyGlobalInteractionBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Interruptible__BodyAssignment_111436);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getInterruptibleAccess().getBodyGlobalInteractionBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__BodyAssignment_1"


    // $ANTLR start "rule__Interruptible__RoleNamesAssignment_3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5749:1: rule__Interruptible__RoleNamesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Interruptible__RoleNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5753:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5754:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5754:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5755:1: RULE_ID
            {
             before(grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interruptible__RoleNamesAssignment_311467); 
             after(grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__RoleNamesAssignment_3"


    // $ANTLR start "rule__Interruptible__SignaturesAssignment_5"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5764:1: rule__Interruptible__SignaturesAssignment_5 : ( ruleMessageSignature ) ;
    public final void rule__Interruptible__SignaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5768:1: ( ( ruleMessageSignature ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5769:1: ( ruleMessageSignature )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5769:1: ( ruleMessageSignature )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5770:1: ruleMessageSignature
            {
             before(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_rule__Interruptible__SignaturesAssignment_511498);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__SignaturesAssignment_5"


    // $ANTLR start "rule__Interruptible__RoleNamesAssignment_6_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5779:1: rule__Interruptible__RoleNamesAssignment_6_2 : ( RULE_ID ) ;
    public final void rule__Interruptible__RoleNamesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5783:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5784:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5784:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5785:1: RULE_ID
            {
             before(grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_6_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interruptible__RoleNamesAssignment_6_211529); 
             after(grammarAccess.getInterruptibleAccess().getRoleNamesIDTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__RoleNamesAssignment_6_2"


    // $ANTLR start "rule__Interruptible__SignaturesAssignment_6_4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5794:1: rule__Interruptible__SignaturesAssignment_6_4 : ( ruleMessageSignature ) ;
    public final void rule__Interruptible__SignaturesAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5798:1: ( ( ruleMessageSignature ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5799:1: ( ruleMessageSignature )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5799:1: ( ruleMessageSignature )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5800:1: ruleMessageSignature
            {
             before(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_rule__Interruptible__SignaturesAssignment_6_411560);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getInterruptibleAccess().getSignaturesMessageSignatureParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interruptible__SignaturesAssignment_6_4"


    // $ANTLR start "rule__Continue__LoopNameAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5809:1: rule__Continue__LoopNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Continue__LoopNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5813:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5814:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5814:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5815:1: RULE_ID
            {
             before(grammarAccess.getContinueAccess().getLoopNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Continue__LoopNameAssignment_111591); 
             after(grammarAccess.getContinueAccess().getLoopNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Continue__LoopNameAssignment_1"


    // $ANTLR start "rule__Recursion__LoopNameAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5824:1: rule__Recursion__LoopNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Recursion__LoopNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5828:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5829:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5829:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5830:1: RULE_ID
            {
             before(grammarAccess.getRecursionAccess().getLoopNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recursion__LoopNameAssignment_111622); 
             after(grammarAccess.getRecursionAccess().getLoopNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__LoopNameAssignment_1"


    // $ANTLR start "rule__Recursion__BodyAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5839:1: rule__Recursion__BodyAssignment_2 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Recursion__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5843:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5844:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5844:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5845:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getRecursionAccess().getBodyGlobalInteractionBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Recursion__BodyAssignment_211653);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getRecursionAccess().getBodyGlobalInteractionBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recursion__BodyAssignment_2"


    // $ANTLR start "rule__Parallel__BranchesAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5854:1: rule__Parallel__BranchesAssignment_1 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Parallel__BranchesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5858:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5859:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5859:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5860:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Parallel__BranchesAssignment_111684);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__BranchesAssignment_1"


    // $ANTLR start "rule__Parallel__BranchesAssignment_2_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5869:1: rule__Parallel__BranchesAssignment_2_1 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Parallel__BranchesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5873:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5874:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5874:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5875:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Parallel__BranchesAssignment_2_111715);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getParallelAccess().getBranchesGlobalInteractionBlockParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallel__BranchesAssignment_2_1"


    // $ANTLR start "rule__Choice__RoleAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5884:1: rule__Choice__RoleAssignment_2 : ( RULE_ID ) ;
    public final void rule__Choice__RoleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5888:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5889:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5889:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5890:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getRoleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__RoleAssignment_211746); 
             after(grammarAccess.getChoiceAccess().getRoleIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__RoleAssignment_2"


    // $ANTLR start "rule__Choice__BranchesAssignment_3"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5899:1: rule__Choice__BranchesAssignment_3 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Choice__BranchesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5903:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5904:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5904:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5905:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Choice__BranchesAssignment_311777);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_3"


    // $ANTLR start "rule__Choice__BranchesAssignment_4_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5914:1: rule__Choice__BranchesAssignment_4_1 : ( ruleGlobalInteractionBlock ) ;
    public final void rule__Choice__BranchesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5918:1: ( ( ruleGlobalInteractionBlock ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5919:1: ( ruleGlobalInteractionBlock )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5919:1: ( ruleGlobalInteractionBlock )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5920:1: ruleGlobalInteractionBlock
            {
             before(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleGlobalInteractionBlock_in_rule__Choice__BranchesAssignment_4_111808);
            ruleGlobalInteractionBlock();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getBranchesGlobalInteractionBlockParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__BranchesAssignment_4_1"


    // $ANTLR start "rule__Message__SignatureAssignment_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5929:1: rule__Message__SignatureAssignment_0 : ( ruleMessageSignature ) ;
    public final void rule__Message__SignatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5933:1: ( ( ruleMessageSignature ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5934:1: ( ruleMessageSignature )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5934:1: ( ruleMessageSignature )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5935:1: ruleMessageSignature
            {
             before(grammarAccess.getMessageAccess().getSignatureMessageSignatureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMessageSignature_in_rule__Message__SignatureAssignment_011839);
            ruleMessageSignature();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getSignatureMessageSignatureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SignatureAssignment_0"


    // $ANTLR start "rule__Message__SenderAssignment_2"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5944:1: rule__Message__SenderAssignment_2 : ( RULE_ID ) ;
    public final void rule__Message__SenderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5948:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5949:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5949:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5950:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getSenderIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__SenderAssignment_211870); 
             after(grammarAccess.getMessageAccess().getSenderIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__SenderAssignment_2"


    // $ANTLR start "rule__Message__ReceiverAssignment_4"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5959:1: rule__Message__ReceiverAssignment_4 : ( RULE_ID ) ;
    public final void rule__Message__ReceiverAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5963:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5964:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5964:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5965:1: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getReceiverIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Message__ReceiverAssignment_411901); 
             after(grammarAccess.getMessageAccess().getReceiverIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__ReceiverAssignment_4"


    // $ANTLR start "rule__MessageSignature__OperatorAssignment_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5974:1: rule__MessageSignature__OperatorAssignment_0 : ( RULE_ID ) ;
    public final void rule__MessageSignature__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5978:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5979:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5979:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5980:1: RULE_ID
            {
             before(grammarAccess.getMessageSignatureAccess().getOperatorIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MessageSignature__OperatorAssignment_011932); 
             after(grammarAccess.getMessageSignatureAccess().getOperatorIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__OperatorAssignment_0"


    // $ANTLR start "rule__MessageSignature__PayloadTypesAssignment_2_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5989:1: rule__MessageSignature__PayloadTypesAssignment_2_0 : ( rulePayloadType ) ;
    public final void rule__MessageSignature__PayloadTypesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5993:1: ( ( rulePayloadType ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5994:1: ( rulePayloadType )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5994:1: ( rulePayloadType )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:5995:1: rulePayloadType
            {
             before(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_rulePayloadType_in_rule__MessageSignature__PayloadTypesAssignment_2_011963);
            rulePayloadType();

            state._fsp--;

             after(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__PayloadTypesAssignment_2_0"


    // $ANTLR start "rule__MessageSignature__PayloadTypesAssignment_2_1_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6004:1: rule__MessageSignature__PayloadTypesAssignment_2_1_1 : ( rulePayloadType ) ;
    public final void rule__MessageSignature__PayloadTypesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6008:1: ( ( rulePayloadType ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6009:1: ( rulePayloadType )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6009:1: ( rulePayloadType )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6010:1: rulePayloadType
            {
             before(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_rulePayloadType_in_rule__MessageSignature__PayloadTypesAssignment_2_1_111994);
            rulePayloadType();

            state._fsp--;

             after(grammarAccess.getMessageSignatureAccess().getPayloadTypesPayloadTypeParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSignature__PayloadTypesAssignment_2_1_1"


    // $ANTLR start "rule__PayloadType__PayloadAssignment_0"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6019:1: rule__PayloadType__PayloadAssignment_0 : ( RULE_ID ) ;
    public final void rule__PayloadType__PayloadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6023:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6024:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6024:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6025:1: RULE_ID
            {
             before(grammarAccess.getPayloadTypeAccess().getPayloadIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PayloadType__PayloadAssignment_012025); 
             after(grammarAccess.getPayloadTypeAccess().getPayloadIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__PayloadAssignment_0"


    // $ANTLR start "rule__PayloadType__DataTypeAssignment_1"
    // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6034:1: rule__PayloadType__DataTypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__PayloadType__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6038:1: ( ( RULE_ID ) )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6039:1: ( RULE_ID )
            {
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6039:1: ( RULE_ID )
            // ../scribble.ui/src-gen/org/scribble/ui/contentassist/antlr/internal/InternalScribble.g:6040:1: RULE_ID
            {
             before(grammarAccess.getPayloadTypeAccess().getDataTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PayloadType__DataTypeAssignment_112056); 
             after(grammarAccess.getPayloadTypeAccess().getDataTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PayloadType__DataTypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\15\1\5\10\uffff";
    static final String DFA1_maxS =
        "\1\46\1\35\10\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\10";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\20\uffff\1\7\1\6\2\uffff\1\5\1\4\1\3\1\uffff\1\2",
            "\1\10\27\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "536:1: rule__GlobalInteraction__Alternatives : ( ( ruleMessage ) | ( ruleChoice ) | ( ruleParallel ) | ( ruleRecursion ) | ( ruleContinue ) | ( ruleInterruptible ) | ( ruleDo ) | ( ruleSpawn ) );";
        }
    }
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\1\2\14\uffff";
    static final String DFA4_minS =
        "\1\25\1\26\1\uffff\1\15\1\5\1\uffff\1\6\1\15\1\6\1\27\1\12\1\15"+
        "\1\6";
    static final String DFA4_maxS =
        "\1\25\1\26\1\uffff\1\15\1\10\1\uffff\1\27\1\15\1\7\1\27\1\30\1"+
        "\15\1\7";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\7\uffff";
    static final String DFA4_specialS =
        "\15\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3",
            "",
            "\1\4",
            "\1\6\2\uffff\1\5",
            "",
            "\1\5\20\uffff\1\7",
            "\1\10",
            "\1\12\1\11",
            "\1\13",
            "\1\5\15\uffff\1\2",
            "\1\14",
            "\1\12\1\11"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 679:1: ( rule__ScribbleProgram__GlobalProtocolDeclAssignment_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleScribbleProgram_in_entryRuleScribbleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScribbleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__0_in_ruleScribbleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDecl_in_entryRuleIncludeDecl121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDecl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__0_in_ruleIncludeDecl154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstGlobalProtocolDecl_in_entryRuleInstGlobalProtocolDecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstGlobalProtocolDecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__0_in_ruleInstGlobalProtocolDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0_in_ruleTypeDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalProtocolDecl_in_entryRuleGlobalProtocolDecl301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalProtocolDecl308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__0_in_ruleGlobalProtocolDecl334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_entryRuleGlobalInteractionBlock361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInteractionBlock368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__0_in_ruleGlobalInteractionBlock394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteraction_in_entryRuleGlobalInteraction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalInteraction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInteraction__Alternatives_in_ruleGlobalInteraction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpawn_in_entryRuleSpawn481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpawn488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__0_in_ruleSpawn514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_entryRuleDo541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__0_in_ruleDo574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterruptible_in_entryRuleInterruptible601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterruptible608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__0_in_ruleInterruptible634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinue_in_entryRuleContinue661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContinue668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Continue__Group__0_in_ruleContinue694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecursion_in_entryRuleRecursion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecursion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__Group__0_in_ruleRecursion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_entryRuleParallel781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallel788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group__0_in_ruleParallel814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0_in_ruleMessage934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_entryRuleMessageSignature961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSignature968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__0_in_ruleMessageSignature994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePayloadType_in_entryRulePayloadType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePayloadType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PayloadType__Group__0_in_rulePayloadType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__GlobalInteraction__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__GlobalInteraction__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallel_in_rule__GlobalInteraction__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecursion_in_rule__GlobalInteraction__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContinue_in_rule__GlobalInteraction__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterruptible_in_rule__GlobalInteraction__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_rule__GlobalInteraction__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpawn_in_rule__GlobalInteraction__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__0__Impl_in_rule__ScribbleProgram__Group__01239 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__1_in_rule__ScribbleProgram__Group__01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__IncludeDeclAssignment_0_in_rule__ScribbleProgram__Group__0__Impl1269 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__1__Impl_in_rule__ScribbleProgram__Group__11300 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__2_in_rule__ScribbleProgram__Group__11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__TypeDeclAssignment_1_in_rule__ScribbleProgram__Group__1__Impl1330 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__2__Impl_in_rule__ScribbleProgram__Group__21361 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__3_in_rule__ScribbleProgram__Group__21364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__GlobalProtocolDeclAssignment_2_in_rule__ScribbleProgram__Group__2__Impl1393 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__GlobalProtocolDeclAssignment_2_in_rule__ScribbleProgram__Group__2__Impl1405 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__Group__3__Impl_in_rule__ScribbleProgram__Group__31438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_3_in_rule__ScribbleProgram__Group__3__Impl1465 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__0__Impl_in_rule__IncludeDecl__Group__01504 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__1_in_rule__IncludeDecl__Group__01507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IncludeDecl__Group__0__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__1__Impl_in_rule__IncludeDecl__Group__11566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__2_in_rule__IncludeDecl__Group__11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDecl__ImportURIAssignment_1_in_rule__IncludeDecl__Group__1__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IncludeDecl__Group__2__Impl_in_rule__IncludeDecl__Group__21626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__IncludeDecl__Group__2__Impl1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__0__Impl_in_rule__InstGlobalProtocolDecl__Group__01688 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__1_in_rule__InstGlobalProtocolDecl__Group__01691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__InstGlobalProtocolDecl__Group__0__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__1__Impl_in_rule__InstGlobalProtocolDecl__Group__11750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__2_in_rule__InstGlobalProtocolDecl__Group__11753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__InstGlobalProtocolDecl__Group__1__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__2__Impl_in_rule__InstGlobalProtocolDecl__Group__21812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__3_in_rule__InstGlobalProtocolDecl__Group__21815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__ProtocolNameAssignment_2_in_rule__InstGlobalProtocolDecl__Group__2__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__3__Impl_in_rule__InstGlobalProtocolDecl__Group__31872 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__4_in_rule__InstGlobalProtocolDecl__Group__31875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPA_in_rule__InstGlobalProtocolDecl__Group__3__Impl1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__4__Impl_in_rule__InstGlobalProtocolDecl__Group__41931 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__5_in_rule__InstGlobalProtocolDecl__Group__41934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InstGlobalProtocolDecl__Group__4__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__5__Impl_in_rule__InstGlobalProtocolDecl__Group__51993 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__6_in_rule__InstGlobalProtocolDecl__Group__51996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__RolesAssignment_5_in_rule__InstGlobalProtocolDecl__Group__5__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__6__Impl_in_rule__InstGlobalProtocolDecl__Group__62053 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__7_in_rule__InstGlobalProtocolDecl__Group__62056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__0_in_rule__InstGlobalProtocolDecl__Group__6__Impl2083 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__7__Impl_in_rule__InstGlobalProtocolDecl__Group__72114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__8_in_rule__InstGlobalProtocolDecl__Group__72117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPA_in_rule__InstGlobalProtocolDecl__Group__7__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__8__Impl_in_rule__InstGlobalProtocolDecl__Group__82173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__9_in_rule__InstGlobalProtocolDecl__Group__82176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InstGlobalProtocolDecl__Group__8__Impl2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__9__Impl_in_rule__InstGlobalProtocolDecl__Group__92235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__10_in_rule__InstGlobalProtocolDecl__Group__92238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_9_in_rule__InstGlobalProtocolDecl__Group__9__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group__10__Impl_in_rule__InstGlobalProtocolDecl__Group__102295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__InstGlobalProtocolDecl__Group__10__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__0__Impl_in_rule__InstGlobalProtocolDecl__Group_6__02373 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__1_in_rule__InstGlobalProtocolDecl__Group_6__02376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__InstGlobalProtocolDecl__Group_6__0__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__1__Impl_in_rule__InstGlobalProtocolDecl__Group_6__12432 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__2_in_rule__InstGlobalProtocolDecl__Group_6__12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InstGlobalProtocolDecl__Group_6__1__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__Group_6__2__Impl_in_rule__InstGlobalProtocolDecl__Group_6__22494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstGlobalProtocolDecl__RolesAssignment_6_2_in_rule__InstGlobalProtocolDecl__Group_6__2__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__0__Impl_in_rule__TypeDecl__Group__02557 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1_in_rule__TypeDecl__Group__02560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TypeDecl__Group__0__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__1__Impl_in_rule__TypeDecl__Group__12619 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2_in_rule__TypeDecl__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__TypeNameAssignment_1_in_rule__TypeDecl__Group__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__2__Impl_in_rule__TypeDecl__Group__22679 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3_in_rule__TypeDecl__Group__22682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TypeDecl__Group__2__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__3__Impl_in_rule__TypeDecl__Group__32741 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4_in_rule__TypeDecl__Group__32744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__TypeDecl__Group__3__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__4__Impl_in_rule__TypeDecl__Group__42800 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__5_in_rule__TypeDecl__Group__42803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__SchemaAssignment_4_in_rule__TypeDecl__Group__4__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__5__Impl_in_rule__TypeDecl__Group__52860 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__6_in_rule__TypeDecl__Group__52863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__TypeDecl__Group__5__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__6__Impl_in_rule__TypeDecl__Group__62919 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__7_in_rule__TypeDecl__Group__62922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__FileAssignment_6_in_rule__TypeDecl__Group__6__Impl2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__7__Impl_in_rule__TypeDecl__Group__72979 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__8_in_rule__TypeDecl__Group__72982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_7__0_in_rule__TypeDecl__Group__7__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group__8__Impl_in_rule__TypeDecl__Group__83040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__TypeDecl__Group__8__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_7__0__Impl_in_rule__TypeDecl__Group_7__03114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_7__1_in_rule__TypeDecl__Group_7__03117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TypeDecl__Group_7__0__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__Group_7__1__Impl_in_rule__TypeDecl__Group_7__13176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeDecl__AliasAssignment_7_1_in_rule__TypeDecl__Group_7__1__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__0__Impl_in_rule__GlobalProtocolDecl__Group__03237 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__1_in_rule__GlobalProtocolDecl__Group__03240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__GlobalProtocolDecl__Group__0__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__1__Impl_in_rule__GlobalProtocolDecl__Group__13299 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__2_in_rule__GlobalProtocolDecl__Group__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__GlobalProtocolDecl__Group__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__2__Impl_in_rule__GlobalProtocolDecl__Group__23361 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__3_in_rule__GlobalProtocolDecl__Group__23364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__ProtocolNameAssignment_2_in_rule__GlobalProtocolDecl__Group__2__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__3__Impl_in_rule__GlobalProtocolDecl__Group__33421 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__4_in_rule__GlobalProtocolDecl__Group__33424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__0_in_rule__GlobalProtocolDecl__Group__3__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__4__Impl_in_rule__GlobalProtocolDecl__Group__43482 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__5_in_rule__GlobalProtocolDecl__Group__43485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPA_in_rule__GlobalProtocolDecl__Group__4__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__5__Impl_in_rule__GlobalProtocolDecl__Group__53541 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__6_in_rule__GlobalProtocolDecl__Group__53544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__0_in_rule__GlobalProtocolDecl__Group__5__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__6__Impl_in_rule__GlobalProtocolDecl__Group__63602 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__7_in_rule__GlobalProtocolDecl__Group__63605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPA_in_rule__GlobalProtocolDecl__Group__6__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group__7__Impl_in_rule__GlobalProtocolDecl__Group__73661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__BodyAssignment_7_in_rule__GlobalProtocolDecl__Group__7__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__0__Impl_in_rule__GlobalProtocolDecl__Group_3__03734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__1_in_rule__GlobalProtocolDecl__Group_3__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__GlobalProtocolDecl__Group_3__0__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__1__Impl_in_rule__GlobalProtocolDecl__Group_3__13793 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__2_in_rule__GlobalProtocolDecl__Group_3__13796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GlobalProtocolDecl__Group_3__1__Impl3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__2__Impl_in_rule__GlobalProtocolDecl__Group_3__23855 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__3_in_rule__GlobalProtocolDecl__Group_3__23858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__ParametersAssignment_3_2_in_rule__GlobalProtocolDecl__Group_3__2__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__3__Impl_in_rule__GlobalProtocolDecl__Group_3__33915 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__4_in_rule__GlobalProtocolDecl__Group_3__33918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__0_in_rule__GlobalProtocolDecl__Group_3__3__Impl3945 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3__4__Impl_in_rule__GlobalProtocolDecl__Group_3__43976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__GlobalProtocolDecl__Group_3__4__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__0__Impl_in_rule__GlobalProtocolDecl__Group_3_3__04042 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__1_in_rule__GlobalProtocolDecl__Group_3_3__04045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__GlobalProtocolDecl__Group_3_3__0__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__1__Impl_in_rule__GlobalProtocolDecl__Group_3_3__14101 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__2_in_rule__GlobalProtocolDecl__Group_3_3__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__GlobalProtocolDecl__Group_3_3__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_3_3__2__Impl_in_rule__GlobalProtocolDecl__Group_3_3__24163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__ParametersAssignment_3_3_2_in_rule__GlobalProtocolDecl__Group_3_3__2__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__0__Impl_in_rule__GlobalProtocolDecl__Group_5__04226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__1_in_rule__GlobalProtocolDecl__Group_5__04229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GlobalProtocolDecl__Group_5__0__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__1__Impl_in_rule__GlobalProtocolDecl__Group_5__14288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__2_in_rule__GlobalProtocolDecl__Group_5__14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__RolesAssignment_5_1_in_rule__GlobalProtocolDecl__Group_5__1__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5__2__Impl_in_rule__GlobalProtocolDecl__Group_5__24348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__0_in_rule__GlobalProtocolDecl__Group_5__2__Impl4375 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__0__Impl_in_rule__GlobalProtocolDecl__Group_5_2__04412 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__1_in_rule__GlobalProtocolDecl__Group_5_2__04415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__GlobalProtocolDecl__Group_5_2__0__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__1__Impl_in_rule__GlobalProtocolDecl__Group_5_2__14471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__2_in_rule__GlobalProtocolDecl__Group_5_2__14474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__GlobalProtocolDecl__Group_5_2__1__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__Group_5_2__2__Impl_in_rule__GlobalProtocolDecl__Group_5_2__24533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalProtocolDecl__RolesAssignment_5_2_2_in_rule__GlobalProtocolDecl__Group_5_2__2__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__0__Impl_in_rule__GlobalInteractionBlock__Group__04596 = new BitSet(new long[]{0x0000005CC0002000L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__1_in_rule__GlobalInteractionBlock__Group__04599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCB_in_rule__GlobalInteractionBlock__Group__0__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__1__Impl_in_rule__GlobalInteractionBlock__Group__14655 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__2_in_rule__GlobalInteractionBlock__Group__14658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__InteractionsequenceAssignment_1_in_rule__GlobalInteractionBlock__Group__1__Impl4687 = new BitSet(new long[]{0x0000005CC0002002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__InteractionsequenceAssignment_1_in_rule__GlobalInteractionBlock__Group__1__Impl4699 = new BitSet(new long[]{0x0000005CC0002002L});
    public static final BitSet FOLLOW_rule__GlobalInteractionBlock__Group__2__Impl_in_rule__GlobalInteractionBlock__Group__24732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RCB_in_rule__GlobalInteractionBlock__Group__2__Impl4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__0__Impl_in_rule__Spawn__Group__04794 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Spawn__Group__1_in_rule__Spawn__Group__04797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__RoleNameAssignment_0_in_rule__Spawn__Group__0__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__1__Impl_in_rule__Spawn__Group__14854 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group__2_in_rule__Spawn__Group__14857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Spawn__Group__1__Impl4885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__2__Impl_in_rule__Spawn__Group__24916 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__Spawn__Group__3_in_rule__Spawn__Group__24919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__TargetProtocolNameAssignment_2_in_rule__Spawn__Group__2__Impl4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__3__Impl_in_rule__Spawn__Group__34976 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__Spawn__Group__4_in_rule__Spawn__Group__34979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__0_in_rule__Spawn__Group__3__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__4__Impl_in_rule__Spawn__Group__45037 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group__5_in_rule__Spawn__Group__45040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPA_in_rule__Spawn__Group__4__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__5__Impl_in_rule__Spawn__Group__55096 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Spawn__Group__6_in_rule__Spawn__Group__55099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__CurrentRolesAssignment_5_in_rule__Spawn__Group__5__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__6__Impl_in_rule__Spawn__Group__65156 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group__7_in_rule__Spawn__Group__65159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Spawn__Group__6__Impl5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__7__Impl_in_rule__Spawn__Group__75218 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Spawn__Group__8_in_rule__Spawn__Group__75221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__TargetRolesAssignment_7_in_rule__Spawn__Group__7__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__8__Impl_in_rule__Spawn__Group__85278 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Spawn__Group__9_in_rule__Spawn__Group__85281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__0_in_rule__Spawn__Group__8__Impl5308 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Spawn__Group__9__Impl_in_rule__Spawn__Group__95339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Spawn__Group__10_in_rule__Spawn__Group__95342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPA_in_rule__Spawn__Group__9__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group__10__Impl_in_rule__Spawn__Group__105398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__Spawn__Group__10__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__0__Impl_in_rule__Spawn__Group_3__05476 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__1_in_rule__Spawn__Group_3__05479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__Spawn__Group_3__0__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__1__Impl_in_rule__Spawn__Group_3__15535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__2_in_rule__Spawn__Group_3__15538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Spawn__Group_3__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__2__Impl_in_rule__Spawn__Group_3__25597 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__3_in_rule__Spawn__Group_3__25600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__ParametersAssignment_3_2_in_rule__Spawn__Group_3__2__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__3__Impl_in_rule__Spawn__Group_3__35657 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__4_in_rule__Spawn__Group_3__35660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__0_in_rule__Spawn__Group_3__3__Impl5687 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3__4__Impl_in_rule__Spawn__Group_3__45718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__Spawn__Group_3__4__Impl5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__0__Impl_in_rule__Spawn__Group_3_3__05784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__1_in_rule__Spawn__Group_3_3__05787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Spawn__Group_3_3__0__Impl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__1__Impl_in_rule__Spawn__Group_3_3__15843 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__2_in_rule__Spawn__Group_3_3__15846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Spawn__Group_3_3__1__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_3_3__2__Impl_in_rule__Spawn__Group_3_3__25905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__ParametersAssignment_3_3_2_in_rule__Spawn__Group_3_3__2__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__0__Impl_in_rule__Spawn__Group_8__05968 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__1_in_rule__Spawn__Group_8__05971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Spawn__Group_8__0__Impl5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__1__Impl_in_rule__Spawn__Group_8__16027 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__2_in_rule__Spawn__Group_8__16030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__CurrentRolesAssignment_8_1_in_rule__Spawn__Group_8__1__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__2__Impl_in_rule__Spawn__Group_8__26087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__3_in_rule__Spawn__Group_8__26090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Spawn__Group_8__2__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__Group_8__3__Impl_in_rule__Spawn__Group_8__36149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spawn__TargetRolesAssignment_8_3_in_rule__Spawn__Group_8__3__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__0__Impl_in_rule__Do__Group__06214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group__1_in_rule__Do__Group__06217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Do__Group__0__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__1__Impl_in_rule__Do__Group__16276 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__Do__Group__2_in_rule__Do__Group__16279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__TargetProtocolNameAssignment_1_in_rule__Do__Group__1__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__2__Impl_in_rule__Do__Group__26336 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_rule__Do__Group__3_in_rule__Do__Group__26339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2__0_in_rule__Do__Group__2__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__3__Impl_in_rule__Do__Group__36397 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group__4_in_rule__Do__Group__36400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPA_in_rule__Do__Group__3__Impl6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__4__Impl_in_rule__Do__Group__46456 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Do__Group__5_in_rule__Do__Group__46459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__CurrentRolesAssignment_4_in_rule__Do__Group__4__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__5__Impl_in_rule__Do__Group__56516 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group__6_in_rule__Do__Group__56519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Do__Group__5__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__6__Impl_in_rule__Do__Group__66578 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Do__Group__7_in_rule__Do__Group__66581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__TargetRolesAssignment_6_in_rule__Do__Group__6__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__7__Impl_in_rule__Do__Group__76638 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_rule__Do__Group__8_in_rule__Do__Group__76641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_7__0_in_rule__Do__Group__7__Impl6668 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Do__Group__8__Impl_in_rule__Do__Group__86699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Do__Group__9_in_rule__Do__Group__86702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPA_in_rule__Do__Group__8__Impl6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group__9__Impl_in_rule__Do__Group__96758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__Do__Group__9__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2__0__Impl_in_rule__Do__Group_2__06834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group_2__1_in_rule__Do__Group_2__06837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__Do__Group_2__0__Impl6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2__1__Impl_in_rule__Do__Group_2__16893 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Do__Group_2__2_in_rule__Do__Group_2__16896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__ArgumentsAssignment_2_1_in_rule__Do__Group_2__1__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2__2__Impl_in_rule__Do__Group_2__26953 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__Do__Group_2__3_in_rule__Do__Group_2__26956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2_2__0_in_rule__Do__Group_2__2__Impl6983 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Do__Group_2__3__Impl_in_rule__Do__Group_2__37014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__Do__Group_2__3__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2_2__0__Impl_in_rule__Do__Group_2_2__07078 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group_2_2__1_in_rule__Do__Group_2_2__07081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Do__Group_2_2__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_2_2__1__Impl_in_rule__Do__Group_2_2__17137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__ArgumentsAssignment_2_2_1_in_rule__Do__Group_2_2__1__Impl7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_7__0__Impl_in_rule__Do__Group_7__07198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group_7__1_in_rule__Do__Group_7__07201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Do__Group_7__0__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_7__1__Impl_in_rule__Do__Group_7__17257 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Do__Group_7__2_in_rule__Do__Group_7__17260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__CurrentRolesAssignment_7_1_in_rule__Do__Group_7__1__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_7__2__Impl_in_rule__Do__Group_7__27317 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Do__Group_7__3_in_rule__Do__Group_7__27320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Do__Group_7__2__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__Group_7__3__Impl_in_rule__Do__Group_7__37379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Do__TargetRolesAssignment_7_3_in_rule__Do__Group_7__3__Impl7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__0__Impl_in_rule__Interruptible__Group__07444 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__1_in_rule__Interruptible__Group__07447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Interruptible__Group__0__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__1__Impl_in_rule__Interruptible__Group__17506 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__2_in_rule__Interruptible__Group__17509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__BodyAssignment_1_in_rule__Interruptible__Group__1__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__2__Impl_in_rule__Interruptible__Group__27566 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__3_in_rule__Interruptible__Group__27569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Interruptible__Group__2__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__3__Impl_in_rule__Interruptible__Group__37628 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__4_in_rule__Interruptible__Group__37631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__RoleNamesAssignment_3_in_rule__Interruptible__Group__3__Impl7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__4__Impl_in_rule__Interruptible__Group__47688 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__5_in_rule__Interruptible__Group__47691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Interruptible__Group__4__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__5__Impl_in_rule__Interruptible__Group__57750 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__6_in_rule__Interruptible__Group__57753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__SignaturesAssignment_5_in_rule__Interruptible__Group__5__Impl7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__6__Impl_in_rule__Interruptible__Group__67810 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__7_in_rule__Interruptible__Group__67813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__0_in_rule__Interruptible__Group__6__Impl7840 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Interruptible__Group__7__Impl_in_rule__Interruptible__Group__77871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__Interruptible__Group__7__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__0__Impl_in_rule__Interruptible__Group_6__07943 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__1_in_rule__Interruptible__Group_6__07946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Interruptible__Group_6__0__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__1__Impl_in_rule__Interruptible__Group_6__18002 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__2_in_rule__Interruptible__Group_6__18005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Interruptible__Group_6__1__Impl8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__2__Impl_in_rule__Interruptible__Group_6__28064 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__3_in_rule__Interruptible__Group_6__28067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__RoleNamesAssignment_6_2_in_rule__Interruptible__Group_6__2__Impl8094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__3__Impl_in_rule__Interruptible__Group_6__38124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__4_in_rule__Interruptible__Group_6__38127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Interruptible__Group_6__3__Impl8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__Group_6__4__Impl_in_rule__Interruptible__Group_6__48186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interruptible__SignaturesAssignment_6_4_in_rule__Interruptible__Group_6__4__Impl8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Continue__Group__0__Impl_in_rule__Continue__Group__08253 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Continue__Group__1_in_rule__Continue__Group__08256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Continue__Group__0__Impl8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Continue__Group__1__Impl_in_rule__Continue__Group__18315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Continue__Group__2_in_rule__Continue__Group__18318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Continue__LoopNameAssignment_1_in_rule__Continue__Group__1__Impl8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Continue__Group__2__Impl_in_rule__Continue__Group__28375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__Continue__Group__2__Impl8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__Group__0__Impl_in_rule__Recursion__Group__08437 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Recursion__Group__1_in_rule__Recursion__Group__08440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Recursion__Group__0__Impl8468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__Group__1__Impl_in_rule__Recursion__Group__18499 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Recursion__Group__2_in_rule__Recursion__Group__18502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__LoopNameAssignment_1_in_rule__Recursion__Group__1__Impl8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__Group__2__Impl_in_rule__Recursion__Group__28559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recursion__BodyAssignment_2_in_rule__Recursion__Group__2__Impl8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group__0__Impl_in_rule__Parallel__Group__08622 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Parallel__Group__1_in_rule__Parallel__Group__08625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Parallel__Group__0__Impl8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group__1__Impl_in_rule__Parallel__Group__18684 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Parallel__Group__2_in_rule__Parallel__Group__18687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__BranchesAssignment_1_in_rule__Parallel__Group__1__Impl8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group__2__Impl_in_rule__Parallel__Group__28744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group_2__0_in_rule__Parallel__Group__2__Impl8771 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group_2__0__Impl_in_rule__Parallel__Group_2__08808 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Parallel__Group_2__1_in_rule__Parallel__Group_2__08811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Parallel__Group_2__0__Impl8839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__Group_2__1__Impl_in_rule__Parallel__Group_2__18870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parallel__BranchesAssignment_2_1_in_rule__Parallel__Group_2__1__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__08931 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__08934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Choice__Group__0__Impl8962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__18993 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__18996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Choice__Group__1__Impl9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__29055 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__29058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__RoleAssignment_2_in_rule__Choice__Group__2__Impl9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__39115 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__39118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__BranchesAssignment_3_in_rule__Choice__Group__3__Impl9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__49175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_4__0_in_rule__Choice__Group__4__Impl9202 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_4__0__Impl_in_rule__Choice__Group_4__09243 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Choice__Group_4__1_in_rule__Choice__Group_4__09246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Choice__Group_4__0__Impl9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group_4__1__Impl_in_rule__Choice__Group_4__19305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__BranchesAssignment_4_1_in_rule__Choice__Group_4__1__Impl9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__0__Impl_in_rule__Message__Group__09366 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Message__Group__1_in_rule__Message__Group__09369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__SignatureAssignment_0_in_rule__Message__Group__0__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__1__Impl_in_rule__Message__Group__19426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Message__Group__2_in_rule__Message__Group__19429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Message__Group__1__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__2__Impl_in_rule__Message__Group__29488 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Message__Group__3_in_rule__Message__Group__29491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__SenderAssignment_2_in_rule__Message__Group__2__Impl9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__3__Impl_in_rule__Message__Group__39548 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Message__Group__4_in_rule__Message__Group__39551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Message__Group__3__Impl9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__4__Impl_in_rule__Message__Group__49610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Message__Group__5_in_rule__Message__Group__49613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__ReceiverAssignment_4_in_rule__Message__Group__4__Impl9640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Group__5__Impl_in_rule__Message__Group__59670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SEMI_in_rule__Message__Group__5__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__0__Impl_in_rule__MessageSignature__Group__09738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__1_in_rule__MessageSignature__Group__09741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__OperatorAssignment_0_in_rule__MessageSignature__Group__0__Impl9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__1__Impl_in_rule__MessageSignature__Group__19798 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__2_in_rule__MessageSignature__Group__19801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPA_in_rule__MessageSignature__Group__1__Impl9828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__2__Impl_in_rule__MessageSignature__Group__29857 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__3_in_rule__MessageSignature__Group__29860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2__0_in_rule__MessageSignature__Group__2__Impl9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group__3__Impl_in_rule__MessageSignature__Group__39918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPA_in_rule__MessageSignature__Group__3__Impl9945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2__0__Impl_in_rule__MessageSignature__Group_2__09982 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2__1_in_rule__MessageSignature__Group_2__09985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__PayloadTypesAssignment_2_0_in_rule__MessageSignature__Group_2__0__Impl10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2__1__Impl_in_rule__MessageSignature__Group_2__110042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2_1__0_in_rule__MessageSignature__Group_2__1__Impl10069 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2_1__0__Impl_in_rule__MessageSignature__Group_2_1__010104 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2_1__1_in_rule__MessageSignature__Group_2_1__010107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__MessageSignature__Group_2_1__0__Impl10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__Group_2_1__1__Impl_in_rule__MessageSignature__Group_2_1__110163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSignature__PayloadTypesAssignment_2_1_1_in_rule__MessageSignature__Group_2_1__1__Impl10190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PayloadType__Group__0__Impl_in_rule__PayloadType__Group__010224 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PayloadType__Group__1_in_rule__PayloadType__Group__010227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PayloadType__PayloadAssignment_0_in_rule__PayloadType__Group__0__Impl10254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PayloadType__Group__1__Impl_in_rule__PayloadType__Group__110284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PayloadType__DataTypeAssignment_1_in_rule__PayloadType__Group__1__Impl10311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludeDecl_in_rule__ScribbleProgram__IncludeDeclAssignment_010351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_rule__ScribbleProgram__TypeDeclAssignment_110382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalProtocolDecl_in_rule__ScribbleProgram__GlobalProtocolDeclAssignment_210413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstGlobalProtocolDecl_in_rule__ScribbleProgram__InstGlobalProtocolDeclAssignment_310444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IncludeDecl__ImportURIAssignment_110475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__ProtocolNameAssignment_210506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__RolesAssignment_510537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__RolesAssignment_6_210568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InstGlobalProtocolDecl__InstantiatedProtocolAssignment_910599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__TypeNameAssignment_110630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__SchemaAssignment_410661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__FileAssignment_610692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeDecl__AliasAssignment_7_110723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ProtocolNameAssignment_210754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ParametersAssignment_3_210785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__ParametersAssignment_3_3_210816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__RolesAssignment_5_110847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GlobalProtocolDecl__RolesAssignment_5_2_210878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__GlobalProtocolDecl__BodyAssignment_710909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteraction_in_rule__GlobalInteractionBlock__InteractionsequenceAssignment_110940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__RoleNameAssignment_010971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__TargetProtocolNameAssignment_211002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__ParametersAssignment_3_211033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__ParametersAssignment_3_3_211064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__CurrentRolesAssignment_511095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__TargetRolesAssignment_711126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__CurrentRolesAssignment_8_111157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Spawn__TargetRolesAssignment_8_311188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Do__TargetProtocolNameAssignment_111219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_rule__Do__ArgumentsAssignment_2_111250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_rule__Do__ArgumentsAssignment_2_2_111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Do__CurrentRolesAssignment_411312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Do__TargetRolesAssignment_611343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Do__CurrentRolesAssignment_7_111374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Do__TargetRolesAssignment_7_311405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Interruptible__BodyAssignment_111436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interruptible__RoleNamesAssignment_311467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_rule__Interruptible__SignaturesAssignment_511498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interruptible__RoleNamesAssignment_6_211529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_rule__Interruptible__SignaturesAssignment_6_411560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Continue__LoopNameAssignment_111591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recursion__LoopNameAssignment_111622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Recursion__BodyAssignment_211653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Parallel__BranchesAssignment_111684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Parallel__BranchesAssignment_2_111715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__RoleAssignment_211746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Choice__BranchesAssignment_311777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalInteractionBlock_in_rule__Choice__BranchesAssignment_4_111808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSignature_in_rule__Message__SignatureAssignment_011839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__SenderAssignment_211870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Message__ReceiverAssignment_411901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MessageSignature__OperatorAssignment_011932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePayloadType_in_rule__MessageSignature__PayloadTypesAssignment_2_011963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePayloadType_in_rule__MessageSignature__PayloadTypesAssignment_2_1_111994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PayloadType__PayloadAssignment_012025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PayloadType__DataTypeAssignment_112056 = new BitSet(new long[]{0x0000000000000002L});

}