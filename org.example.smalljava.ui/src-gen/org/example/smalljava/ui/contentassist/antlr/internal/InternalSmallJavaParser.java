package org.example.smalljava.ui.contentassist.antlr.internal; 

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
import org.example.smalljava.services.SmallJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmallJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'private'", "'public'", "'protected'", "'package'", "';'", "'import'", "'.*'", "'.'", "'class'", "'{'", "'}'", "'extends'", "'('", "')'", "','", "'return'", "'='", "'if'", "'else'", "'this'", "'super'", "'null'", "'new'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSmallJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g"; }


     
     	private SmallJavaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SmallJavaGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSJProgram"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:61:1: entryRuleSJProgram : ruleSJProgram EOF ;
    public final void entryRuleSJProgram() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:62:1: ( ruleSJProgram EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:63:1: ruleSJProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramRule()); 
            }
            pushFollow(FOLLOW_ruleSJProgram_in_entryRuleSJProgram67);
            ruleSJProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJProgram74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJProgram"


    // $ANTLR start "ruleSJProgram"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:70:1: ruleSJProgram : ( ( rule__SJProgram__Group__0 ) ) ;
    public final void ruleSJProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:74:2: ( ( ( rule__SJProgram__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:75:1: ( ( rule__SJProgram__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:75:1: ( ( rule__SJProgram__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:76:1: ( rule__SJProgram__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:77:1: ( rule__SJProgram__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:77:2: rule__SJProgram__Group__0
            {
            pushFollow(FOLLOW_rule__SJProgram__Group__0_in_ruleSJProgram100);
            rule__SJProgram__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getGroup()); 
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
    // $ANTLR end "ruleSJProgram"


    // $ANTLR start "entryRuleSJImport"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:89:1: entryRuleSJImport : ruleSJImport EOF ;
    public final void entryRuleSJImport() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:90:1: ( ruleSJImport EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:91:1: ruleSJImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportRule()); 
            }
            pushFollow(FOLLOW_ruleSJImport_in_entryRuleSJImport127);
            ruleSJImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJImport"


    // $ANTLR start "ruleSJImport"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:98:1: ruleSJImport : ( ( rule__SJImport__Group__0 ) ) ;
    public final void ruleSJImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:102:2: ( ( ( rule__SJImport__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:103:1: ( ( rule__SJImport__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:103:1: ( ( rule__SJImport__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:104:1: ( rule__SJImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:105:1: ( rule__SJImport__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:105:2: rule__SJImport__Group__0
            {
            pushFollow(FOLLOW_rule__SJImport__Group__0_in_ruleSJImport160);
            rule__SJImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportAccess().getGroup()); 
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
    // $ANTLR end "ruleSJImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:117:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:118:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:119:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard187);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:126:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:130:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:131:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:131:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:132:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:133:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:133:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard220);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:146:1: ( ruleQualifiedName EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSJClass"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:173:1: entryRuleSJClass : ruleSJClass EOF ;
    public final void entryRuleSJClass() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:174:1: ( ruleSJClass EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:175:1: ruleSJClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassRule()); 
            }
            pushFollow(FOLLOW_ruleSJClass_in_entryRuleSJClass307);
            ruleSJClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJClass314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJClass"


    // $ANTLR start "ruleSJClass"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:182:1: ruleSJClass : ( ( rule__SJClass__Group__0 ) ) ;
    public final void ruleSJClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:186:2: ( ( ( rule__SJClass__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:187:1: ( ( rule__SJClass__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:187:1: ( ( rule__SJClass__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:188:1: ( rule__SJClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:189:1: ( rule__SJClass__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:189:2: rule__SJClass__Group__0
            {
            pushFollow(FOLLOW_rule__SJClass__Group__0_in_ruleSJClass340);
            rule__SJClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getGroup()); 
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
    // $ANTLR end "ruleSJClass"


    // $ANTLR start "entryRuleSJMember"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:201:1: entryRuleSJMember : ruleSJMember EOF ;
    public final void entryRuleSJMember() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:202:1: ( ruleSJMember EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:203:1: ruleSJMember EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMemberRule()); 
            }
            pushFollow(FOLLOW_ruleSJMember_in_entryRuleSJMember367);
            ruleSJMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMemberRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMember374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJMember"


    // $ANTLR start "ruleSJMember"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:210:1: ruleSJMember : ( ( rule__SJMember__Alternatives ) ) ;
    public final void ruleSJMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:214:2: ( ( ( rule__SJMember__Alternatives ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:215:1: ( ( rule__SJMember__Alternatives ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:215:1: ( ( rule__SJMember__Alternatives ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:216:1: ( rule__SJMember__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMemberAccess().getAlternatives()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:217:1: ( rule__SJMember__Alternatives )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:217:2: rule__SJMember__Alternatives
            {
            pushFollow(FOLLOW_rule__SJMember__Alternatives_in_ruleSJMember400);
            rule__SJMember__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMemberAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSJMember"


    // $ANTLR start "entryRuleSJField"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:229:1: entryRuleSJField : ruleSJField EOF ;
    public final void entryRuleSJField() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:230:1: ( ruleSJField EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:231:1: ruleSJField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldRule()); 
            }
            pushFollow(FOLLOW_ruleSJField_in_entryRuleSJField427);
            ruleSJField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJField434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJField"


    // $ANTLR start "ruleSJField"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:238:1: ruleSJField : ( ( rule__SJField__Group__0 ) ) ;
    public final void ruleSJField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:242:2: ( ( ( rule__SJField__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:243:1: ( ( rule__SJField__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:243:1: ( ( rule__SJField__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:244:1: ( rule__SJField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:245:1: ( rule__SJField__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:245:2: rule__SJField__Group__0
            {
            pushFollow(FOLLOW_rule__SJField__Group__0_in_ruleSJField460);
            rule__SJField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleSJField"


    // $ANTLR start "entryRuleSJMethod"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:257:1: entryRuleSJMethod : ruleSJMethod EOF ;
    public final void entryRuleSJMethod() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:258:1: ( ruleSJMethod EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:259:1: ruleSJMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodRule()); 
            }
            pushFollow(FOLLOW_ruleSJMethod_in_entryRuleSJMethod487);
            ruleSJMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMethod494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJMethod"


    // $ANTLR start "ruleSJMethod"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:266:1: ruleSJMethod : ( ( rule__SJMethod__Group__0 ) ) ;
    public final void ruleSJMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:270:2: ( ( ( rule__SJMethod__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:271:1: ( ( rule__SJMethod__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:271:1: ( ( rule__SJMethod__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:272:1: ( rule__SJMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:273:1: ( rule__SJMethod__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:273:2: rule__SJMethod__Group__0
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__0_in_ruleSJMethod520);
            rule__SJMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup()); 
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
    // $ANTLR end "ruleSJMethod"


    // $ANTLR start "entryRuleSJParameter"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:285:1: entryRuleSJParameter : ruleSJParameter EOF ;
    public final void entryRuleSJParameter() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:286:1: ( ruleSJParameter EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:287:1: ruleSJParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterRule()); 
            }
            pushFollow(FOLLOW_ruleSJParameter_in_entryRuleSJParameter547);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJParameter554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJParameter"


    // $ANTLR start "ruleSJParameter"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:294:1: ruleSJParameter : ( ( rule__SJParameter__Group__0 ) ) ;
    public final void ruleSJParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:298:2: ( ( ( rule__SJParameter__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:299:1: ( ( rule__SJParameter__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:299:1: ( ( rule__SJParameter__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:300:1: ( rule__SJParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:301:1: ( rule__SJParameter__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:301:2: rule__SJParameter__Group__0
            {
            pushFollow(FOLLOW_rule__SJParameter__Group__0_in_ruleSJParameter580);
            rule__SJParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleSJParameter"


    // $ANTLR start "entryRuleSJMethodBody"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:313:1: entryRuleSJMethodBody : ruleSJMethodBody EOF ;
    public final void entryRuleSJMethodBody() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:314:1: ( ruleSJMethodBody EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:315:1: ruleSJMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSJMethodBody_in_entryRuleSJMethodBody607);
            ruleSJMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMethodBody614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJMethodBody"


    // $ANTLR start "ruleSJMethodBody"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:322:1: ruleSJMethodBody : ( ( rule__SJMethodBody__Group__0 ) ) ;
    public final void ruleSJMethodBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:326:2: ( ( ( rule__SJMethodBody__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:327:1: ( ( rule__SJMethodBody__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:327:1: ( ( rule__SJMethodBody__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:328:1: ( rule__SJMethodBody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:329:1: ( rule__SJMethodBody__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:329:2: rule__SJMethodBody__Group__0
            {
            pushFollow(FOLLOW_rule__SJMethodBody__Group__0_in_ruleSJMethodBody640);
            rule__SJMethodBody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getGroup()); 
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
    // $ANTLR end "ruleSJMethodBody"


    // $ANTLR start "entryRuleSJStatement"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:341:1: entryRuleSJStatement : ruleSJStatement EOF ;
    public final void entryRuleSJStatement() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:342:1: ( ruleSJStatement EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:343:1: ruleSJStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSJStatement_in_entryRuleSJStatement667);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJStatement674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJStatement"


    // $ANTLR start "ruleSJStatement"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:350:1: ruleSJStatement : ( ( rule__SJStatement__Alternatives ) ) ;
    public final void ruleSJStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:354:2: ( ( ( rule__SJStatement__Alternatives ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:355:1: ( ( rule__SJStatement__Alternatives ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:355:1: ( ( rule__SJStatement__Alternatives ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:356:1: ( rule__SJStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getAlternatives()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:357:1: ( rule__SJStatement__Alternatives )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:357:2: rule__SJStatement__Alternatives
            {
            pushFollow(FOLLOW_rule__SJStatement__Alternatives_in_ruleSJStatement700);
            rule__SJStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSJStatement"


    // $ANTLR start "entryRuleSJReturn"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:369:1: entryRuleSJReturn : ruleSJReturn EOF ;
    public final void entryRuleSJReturn() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:370:1: ( ruleSJReturn EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:371:1: ruleSJReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnRule()); 
            }
            pushFollow(FOLLOW_ruleSJReturn_in_entryRuleSJReturn727);
            ruleSJReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJReturn734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJReturn"


    // $ANTLR start "ruleSJReturn"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:378:1: ruleSJReturn : ( ( rule__SJReturn__Group__0 ) ) ;
    public final void ruleSJReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:382:2: ( ( ( rule__SJReturn__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:383:1: ( ( rule__SJReturn__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:383:1: ( ( rule__SJReturn__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:384:1: ( rule__SJReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:385:1: ( rule__SJReturn__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:385:2: rule__SJReturn__Group__0
            {
            pushFollow(FOLLOW_rule__SJReturn__Group__0_in_ruleSJReturn760);
            rule__SJReturn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getGroup()); 
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
    // $ANTLR end "ruleSJReturn"


    // $ANTLR start "entryRuleSJVariableDeclaration"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:397:1: entryRuleSJVariableDeclaration : ruleSJVariableDeclaration EOF ;
    public final void entryRuleSJVariableDeclaration() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:398:1: ( ruleSJVariableDeclaration EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:399:1: ruleSJVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSJVariableDeclaration_in_entryRuleSJVariableDeclaration787);
            ruleSJVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJVariableDeclaration794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJVariableDeclaration"


    // $ANTLR start "ruleSJVariableDeclaration"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:406:1: ruleSJVariableDeclaration : ( ( rule__SJVariableDeclaration__Group__0 ) ) ;
    public final void ruleSJVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:410:2: ( ( ( rule__SJVariableDeclaration__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:411:1: ( ( rule__SJVariableDeclaration__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:411:1: ( ( rule__SJVariableDeclaration__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:412:1: ( rule__SJVariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:413:1: ( rule__SJVariableDeclaration__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:413:2: rule__SJVariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__0_in_ruleSJVariableDeclaration820);
            rule__SJVariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleSJVariableDeclaration"


    // $ANTLR start "entryRuleSJIfStatement"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:425:1: entryRuleSJIfStatement : ruleSJIfStatement EOF ;
    public final void entryRuleSJIfStatement() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:426:1: ( ruleSJIfStatement EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:427:1: ruleSJIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSJIfStatement_in_entryRuleSJIfStatement847);
            ruleSJIfStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJIfStatement854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJIfStatement"


    // $ANTLR start "ruleSJIfStatement"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:434:1: ruleSJIfStatement : ( ( rule__SJIfStatement__Group__0 ) ) ;
    public final void ruleSJIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:438:2: ( ( ( rule__SJIfStatement__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:439:1: ( ( rule__SJIfStatement__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:439:1: ( ( rule__SJIfStatement__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:440:1: ( rule__SJIfStatement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:441:1: ( rule__SJIfStatement__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:441:2: rule__SJIfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__0_in_ruleSJIfStatement880);
            rule__SJIfStatement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getGroup()); 
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
    // $ANTLR end "ruleSJIfStatement"


    // $ANTLR start "entryRuleSJIfBlock"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:453:1: entryRuleSJIfBlock : ruleSJIfBlock EOF ;
    public final void entryRuleSJIfBlock() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:454:1: ( ruleSJIfBlock EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:455:1: ruleSJIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSJIfBlock_in_entryRuleSJIfBlock907);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJIfBlock914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJIfBlock"


    // $ANTLR start "ruleSJIfBlock"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:462:1: ruleSJIfBlock : ( ( rule__SJIfBlock__Alternatives ) ) ;
    public final void ruleSJIfBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:466:2: ( ( ( rule__SJIfBlock__Alternatives ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:467:1: ( ( rule__SJIfBlock__Alternatives ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:467:1: ( ( rule__SJIfBlock__Alternatives ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:468:1: ( rule__SJIfBlock__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getAlternatives()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:469:1: ( rule__SJIfBlock__Alternatives )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:469:2: rule__SJIfBlock__Alternatives
            {
            pushFollow(FOLLOW_rule__SJIfBlock__Alternatives_in_ruleSJIfBlock940);
            rule__SJIfBlock__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSJIfBlock"


    // $ANTLR start "entryRuleSJExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:485:1: entryRuleSJExpression : ruleSJExpression EOF ;
    public final void entryRuleSJExpression() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:486:1: ( ruleSJExpression EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:487:1: ruleSJExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_entryRuleSJExpression971);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJExpression978); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJExpression"


    // $ANTLR start "ruleSJExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:494:1: ruleSJExpression : ( ruleSJAssignment ) ;
    public final void ruleSJExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:498:2: ( ( ruleSJAssignment ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:499:1: ( ruleSJAssignment )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:499:1: ( ruleSJAssignment )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:500:1: ruleSJAssignment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleSJAssignment_in_ruleSJExpression1004);
            ruleSJAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall()); 
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
    // $ANTLR end "ruleSJExpression"


    // $ANTLR start "entryRuleSJAssignment"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:513:1: entryRuleSJAssignment : ruleSJAssignment EOF ;
    public final void entryRuleSJAssignment() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:514:1: ( ruleSJAssignment EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:515:1: ruleSJAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleSJAssignment_in_entryRuleSJAssignment1030);
            ruleSJAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJAssignment1037); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJAssignment"


    // $ANTLR start "ruleSJAssignment"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:522:1: ruleSJAssignment : ( ( rule__SJAssignment__Group__0 ) ) ;
    public final void ruleSJAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:526:2: ( ( ( rule__SJAssignment__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:527:1: ( ( rule__SJAssignment__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:527:1: ( ( rule__SJAssignment__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:528:1: ( rule__SJAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:529:1: ( rule__SJAssignment__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:529:2: rule__SJAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group__0_in_ruleSJAssignment1063);
            rule__SJAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleSJAssignment"


    // $ANTLR start "entryRuleSJSelectionExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:541:1: entryRuleSJSelectionExpression : ruleSJSelectionExpression EOF ;
    public final void entryRuleSJSelectionExpression() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:542:1: ( ruleSJSelectionExpression EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:543:1: ruleSJSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJSelectionExpression_in_entryRuleSJSelectionExpression1090);
            ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJSelectionExpression1097); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJSelectionExpression"


    // $ANTLR start "ruleSJSelectionExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:550:1: ruleSJSelectionExpression : ( ( rule__SJSelectionExpression__Group__0 ) ) ;
    public final void ruleSJSelectionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:554:2: ( ( ( rule__SJSelectionExpression__Group__0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:555:1: ( ( rule__SJSelectionExpression__Group__0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:555:1: ( ( rule__SJSelectionExpression__Group__0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:556:1: ( rule__SJSelectionExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:557:1: ( rule__SJSelectionExpression__Group__0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:557:2: rule__SJSelectionExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group__0_in_ruleSJSelectionExpression1123);
            rule__SJSelectionExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleSJSelectionExpression"


    // $ANTLR start "entryRuleSJTerminalExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:569:1: entryRuleSJTerminalExpression : ruleSJTerminalExpression EOF ;
    public final void entryRuleSJTerminalExpression() throws RecognitionException {
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:570:1: ( ruleSJTerminalExpression EOF )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:571:1: ruleSJTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJTerminalExpression_in_entryRuleSJTerminalExpression1150);
            ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJTerminalExpression1157); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSJTerminalExpression"


    // $ANTLR start "ruleSJTerminalExpression"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:578:1: ruleSJTerminalExpression : ( ( rule__SJTerminalExpression__Alternatives ) ) ;
    public final void ruleSJTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:582:2: ( ( ( rule__SJTerminalExpression__Alternatives ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:583:1: ( ( rule__SJTerminalExpression__Alternatives ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:583:1: ( ( rule__SJTerminalExpression__Alternatives ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:584:1: ( rule__SJTerminalExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getAlternatives()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:585:1: ( rule__SJTerminalExpression__Alternatives )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:585:2: rule__SJTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Alternatives_in_ruleSJTerminalExpression1183);
            rule__SJTerminalExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSJTerminalExpression"


    // $ANTLR start "ruleSJAccessLevel"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:598:1: ruleSJAccessLevel : ( ( rule__SJAccessLevel__Alternatives ) ) ;
    public final void ruleSJAccessLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:602:1: ( ( ( rule__SJAccessLevel__Alternatives ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:603:1: ( ( rule__SJAccessLevel__Alternatives ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:603:1: ( ( rule__SJAccessLevel__Alternatives ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:604:1: ( rule__SJAccessLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAccessLevelAccess().getAlternatives()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:605:1: ( rule__SJAccessLevel__Alternatives )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:605:2: rule__SJAccessLevel__Alternatives
            {
            pushFollow(FOLLOW_rule__SJAccessLevel__Alternatives_in_ruleSJAccessLevel1220);
            rule__SJAccessLevel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAccessLevelAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSJAccessLevel"


    // $ANTLR start "rule__SJMember__Alternatives"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:616:1: rule__SJMember__Alternatives : ( ( ruleSJField ) | ( ruleSJMethod ) );
    public final void rule__SJMember__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:620:1: ( ( ruleSJField ) | ( ruleSJMethod ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:621:1: ( ruleSJField )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:621:1: ( ruleSJField )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:622:1: ruleSJField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSJField_in_rule__SJMember__Alternatives1255);
                    ruleSJField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:627:6: ( ruleSJMethod )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:627:6: ( ruleSJMethod )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:628:1: ruleSJMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSJMethod_in_rule__SJMember__Alternatives1272);
                    ruleSJMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__SJMember__Alternatives"


    // $ANTLR start "rule__SJStatement__Alternatives"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:638:1: rule__SJStatement__Alternatives : ( ( ruleSJVariableDeclaration ) | ( ruleSJReturn ) | ( ( rule__SJStatement__Group_2__0 ) ) | ( ruleSJIfStatement ) );
    public final void rule__SJStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:642:1: ( ( ruleSJVariableDeclaration ) | ( ruleSJReturn ) | ( ( rule__SJStatement__Group_2__0 ) ) | ( ruleSJIfStatement ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:643:1: ( ruleSJVariableDeclaration )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:643:1: ( ruleSJVariableDeclaration )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:644:1: ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSJVariableDeclaration_in_rule__SJStatement__Alternatives1304);
                    ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:649:6: ( ruleSJReturn )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:649:6: ( ruleSJReturn )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:650:1: ruleSJReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSJReturn_in_rule__SJStatement__Alternatives1321);
                    ruleSJReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:655:6: ( ( rule__SJStatement__Group_2__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:655:6: ( ( rule__SJStatement__Group_2__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:656:1: ( rule__SJStatement__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getGroup_2()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:657:1: ( rule__SJStatement__Group_2__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:657:2: rule__SJStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SJStatement__Group_2__0_in_rule__SJStatement__Alternatives1338);
                    rule__SJStatement__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:661:6: ( ruleSJIfStatement )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:661:6: ( ruleSJIfStatement )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:662:1: ruleSJIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSJIfStatement_in_rule__SJStatement__Alternatives1356);
                    ruleSJIfStatement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__SJStatement__Alternatives"


    // $ANTLR start "rule__SJIfBlock__Alternatives"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:672:1: rule__SJIfBlock__Alternatives : ( ( ( rule__SJIfBlock__StatementsAssignment_0 ) ) | ( ( rule__SJIfBlock__Group_1__0 ) ) );
    public final void rule__SJIfBlock__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:676:1: ( ( ( rule__SJIfBlock__StatementsAssignment_0 ) ) | ( ( rule__SJIfBlock__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||(LA3_0>=11 && LA3_0<=12)||LA3_0==25||LA3_0==28||LA3_0==30||(LA3_0>=32 && LA3_0<=35)) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:677:1: ( ( rule__SJIfBlock__StatementsAssignment_0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:677:1: ( ( rule__SJIfBlock__StatementsAssignment_0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:678:1: ( rule__SJIfBlock__StatementsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_0()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:679:1: ( rule__SJIfBlock__StatementsAssignment_0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:679:2: rule__SJIfBlock__StatementsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SJIfBlock__StatementsAssignment_0_in_rule__SJIfBlock__Alternatives1388);
                    rule__SJIfBlock__StatementsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:683:6: ( ( rule__SJIfBlock__Group_1__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:683:6: ( ( rule__SJIfBlock__Group_1__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:684:1: ( rule__SJIfBlock__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJIfBlockAccess().getGroup_1()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:685:1: ( rule__SJIfBlock__Group_1__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:685:2: rule__SJIfBlock__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SJIfBlock__Group_1__0_in_rule__SJIfBlock__Alternatives1406);
                    rule__SJIfBlock__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJIfBlockAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__SJIfBlock__Alternatives"


    // $ANTLR start "rule__SJTerminalExpression__Alternatives"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:696:1: rule__SJTerminalExpression__Alternatives : ( ( ( rule__SJTerminalExpression__Group_0__0 ) ) | ( ( rule__SJTerminalExpression__Group_1__0 ) ) | ( ( rule__SJTerminalExpression__Group_2__0 ) ) | ( ( rule__SJTerminalExpression__Group_3__0 ) ) | ( ( rule__SJTerminalExpression__Group_4__0 ) ) | ( ( rule__SJTerminalExpression__Group_5__0 ) ) | ( ( rule__SJTerminalExpression__Group_6__0 ) ) | ( ( rule__SJTerminalExpression__Group_7__0 ) ) | ( ( rule__SJTerminalExpression__Group_8__0 ) ) );
    public final void rule__SJTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:700:1: ( ( ( rule__SJTerminalExpression__Group_0__0 ) ) | ( ( rule__SJTerminalExpression__Group_1__0 ) ) | ( ( rule__SJTerminalExpression__Group_2__0 ) ) | ( ( rule__SJTerminalExpression__Group_3__0 ) ) | ( ( rule__SJTerminalExpression__Group_4__0 ) ) | ( ( rule__SJTerminalExpression__Group_5__0 ) ) | ( ( rule__SJTerminalExpression__Group_6__0 ) ) | ( ( rule__SJTerminalExpression__Group_7__0 ) ) | ( ( rule__SJTerminalExpression__Group_8__0 ) ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case 11:
            case 12:
                {
                alt4=3;
                }
                break;
            case 32:
                {
                alt4=4;
                }
                break;
            case 33:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            case RULE_ID:
                {
                alt4=7;
                }
                break;
            case 35:
                {
                alt4=8;
                }
                break;
            case 25:
                {
                alt4=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:701:1: ( ( rule__SJTerminalExpression__Group_0__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:701:1: ( ( rule__SJTerminalExpression__Group_0__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:702:1: ( rule__SJTerminalExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_0()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:703:1: ( rule__SJTerminalExpression__Group_0__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:703:2: rule__SJTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_0__0_in_rule__SJTerminalExpression__Alternatives1441);
                    rule__SJTerminalExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:707:6: ( ( rule__SJTerminalExpression__Group_1__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:707:6: ( ( rule__SJTerminalExpression__Group_1__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:708:1: ( rule__SJTerminalExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_1()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:709:1: ( rule__SJTerminalExpression__Group_1__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:709:2: rule__SJTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_1__0_in_rule__SJTerminalExpression__Alternatives1459);
                    rule__SJTerminalExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:713:6: ( ( rule__SJTerminalExpression__Group_2__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:713:6: ( ( rule__SJTerminalExpression__Group_2__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:714:1: ( rule__SJTerminalExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_2()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:715:1: ( rule__SJTerminalExpression__Group_2__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:715:2: rule__SJTerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_2__0_in_rule__SJTerminalExpression__Alternatives1477);
                    rule__SJTerminalExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:719:6: ( ( rule__SJTerminalExpression__Group_3__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:719:6: ( ( rule__SJTerminalExpression__Group_3__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:720:1: ( rule__SJTerminalExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_3()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:721:1: ( rule__SJTerminalExpression__Group_3__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:721:2: rule__SJTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_3__0_in_rule__SJTerminalExpression__Alternatives1495);
                    rule__SJTerminalExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:725:6: ( ( rule__SJTerminalExpression__Group_4__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:725:6: ( ( rule__SJTerminalExpression__Group_4__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:726:1: ( rule__SJTerminalExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_4()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:727:1: ( rule__SJTerminalExpression__Group_4__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:727:2: rule__SJTerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_4__0_in_rule__SJTerminalExpression__Alternatives1513);
                    rule__SJTerminalExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:731:6: ( ( rule__SJTerminalExpression__Group_5__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:731:6: ( ( rule__SJTerminalExpression__Group_5__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:732:1: ( rule__SJTerminalExpression__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_5()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:733:1: ( rule__SJTerminalExpression__Group_5__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:733:2: rule__SJTerminalExpression__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_5__0_in_rule__SJTerminalExpression__Alternatives1531);
                    rule__SJTerminalExpression__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:737:6: ( ( rule__SJTerminalExpression__Group_6__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:737:6: ( ( rule__SJTerminalExpression__Group_6__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:738:1: ( rule__SJTerminalExpression__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_6()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:739:1: ( rule__SJTerminalExpression__Group_6__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:739:2: rule__SJTerminalExpression__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_6__0_in_rule__SJTerminalExpression__Alternatives1549);
                    rule__SJTerminalExpression__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:743:6: ( ( rule__SJTerminalExpression__Group_7__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:743:6: ( ( rule__SJTerminalExpression__Group_7__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:744:1: ( rule__SJTerminalExpression__Group_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_7()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:745:1: ( rule__SJTerminalExpression__Group_7__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:745:2: rule__SJTerminalExpression__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__0_in_rule__SJTerminalExpression__Alternatives1567);
                    rule__SJTerminalExpression__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:749:6: ( ( rule__SJTerminalExpression__Group_8__0 ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:749:6: ( ( rule__SJTerminalExpression__Group_8__0 ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:750:1: ( rule__SJTerminalExpression__Group_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getGroup_8()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:751:1: ( rule__SJTerminalExpression__Group_8__0 )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:751:2: rule__SJTerminalExpression__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__0_in_rule__SJTerminalExpression__Alternatives1585);
                    rule__SJTerminalExpression__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getGroup_8()); 
                    }

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
    // $ANTLR end "rule__SJTerminalExpression__Alternatives"


    // $ANTLR start "rule__SJTerminalExpression__ValueAlternatives_2_1_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:760:1: rule__SJTerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__SJTerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:764:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:765:1: ( 'true' )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:765:1: ( 'true' )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:766:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__SJTerminalExpression__ValueAlternatives_2_1_01619); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:773:6: ( 'false' )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:773:6: ( 'false' )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:774:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__SJTerminalExpression__ValueAlternatives_2_1_01639); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    }

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
    // $ANTLR end "rule__SJTerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__SJAccessLevel__Alternatives"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:786:1: rule__SJAccessLevel__Alternatives : ( ( ( 'private' ) ) | ( ( 'public' ) ) | ( ( 'protected' ) ) );
    public final void rule__SJAccessLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:790:1: ( ( ( 'private' ) ) | ( ( 'public' ) ) | ( ( 'protected' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:791:1: ( ( 'private' ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:791:1: ( ( 'private' ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:792:1: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:793:1: ( 'private' )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:793:3: 'private'
                    {
                    match(input,13,FOLLOW_13_in_rule__SJAccessLevel__Alternatives1674); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:798:6: ( ( 'public' ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:798:6: ( ( 'public' ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:799:1: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:800:1: ( 'public' )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:800:3: 'public'
                    {
                    match(input,14,FOLLOW_14_in_rule__SJAccessLevel__Alternatives1695); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:805:6: ( ( 'protected' ) )
                    {
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:805:6: ( ( 'protected' ) )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:806:1: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSJAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:807:1: ( 'protected' )
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:807:3: 'protected'
                    {
                    match(input,15,FOLLOW_15_in_rule__SJAccessLevel__Alternatives1716); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSJAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__SJAccessLevel__Alternatives"


    // $ANTLR start "rule__SJProgram__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:819:1: rule__SJProgram__Group__0 : rule__SJProgram__Group__0__Impl rule__SJProgram__Group__1 ;
    public final void rule__SJProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:823:1: ( rule__SJProgram__Group__0__Impl rule__SJProgram__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:824:2: rule__SJProgram__Group__0__Impl rule__SJProgram__Group__1
            {
            pushFollow(FOLLOW_rule__SJProgram__Group__0__Impl_in_rule__SJProgram__Group__01749);
            rule__SJProgram__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJProgram__Group__1_in_rule__SJProgram__Group__01752);
            rule__SJProgram__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group__0"


    // $ANTLR start "rule__SJProgram__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:831:1: rule__SJProgram__Group__0__Impl : ( ( rule__SJProgram__Group_0__0 )? ) ;
    public final void rule__SJProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:835:1: ( ( ( rule__SJProgram__Group_0__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:836:1: ( ( rule__SJProgram__Group_0__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:836:1: ( ( rule__SJProgram__Group_0__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:837:1: ( rule__SJProgram__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getGroup_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:838:1: ( rule__SJProgram__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:838:2: rule__SJProgram__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SJProgram__Group_0__0_in_rule__SJProgram__Group__0__Impl1779);
                    rule__SJProgram__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getGroup_0()); 
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
    // $ANTLR end "rule__SJProgram__Group__0__Impl"


    // $ANTLR start "rule__SJProgram__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:848:1: rule__SJProgram__Group__1 : rule__SJProgram__Group__1__Impl rule__SJProgram__Group__2 ;
    public final void rule__SJProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:852:1: ( rule__SJProgram__Group__1__Impl rule__SJProgram__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:853:2: rule__SJProgram__Group__1__Impl rule__SJProgram__Group__2
            {
            pushFollow(FOLLOW_rule__SJProgram__Group__1__Impl_in_rule__SJProgram__Group__11810);
            rule__SJProgram__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJProgram__Group__2_in_rule__SJProgram__Group__11813);
            rule__SJProgram__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group__1"


    // $ANTLR start "rule__SJProgram__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:860:1: rule__SJProgram__Group__1__Impl : ( ( rule__SJProgram__ImportsAssignment_1 )* ) ;
    public final void rule__SJProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:864:1: ( ( ( rule__SJProgram__ImportsAssignment_1 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:865:1: ( ( rule__SJProgram__ImportsAssignment_1 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:865:1: ( ( rule__SJProgram__ImportsAssignment_1 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:866:1: ( rule__SJProgram__ImportsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getImportsAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:867:1: ( rule__SJProgram__ImportsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:867:2: rule__SJProgram__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SJProgram__ImportsAssignment_1_in_rule__SJProgram__Group__1__Impl1840);
            	    rule__SJProgram__ImportsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getImportsAssignment_1()); 
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
    // $ANTLR end "rule__SJProgram__Group__1__Impl"


    // $ANTLR start "rule__SJProgram__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:877:1: rule__SJProgram__Group__2 : rule__SJProgram__Group__2__Impl ;
    public final void rule__SJProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:881:1: ( rule__SJProgram__Group__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:882:2: rule__SJProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SJProgram__Group__2__Impl_in_rule__SJProgram__Group__21871);
            rule__SJProgram__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group__2"


    // $ANTLR start "rule__SJProgram__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:888:1: rule__SJProgram__Group__2__Impl : ( ( rule__SJProgram__ClassesAssignment_2 )* ) ;
    public final void rule__SJProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:892:1: ( ( ( rule__SJProgram__ClassesAssignment_2 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:893:1: ( ( rule__SJProgram__ClassesAssignment_2 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:893:1: ( ( rule__SJProgram__ClassesAssignment_2 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:894:1: ( rule__SJProgram__ClassesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getClassesAssignment_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:895:1: ( rule__SJProgram__ClassesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:895:2: rule__SJProgram__ClassesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SJProgram__ClassesAssignment_2_in_rule__SJProgram__Group__2__Impl1898);
            	    rule__SJProgram__ClassesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getClassesAssignment_2()); 
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
    // $ANTLR end "rule__SJProgram__Group__2__Impl"


    // $ANTLR start "rule__SJProgram__Group_0__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:911:1: rule__SJProgram__Group_0__0 : rule__SJProgram__Group_0__0__Impl rule__SJProgram__Group_0__1 ;
    public final void rule__SJProgram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:915:1: ( rule__SJProgram__Group_0__0__Impl rule__SJProgram__Group_0__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:916:2: rule__SJProgram__Group_0__0__Impl rule__SJProgram__Group_0__1
            {
            pushFollow(FOLLOW_rule__SJProgram__Group_0__0__Impl_in_rule__SJProgram__Group_0__01935);
            rule__SJProgram__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJProgram__Group_0__1_in_rule__SJProgram__Group_0__01938);
            rule__SJProgram__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group_0__0"


    // $ANTLR start "rule__SJProgram__Group_0__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:923:1: rule__SJProgram__Group_0__0__Impl : ( 'package' ) ;
    public final void rule__SJProgram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:927:1: ( ( 'package' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:928:1: ( 'package' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:928:1: ( 'package' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:929:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getPackageKeyword_0_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__SJProgram__Group_0__0__Impl1966); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getPackageKeyword_0_0()); 
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
    // $ANTLR end "rule__SJProgram__Group_0__0__Impl"


    // $ANTLR start "rule__SJProgram__Group_0__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:942:1: rule__SJProgram__Group_0__1 : rule__SJProgram__Group_0__1__Impl rule__SJProgram__Group_0__2 ;
    public final void rule__SJProgram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:946:1: ( rule__SJProgram__Group_0__1__Impl rule__SJProgram__Group_0__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:947:2: rule__SJProgram__Group_0__1__Impl rule__SJProgram__Group_0__2
            {
            pushFollow(FOLLOW_rule__SJProgram__Group_0__1__Impl_in_rule__SJProgram__Group_0__11997);
            rule__SJProgram__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJProgram__Group_0__2_in_rule__SJProgram__Group_0__12000);
            rule__SJProgram__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group_0__1"


    // $ANTLR start "rule__SJProgram__Group_0__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:954:1: rule__SJProgram__Group_0__1__Impl : ( ( rule__SJProgram__NameAssignment_0_1 ) ) ;
    public final void rule__SJProgram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:958:1: ( ( ( rule__SJProgram__NameAssignment_0_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:959:1: ( ( rule__SJProgram__NameAssignment_0_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:959:1: ( ( rule__SJProgram__NameAssignment_0_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:960:1: ( rule__SJProgram__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getNameAssignment_0_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:961:1: ( rule__SJProgram__NameAssignment_0_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:961:2: rule__SJProgram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SJProgram__NameAssignment_0_1_in_rule__SJProgram__Group_0__1__Impl2027);
            rule__SJProgram__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getNameAssignment_0_1()); 
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
    // $ANTLR end "rule__SJProgram__Group_0__1__Impl"


    // $ANTLR start "rule__SJProgram__Group_0__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:971:1: rule__SJProgram__Group_0__2 : rule__SJProgram__Group_0__2__Impl ;
    public final void rule__SJProgram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:975:1: ( rule__SJProgram__Group_0__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:976:2: rule__SJProgram__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SJProgram__Group_0__2__Impl_in_rule__SJProgram__Group_0__22057);
            rule__SJProgram__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJProgram__Group_0__2"


    // $ANTLR start "rule__SJProgram__Group_0__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:982:1: rule__SJProgram__Group_0__2__Impl : ( ';' ) ;
    public final void rule__SJProgram__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:986:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:987:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:987:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:988:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getSemicolonKeyword_0_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJProgram__Group_0__2__Impl2085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getSemicolonKeyword_0_2()); 
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
    // $ANTLR end "rule__SJProgram__Group_0__2__Impl"


    // $ANTLR start "rule__SJImport__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1007:1: rule__SJImport__Group__0 : rule__SJImport__Group__0__Impl rule__SJImport__Group__1 ;
    public final void rule__SJImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1011:1: ( rule__SJImport__Group__0__Impl rule__SJImport__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1012:2: rule__SJImport__Group__0__Impl rule__SJImport__Group__1
            {
            pushFollow(FOLLOW_rule__SJImport__Group__0__Impl_in_rule__SJImport__Group__02122);
            rule__SJImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJImport__Group__1_in_rule__SJImport__Group__02125);
            rule__SJImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJImport__Group__0"


    // $ANTLR start "rule__SJImport__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1019:1: rule__SJImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__SJImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1023:1: ( ( 'import' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1024:1: ( 'import' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1024:1: ( 'import' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1025:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__SJImport__Group__0__Impl2153); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__SJImport__Group__0__Impl"


    // $ANTLR start "rule__SJImport__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1038:1: rule__SJImport__Group__1 : rule__SJImport__Group__1__Impl rule__SJImport__Group__2 ;
    public final void rule__SJImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1042:1: ( rule__SJImport__Group__1__Impl rule__SJImport__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1043:2: rule__SJImport__Group__1__Impl rule__SJImport__Group__2
            {
            pushFollow(FOLLOW_rule__SJImport__Group__1__Impl_in_rule__SJImport__Group__12184);
            rule__SJImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJImport__Group__2_in_rule__SJImport__Group__12187);
            rule__SJImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJImport__Group__1"


    // $ANTLR start "rule__SJImport__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1050:1: rule__SJImport__Group__1__Impl : ( ( rule__SJImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__SJImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1054:1: ( ( ( rule__SJImport__ImportedNamespaceAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1055:1: ( ( rule__SJImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1055:1: ( ( rule__SJImport__ImportedNamespaceAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1056:1: ( rule__SJImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1057:1: ( rule__SJImport__ImportedNamespaceAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1057:2: rule__SJImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__SJImport__ImportedNamespaceAssignment_1_in_rule__SJImport__Group__1__Impl2214);
            rule__SJImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__SJImport__Group__1__Impl"


    // $ANTLR start "rule__SJImport__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1067:1: rule__SJImport__Group__2 : rule__SJImport__Group__2__Impl ;
    public final void rule__SJImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1071:1: ( rule__SJImport__Group__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1072:2: rule__SJImport__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SJImport__Group__2__Impl_in_rule__SJImport__Group__22244);
            rule__SJImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJImport__Group__2"


    // $ANTLR start "rule__SJImport__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1078:1: rule__SJImport__Group__2__Impl : ( ';' ) ;
    public final void rule__SJImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1082:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1083:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1083:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1084:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJImport__Group__2__Impl2272); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__SJImport__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1103:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1107:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1108:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02309);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02312);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1115:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1119:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1120:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1120:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1121:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2339);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1132:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1136:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1137:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12368);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1143:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1147:1: ( ( ( '.*' )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1148:1: ( ( '.*' )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1148:1: ( ( '.*' )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1149:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1150:1: ( '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1151:2: '.*'
                    {
                    match(input,19,FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2397); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1166:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1170:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1171:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02434);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02437);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1178:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1182:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1183:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1183:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1184:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2464); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1195:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1199:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1200:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12493);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1206:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1210:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1211:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1211:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1212:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1213:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1213:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2520);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1227:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1231:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1232:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02555);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02558);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1239:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1243:1: ( ( '.' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1244:1: ( '.' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1244:1: ( '.' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1245:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1258:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1262:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1263:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12617);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1269:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1273:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1274:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1274:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1275:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__SJClass__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1290:1: rule__SJClass__Group__0 : rule__SJClass__Group__0__Impl rule__SJClass__Group__1 ;
    public final void rule__SJClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1294:1: ( rule__SJClass__Group__0__Impl rule__SJClass__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1295:2: rule__SJClass__Group__0__Impl rule__SJClass__Group__1
            {
            pushFollow(FOLLOW_rule__SJClass__Group__0__Impl_in_rule__SJClass__Group__02677);
            rule__SJClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group__1_in_rule__SJClass__Group__02680);
            rule__SJClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__0"


    // $ANTLR start "rule__SJClass__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1302:1: rule__SJClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__SJClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1306:1: ( ( 'class' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1307:1: ( 'class' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1307:1: ( 'class' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1308:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getClassKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__SJClass__Group__0__Impl2708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getClassKeyword_0()); 
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
    // $ANTLR end "rule__SJClass__Group__0__Impl"


    // $ANTLR start "rule__SJClass__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1321:1: rule__SJClass__Group__1 : rule__SJClass__Group__1__Impl rule__SJClass__Group__2 ;
    public final void rule__SJClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1325:1: ( rule__SJClass__Group__1__Impl rule__SJClass__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1326:2: rule__SJClass__Group__1__Impl rule__SJClass__Group__2
            {
            pushFollow(FOLLOW_rule__SJClass__Group__1__Impl_in_rule__SJClass__Group__12739);
            rule__SJClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group__2_in_rule__SJClass__Group__12742);
            rule__SJClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__1"


    // $ANTLR start "rule__SJClass__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1333:1: rule__SJClass__Group__1__Impl : ( ( rule__SJClass__NameAssignment_1 ) ) ;
    public final void rule__SJClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1337:1: ( ( ( rule__SJClass__NameAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1338:1: ( ( rule__SJClass__NameAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1338:1: ( ( rule__SJClass__NameAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1339:1: ( rule__SJClass__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getNameAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1340:1: ( rule__SJClass__NameAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1340:2: rule__SJClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SJClass__NameAssignment_1_in_rule__SJClass__Group__1__Impl2769);
            rule__SJClass__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SJClass__Group__1__Impl"


    // $ANTLR start "rule__SJClass__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1350:1: rule__SJClass__Group__2 : rule__SJClass__Group__2__Impl rule__SJClass__Group__3 ;
    public final void rule__SJClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1354:1: ( rule__SJClass__Group__2__Impl rule__SJClass__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1355:2: rule__SJClass__Group__2__Impl rule__SJClass__Group__3
            {
            pushFollow(FOLLOW_rule__SJClass__Group__2__Impl_in_rule__SJClass__Group__22799);
            rule__SJClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group__3_in_rule__SJClass__Group__22802);
            rule__SJClass__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__2"


    // $ANTLR start "rule__SJClass__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1362:1: rule__SJClass__Group__2__Impl : ( ( rule__SJClass__Group_2__0 )? ) ;
    public final void rule__SJClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1366:1: ( ( ( rule__SJClass__Group_2__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1367:1: ( ( rule__SJClass__Group_2__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1367:1: ( ( rule__SJClass__Group_2__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1368:1: ( rule__SJClass__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getGroup_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1369:1: ( rule__SJClass__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1369:2: rule__SJClass__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SJClass__Group_2__0_in_rule__SJClass__Group__2__Impl2829);
                    rule__SJClass__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getGroup_2()); 
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
    // $ANTLR end "rule__SJClass__Group__2__Impl"


    // $ANTLR start "rule__SJClass__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1379:1: rule__SJClass__Group__3 : rule__SJClass__Group__3__Impl rule__SJClass__Group__4 ;
    public final void rule__SJClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1383:1: ( rule__SJClass__Group__3__Impl rule__SJClass__Group__4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1384:2: rule__SJClass__Group__3__Impl rule__SJClass__Group__4
            {
            pushFollow(FOLLOW_rule__SJClass__Group__3__Impl_in_rule__SJClass__Group__32860);
            rule__SJClass__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group__4_in_rule__SJClass__Group__32863);
            rule__SJClass__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__3"


    // $ANTLR start "rule__SJClass__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1391:1: rule__SJClass__Group__3__Impl : ( '{' ) ;
    public final void rule__SJClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1395:1: ( ( '{' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1396:1: ( '{' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1396:1: ( '{' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1397:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__SJClass__Group__3__Impl2891); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__SJClass__Group__3__Impl"


    // $ANTLR start "rule__SJClass__Group__4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1410:1: rule__SJClass__Group__4 : rule__SJClass__Group__4__Impl rule__SJClass__Group__5 ;
    public final void rule__SJClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1414:1: ( rule__SJClass__Group__4__Impl rule__SJClass__Group__5 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1415:2: rule__SJClass__Group__4__Impl rule__SJClass__Group__5
            {
            pushFollow(FOLLOW_rule__SJClass__Group__4__Impl_in_rule__SJClass__Group__42922);
            rule__SJClass__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group__5_in_rule__SJClass__Group__42925);
            rule__SJClass__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__4"


    // $ANTLR start "rule__SJClass__Group__4__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1422:1: rule__SJClass__Group__4__Impl : ( ( rule__SJClass__MembersAssignment_4 )* ) ;
    public final void rule__SJClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1426:1: ( ( ( rule__SJClass__MembersAssignment_4 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1427:1: ( ( rule__SJClass__MembersAssignment_4 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1427:1: ( ( rule__SJClass__MembersAssignment_4 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1428:1: ( rule__SJClass__MembersAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getMembersAssignment_4()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1429:1: ( rule__SJClass__MembersAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=13 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1429:2: rule__SJClass__MembersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SJClass__MembersAssignment_4_in_rule__SJClass__Group__4__Impl2952);
            	    rule__SJClass__MembersAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getMembersAssignment_4()); 
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
    // $ANTLR end "rule__SJClass__Group__4__Impl"


    // $ANTLR start "rule__SJClass__Group__5"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1439:1: rule__SJClass__Group__5 : rule__SJClass__Group__5__Impl ;
    public final void rule__SJClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1443:1: ( rule__SJClass__Group__5__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1444:2: rule__SJClass__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SJClass__Group__5__Impl_in_rule__SJClass__Group__52983);
            rule__SJClass__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group__5"


    // $ANTLR start "rule__SJClass__Group__5__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1450:1: rule__SJClass__Group__5__Impl : ( '}' ) ;
    public final void rule__SJClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1454:1: ( ( '}' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1455:1: ( '}' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1455:1: ( '}' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1456:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__SJClass__Group__5__Impl3011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__SJClass__Group__5__Impl"


    // $ANTLR start "rule__SJClass__Group_2__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1481:1: rule__SJClass__Group_2__0 : rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1 ;
    public final void rule__SJClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1485:1: ( rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1486:2: rule__SJClass__Group_2__0__Impl rule__SJClass__Group_2__1
            {
            pushFollow(FOLLOW_rule__SJClass__Group_2__0__Impl_in_rule__SJClass__Group_2__03054);
            rule__SJClass__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJClass__Group_2__1_in_rule__SJClass__Group_2__03057);
            rule__SJClass__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__0"


    // $ANTLR start "rule__SJClass__Group_2__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1493:1: rule__SJClass__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__SJClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1497:1: ( ( 'extends' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1498:1: ( 'extends' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1498:1: ( 'extends' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1499:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getExtendsKeyword_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__SJClass__Group_2__0__Impl3085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getExtendsKeyword_2_0()); 
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
    // $ANTLR end "rule__SJClass__Group_2__0__Impl"


    // $ANTLR start "rule__SJClass__Group_2__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1512:1: rule__SJClass__Group_2__1 : rule__SJClass__Group_2__1__Impl ;
    public final void rule__SJClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1516:1: ( rule__SJClass__Group_2__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1517:2: rule__SJClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SJClass__Group_2__1__Impl_in_rule__SJClass__Group_2__13116);
            rule__SJClass__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJClass__Group_2__1"


    // $ANTLR start "rule__SJClass__Group_2__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1523:1: rule__SJClass__Group_2__1__Impl : ( ( rule__SJClass__SuperclassAssignment_2_1 ) ) ;
    public final void rule__SJClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1527:1: ( ( ( rule__SJClass__SuperclassAssignment_2_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1528:1: ( ( rule__SJClass__SuperclassAssignment_2_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1528:1: ( ( rule__SJClass__SuperclassAssignment_2_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1529:1: ( rule__SJClass__SuperclassAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassAssignment_2_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1530:1: ( rule__SJClass__SuperclassAssignment_2_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1530:2: rule__SJClass__SuperclassAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SJClass__SuperclassAssignment_2_1_in_rule__SJClass__Group_2__1__Impl3143);
            rule__SJClass__SuperclassAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassAssignment_2_1()); 
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
    // $ANTLR end "rule__SJClass__Group_2__1__Impl"


    // $ANTLR start "rule__SJField__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1544:1: rule__SJField__Group__0 : rule__SJField__Group__0__Impl rule__SJField__Group__1 ;
    public final void rule__SJField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1548:1: ( rule__SJField__Group__0__Impl rule__SJField__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1549:2: rule__SJField__Group__0__Impl rule__SJField__Group__1
            {
            pushFollow(FOLLOW_rule__SJField__Group__0__Impl_in_rule__SJField__Group__03177);
            rule__SJField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJField__Group__1_in_rule__SJField__Group__03180);
            rule__SJField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__0"


    // $ANTLR start "rule__SJField__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1556:1: rule__SJField__Group__0__Impl : ( ( rule__SJField__AccessAssignment_0 )? ) ;
    public final void rule__SJField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1560:1: ( ( ( rule__SJField__AccessAssignment_0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1561:1: ( ( rule__SJField__AccessAssignment_0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1561:1: ( ( rule__SJField__AccessAssignment_0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1562:1: ( rule__SJField__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getAccessAssignment_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1563:1: ( rule__SJField__AccessAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=13 && LA14_0<=15)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1563:2: rule__SJField__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SJField__AccessAssignment_0_in_rule__SJField__Group__0__Impl3207);
                    rule__SJField__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getAccessAssignment_0()); 
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
    // $ANTLR end "rule__SJField__Group__0__Impl"


    // $ANTLR start "rule__SJField__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1573:1: rule__SJField__Group__1 : rule__SJField__Group__1__Impl rule__SJField__Group__2 ;
    public final void rule__SJField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1577:1: ( rule__SJField__Group__1__Impl rule__SJField__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1578:2: rule__SJField__Group__1__Impl rule__SJField__Group__2
            {
            pushFollow(FOLLOW_rule__SJField__Group__1__Impl_in_rule__SJField__Group__13238);
            rule__SJField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJField__Group__2_in_rule__SJField__Group__13241);
            rule__SJField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__1"


    // $ANTLR start "rule__SJField__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1585:1: rule__SJField__Group__1__Impl : ( ( rule__SJField__TypeAssignment_1 ) ) ;
    public final void rule__SJField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1589:1: ( ( ( rule__SJField__TypeAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1590:1: ( ( rule__SJField__TypeAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1590:1: ( ( rule__SJField__TypeAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1591:1: ( rule__SJField__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getTypeAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1592:1: ( rule__SJField__TypeAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1592:2: rule__SJField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SJField__TypeAssignment_1_in_rule__SJField__Group__1__Impl3268);
            rule__SJField__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__SJField__Group__1__Impl"


    // $ANTLR start "rule__SJField__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1602:1: rule__SJField__Group__2 : rule__SJField__Group__2__Impl rule__SJField__Group__3 ;
    public final void rule__SJField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1606:1: ( rule__SJField__Group__2__Impl rule__SJField__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1607:2: rule__SJField__Group__2__Impl rule__SJField__Group__3
            {
            pushFollow(FOLLOW_rule__SJField__Group__2__Impl_in_rule__SJField__Group__23298);
            rule__SJField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJField__Group__3_in_rule__SJField__Group__23301);
            rule__SJField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__2"


    // $ANTLR start "rule__SJField__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1614:1: rule__SJField__Group__2__Impl : ( ( rule__SJField__NameAssignment_2 ) ) ;
    public final void rule__SJField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1618:1: ( ( ( rule__SJField__NameAssignment_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1619:1: ( ( rule__SJField__NameAssignment_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1619:1: ( ( rule__SJField__NameAssignment_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1620:1: ( rule__SJField__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getNameAssignment_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1621:1: ( rule__SJField__NameAssignment_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1621:2: rule__SJField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SJField__NameAssignment_2_in_rule__SJField__Group__2__Impl3328);
            rule__SJField__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__SJField__Group__2__Impl"


    // $ANTLR start "rule__SJField__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1631:1: rule__SJField__Group__3 : rule__SJField__Group__3__Impl ;
    public final void rule__SJField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1635:1: ( rule__SJField__Group__3__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1636:2: rule__SJField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SJField__Group__3__Impl_in_rule__SJField__Group__33358);
            rule__SJField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJField__Group__3"


    // $ANTLR start "rule__SJField__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1642:1: rule__SJField__Group__3__Impl : ( ';' ) ;
    public final void rule__SJField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1646:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1647:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1647:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1648:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getSemicolonKeyword_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJField__Group__3__Impl3386); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getSemicolonKeyword_3()); 
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
    // $ANTLR end "rule__SJField__Group__3__Impl"


    // $ANTLR start "rule__SJMethod__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1669:1: rule__SJMethod__Group__0 : rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1 ;
    public final void rule__SJMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1673:1: ( rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1674:2: rule__SJMethod__Group__0__Impl rule__SJMethod__Group__1
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__0__Impl_in_rule__SJMethod__Group__03425);
            rule__SJMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__1_in_rule__SJMethod__Group__03428);
            rule__SJMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__0"


    // $ANTLR start "rule__SJMethod__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1681:1: rule__SJMethod__Group__0__Impl : ( ( rule__SJMethod__AccessAssignment_0 )? ) ;
    public final void rule__SJMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1685:1: ( ( ( rule__SJMethod__AccessAssignment_0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1686:1: ( ( rule__SJMethod__AccessAssignment_0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1686:1: ( ( rule__SJMethod__AccessAssignment_0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1687:1: ( rule__SJMethod__AccessAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getAccessAssignment_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1688:1: ( rule__SJMethod__AccessAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=13 && LA15_0<=15)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1688:2: rule__SJMethod__AccessAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SJMethod__AccessAssignment_0_in_rule__SJMethod__Group__0__Impl3455);
                    rule__SJMethod__AccessAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getAccessAssignment_0()); 
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
    // $ANTLR end "rule__SJMethod__Group__0__Impl"


    // $ANTLR start "rule__SJMethod__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1698:1: rule__SJMethod__Group__1 : rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2 ;
    public final void rule__SJMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1702:1: ( rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1703:2: rule__SJMethod__Group__1__Impl rule__SJMethod__Group__2
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__1__Impl_in_rule__SJMethod__Group__13486);
            rule__SJMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__2_in_rule__SJMethod__Group__13489);
            rule__SJMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__1"


    // $ANTLR start "rule__SJMethod__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1710:1: rule__SJMethod__Group__1__Impl : ( ( rule__SJMethod__TypeAssignment_1 ) ) ;
    public final void rule__SJMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1714:1: ( ( ( rule__SJMethod__TypeAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1715:1: ( ( rule__SJMethod__TypeAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1715:1: ( ( rule__SJMethod__TypeAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1716:1: ( rule__SJMethod__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getTypeAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1717:1: ( rule__SJMethod__TypeAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1717:2: rule__SJMethod__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SJMethod__TypeAssignment_1_in_rule__SJMethod__Group__1__Impl3516);
            rule__SJMethod__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__SJMethod__Group__1__Impl"


    // $ANTLR start "rule__SJMethod__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1727:1: rule__SJMethod__Group__2 : rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3 ;
    public final void rule__SJMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1731:1: ( rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1732:2: rule__SJMethod__Group__2__Impl rule__SJMethod__Group__3
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__2__Impl_in_rule__SJMethod__Group__23546);
            rule__SJMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__3_in_rule__SJMethod__Group__23549);
            rule__SJMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__2"


    // $ANTLR start "rule__SJMethod__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1739:1: rule__SJMethod__Group__2__Impl : ( ( rule__SJMethod__NameAssignment_2 ) ) ;
    public final void rule__SJMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1743:1: ( ( ( rule__SJMethod__NameAssignment_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1744:1: ( ( rule__SJMethod__NameAssignment_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1744:1: ( ( rule__SJMethod__NameAssignment_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1745:1: ( rule__SJMethod__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getNameAssignment_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1746:1: ( rule__SJMethod__NameAssignment_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1746:2: rule__SJMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SJMethod__NameAssignment_2_in_rule__SJMethod__Group__2__Impl3576);
            rule__SJMethod__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__SJMethod__Group__2__Impl"


    // $ANTLR start "rule__SJMethod__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1756:1: rule__SJMethod__Group__3 : rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4 ;
    public final void rule__SJMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1760:1: ( rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1761:2: rule__SJMethod__Group__3__Impl rule__SJMethod__Group__4
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__3__Impl_in_rule__SJMethod__Group__33606);
            rule__SJMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__4_in_rule__SJMethod__Group__33609);
            rule__SJMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__3"


    // $ANTLR start "rule__SJMethod__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1768:1: rule__SJMethod__Group__3__Impl : ( '(' ) ;
    public final void rule__SJMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1772:1: ( ( '(' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1773:1: ( '(' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1773:1: ( '(' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1774:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__SJMethod__Group__3__Impl3637); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__SJMethod__Group__3__Impl"


    // $ANTLR start "rule__SJMethod__Group__4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1787:1: rule__SJMethod__Group__4 : rule__SJMethod__Group__4__Impl rule__SJMethod__Group__5 ;
    public final void rule__SJMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1791:1: ( rule__SJMethod__Group__4__Impl rule__SJMethod__Group__5 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1792:2: rule__SJMethod__Group__4__Impl rule__SJMethod__Group__5
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__4__Impl_in_rule__SJMethod__Group__43668);
            rule__SJMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__5_in_rule__SJMethod__Group__43671);
            rule__SJMethod__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__4"


    // $ANTLR start "rule__SJMethod__Group__4__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1799:1: rule__SJMethod__Group__4__Impl : ( ( rule__SJMethod__Group_4__0 )? ) ;
    public final void rule__SJMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1803:1: ( ( ( rule__SJMethod__Group_4__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1804:1: ( ( rule__SJMethod__Group_4__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1804:1: ( ( rule__SJMethod__Group_4__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1805:1: ( rule__SJMethod__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup_4()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1806:1: ( rule__SJMethod__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1806:2: rule__SJMethod__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SJMethod__Group_4__0_in_rule__SJMethod__Group__4__Impl3698);
                    rule__SJMethod__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup_4()); 
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
    // $ANTLR end "rule__SJMethod__Group__4__Impl"


    // $ANTLR start "rule__SJMethod__Group__5"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1816:1: rule__SJMethod__Group__5 : rule__SJMethod__Group__5__Impl rule__SJMethod__Group__6 ;
    public final void rule__SJMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1820:1: ( rule__SJMethod__Group__5__Impl rule__SJMethod__Group__6 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1821:2: rule__SJMethod__Group__5__Impl rule__SJMethod__Group__6
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__5__Impl_in_rule__SJMethod__Group__53729);
            rule__SJMethod__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group__6_in_rule__SJMethod__Group__53732);
            rule__SJMethod__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__5"


    // $ANTLR start "rule__SJMethod__Group__5__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1828:1: rule__SJMethod__Group__5__Impl : ( ')' ) ;
    public final void rule__SJMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1832:1: ( ( ')' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1833:1: ( ')' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1833:1: ( ')' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1834:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,26,FOLLOW_26_in_rule__SJMethod__Group__5__Impl3760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__SJMethod__Group__5__Impl"


    // $ANTLR start "rule__SJMethod__Group__6"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1847:1: rule__SJMethod__Group__6 : rule__SJMethod__Group__6__Impl ;
    public final void rule__SJMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1851:1: ( rule__SJMethod__Group__6__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1852:2: rule__SJMethod__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SJMethod__Group__6__Impl_in_rule__SJMethod__Group__63791);
            rule__SJMethod__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group__6"


    // $ANTLR start "rule__SJMethod__Group__6__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1858:1: rule__SJMethod__Group__6__Impl : ( ( rule__SJMethod__BodyAssignment_6 ) ) ;
    public final void rule__SJMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1862:1: ( ( ( rule__SJMethod__BodyAssignment_6 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1863:1: ( ( rule__SJMethod__BodyAssignment_6 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1863:1: ( ( rule__SJMethod__BodyAssignment_6 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1864:1: ( rule__SJMethod__BodyAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getBodyAssignment_6()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1865:1: ( rule__SJMethod__BodyAssignment_6 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1865:2: rule__SJMethod__BodyAssignment_6
            {
            pushFollow(FOLLOW_rule__SJMethod__BodyAssignment_6_in_rule__SJMethod__Group__6__Impl3818);
            rule__SJMethod__BodyAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getBodyAssignment_6()); 
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
    // $ANTLR end "rule__SJMethod__Group__6__Impl"


    // $ANTLR start "rule__SJMethod__Group_4__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1889:1: rule__SJMethod__Group_4__0 : rule__SJMethod__Group_4__0__Impl rule__SJMethod__Group_4__1 ;
    public final void rule__SJMethod__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1893:1: ( rule__SJMethod__Group_4__0__Impl rule__SJMethod__Group_4__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1894:2: rule__SJMethod__Group_4__0__Impl rule__SJMethod__Group_4__1
            {
            pushFollow(FOLLOW_rule__SJMethod__Group_4__0__Impl_in_rule__SJMethod__Group_4__03862);
            rule__SJMethod__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group_4__1_in_rule__SJMethod__Group_4__03865);
            rule__SJMethod__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_4__0"


    // $ANTLR start "rule__SJMethod__Group_4__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1901:1: rule__SJMethod__Group_4__0__Impl : ( ( rule__SJMethod__ParamsAssignment_4_0 ) ) ;
    public final void rule__SJMethod__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1905:1: ( ( ( rule__SJMethod__ParamsAssignment_4_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1906:1: ( ( rule__SJMethod__ParamsAssignment_4_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1906:1: ( ( rule__SJMethod__ParamsAssignment_4_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1907:1: ( rule__SJMethod__ParamsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsAssignment_4_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1908:1: ( rule__SJMethod__ParamsAssignment_4_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1908:2: rule__SJMethod__ParamsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__SJMethod__ParamsAssignment_4_0_in_rule__SJMethod__Group_4__0__Impl3892);
            rule__SJMethod__ParamsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsAssignment_4_0()); 
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
    // $ANTLR end "rule__SJMethod__Group_4__0__Impl"


    // $ANTLR start "rule__SJMethod__Group_4__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1918:1: rule__SJMethod__Group_4__1 : rule__SJMethod__Group_4__1__Impl ;
    public final void rule__SJMethod__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1922:1: ( rule__SJMethod__Group_4__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1923:2: rule__SJMethod__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SJMethod__Group_4__1__Impl_in_rule__SJMethod__Group_4__13922);
            rule__SJMethod__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_4__1"


    // $ANTLR start "rule__SJMethod__Group_4__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1929:1: rule__SJMethod__Group_4__1__Impl : ( ( rule__SJMethod__Group_4_1__0 )* ) ;
    public final void rule__SJMethod__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1933:1: ( ( ( rule__SJMethod__Group_4_1__0 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1934:1: ( ( rule__SJMethod__Group_4_1__0 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1934:1: ( ( rule__SJMethod__Group_4_1__0 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1935:1: ( rule__SJMethod__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getGroup_4_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1936:1: ( rule__SJMethod__Group_4_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1936:2: rule__SJMethod__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SJMethod__Group_4_1__0_in_rule__SJMethod__Group_4__1__Impl3949);
            	    rule__SJMethod__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__SJMethod__Group_4__1__Impl"


    // $ANTLR start "rule__SJMethod__Group_4_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1950:1: rule__SJMethod__Group_4_1__0 : rule__SJMethod__Group_4_1__0__Impl rule__SJMethod__Group_4_1__1 ;
    public final void rule__SJMethod__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1954:1: ( rule__SJMethod__Group_4_1__0__Impl rule__SJMethod__Group_4_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1955:2: rule__SJMethod__Group_4_1__0__Impl rule__SJMethod__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__SJMethod__Group_4_1__0__Impl_in_rule__SJMethod__Group_4_1__03984);
            rule__SJMethod__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethod__Group_4_1__1_in_rule__SJMethod__Group_4_1__03987);
            rule__SJMethod__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_4_1__0"


    // $ANTLR start "rule__SJMethod__Group_4_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1962:1: rule__SJMethod__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__SJMethod__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1966:1: ( ( ',' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1967:1: ( ',' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1967:1: ( ',' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1968:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__SJMethod__Group_4_1__0__Impl4015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__SJMethod__Group_4_1__0__Impl"


    // $ANTLR start "rule__SJMethod__Group_4_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1981:1: rule__SJMethod__Group_4_1__1 : rule__SJMethod__Group_4_1__1__Impl ;
    public final void rule__SJMethod__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1985:1: ( rule__SJMethod__Group_4_1__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1986:2: rule__SJMethod__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SJMethod__Group_4_1__1__Impl_in_rule__SJMethod__Group_4_1__14046);
            rule__SJMethod__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethod__Group_4_1__1"


    // $ANTLR start "rule__SJMethod__Group_4_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1992:1: rule__SJMethod__Group_4_1__1__Impl : ( ( rule__SJMethod__ParamsAssignment_4_1_1 ) ) ;
    public final void rule__SJMethod__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1996:1: ( ( ( rule__SJMethod__ParamsAssignment_4_1_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1997:1: ( ( rule__SJMethod__ParamsAssignment_4_1_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1997:1: ( ( rule__SJMethod__ParamsAssignment_4_1_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1998:1: ( rule__SJMethod__ParamsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsAssignment_4_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1999:1: ( rule__SJMethod__ParamsAssignment_4_1_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:1999:2: rule__SJMethod__ParamsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__SJMethod__ParamsAssignment_4_1_1_in_rule__SJMethod__Group_4_1__1__Impl4073);
            rule__SJMethod__ParamsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsAssignment_4_1_1()); 
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
    // $ANTLR end "rule__SJMethod__Group_4_1__1__Impl"


    // $ANTLR start "rule__SJParameter__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2013:1: rule__SJParameter__Group__0 : rule__SJParameter__Group__0__Impl rule__SJParameter__Group__1 ;
    public final void rule__SJParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2017:1: ( rule__SJParameter__Group__0__Impl rule__SJParameter__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2018:2: rule__SJParameter__Group__0__Impl rule__SJParameter__Group__1
            {
            pushFollow(FOLLOW_rule__SJParameter__Group__0__Impl_in_rule__SJParameter__Group__04107);
            rule__SJParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJParameter__Group__1_in_rule__SJParameter__Group__04110);
            rule__SJParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJParameter__Group__0"


    // $ANTLR start "rule__SJParameter__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2025:1: rule__SJParameter__Group__0__Impl : ( ( rule__SJParameter__TypeAssignment_0 ) ) ;
    public final void rule__SJParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2029:1: ( ( ( rule__SJParameter__TypeAssignment_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2030:1: ( ( rule__SJParameter__TypeAssignment_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2030:1: ( ( rule__SJParameter__TypeAssignment_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2031:1: ( rule__SJParameter__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getTypeAssignment_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2032:1: ( rule__SJParameter__TypeAssignment_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2032:2: rule__SJParameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__SJParameter__TypeAssignment_0_in_rule__SJParameter__Group__0__Impl4137);
            rule__SJParameter__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__SJParameter__Group__0__Impl"


    // $ANTLR start "rule__SJParameter__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2042:1: rule__SJParameter__Group__1 : rule__SJParameter__Group__1__Impl ;
    public final void rule__SJParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2046:1: ( rule__SJParameter__Group__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2047:2: rule__SJParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SJParameter__Group__1__Impl_in_rule__SJParameter__Group__14167);
            rule__SJParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJParameter__Group__1"


    // $ANTLR start "rule__SJParameter__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2053:1: rule__SJParameter__Group__1__Impl : ( ( rule__SJParameter__NameAssignment_1 ) ) ;
    public final void rule__SJParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2057:1: ( ( ( rule__SJParameter__NameAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2058:1: ( ( rule__SJParameter__NameAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2058:1: ( ( rule__SJParameter__NameAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2059:1: ( rule__SJParameter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getNameAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2060:1: ( rule__SJParameter__NameAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2060:2: rule__SJParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SJParameter__NameAssignment_1_in_rule__SJParameter__Group__1__Impl4194);
            rule__SJParameter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SJParameter__Group__1__Impl"


    // $ANTLR start "rule__SJMethodBody__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2074:1: rule__SJMethodBody__Group__0 : rule__SJMethodBody__Group__0__Impl rule__SJMethodBody__Group__1 ;
    public final void rule__SJMethodBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2078:1: ( rule__SJMethodBody__Group__0__Impl rule__SJMethodBody__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2079:2: rule__SJMethodBody__Group__0__Impl rule__SJMethodBody__Group__1
            {
            pushFollow(FOLLOW_rule__SJMethodBody__Group__0__Impl_in_rule__SJMethodBody__Group__04228);
            rule__SJMethodBody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethodBody__Group__1_in_rule__SJMethodBody__Group__04231);
            rule__SJMethodBody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethodBody__Group__0"


    // $ANTLR start "rule__SJMethodBody__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2086:1: rule__SJMethodBody__Group__0__Impl : ( () ) ;
    public final void rule__SJMethodBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2090:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2091:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2091:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2092:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getSJMethodBodyAction_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2093:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2095:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getSJMethodBodyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethodBody__Group__0__Impl"


    // $ANTLR start "rule__SJMethodBody__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2105:1: rule__SJMethodBody__Group__1 : rule__SJMethodBody__Group__1__Impl rule__SJMethodBody__Group__2 ;
    public final void rule__SJMethodBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2109:1: ( rule__SJMethodBody__Group__1__Impl rule__SJMethodBody__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2110:2: rule__SJMethodBody__Group__1__Impl rule__SJMethodBody__Group__2
            {
            pushFollow(FOLLOW_rule__SJMethodBody__Group__1__Impl_in_rule__SJMethodBody__Group__14289);
            rule__SJMethodBody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethodBody__Group__2_in_rule__SJMethodBody__Group__14292);
            rule__SJMethodBody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethodBody__Group__1"


    // $ANTLR start "rule__SJMethodBody__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2117:1: rule__SJMethodBody__Group__1__Impl : ( '{' ) ;
    public final void rule__SJMethodBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2121:1: ( ( '{' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2122:1: ( '{' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2122:1: ( '{' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2123:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__SJMethodBody__Group__1__Impl4320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__SJMethodBody__Group__1__Impl"


    // $ANTLR start "rule__SJMethodBody__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2136:1: rule__SJMethodBody__Group__2 : rule__SJMethodBody__Group__2__Impl rule__SJMethodBody__Group__3 ;
    public final void rule__SJMethodBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2140:1: ( rule__SJMethodBody__Group__2__Impl rule__SJMethodBody__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2141:2: rule__SJMethodBody__Group__2__Impl rule__SJMethodBody__Group__3
            {
            pushFollow(FOLLOW_rule__SJMethodBody__Group__2__Impl_in_rule__SJMethodBody__Group__24351);
            rule__SJMethodBody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJMethodBody__Group__3_in_rule__SJMethodBody__Group__24354);
            rule__SJMethodBody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethodBody__Group__2"


    // $ANTLR start "rule__SJMethodBody__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2148:1: rule__SJMethodBody__Group__2__Impl : ( ( rule__SJMethodBody__StatementsAssignment_2 )* ) ;
    public final void rule__SJMethodBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2152:1: ( ( ( rule__SJMethodBody__StatementsAssignment_2 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2153:1: ( ( rule__SJMethodBody__StatementsAssignment_2 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2153:1: ( ( rule__SJMethodBody__StatementsAssignment_2 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2154:1: ( rule__SJMethodBody__StatementsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getStatementsAssignment_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2155:1: ( rule__SJMethodBody__StatementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||LA18_0==25||LA18_0==28||LA18_0==30||(LA18_0>=32 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2155:2: rule__SJMethodBody__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SJMethodBody__StatementsAssignment_2_in_rule__SJMethodBody__Group__2__Impl4381);
            	    rule__SJMethodBody__StatementsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getStatementsAssignment_2()); 
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
    // $ANTLR end "rule__SJMethodBody__Group__2__Impl"


    // $ANTLR start "rule__SJMethodBody__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2165:1: rule__SJMethodBody__Group__3 : rule__SJMethodBody__Group__3__Impl ;
    public final void rule__SJMethodBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2169:1: ( rule__SJMethodBody__Group__3__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2170:2: rule__SJMethodBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SJMethodBody__Group__3__Impl_in_rule__SJMethodBody__Group__34412);
            rule__SJMethodBody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJMethodBody__Group__3"


    // $ANTLR start "rule__SJMethodBody__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2176:1: rule__SJMethodBody__Group__3__Impl : ( '}' ) ;
    public final void rule__SJMethodBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2180:1: ( ( '}' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2181:1: ( '}' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2181:1: ( '}' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2182:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__SJMethodBody__Group__3__Impl4440); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__SJMethodBody__Group__3__Impl"


    // $ANTLR start "rule__SJStatement__Group_2__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2203:1: rule__SJStatement__Group_2__0 : rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1 ;
    public final void rule__SJStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2207:1: ( rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2208:2: rule__SJStatement__Group_2__0__Impl rule__SJStatement__Group_2__1
            {
            pushFollow(FOLLOW_rule__SJStatement__Group_2__0__Impl_in_rule__SJStatement__Group_2__04479);
            rule__SJStatement__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJStatement__Group_2__1_in_rule__SJStatement__Group_2__04482);
            rule__SJStatement__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__0"


    // $ANTLR start "rule__SJStatement__Group_2__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2215:1: rule__SJStatement__Group_2__0__Impl : ( ruleSJExpression ) ;
    public final void rule__SJStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2219:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2220:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2220:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2221:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJStatement__Group_2__0__Impl4509);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SJStatement__Group_2__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2232:1: rule__SJStatement__Group_2__1 : rule__SJStatement__Group_2__1__Impl ;
    public final void rule__SJStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2236:1: ( rule__SJStatement__Group_2__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2237:2: rule__SJStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SJStatement__Group_2__1__Impl_in_rule__SJStatement__Group_2__14538);
            rule__SJStatement__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJStatement__Group_2__1"


    // $ANTLR start "rule__SJStatement__Group_2__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2243:1: rule__SJStatement__Group_2__1__Impl : ( ';' ) ;
    public final void rule__SJStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2247:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2248:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2248:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2249:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJStatement__Group_2__1__Impl4566); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1()); 
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
    // $ANTLR end "rule__SJStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SJReturn__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2266:1: rule__SJReturn__Group__0 : rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1 ;
    public final void rule__SJReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2270:1: ( rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2271:2: rule__SJReturn__Group__0__Impl rule__SJReturn__Group__1
            {
            pushFollow(FOLLOW_rule__SJReturn__Group__0__Impl_in_rule__SJReturn__Group__04601);
            rule__SJReturn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJReturn__Group__1_in_rule__SJReturn__Group__04604);
            rule__SJReturn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__0"


    // $ANTLR start "rule__SJReturn__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2278:1: rule__SJReturn__Group__0__Impl : ( 'return' ) ;
    public final void rule__SJReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2282:1: ( ( 'return' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2283:1: ( 'return' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2283:1: ( 'return' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2284:1: 'return'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getReturnKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__SJReturn__Group__0__Impl4632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getReturnKeyword_0()); 
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
    // $ANTLR end "rule__SJReturn__Group__0__Impl"


    // $ANTLR start "rule__SJReturn__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2297:1: rule__SJReturn__Group__1 : rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2 ;
    public final void rule__SJReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2301:1: ( rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2302:2: rule__SJReturn__Group__1__Impl rule__SJReturn__Group__2
            {
            pushFollow(FOLLOW_rule__SJReturn__Group__1__Impl_in_rule__SJReturn__Group__14663);
            rule__SJReturn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJReturn__Group__2_in_rule__SJReturn__Group__14666);
            rule__SJReturn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__1"


    // $ANTLR start "rule__SJReturn__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2309:1: rule__SJReturn__Group__1__Impl : ( ( rule__SJReturn__ExpressionAssignment_1 ) ) ;
    public final void rule__SJReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2313:1: ( ( ( rule__SJReturn__ExpressionAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2314:1: ( ( rule__SJReturn__ExpressionAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2314:1: ( ( rule__SJReturn__ExpressionAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2315:1: ( rule__SJReturn__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getExpressionAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2316:1: ( rule__SJReturn__ExpressionAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2316:2: rule__SJReturn__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__SJReturn__ExpressionAssignment_1_in_rule__SJReturn__Group__1__Impl4693);
            rule__SJReturn__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__SJReturn__Group__1__Impl"


    // $ANTLR start "rule__SJReturn__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2326:1: rule__SJReturn__Group__2 : rule__SJReturn__Group__2__Impl ;
    public final void rule__SJReturn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2330:1: ( rule__SJReturn__Group__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2331:2: rule__SJReturn__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SJReturn__Group__2__Impl_in_rule__SJReturn__Group__24723);
            rule__SJReturn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJReturn__Group__2"


    // $ANTLR start "rule__SJReturn__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2337:1: rule__SJReturn__Group__2__Impl : ( ';' ) ;
    public final void rule__SJReturn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2341:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2342:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2342:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2343:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getSemicolonKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJReturn__Group__2__Impl4751); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getSemicolonKeyword_2()); 
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
    // $ANTLR end "rule__SJReturn__Group__2__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2362:1: rule__SJVariableDeclaration__Group__0 : rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1 ;
    public final void rule__SJVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2366:1: ( rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2367:2: rule__SJVariableDeclaration__Group__0__Impl rule__SJVariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__0__Impl_in_rule__SJVariableDeclaration__Group__04788);
            rule__SJVariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__1_in_rule__SJVariableDeclaration__Group__04791);
            rule__SJVariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__0"


    // $ANTLR start "rule__SJVariableDeclaration__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2374:1: rule__SJVariableDeclaration__Group__0__Impl : ( ( rule__SJVariableDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__SJVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2378:1: ( ( ( rule__SJVariableDeclaration__TypeAssignment_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2379:1: ( ( rule__SJVariableDeclaration__TypeAssignment_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2379:1: ( ( rule__SJVariableDeclaration__TypeAssignment_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2380:1: ( rule__SJVariableDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getTypeAssignment_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2381:1: ( rule__SJVariableDeclaration__TypeAssignment_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2381:2: rule__SJVariableDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__TypeAssignment_0_in_rule__SJVariableDeclaration__Group__0__Impl4818);
            rule__SJVariableDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2391:1: rule__SJVariableDeclaration__Group__1 : rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2 ;
    public final void rule__SJVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2395:1: ( rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2396:2: rule__SJVariableDeclaration__Group__1__Impl rule__SJVariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__1__Impl_in_rule__SJVariableDeclaration__Group__14848);
            rule__SJVariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__2_in_rule__SJVariableDeclaration__Group__14851);
            rule__SJVariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__1"


    // $ANTLR start "rule__SJVariableDeclaration__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2403:1: rule__SJVariableDeclaration__Group__1__Impl : ( ( rule__SJVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__SJVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2407:1: ( ( ( rule__SJVariableDeclaration__NameAssignment_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2408:1: ( ( rule__SJVariableDeclaration__NameAssignment_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2408:1: ( ( rule__SJVariableDeclaration__NameAssignment_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2409:1: ( rule__SJVariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2410:1: ( rule__SJVariableDeclaration__NameAssignment_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2410:2: rule__SJVariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__NameAssignment_1_in_rule__SJVariableDeclaration__Group__1__Impl4878);
            rule__SJVariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2420:1: rule__SJVariableDeclaration__Group__2 : rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3 ;
    public final void rule__SJVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2424:1: ( rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2425:2: rule__SJVariableDeclaration__Group__2__Impl rule__SJVariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__2__Impl_in_rule__SJVariableDeclaration__Group__24908);
            rule__SJVariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__3_in_rule__SJVariableDeclaration__Group__24911);
            rule__SJVariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__2"


    // $ANTLR start "rule__SJVariableDeclaration__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2432:1: rule__SJVariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__SJVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2436:1: ( ( '=' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2437:1: ( '=' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2437:1: ( '=' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2438:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__SJVariableDeclaration__Group__2__Impl4939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_2()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2451:1: rule__SJVariableDeclaration__Group__3 : rule__SJVariableDeclaration__Group__3__Impl rule__SJVariableDeclaration__Group__4 ;
    public final void rule__SJVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2455:1: ( rule__SJVariableDeclaration__Group__3__Impl rule__SJVariableDeclaration__Group__4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2456:2: rule__SJVariableDeclaration__Group__3__Impl rule__SJVariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__3__Impl_in_rule__SJVariableDeclaration__Group__34970);
            rule__SJVariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__4_in_rule__SJVariableDeclaration__Group__34973);
            rule__SJVariableDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__3"


    // $ANTLR start "rule__SJVariableDeclaration__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2463:1: rule__SJVariableDeclaration__Group__3__Impl : ( ( rule__SJVariableDeclaration__ExpressionAssignment_3 ) ) ;
    public final void rule__SJVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2467:1: ( ( ( rule__SJVariableDeclaration__ExpressionAssignment_3 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2468:1: ( ( rule__SJVariableDeclaration__ExpressionAssignment_3 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2468:1: ( ( rule__SJVariableDeclaration__ExpressionAssignment_3 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2469:1: ( rule__SJVariableDeclaration__ExpressionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getExpressionAssignment_3()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2470:1: ( rule__SJVariableDeclaration__ExpressionAssignment_3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2470:2: rule__SJVariableDeclaration__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__ExpressionAssignment_3_in_rule__SJVariableDeclaration__Group__3__Impl5000);
            rule__SJVariableDeclaration__ExpressionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getExpressionAssignment_3()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SJVariableDeclaration__Group__4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2480:1: rule__SJVariableDeclaration__Group__4 : rule__SJVariableDeclaration__Group__4__Impl ;
    public final void rule__SJVariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2484:1: ( rule__SJVariableDeclaration__Group__4__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2485:2: rule__SJVariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SJVariableDeclaration__Group__4__Impl_in_rule__SJVariableDeclaration__Group__45030);
            rule__SJVariableDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJVariableDeclaration__Group__4"


    // $ANTLR start "rule__SJVariableDeclaration__Group__4__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2491:1: rule__SJVariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__SJVariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2495:1: ( ( ';' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2496:1: ( ';' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2496:1: ( ';' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2497:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,17,FOLLOW_17_in_rule__SJVariableDeclaration__Group__4__Impl5058); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_4()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2520:1: rule__SJIfStatement__Group__0 : rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1 ;
    public final void rule__SJIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2524:1: ( rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2525:2: rule__SJIfStatement__Group__0__Impl rule__SJIfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__0__Impl_in_rule__SJIfStatement__Group__05099);
            rule__SJIfStatement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group__1_in_rule__SJIfStatement__Group__05102);
            rule__SJIfStatement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__0"


    // $ANTLR start "rule__SJIfStatement__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2532:1: rule__SJIfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__SJIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2536:1: ( ( 'if' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2537:1: ( 'if' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2537:1: ( 'if' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2538:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getIfKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__SJIfStatement__Group__0__Impl5130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__0__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2551:1: rule__SJIfStatement__Group__1 : rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2 ;
    public final void rule__SJIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2555:1: ( rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2556:2: rule__SJIfStatement__Group__1__Impl rule__SJIfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__1__Impl_in_rule__SJIfStatement__Group__15161);
            rule__SJIfStatement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group__2_in_rule__SJIfStatement__Group__15164);
            rule__SJIfStatement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__1"


    // $ANTLR start "rule__SJIfStatement__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2563:1: rule__SJIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SJIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2567:1: ( ( '(' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2568:1: ( '(' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2568:1: ( '(' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2569:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__SJIfStatement__Group__1__Impl5192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__1__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2582:1: rule__SJIfStatement__Group__2 : rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3 ;
    public final void rule__SJIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2586:1: ( rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2587:2: rule__SJIfStatement__Group__2__Impl rule__SJIfStatement__Group__3
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__2__Impl_in_rule__SJIfStatement__Group__25223);
            rule__SJIfStatement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group__3_in_rule__SJIfStatement__Group__25226);
            rule__SJIfStatement__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__2"


    // $ANTLR start "rule__SJIfStatement__Group__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2594:1: rule__SJIfStatement__Group__2__Impl : ( ( rule__SJIfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SJIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2598:1: ( ( ( rule__SJIfStatement__ExpressionAssignment_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2599:1: ( ( rule__SJIfStatement__ExpressionAssignment_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2599:1: ( ( rule__SJIfStatement__ExpressionAssignment_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2600:1: ( rule__SJIfStatement__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getExpressionAssignment_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2601:1: ( rule__SJIfStatement__ExpressionAssignment_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2601:2: rule__SJIfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SJIfStatement__ExpressionAssignment_2_in_rule__SJIfStatement__Group__2__Impl5253);
            rule__SJIfStatement__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__2__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2611:1: rule__SJIfStatement__Group__3 : rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4 ;
    public final void rule__SJIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2615:1: ( rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2616:2: rule__SJIfStatement__Group__3__Impl rule__SJIfStatement__Group__4
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__3__Impl_in_rule__SJIfStatement__Group__35283);
            rule__SJIfStatement__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group__4_in_rule__SJIfStatement__Group__35286);
            rule__SJIfStatement__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__3"


    // $ANTLR start "rule__SJIfStatement__Group__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2623:1: rule__SJIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__SJIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2627:1: ( ( ')' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2628:1: ( ')' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2628:1: ( ')' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2629:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__SJIfStatement__Group__3__Impl5314); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__3__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2642:1: rule__SJIfStatement__Group__4 : rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5 ;
    public final void rule__SJIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2646:1: ( rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2647:2: rule__SJIfStatement__Group__4__Impl rule__SJIfStatement__Group__5
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__4__Impl_in_rule__SJIfStatement__Group__45345);
            rule__SJIfStatement__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group__5_in_rule__SJIfStatement__Group__45348);
            rule__SJIfStatement__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__4"


    // $ANTLR start "rule__SJIfStatement__Group__4__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2654:1: rule__SJIfStatement__Group__4__Impl : ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) ) ;
    public final void rule__SJIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2658:1: ( ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2659:1: ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2659:1: ( ( rule__SJIfStatement__ThenBlockAssignment_4 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2660:1: ( rule__SJIfStatement__ThenBlockAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getThenBlockAssignment_4()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2661:1: ( rule__SJIfStatement__ThenBlockAssignment_4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2661:2: rule__SJIfStatement__ThenBlockAssignment_4
            {
            pushFollow(FOLLOW_rule__SJIfStatement__ThenBlockAssignment_4_in_rule__SJIfStatement__Group__4__Impl5375);
            rule__SJIfStatement__ThenBlockAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getThenBlockAssignment_4()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__4__Impl"


    // $ANTLR start "rule__SJIfStatement__Group__5"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2671:1: rule__SJIfStatement__Group__5 : rule__SJIfStatement__Group__5__Impl ;
    public final void rule__SJIfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2675:1: ( rule__SJIfStatement__Group__5__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2676:2: rule__SJIfStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group__5__Impl_in_rule__SJIfStatement__Group__55405);
            rule__SJIfStatement__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group__5"


    // $ANTLR start "rule__SJIfStatement__Group__5__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2682:1: rule__SJIfStatement__Group__5__Impl : ( ( rule__SJIfStatement__Group_5__0 )? ) ;
    public final void rule__SJIfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2686:1: ( ( ( rule__SJIfStatement__Group_5__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2687:1: ( ( rule__SJIfStatement__Group_5__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2687:1: ( ( rule__SJIfStatement__Group_5__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2688:1: ( rule__SJIfStatement__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getGroup_5()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2689:1: ( rule__SJIfStatement__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                int LA19_1 = input.LA(2);

                if ( (synpred29_InternalSmallJava()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2689:2: rule__SJIfStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__SJIfStatement__Group_5__0_in_rule__SJIfStatement__Group__5__Impl5432);
                    rule__SJIfStatement__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getGroup_5()); 
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
    // $ANTLR end "rule__SJIfStatement__Group__5__Impl"


    // $ANTLR start "rule__SJIfStatement__Group_5__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2711:1: rule__SJIfStatement__Group_5__0 : rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1 ;
    public final void rule__SJIfStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2715:1: ( rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2716:2: rule__SJIfStatement__Group_5__0__Impl rule__SJIfStatement__Group_5__1
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group_5__0__Impl_in_rule__SJIfStatement__Group_5__05475);
            rule__SJIfStatement__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfStatement__Group_5__1_in_rule__SJIfStatement__Group_5__05478);
            rule__SJIfStatement__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__0"


    // $ANTLR start "rule__SJIfStatement__Group_5__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2723:1: rule__SJIfStatement__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__SJIfStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2727:1: ( ( ( 'else' ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2728:1: ( ( 'else' ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2728:1: ( ( 'else' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2729:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2730:1: ( 'else' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2731:2: 'else'
            {
            match(input,31,FOLLOW_31_in_rule__SJIfStatement__Group_5__0__Impl5507); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__SJIfStatement__Group_5__0__Impl"


    // $ANTLR start "rule__SJIfStatement__Group_5__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2742:1: rule__SJIfStatement__Group_5__1 : rule__SJIfStatement__Group_5__1__Impl ;
    public final void rule__SJIfStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2746:1: ( rule__SJIfStatement__Group_5__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2747:2: rule__SJIfStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SJIfStatement__Group_5__1__Impl_in_rule__SJIfStatement__Group_5__15539);
            rule__SJIfStatement__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfStatement__Group_5__1"


    // $ANTLR start "rule__SJIfStatement__Group_5__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2753:1: rule__SJIfStatement__Group_5__1__Impl : ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) ) ;
    public final void rule__SJIfStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2757:1: ( ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2758:1: ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2758:1: ( ( rule__SJIfStatement__ElseBlockAssignment_5_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2759:1: ( rule__SJIfStatement__ElseBlockAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseBlockAssignment_5_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2760:1: ( rule__SJIfStatement__ElseBlockAssignment_5_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2760:2: rule__SJIfStatement__ElseBlockAssignment_5_1
            {
            pushFollow(FOLLOW_rule__SJIfStatement__ElseBlockAssignment_5_1_in_rule__SJIfStatement__Group_5__1__Impl5566);
            rule__SJIfStatement__ElseBlockAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseBlockAssignment_5_1()); 
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
    // $ANTLR end "rule__SJIfStatement__Group_5__1__Impl"


    // $ANTLR start "rule__SJIfBlock__Group_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2774:1: rule__SJIfBlock__Group_1__0 : rule__SJIfBlock__Group_1__0__Impl rule__SJIfBlock__Group_1__1 ;
    public final void rule__SJIfBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2778:1: ( rule__SJIfBlock__Group_1__0__Impl rule__SJIfBlock__Group_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2779:2: rule__SJIfBlock__Group_1__0__Impl rule__SJIfBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__SJIfBlock__Group_1__0__Impl_in_rule__SJIfBlock__Group_1__05600);
            rule__SJIfBlock__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfBlock__Group_1__1_in_rule__SJIfBlock__Group_1__05603);
            rule__SJIfBlock__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfBlock__Group_1__0"


    // $ANTLR start "rule__SJIfBlock__Group_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2786:1: rule__SJIfBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__SJIfBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2790:1: ( ( '{' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2791:1: ( '{' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2791:1: ( '{' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2792:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__SJIfBlock__Group_1__0__Impl5631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
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
    // $ANTLR end "rule__SJIfBlock__Group_1__0__Impl"


    // $ANTLR start "rule__SJIfBlock__Group_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2805:1: rule__SJIfBlock__Group_1__1 : rule__SJIfBlock__Group_1__1__Impl rule__SJIfBlock__Group_1__2 ;
    public final void rule__SJIfBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2809:1: ( rule__SJIfBlock__Group_1__1__Impl rule__SJIfBlock__Group_1__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2810:2: rule__SJIfBlock__Group_1__1__Impl rule__SJIfBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__SJIfBlock__Group_1__1__Impl_in_rule__SJIfBlock__Group_1__15662);
            rule__SJIfBlock__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJIfBlock__Group_1__2_in_rule__SJIfBlock__Group_1__15665);
            rule__SJIfBlock__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfBlock__Group_1__1"


    // $ANTLR start "rule__SJIfBlock__Group_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2817:1: rule__SJIfBlock__Group_1__1__Impl : ( ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* ) ) ;
    public final void rule__SJIfBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2821:1: ( ( ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2822:1: ( ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2822:1: ( ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2823:1: ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) ) ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2823:1: ( ( rule__SJIfBlock__StatementsAssignment_1_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2824:1: ( rule__SJIfBlock__StatementsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2825:1: ( rule__SJIfBlock__StatementsAssignment_1_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2825:2: rule__SJIfBlock__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SJIfBlock__StatementsAssignment_1_1_in_rule__SJIfBlock__Group_1__1__Impl5694);
            rule__SJIfBlock__StatementsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_1_1()); 
            }

            }

            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2828:1: ( ( rule__SJIfBlock__StatementsAssignment_1_1 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2829:1: ( rule__SJIfBlock__StatementsAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2830:1: ( rule__SJIfBlock__StatementsAssignment_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||(LA20_0>=11 && LA20_0<=12)||LA20_0==25||LA20_0==28||LA20_0==30||(LA20_0>=32 && LA20_0<=35)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2830:2: rule__SJIfBlock__StatementsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__SJIfBlock__StatementsAssignment_1_1_in_rule__SJIfBlock__Group_1__1__Impl5706);
            	    rule__SJIfBlock__StatementsAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getStatementsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__SJIfBlock__Group_1__1__Impl"


    // $ANTLR start "rule__SJIfBlock__Group_1__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2841:1: rule__SJIfBlock__Group_1__2 : rule__SJIfBlock__Group_1__2__Impl ;
    public final void rule__SJIfBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2845:1: ( rule__SJIfBlock__Group_1__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2846:2: rule__SJIfBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SJIfBlock__Group_1__2__Impl_in_rule__SJIfBlock__Group_1__25739);
            rule__SJIfBlock__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJIfBlock__Group_1__2"


    // $ANTLR start "rule__SJIfBlock__Group_1__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2852:1: rule__SJIfBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__SJIfBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2856:1: ( ( '}' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2857:1: ( '}' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2857:1: ( '}' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2858:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__SJIfBlock__Group_1__2__Impl5767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getRightCurlyBracketKeyword_1_2()); 
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
    // $ANTLR end "rule__SJIfBlock__Group_1__2__Impl"


    // $ANTLR start "rule__SJAssignment__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2877:1: rule__SJAssignment__Group__0 : rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1 ;
    public final void rule__SJAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2881:1: ( rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2882:2: rule__SJAssignment__Group__0__Impl rule__SJAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group__0__Impl_in_rule__SJAssignment__Group__05804);
            rule__SJAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJAssignment__Group__1_in_rule__SJAssignment__Group__05807);
            rule__SJAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__0"


    // $ANTLR start "rule__SJAssignment__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2889:1: rule__SJAssignment__Group__0__Impl : ( ruleSJSelectionExpression ) ;
    public final void rule__SJAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2893:1: ( ( ruleSJSelectionExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2894:1: ( ruleSJSelectionExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2894:1: ( ruleSJSelectionExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2895:1: ruleSJSelectionExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSJSelectionExpression_in_rule__SJAssignment__Group__0__Impl5834);
            ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__SJAssignment__Group__0__Impl"


    // $ANTLR start "rule__SJAssignment__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2906:1: rule__SJAssignment__Group__1 : rule__SJAssignment__Group__1__Impl ;
    public final void rule__SJAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2910:1: ( rule__SJAssignment__Group__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2911:2: rule__SJAssignment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group__1__Impl_in_rule__SJAssignment__Group__15863);
            rule__SJAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group__1"


    // $ANTLR start "rule__SJAssignment__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2917:1: rule__SJAssignment__Group__1__Impl : ( ( rule__SJAssignment__Group_1__0 )? ) ;
    public final void rule__SJAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2921:1: ( ( ( rule__SJAssignment__Group_1__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2922:1: ( ( rule__SJAssignment__Group_1__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2922:1: ( ( rule__SJAssignment__Group_1__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2923:1: ( rule__SJAssignment__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getGroup_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2924:1: ( rule__SJAssignment__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2924:2: rule__SJAssignment__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SJAssignment__Group_1__0_in_rule__SJAssignment__Group__1__Impl5890);
                    rule__SJAssignment__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getGroup_1()); 
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
    // $ANTLR end "rule__SJAssignment__Group__1__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2938:1: rule__SJAssignment__Group_1__0 : rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1 ;
    public final void rule__SJAssignment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2942:1: ( rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2943:2: rule__SJAssignment__Group_1__0__Impl rule__SJAssignment__Group_1__1
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group_1__0__Impl_in_rule__SJAssignment__Group_1__05925);
            rule__SJAssignment__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJAssignment__Group_1__1_in_rule__SJAssignment__Group_1__05928);
            rule__SJAssignment__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__0"


    // $ANTLR start "rule__SJAssignment__Group_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2950:1: rule__SJAssignment__Group_1__0__Impl : ( () ) ;
    public final void rule__SJAssignment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2954:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2955:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2955:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2956:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2957:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2959:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__0__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2969:1: rule__SJAssignment__Group_1__1 : rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2 ;
    public final void rule__SJAssignment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2973:1: ( rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2974:2: rule__SJAssignment__Group_1__1__Impl rule__SJAssignment__Group_1__2
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group_1__1__Impl_in_rule__SJAssignment__Group_1__15986);
            rule__SJAssignment__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJAssignment__Group_1__2_in_rule__SJAssignment__Group_1__15989);
            rule__SJAssignment__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__1"


    // $ANTLR start "rule__SJAssignment__Group_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2981:1: rule__SJAssignment__Group_1__1__Impl : ( '=' ) ;
    public final void rule__SJAssignment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2985:1: ( ( '=' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2986:1: ( '=' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2986:1: ( '=' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2987:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__SJAssignment__Group_1__1__Impl6017); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1()); 
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
    // $ANTLR end "rule__SJAssignment__Group_1__1__Impl"


    // $ANTLR start "rule__SJAssignment__Group_1__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3000:1: rule__SJAssignment__Group_1__2 : rule__SJAssignment__Group_1__2__Impl ;
    public final void rule__SJAssignment__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3004:1: ( rule__SJAssignment__Group_1__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3005:2: rule__SJAssignment__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SJAssignment__Group_1__2__Impl_in_rule__SJAssignment__Group_1__26048);
            rule__SJAssignment__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJAssignment__Group_1__2"


    // $ANTLR start "rule__SJAssignment__Group_1__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3011:1: rule__SJAssignment__Group_1__2__Impl : ( ( rule__SJAssignment__RightAssignment_1_2 ) ) ;
    public final void rule__SJAssignment__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3015:1: ( ( ( rule__SJAssignment__RightAssignment_1_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3016:1: ( ( rule__SJAssignment__RightAssignment_1_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3016:1: ( ( rule__SJAssignment__RightAssignment_1_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3017:1: ( rule__SJAssignment__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getRightAssignment_1_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3018:1: ( rule__SJAssignment__RightAssignment_1_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3018:2: rule__SJAssignment__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SJAssignment__RightAssignment_1_2_in_rule__SJAssignment__Group_1__2__Impl6075);
            rule__SJAssignment__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__SJAssignment__Group_1__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3034:1: rule__SJSelectionExpression__Group__0 : rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1 ;
    public final void rule__SJSelectionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3038:1: ( rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3039:2: rule__SJSelectionExpression__Group__0__Impl rule__SJSelectionExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group__0__Impl_in_rule__SJSelectionExpression__Group__06111);
            rule__SJSelectionExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group__1_in_rule__SJSelectionExpression__Group__06114);
            rule__SJSelectionExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__0"


    // $ANTLR start "rule__SJSelectionExpression__Group__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3046:1: rule__SJSelectionExpression__Group__0__Impl : ( ruleSJTerminalExpression ) ;
    public final void rule__SJSelectionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3050:1: ( ( ruleSJTerminalExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3051:1: ( ruleSJTerminalExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3051:1: ( ruleSJTerminalExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3052:1: ruleSJTerminalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSJTerminalExpression_in_rule__SJSelectionExpression__Group__0__Impl6141);
            ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3063:1: rule__SJSelectionExpression__Group__1 : rule__SJSelectionExpression__Group__1__Impl ;
    public final void rule__SJSelectionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3067:1: ( rule__SJSelectionExpression__Group__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3068:2: rule__SJSelectionExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group__1__Impl_in_rule__SJSelectionExpression__Group__16170);
            rule__SJSelectionExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group__1"


    // $ANTLR start "rule__SJSelectionExpression__Group__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3074:1: rule__SJSelectionExpression__Group__1__Impl : ( ( rule__SJSelectionExpression__Group_1__0 )* ) ;
    public final void rule__SJSelectionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3078:1: ( ( ( rule__SJSelectionExpression__Group_1__0 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3079:1: ( ( rule__SJSelectionExpression__Group_1__0 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3079:1: ( ( rule__SJSelectionExpression__Group_1__0 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3080:1: ( rule__SJSelectionExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3081:1: ( rule__SJSelectionExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3081:2: rule__SJSelectionExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__0_in_rule__SJSelectionExpression__Group__1__Impl6197);
            	    rule__SJSelectionExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3095:1: rule__SJSelectionExpression__Group_1__0 : rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1 ;
    public final void rule__SJSelectionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3099:1: ( rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3100:2: rule__SJSelectionExpression__Group_1__0__Impl rule__SJSelectionExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__0__Impl_in_rule__SJSelectionExpression__Group_1__06232);
            rule__SJSelectionExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__1_in_rule__SJSelectionExpression__Group_1__06235);
            rule__SJSelectionExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3107:1: rule__SJSelectionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SJSelectionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3111:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3112:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3112:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3113:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3114:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3116:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3126:1: rule__SJSelectionExpression__Group_1__1 : rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2 ;
    public final void rule__SJSelectionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3130:1: ( rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3131:2: rule__SJSelectionExpression__Group_1__1__Impl rule__SJSelectionExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__1__Impl_in_rule__SJSelectionExpression__Group_1__16293);
            rule__SJSelectionExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__2_in_rule__SJSelectionExpression__Group_1__16296);
            rule__SJSelectionExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3138:1: rule__SJSelectionExpression__Group_1__1__Impl : ( '.' ) ;
    public final void rule__SJSelectionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3142:1: ( ( '.' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3143:1: ( '.' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3143:1: ( '.' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3144:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__SJSelectionExpression__Group_1__1__Impl6324); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3157:1: rule__SJSelectionExpression__Group_1__2 : rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3 ;
    public final void rule__SJSelectionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3161:1: ( rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3162:2: rule__SJSelectionExpression__Group_1__2__Impl rule__SJSelectionExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__2__Impl_in_rule__SJSelectionExpression__Group_1__26355);
            rule__SJSelectionExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__3_in_rule__SJSelectionExpression__Group_1__26358);
            rule__SJSelectionExpression__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__2"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3169:1: rule__SJSelectionExpression__Group_1__2__Impl : ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) ) ;
    public final void rule__SJSelectionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3173:1: ( ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3174:1: ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3174:1: ( ( rule__SJSelectionExpression__MemberAssignment_1_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3175:1: ( rule__SJSelectionExpression__MemberAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberAssignment_1_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3176:1: ( rule__SJSelectionExpression__MemberAssignment_1_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3176:2: rule__SJSelectionExpression__MemberAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__MemberAssignment_1_2_in_rule__SJSelectionExpression__Group_1__2__Impl6385);
            rule__SJSelectionExpression__MemberAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberAssignment_1_2()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3186:1: rule__SJSelectionExpression__Group_1__3 : rule__SJSelectionExpression__Group_1__3__Impl ;
    public final void rule__SJSelectionExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3190:1: ( rule__SJSelectionExpression__Group_1__3__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3191:2: rule__SJSelectionExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1__3__Impl_in_rule__SJSelectionExpression__Group_1__36415);
            rule__SJSelectionExpression__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1__3"


    // $ANTLR start "rule__SJSelectionExpression__Group_1__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3197:1: rule__SJSelectionExpression__Group_1__3__Impl : ( ( rule__SJSelectionExpression__Group_1_3__0 )? ) ;
    public final void rule__SJSelectionExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3201:1: ( ( ( rule__SJSelectionExpression__Group_1_3__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3202:1: ( ( rule__SJSelectionExpression__Group_1_3__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3202:1: ( ( rule__SJSelectionExpression__Group_1_3__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3203:1: ( rule__SJSelectionExpression__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3204:1: ( rule__SJSelectionExpression__Group_1_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3204:2: rule__SJSelectionExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__0_in_rule__SJSelectionExpression__Group_1__3__Impl6442);
                    rule__SJSelectionExpression__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1__3__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3222:1: rule__SJSelectionExpression__Group_1_3__0 : rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1 ;
    public final void rule__SJSelectionExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3226:1: ( rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3227:2: rule__SJSelectionExpression__Group_1_3__0__Impl rule__SJSelectionExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__0__Impl_in_rule__SJSelectionExpression__Group_1_3__06481);
            rule__SJSelectionExpression__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__1_in_rule__SJSelectionExpression__Group_1_3__06484);
            rule__SJSelectionExpression__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3234:1: rule__SJSelectionExpression__Group_1_3__0__Impl : ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3238:1: ( ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3239:1: ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3239:1: ( ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3240:1: ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3241:1: ( rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3241:2: rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0_in_rule__SJSelectionExpression__Group_1_3__0__Impl6511);
            rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationAssignment_1_3_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3251:1: rule__SJSelectionExpression__Group_1_3__1 : rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2 ;
    public final void rule__SJSelectionExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3255:1: ( rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3256:2: rule__SJSelectionExpression__Group_1_3__1__Impl rule__SJSelectionExpression__Group_1_3__2
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__1__Impl_in_rule__SJSelectionExpression__Group_1_3__16541);
            rule__SJSelectionExpression__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__2_in_rule__SJSelectionExpression__Group_1_3__16544);
            rule__SJSelectionExpression__Group_1_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3263:1: rule__SJSelectionExpression__Group_1_3__1__Impl : ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? ) ;
    public final void rule__SJSelectionExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3267:1: ( ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3268:1: ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3268:1: ( ( rule__SJSelectionExpression__Group_1_3_1__0 )? )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3269:1: ( rule__SJSelectionExpression__Group_1_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3270:1: ( rule__SJSelectionExpression__Group_1_3_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||(LA24_0>=11 && LA24_0<=12)||LA24_0==25||(LA24_0>=32 && LA24_0<=35)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3270:2: rule__SJSelectionExpression__Group_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1__0_in_rule__SJSelectionExpression__Group_1_3__1__Impl6571);
                    rule__SJSelectionExpression__Group_1_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3280:1: rule__SJSelectionExpression__Group_1_3__2 : rule__SJSelectionExpression__Group_1_3__2__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3284:1: ( rule__SJSelectionExpression__Group_1_3__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3285:2: rule__SJSelectionExpression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3__2__Impl_in_rule__SJSelectionExpression__Group_1_3__26602);
            rule__SJSelectionExpression__Group_1_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__2"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3291:1: rule__SJSelectionExpression__Group_1_3__2__Impl : ( ')' ) ;
    public final void rule__SJSelectionExpression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3295:1: ( ( ')' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3296:1: ( ')' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3296:1: ( ')' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3297:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__SJSelectionExpression__Group_1_3__2__Impl6630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3__2__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3316:1: rule__SJSelectionExpression__Group_1_3_1__0 : rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1 ;
    public final void rule__SJSelectionExpression__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3320:1: ( rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3321:2: rule__SJSelectionExpression__Group_1_3_1__0__Impl rule__SJSelectionExpression__Group_1_3_1__1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1__0__Impl_in_rule__SJSelectionExpression__Group_1_3_1__06667);
            rule__SJSelectionExpression__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1__1_in_rule__SJSelectionExpression__Group_1_3_1__06670);
            rule__SJSelectionExpression__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3328:1: rule__SJSelectionExpression__Group_1_3_1__0__Impl : ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3332:1: ( ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3333:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3333:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3334:1: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3335:1: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3335:2: rule__SJSelectionExpression__ArgsAssignment_1_3_1_0
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__ArgsAssignment_1_3_1_0_in_rule__SJSelectionExpression__Group_1_3_1__0__Impl6697);
            rule__SJSelectionExpression__ArgsAssignment_1_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3345:1: rule__SJSelectionExpression__Group_1_3_1__1 : rule__SJSelectionExpression__Group_1_3_1__1__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3349:1: ( rule__SJSelectionExpression__Group_1_3_1__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3350:2: rule__SJSelectionExpression__Group_1_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1__1__Impl_in_rule__SJSelectionExpression__Group_1_3_1__16727);
            rule__SJSelectionExpression__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3356:1: rule__SJSelectionExpression__Group_1_3_1__1__Impl : ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3360:1: ( ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3361:1: ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3361:1: ( ( rule__SJSelectionExpression__Group_1_3_1_1__0 )* )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3362:1: ( rule__SJSelectionExpression__Group_1_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3363:1: ( rule__SJSelectionExpression__Group_1_3_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==27) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3363:2: rule__SJSelectionExpression__Group_1_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__0_in_rule__SJSelectionExpression__Group_1_3_1__1__Impl6754);
            	    rule__SJSelectionExpression__Group_1_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getGroup_1_3_1_1()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3377:1: rule__SJSelectionExpression__Group_1_3_1_1__0 : rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1 ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3381:1: ( rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3382:2: rule__SJSelectionExpression__Group_1_3_1_1__0__Impl rule__SJSelectionExpression__Group_1_3_1_1__1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__0__Impl_in_rule__SJSelectionExpression__Group_1_3_1_1__06789);
            rule__SJSelectionExpression__Group_1_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__1_in_rule__SJSelectionExpression__Group_1_3_1_1__06792);
            rule__SJSelectionExpression__Group_1_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__0"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3389:1: rule__SJSelectionExpression__Group_1_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3393:1: ( ( ',' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3394:1: ( ',' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3394:1: ( ',' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3395:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__SJSelectionExpression__Group_1_3_1_1__0__Impl6820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__0__Impl"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3408:1: rule__SJSelectionExpression__Group_1_3_1_1__1 : rule__SJSelectionExpression__Group_1_3_1_1__1__Impl ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3412:1: ( rule__SJSelectionExpression__Group_1_3_1_1__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3413:2: rule__SJSelectionExpression__Group_1_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__1__Impl_in_rule__SJSelectionExpression__Group_1_3_1_1__16851);
            rule__SJSelectionExpression__Group_1_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__1"


    // $ANTLR start "rule__SJSelectionExpression__Group_1_3_1_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3419:1: rule__SJSelectionExpression__Group_1_3_1_1__1__Impl : ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) ;
    public final void rule__SJSelectionExpression__Group_1_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3423:1: ( ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3424:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3424:1: ( ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3425:1: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3426:1: ( rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3426:2: rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1
            {
            pushFollow(FOLLOW_rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1_in_rule__SJSelectionExpression__Group_1_3_1_1__1__Impl6878);
            rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1()); 
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
    // $ANTLR end "rule__SJSelectionExpression__Group_1_3_1_1__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3440:1: rule__SJTerminalExpression__Group_0__0 : rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1 ;
    public final void rule__SJTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3444:1: ( rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3445:2: rule__SJTerminalExpression__Group_0__0__Impl rule__SJTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_0__0__Impl_in_rule__SJTerminalExpression__Group_0__06912);
            rule__SJTerminalExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_0__1_in_rule__SJTerminalExpression__Group_0__06915);
            rule__SJTerminalExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3452:1: rule__SJTerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3456:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3457:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3457:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3458:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJStringConstantAction_0_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3459:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3461:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJStringConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3471:1: rule__SJTerminalExpression__Group_0__1 : rule__SJTerminalExpression__Group_0__1__Impl ;
    public final void rule__SJTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3475:1: ( rule__SJTerminalExpression__Group_0__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3476:2: rule__SJTerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_0__1__Impl_in_rule__SJTerminalExpression__Group_0__16973);
            rule__SJTerminalExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_0__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_0__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3482:1: rule__SJTerminalExpression__Group_0__1__Impl : ( ( rule__SJTerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3486:1: ( ( ( rule__SJTerminalExpression__ValueAssignment_0_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3487:1: ( ( rule__SJTerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3487:1: ( ( rule__SJTerminalExpression__ValueAssignment_0_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3488:1: ( rule__SJTerminalExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_0_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3489:1: ( rule__SJTerminalExpression__ValueAssignment_0_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3489:2: rule__SJTerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__ValueAssignment_0_1_in_rule__SJTerminalExpression__Group_0__1__Impl7000);
            rule__SJTerminalExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3503:1: rule__SJTerminalExpression__Group_1__0 : rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1 ;
    public final void rule__SJTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3507:1: ( rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3508:2: rule__SJTerminalExpression__Group_1__0__Impl rule__SJTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_1__0__Impl_in_rule__SJTerminalExpression__Group_1__07034);
            rule__SJTerminalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_1__1_in_rule__SJTerminalExpression__Group_1__07037);
            rule__SJTerminalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3515:1: rule__SJTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3519:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3520:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3520:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3521:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJIntConstantAction_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3522:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3524:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJIntConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3534:1: rule__SJTerminalExpression__Group_1__1 : rule__SJTerminalExpression__Group_1__1__Impl ;
    public final void rule__SJTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3538:1: ( rule__SJTerminalExpression__Group_1__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3539:2: rule__SJTerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_1__1__Impl_in_rule__SJTerminalExpression__Group_1__17095);
            rule__SJTerminalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_1__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_1__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3545:1: rule__SJTerminalExpression__Group_1__1__Impl : ( ( rule__SJTerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3549:1: ( ( ( rule__SJTerminalExpression__ValueAssignment_1_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3550:1: ( ( rule__SJTerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3550:1: ( ( rule__SJTerminalExpression__ValueAssignment_1_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3551:1: ( rule__SJTerminalExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_1_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3552:1: ( rule__SJTerminalExpression__ValueAssignment_1_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3552:2: rule__SJTerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__ValueAssignment_1_1_in_rule__SJTerminalExpression__Group_1__1__Impl7122);
            rule__SJTerminalExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3566:1: rule__SJTerminalExpression__Group_2__0 : rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1 ;
    public final void rule__SJTerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3570:1: ( rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3571:2: rule__SJTerminalExpression__Group_2__0__Impl rule__SJTerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_2__0__Impl_in_rule__SJTerminalExpression__Group_2__07156);
            rule__SJTerminalExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_2__1_in_rule__SJTerminalExpression__Group_2__07159);
            rule__SJTerminalExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3578:1: rule__SJTerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3582:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3583:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3583:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3584:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJBoolConstantAction_2_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3585:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3587:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJBoolConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3597:1: rule__SJTerminalExpression__Group_2__1 : rule__SJTerminalExpression__Group_2__1__Impl ;
    public final void rule__SJTerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3601:1: ( rule__SJTerminalExpression__Group_2__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3602:2: rule__SJTerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_2__1__Impl_in_rule__SJTerminalExpression__Group_2__17217);
            rule__SJTerminalExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_2__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_2__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3608:1: rule__SJTerminalExpression__Group_2__1__Impl : ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3612:1: ( ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3613:1: ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3613:1: ( ( rule__SJTerminalExpression__ValueAssignment_2_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3614:1: ( rule__SJTerminalExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_2_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3615:1: ( rule__SJTerminalExpression__ValueAssignment_2_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3615:2: rule__SJTerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__ValueAssignment_2_1_in_rule__SJTerminalExpression__Group_2__1__Impl7244);
            rule__SJTerminalExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3629:1: rule__SJTerminalExpression__Group_3__0 : rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1 ;
    public final void rule__SJTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3633:1: ( rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3634:2: rule__SJTerminalExpression__Group_3__0__Impl rule__SJTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_3__0__Impl_in_rule__SJTerminalExpression__Group_3__07278);
            rule__SJTerminalExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_3__1_in_rule__SJTerminalExpression__Group_3__07281);
            rule__SJTerminalExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3641:1: rule__SJTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3645:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3646:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3646:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3647:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_3_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3648:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3650:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3660:1: rule__SJTerminalExpression__Group_3__1 : rule__SJTerminalExpression__Group_3__1__Impl ;
    public final void rule__SJTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3664:1: ( rule__SJTerminalExpression__Group_3__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3665:2: rule__SJTerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_3__1__Impl_in_rule__SJTerminalExpression__Group_3__17339);
            rule__SJTerminalExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_3__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_3__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3671:1: rule__SJTerminalExpression__Group_3__1__Impl : ( 'this' ) ;
    public final void rule__SJTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3675:1: ( ( 'this' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3676:1: ( 'this' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3676:1: ( 'this' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3677:1: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_3_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__SJTerminalExpression__Group_3__1__Impl7367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_3_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3694:1: rule__SJTerminalExpression__Group_4__0 : rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1 ;
    public final void rule__SJTerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3698:1: ( rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3699:2: rule__SJTerminalExpression__Group_4__0__Impl rule__SJTerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_4__0__Impl_in_rule__SJTerminalExpression__Group_4__07402);
            rule__SJTerminalExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_4__1_in_rule__SJTerminalExpression__Group_4__07405);
            rule__SJTerminalExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3706:1: rule__SJTerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3710:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3711:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3711:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3712:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJSuperAction_4_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3713:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3715:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJSuperAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3725:1: rule__SJTerminalExpression__Group_4__1 : rule__SJTerminalExpression__Group_4__1__Impl ;
    public final void rule__SJTerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3729:1: ( rule__SJTerminalExpression__Group_4__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3730:2: rule__SJTerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_4__1__Impl_in_rule__SJTerminalExpression__Group_4__17463);
            rule__SJTerminalExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_4__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_4__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3736:1: rule__SJTerminalExpression__Group_4__1__Impl : ( 'super' ) ;
    public final void rule__SJTerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3740:1: ( ( 'super' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3741:1: ( 'super' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3741:1: ( 'super' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3742:1: 'super'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSuperKeyword_4_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__SJTerminalExpression__Group_4__1__Impl7491); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSuperKeyword_4_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3759:1: rule__SJTerminalExpression__Group_5__0 : rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1 ;
    public final void rule__SJTerminalExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3763:1: ( rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3764:2: rule__SJTerminalExpression__Group_5__0__Impl rule__SJTerminalExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_5__0__Impl_in_rule__SJTerminalExpression__Group_5__07526);
            rule__SJTerminalExpression__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_5__1_in_rule__SJTerminalExpression__Group_5__07529);
            rule__SJTerminalExpression__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3771:1: rule__SJTerminalExpression__Group_5__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3775:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3776:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3776:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3777:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_5_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3778:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3780:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3790:1: rule__SJTerminalExpression__Group_5__1 : rule__SJTerminalExpression__Group_5__1__Impl ;
    public final void rule__SJTerminalExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3794:1: ( rule__SJTerminalExpression__Group_5__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3795:2: rule__SJTerminalExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_5__1__Impl_in_rule__SJTerminalExpression__Group_5__17587);
            rule__SJTerminalExpression__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_5__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_5__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3801:1: rule__SJTerminalExpression__Group_5__1__Impl : ( 'null' ) ;
    public final void rule__SJTerminalExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3805:1: ( ( 'null' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3806:1: ( 'null' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3806:1: ( 'null' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3807:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_5_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__SJTerminalExpression__Group_5__1__Impl7615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_5_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_5__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_6__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3824:1: rule__SJTerminalExpression__Group_6__0 : rule__SJTerminalExpression__Group_6__0__Impl rule__SJTerminalExpression__Group_6__1 ;
    public final void rule__SJTerminalExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3828:1: ( rule__SJTerminalExpression__Group_6__0__Impl rule__SJTerminalExpression__Group_6__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3829:2: rule__SJTerminalExpression__Group_6__0__Impl rule__SJTerminalExpression__Group_6__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_6__0__Impl_in_rule__SJTerminalExpression__Group_6__07650);
            rule__SJTerminalExpression__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_6__1_in_rule__SJTerminalExpression__Group_6__07653);
            rule__SJTerminalExpression__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_6__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_6__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3836:1: rule__SJTerminalExpression__Group_6__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3840:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3841:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3841:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3842:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_6_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3843:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3845:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_6__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_6__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3855:1: rule__SJTerminalExpression__Group_6__1 : rule__SJTerminalExpression__Group_6__1__Impl ;
    public final void rule__SJTerminalExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3859:1: ( rule__SJTerminalExpression__Group_6__1__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3860:2: rule__SJTerminalExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_6__1__Impl_in_rule__SJTerminalExpression__Group_6__17711);
            rule__SJTerminalExpression__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_6__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_6__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3866:1: rule__SJTerminalExpression__Group_6__1__Impl : ( ( rule__SJTerminalExpression__SymbolAssignment_6_1 ) ) ;
    public final void rule__SJTerminalExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3870:1: ( ( ( rule__SJTerminalExpression__SymbolAssignment_6_1 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3871:1: ( ( rule__SJTerminalExpression__SymbolAssignment_6_1 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3871:1: ( ( rule__SJTerminalExpression__SymbolAssignment_6_1 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3872:1: ( rule__SJTerminalExpression__SymbolAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolAssignment_6_1()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3873:1: ( rule__SJTerminalExpression__SymbolAssignment_6_1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3873:2: rule__SJTerminalExpression__SymbolAssignment_6_1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__SymbolAssignment_6_1_in_rule__SJTerminalExpression__Group_6__1__Impl7738);
            rule__SJTerminalExpression__SymbolAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolAssignment_6_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_6__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3887:1: rule__SJTerminalExpression__Group_7__0 : rule__SJTerminalExpression__Group_7__0__Impl rule__SJTerminalExpression__Group_7__1 ;
    public final void rule__SJTerminalExpression__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3891:1: ( rule__SJTerminalExpression__Group_7__0__Impl rule__SJTerminalExpression__Group_7__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3892:2: rule__SJTerminalExpression__Group_7__0__Impl rule__SJTerminalExpression__Group_7__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__0__Impl_in_rule__SJTerminalExpression__Group_7__07772);
            rule__SJTerminalExpression__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__1_in_rule__SJTerminalExpression__Group_7__07775);
            rule__SJTerminalExpression__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3899:1: rule__SJTerminalExpression__Group_7__0__Impl : ( () ) ;
    public final void rule__SJTerminalExpression__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3903:1: ( ( () ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3904:1: ( () )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3904:1: ( () )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3905:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_7_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3906:1: ()
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3908:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_7_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3918:1: rule__SJTerminalExpression__Group_7__1 : rule__SJTerminalExpression__Group_7__1__Impl rule__SJTerminalExpression__Group_7__2 ;
    public final void rule__SJTerminalExpression__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3922:1: ( rule__SJTerminalExpression__Group_7__1__Impl rule__SJTerminalExpression__Group_7__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3923:2: rule__SJTerminalExpression__Group_7__1__Impl rule__SJTerminalExpression__Group_7__2
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__1__Impl_in_rule__SJTerminalExpression__Group_7__17833);
            rule__SJTerminalExpression__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__2_in_rule__SJTerminalExpression__Group_7__17836);
            rule__SJTerminalExpression__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3930:1: rule__SJTerminalExpression__Group_7__1__Impl : ( 'new' ) ;
    public final void rule__SJTerminalExpression__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3934:1: ( ( 'new' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3935:1: ( 'new' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3935:1: ( 'new' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3936:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_7_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__SJTerminalExpression__Group_7__1__Impl7864); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_7_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_7__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3949:1: rule__SJTerminalExpression__Group_7__2 : rule__SJTerminalExpression__Group_7__2__Impl rule__SJTerminalExpression__Group_7__3 ;
    public final void rule__SJTerminalExpression__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3953:1: ( rule__SJTerminalExpression__Group_7__2__Impl rule__SJTerminalExpression__Group_7__3 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3954:2: rule__SJTerminalExpression__Group_7__2__Impl rule__SJTerminalExpression__Group_7__3
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__2__Impl_in_rule__SJTerminalExpression__Group_7__27895);
            rule__SJTerminalExpression__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__3_in_rule__SJTerminalExpression__Group_7__27898);
            rule__SJTerminalExpression__Group_7__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__2"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3961:1: rule__SJTerminalExpression__Group_7__2__Impl : ( ( rule__SJTerminalExpression__TypeAssignment_7_2 ) ) ;
    public final void rule__SJTerminalExpression__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3965:1: ( ( ( rule__SJTerminalExpression__TypeAssignment_7_2 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3966:1: ( ( rule__SJTerminalExpression__TypeAssignment_7_2 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3966:1: ( ( rule__SJTerminalExpression__TypeAssignment_7_2 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3967:1: ( rule__SJTerminalExpression__TypeAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeAssignment_7_2()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3968:1: ( rule__SJTerminalExpression__TypeAssignment_7_2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3968:2: rule__SJTerminalExpression__TypeAssignment_7_2
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__TypeAssignment_7_2_in_rule__SJTerminalExpression__Group_7__2__Impl7925);
            rule__SJTerminalExpression__TypeAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeAssignment_7_2()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_7__2__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3978:1: rule__SJTerminalExpression__Group_7__3 : rule__SJTerminalExpression__Group_7__3__Impl rule__SJTerminalExpression__Group_7__4 ;
    public final void rule__SJTerminalExpression__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3982:1: ( rule__SJTerminalExpression__Group_7__3__Impl rule__SJTerminalExpression__Group_7__4 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3983:2: rule__SJTerminalExpression__Group_7__3__Impl rule__SJTerminalExpression__Group_7__4
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__3__Impl_in_rule__SJTerminalExpression__Group_7__37955);
            rule__SJTerminalExpression__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__4_in_rule__SJTerminalExpression__Group_7__37958);
            rule__SJTerminalExpression__Group_7__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__3"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__3__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3990:1: rule__SJTerminalExpression__Group_7__3__Impl : ( '(' ) ;
    public final void rule__SJTerminalExpression__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3994:1: ( ( '(' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3995:1: ( '(' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3995:1: ( '(' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:3996:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__SJTerminalExpression__Group_7__3__Impl7986); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_7_3()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_7__3__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4009:1: rule__SJTerminalExpression__Group_7__4 : rule__SJTerminalExpression__Group_7__4__Impl ;
    public final void rule__SJTerminalExpression__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4013:1: ( rule__SJTerminalExpression__Group_7__4__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4014:2: rule__SJTerminalExpression__Group_7__4__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_7__4__Impl_in_rule__SJTerminalExpression__Group_7__48017);
            rule__SJTerminalExpression__Group_7__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_7__4"


    // $ANTLR start "rule__SJTerminalExpression__Group_7__4__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4020:1: rule__SJTerminalExpression__Group_7__4__Impl : ( ')' ) ;
    public final void rule__SJTerminalExpression__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4024:1: ( ( ')' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4025:1: ( ')' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4025:1: ( ')' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4026:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_7_4()); 
            }
            match(input,26,FOLLOW_26_in_rule__SJTerminalExpression__Group_7__4__Impl8045); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_7_4()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_7__4__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4049:1: rule__SJTerminalExpression__Group_8__0 : rule__SJTerminalExpression__Group_8__0__Impl rule__SJTerminalExpression__Group_8__1 ;
    public final void rule__SJTerminalExpression__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4053:1: ( rule__SJTerminalExpression__Group_8__0__Impl rule__SJTerminalExpression__Group_8__1 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4054:2: rule__SJTerminalExpression__Group_8__0__Impl rule__SJTerminalExpression__Group_8__1
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__0__Impl_in_rule__SJTerminalExpression__Group_8__08086);
            rule__SJTerminalExpression__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__1_in_rule__SJTerminalExpression__Group_8__08089);
            rule__SJTerminalExpression__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_8__0"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__0__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4061:1: rule__SJTerminalExpression__Group_8__0__Impl : ( '(' ) ;
    public final void rule__SJTerminalExpression__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4065:1: ( ( '(' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4066:1: ( '(' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4066:1: ( '(' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4067:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__SJTerminalExpression__Group_8__0__Impl8117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_8_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_8__0__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4080:1: rule__SJTerminalExpression__Group_8__1 : rule__SJTerminalExpression__Group_8__1__Impl rule__SJTerminalExpression__Group_8__2 ;
    public final void rule__SJTerminalExpression__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4084:1: ( rule__SJTerminalExpression__Group_8__1__Impl rule__SJTerminalExpression__Group_8__2 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4085:2: rule__SJTerminalExpression__Group_8__1__Impl rule__SJTerminalExpression__Group_8__2
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__1__Impl_in_rule__SJTerminalExpression__Group_8__18148);
            rule__SJTerminalExpression__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__2_in_rule__SJTerminalExpression__Group_8__18151);
            rule__SJTerminalExpression__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_8__1"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__1__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4092:1: rule__SJTerminalExpression__Group_8__1__Impl : ( ruleSJExpression ) ;
    public final void rule__SJTerminalExpression__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4096:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4097:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4097:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4098:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_8_1()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJTerminalExpression__Group_8__1__Impl8178);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_8_1()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_8__1__Impl"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4109:1: rule__SJTerminalExpression__Group_8__2 : rule__SJTerminalExpression__Group_8__2__Impl ;
    public final void rule__SJTerminalExpression__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4113:1: ( rule__SJTerminalExpression__Group_8__2__Impl )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4114:2: rule__SJTerminalExpression__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__Group_8__2__Impl_in_rule__SJTerminalExpression__Group_8__28207);
            rule__SJTerminalExpression__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SJTerminalExpression__Group_8__2"


    // $ANTLR start "rule__SJTerminalExpression__Group_8__2__Impl"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4120:1: rule__SJTerminalExpression__Group_8__2__Impl : ( ')' ) ;
    public final void rule__SJTerminalExpression__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4124:1: ( ( ')' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4125:1: ( ')' )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4125:1: ( ')' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4126:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__SJTerminalExpression__Group_8__2__Impl8235); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_8_2()); 
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
    // $ANTLR end "rule__SJTerminalExpression__Group_8__2__Impl"


    // $ANTLR start "rule__SJProgram__NameAssignment_0_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4146:1: rule__SJProgram__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__SJProgram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4150:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4151:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4151:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4152:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJProgram__NameAssignment_0_18277);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__SJProgram__NameAssignment_0_1"


    // $ANTLR start "rule__SJProgram__ImportsAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4161:1: rule__SJProgram__ImportsAssignment_1 : ( ruleSJImport ) ;
    public final void rule__SJProgram__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4165:1: ( ( ruleSJImport ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4166:1: ( ruleSJImport )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4166:1: ( ruleSJImport )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4167:1: ruleSJImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getImportsSJImportParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJImport_in_rule__SJProgram__ImportsAssignment_18308);
            ruleSJImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getImportsSJImportParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJProgram__ImportsAssignment_1"


    // $ANTLR start "rule__SJProgram__ClassesAssignment_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4176:1: rule__SJProgram__ClassesAssignment_2 : ( ruleSJClass ) ;
    public final void rule__SJProgram__ClassesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4180:1: ( ( ruleSJClass ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4181:1: ( ruleSJClass )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4181:1: ( ruleSJClass )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4182:1: ruleSJClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSJClass_in_rule__SJProgram__ClassesAssignment_28339);
            ruleSJClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJProgram__ClassesAssignment_2"


    // $ANTLR start "rule__SJImport__ImportedNamespaceAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4191:1: rule__SJImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__SJImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4195:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4196:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4196:1: ( ruleQualifiedNameWithWildcard )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4197:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__SJImport__ImportedNamespaceAssignment_18370);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__SJClass__NameAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4206:1: rule__SJClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4210:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4211:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4211:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4212:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJClass__NameAssignment_18401); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJClass__NameAssignment_1"


    // $ANTLR start "rule__SJClass__SuperclassAssignment_2_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4221:1: rule__SJClass__SuperclassAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJClass__SuperclassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4225:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4226:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4226:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4227:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4228:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4229:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getSuperclassSJClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJClass__SuperclassAssignment_2_18436);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassSJClassQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__SJClass__SuperclassAssignment_2_1"


    // $ANTLR start "rule__SJClass__MembersAssignment_4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4240:1: rule__SJClass__MembersAssignment_4 : ( ruleSJMember ) ;
    public final void rule__SJClass__MembersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4244:1: ( ( ruleSJMember ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4245:1: ( ruleSJMember )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4245:1: ( ruleSJMember )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4246:1: ruleSJMember
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSJMember_in_rule__SJClass__MembersAssignment_48471);
            ruleSJMember();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__SJClass__MembersAssignment_4"


    // $ANTLR start "rule__SJField__AccessAssignment_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4255:1: rule__SJField__AccessAssignment_0 : ( ruleSJAccessLevel ) ;
    public final void rule__SJField__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4259:1: ( ( ruleSJAccessLevel ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4260:1: ( ruleSJAccessLevel )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4260:1: ( ruleSJAccessLevel )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4261:1: ruleSJAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSJAccessLevel_in_rule__SJField__AccessAssignment_08502);
            ruleSJAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__SJField__AccessAssignment_0"


    // $ANTLR start "rule__SJField__TypeAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4270:1: rule__SJField__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4274:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4275:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4275:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4276:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getTypeSJClassCrossReference_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4277:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4278:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getTypeSJClassQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJField__TypeAssignment_18537);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getTypeSJClassQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getTypeSJClassCrossReference_1_0()); 
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
    // $ANTLR end "rule__SJField__TypeAssignment_1"


    // $ANTLR start "rule__SJField__NameAssignment_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4289:1: rule__SJField__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SJField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4293:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4294:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4294:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4295:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJFieldAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJField__NameAssignment_28572); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJFieldAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJField__NameAssignment_2"


    // $ANTLR start "rule__SJMethod__AccessAssignment_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4304:1: rule__SJMethod__AccessAssignment_0 : ( ruleSJAccessLevel ) ;
    public final void rule__SJMethod__AccessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4308:1: ( ( ruleSJAccessLevel ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4309:1: ( ruleSJAccessLevel )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4309:1: ( ruleSJAccessLevel )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4310:1: ruleSJAccessLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSJAccessLevel_in_rule__SJMethod__AccessAssignment_08603);
            ruleSJAccessLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__SJMethod__AccessAssignment_0"


    // $ANTLR start "rule__SJMethod__TypeAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4319:1: rule__SJMethod__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJMethod__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4323:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4324:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4324:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4325:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getTypeSJClassCrossReference_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4326:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4327:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getTypeSJClassQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJMethod__TypeAssignment_18638);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getTypeSJClassQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getTypeSJClassCrossReference_1_0()); 
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
    // $ANTLR end "rule__SJMethod__TypeAssignment_1"


    // $ANTLR start "rule__SJMethod__NameAssignment_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4338:1: rule__SJMethod__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SJMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4342:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4343:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4343:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4344:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJMethod__NameAssignment_28673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJMethod__NameAssignment_2"


    // $ANTLR start "rule__SJMethod__ParamsAssignment_4_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4353:1: rule__SJMethod__ParamsAssignment_4_0 : ( ruleSJParameter ) ;
    public final void rule__SJMethod__ParamsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4357:1: ( ( ruleSJParameter ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4358:1: ( ruleSJParameter )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4358:1: ( ruleSJParameter )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4359:1: ruleSJParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleSJParameter_in_rule__SJMethod__ParamsAssignment_4_08704);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__SJMethod__ParamsAssignment_4_0"


    // $ANTLR start "rule__SJMethod__ParamsAssignment_4_1_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4368:1: rule__SJMethod__ParamsAssignment_4_1_1 : ( ruleSJParameter ) ;
    public final void rule__SJMethod__ParamsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4372:1: ( ( ruleSJParameter ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4373:1: ( ruleSJParameter )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4373:1: ( ruleSJParameter )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4374:1: ruleSJParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJParameter_in_rule__SJMethod__ParamsAssignment_4_1_18735);
            ruleSJParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__SJMethod__ParamsAssignment_4_1_1"


    // $ANTLR start "rule__SJMethod__BodyAssignment_6"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4383:1: rule__SJMethod__BodyAssignment_6 : ( ruleSJMethodBody ) ;
    public final void rule__SJMethod__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4387:1: ( ( ruleSJMethodBody ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4388:1: ( ruleSJMethodBody )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4388:1: ( ruleSJMethodBody )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4389:1: ruleSJMethodBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodAccess().getBodySJMethodBodyParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleSJMethodBody_in_rule__SJMethod__BodyAssignment_68766);
            ruleSJMethodBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodAccess().getBodySJMethodBodyParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__SJMethod__BodyAssignment_6"


    // $ANTLR start "rule__SJParameter__TypeAssignment_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4398:1: rule__SJParameter__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJParameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4402:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4403:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4403:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4404:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getTypeSJClassCrossReference_0_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4405:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4406:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJParameter__TypeAssignment_08801);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getTypeSJClassCrossReference_0_0()); 
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
    // $ANTLR end "rule__SJParameter__TypeAssignment_0"


    // $ANTLR start "rule__SJParameter__NameAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4417:1: rule__SJParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4421:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4422:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4422:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4423:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJParameter__NameAssignment_18836); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJParameterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJParameter__NameAssignment_1"


    // $ANTLR start "rule__SJMethodBody__StatementsAssignment_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4432:1: rule__SJMethodBody__StatementsAssignment_2 : ( ruleSJStatement ) ;
    public final void rule__SJMethodBody__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4436:1: ( ( ruleSJStatement ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4437:1: ( ruleSJStatement )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4437:1: ( ruleSJStatement )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4438:1: ruleSJStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJMethodBodyAccess().getStatementsSJStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSJStatement_in_rule__SJMethodBody__StatementsAssignment_28867);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJMethodBodyAccess().getStatementsSJStatementParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJMethodBody__StatementsAssignment_2"


    // $ANTLR start "rule__SJReturn__ExpressionAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4447:1: rule__SJReturn__ExpressionAssignment_1 : ( ruleSJExpression ) ;
    public final void rule__SJReturn__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4451:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4452:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4452:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4453:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJReturn__ExpressionAssignment_18898);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJReturn__ExpressionAssignment_1"


    // $ANTLR start "rule__SJVariableDeclaration__TypeAssignment_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4462:1: rule__SJVariableDeclaration__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJVariableDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4466:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4467:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4467:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4468:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassCrossReference_0_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4469:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4470:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJVariableDeclaration__TypeAssignment_08933);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassCrossReference_0_0()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__SJVariableDeclaration__NameAssignment_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4481:1: rule__SJVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SJVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4485:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4486:1: ( RULE_ID )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4486:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4487:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJVariableDeclaration__NameAssignment_18968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__SJVariableDeclaration__ExpressionAssignment_3"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4496:1: rule__SJVariableDeclaration__ExpressionAssignment_3 : ( ruleSJExpression ) ;
    public final void rule__SJVariableDeclaration__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4500:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4501:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4501:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4502:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJVariableDeclaration__ExpressionAssignment_38999);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__SJVariableDeclaration__ExpressionAssignment_3"


    // $ANTLR start "rule__SJIfStatement__ExpressionAssignment_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4511:1: rule__SJIfStatement__ExpressionAssignment_2 : ( ruleSJExpression ) ;
    public final void rule__SJIfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4515:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4516:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4516:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4517:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJIfStatement__ExpressionAssignment_29030);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SJIfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SJIfStatement__ThenBlockAssignment_4"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4526:1: rule__SJIfStatement__ThenBlockAssignment_4 : ( ruleSJIfBlock ) ;
    public final void rule__SJIfStatement__ThenBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4530:1: ( ( ruleSJIfBlock ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4531:1: ( ruleSJIfBlock )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4531:1: ( ruleSJIfBlock )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4532:1: ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSJIfBlock_in_rule__SJIfStatement__ThenBlockAssignment_49061);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__SJIfStatement__ThenBlockAssignment_4"


    // $ANTLR start "rule__SJIfStatement__ElseBlockAssignment_5_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4541:1: rule__SJIfStatement__ElseBlockAssignment_5_1 : ( ruleSJIfBlock ) ;
    public final void rule__SJIfStatement__ElseBlockAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4545:1: ( ( ruleSJIfBlock ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4546:1: ( ruleSJIfBlock )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4546:1: ( ruleSJIfBlock )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4547:1: ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJIfBlock_in_rule__SJIfStatement__ElseBlockAssignment_5_19092);
            ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__SJIfStatement__ElseBlockAssignment_5_1"


    // $ANTLR start "rule__SJIfBlock__StatementsAssignment_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4556:1: rule__SJIfBlock__StatementsAssignment_0 : ( ruleSJStatement ) ;
    public final void rule__SJIfBlock__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4560:1: ( ( ruleSJStatement ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4561:1: ( ruleSJStatement )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4561:1: ( ruleSJStatement )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4562:1: ruleSJStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSJStatement_in_rule__SJIfBlock__StatementsAssignment_09123);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__SJIfBlock__StatementsAssignment_0"


    // $ANTLR start "rule__SJIfBlock__StatementsAssignment_1_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4571:1: rule__SJIfBlock__StatementsAssignment_1_1 : ( ruleSJStatement ) ;
    public final void rule__SJIfBlock__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4575:1: ( ( ruleSJStatement ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4576:1: ( ruleSJStatement )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4576:1: ( ruleSJStatement )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4577:1: ruleSJStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJStatement_in_rule__SJIfBlock__StatementsAssignment_1_19154);
            ruleSJStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__SJIfBlock__StatementsAssignment_1_1"


    // $ANTLR start "rule__SJAssignment__RightAssignment_1_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4586:1: rule__SJAssignment__RightAssignment_1_2 : ( ruleSJExpression ) ;
    public final void rule__SJAssignment__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4590:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4591:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4591:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4592:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJAssignment__RightAssignment_1_29185);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__SJAssignment__RightAssignment_1_2"


    // $ANTLR start "rule__SJSelectionExpression__MemberAssignment_1_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4601:1: rule__SJSelectionExpression__MemberAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__SJSelectionExpression__MemberAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4605:1: ( ( ( RULE_ID ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4606:1: ( ( RULE_ID ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4606:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4607:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4608:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4609:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJSelectionExpression__MemberAssignment_1_29220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__MemberAssignment_1_2"


    // $ANTLR start "rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4620:1: rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0 : ( ( '(' ) ) ;
    public final void rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4624:1: ( ( ( '(' ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4625:1: ( ( '(' ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4625:1: ( ( '(' ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4626:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4627:1: ( '(' )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4628:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__SJSelectionExpression__MethodinvocationAssignment_1_3_09260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0"


    // $ANTLR start "rule__SJSelectionExpression__ArgsAssignment_1_3_1_0"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4643:1: rule__SJSelectionExpression__ArgsAssignment_1_3_1_0 : ( ruleSJExpression ) ;
    public final void rule__SJSelectionExpression__ArgsAssignment_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4647:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4648:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4648:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4649:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJSelectionExpression__ArgsAssignment_1_3_1_09299);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__ArgsAssignment_1_3_1_0"


    // $ANTLR start "rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4658:1: rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1 : ( ruleSJExpression ) ;
    public final void rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4662:1: ( ( ruleSJExpression ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4663:1: ( ruleSJExpression )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4663:1: ( ruleSJExpression )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4664:1: ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_19330);
            ruleSJExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0()); 
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
    // $ANTLR end "rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1"


    // $ANTLR start "rule__SJTerminalExpression__ValueAssignment_0_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4673:1: rule__SJTerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__SJTerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4677:1: ( ( RULE_STRING ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4678:1: ( RULE_STRING )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4678:1: ( RULE_STRING )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4679:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SJTerminalExpression__ValueAssignment_0_19361); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__SJTerminalExpression__ValueAssignment_1_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4688:1: rule__SJTerminalExpression__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__SJTerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4692:1: ( ( RULE_INT ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4693:1: ( RULE_INT )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4693:1: ( RULE_INT )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4694:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SJTerminalExpression__ValueAssignment_1_19392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__SJTerminalExpression__ValueAssignment_2_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4703:1: rule__SJTerminalExpression__ValueAssignment_2_1 : ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__SJTerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4707:1: ( ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4708:1: ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4708:1: ( ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4709:1: ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4710:1: ( rule__SJTerminalExpression__ValueAlternatives_2_1_0 )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4710:2: rule__SJTerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__SJTerminalExpression__ValueAlternatives_2_1_0_in_rule__SJTerminalExpression__ValueAssignment_2_19423);
            rule__SJTerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__SJTerminalExpression__SymbolAssignment_6_1"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4719:1: rule__SJTerminalExpression__SymbolAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__SJTerminalExpression__SymbolAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4723:1: ( ( ( RULE_ID ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4724:1: ( ( RULE_ID ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4724:1: ( ( RULE_ID ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4725:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_6_1_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4726:1: ( RULE_ID )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4727:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_6_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SJTerminalExpression__SymbolAssignment_6_19460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolIDTerminalRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_6_1_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__SymbolAssignment_6_1"


    // $ANTLR start "rule__SJTerminalExpression__TypeAssignment_7_2"
    // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4738:1: rule__SJTerminalExpression__TypeAssignment_7_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SJTerminalExpression__TypeAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4742:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4743:1: ( ( ruleQualifiedName ) )
            {
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4743:1: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4744:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_7_2_0()); 
            }
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4745:1: ( ruleQualifiedName )
            // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:4746:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SJTerminalExpression__TypeAssignment_7_29499);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassQualifiedNameParserRuleCall_7_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_7_2_0()); 
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
    // $ANTLR end "rule__SJTerminalExpression__TypeAssignment_7_2"

    // $ANTLR start synpred29_InternalSmallJava
    public final void synpred29_InternalSmallJava_fragment() throws RecognitionException {   
        // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2689:2: ( rule__SJIfStatement__Group_5__0 )
        // ../org.example.smalljava.ui/src-gen/org/example/smalljava/ui/contentassist/antlr/internal/InternalSmallJava.g:2689:2: rule__SJIfStatement__Group_5__0
        {
        pushFollow(FOLLOW_rule__SJIfStatement__Group_5__0_in_synpred29_InternalSmallJava5432);
        rule__SJIfStatement__Group_5__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalSmallJava

    // Delegated rules

    public final boolean synpred29_InternalSmallJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalSmallJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\6\4\1\21\1\4\2\uffff";
    static final String DFA1_maxS =
        "\1\17\3\4\1\24\1\4\1\31\1\24\2\uffff";
    static final String DFA1_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\10\uffff\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\6\17\uffff\1\5",
            "\1\7",
            "\1\10\7\uffff\1\11",
            "\1\6\17\uffff\1\5",
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
            return "616:1: rule__SJMember__Alternatives : ( ( ruleSJField ) | ( ruleSJMethod ) );";
        }
    }
    static final String DFA2_eotS =
        "\10\uffff";
    static final String DFA2_eofS =
        "\10\uffff";
    static final String DFA2_minS =
        "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String DFA2_maxS =
        "\1\43\1\35\3\uffff\1\4\1\uffff\1\35";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String DFA2_specialS =
        "\10\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\2\3\4\uffff\2\3\14\uffff\1\3\2\uffff\1\2\1\uffff\1\4\1"+
            "\uffff\4\3",
            "\1\6\14\uffff\1\3\2\uffff\1\5\10\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\14\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "638:1: rule__SJStatement__Alternatives : ( ( ruleSJVariableDeclaration ) | ( ruleSJReturn ) | ( ( rule__SJStatement__Group_2__0 ) ) | ( ruleSJIfStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSJProgram_in_entryRuleSJProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__0_in_ruleSJProgram100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJImport_in_entryRuleSJImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJImport__Group__0_in_ruleSJImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJClass_in_entryRuleSJClass307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJClass314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__0_in_ruleSJClass340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMember_in_entryRuleSJMember367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMember374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMember__Alternatives_in_ruleSJMember400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJField_in_entryRuleSJField427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJField434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__Group__0_in_ruleSJField460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethod_in_entryRuleSJMethod487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMethod494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__0_in_ruleSJMethod520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJParameter_in_entryRuleSJParameter547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJParameter554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJParameter__Group__0_in_ruleSJParameter580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethodBody_in_entryRuleSJMethodBody607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMethodBody614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__0_in_ruleSJMethodBody640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_entryRuleSJStatement667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJStatement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJStatement__Alternatives_in_ruleSJStatement700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJReturn_in_entryRuleSJReturn727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJReturn734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__0_in_ruleSJReturn760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJVariableDeclaration_in_entryRuleSJVariableDeclaration787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJVariableDeclaration794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__0_in_ruleSJVariableDeclaration820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfStatement_in_entryRuleSJIfStatement847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJIfStatement854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__0_in_ruleSJIfStatement880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_entryRuleSJIfBlock907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJIfBlock914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Alternatives_in_ruleSJIfBlock940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_entryRuleSJExpression971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJExpression978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAssignment_in_ruleSJExpression1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAssignment_in_entryRuleSJAssignment1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJAssignment1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group__0_in_ruleSJAssignment1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJSelectionExpression_in_entryRuleSJSelectionExpression1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJSelectionExpression1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group__0_in_ruleSJSelectionExpression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJTerminalExpression_in_entryRuleSJTerminalExpression1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJTerminalExpression1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Alternatives_in_ruleSJTerminalExpression1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAccessLevel__Alternatives_in_ruleSJAccessLevel1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJField_in_rule__SJMember__Alternatives1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethod_in_rule__SJMember__Alternatives1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJVariableDeclaration_in_rule__SJStatement__Alternatives1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJReturn_in_rule__SJStatement__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJStatement__Group_2__0_in_rule__SJStatement__Alternatives1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfStatement_in_rule__SJStatement__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__StatementsAssignment_0_in_rule__SJIfBlock__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__0_in_rule__SJIfBlock__Alternatives1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_0__0_in_rule__SJTerminalExpression__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_1__0_in_rule__SJTerminalExpression__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_2__0_in_rule__SJTerminalExpression__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_3__0_in_rule__SJTerminalExpression__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_4__0_in_rule__SJTerminalExpression__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_5__0_in_rule__SJTerminalExpression__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_6__0_in_rule__SJTerminalExpression__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__0_in_rule__SJTerminalExpression__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__0_in_rule__SJTerminalExpression__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SJTerminalExpression__ValueAlternatives_2_1_01619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SJTerminalExpression__ValueAlternatives_2_1_01639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SJAccessLevel__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SJAccessLevel__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SJAccessLevel__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__0__Impl_in_rule__SJProgram__Group__01749 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__1_in_rule__SJProgram__Group__01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__0_in_rule__SJProgram__Group__0__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__1__Impl_in_rule__SJProgram__Group__11810 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__2_in_rule__SJProgram__Group__11813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__ImportsAssignment_1_in_rule__SJProgram__Group__1__Impl1840 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group__2__Impl_in_rule__SJProgram__Group__21871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__ClassesAssignment_2_in_rule__SJProgram__Group__2__Impl1898 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__0__Impl_in_rule__SJProgram__Group_0__01935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__1_in_rule__SJProgram__Group_0__01938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SJProgram__Group_0__0__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__1__Impl_in_rule__SJProgram__Group_0__11997 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__2_in_rule__SJProgram__Group_0__12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__NameAssignment_0_1_in_rule__SJProgram__Group_0__1__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJProgram__Group_0__2__Impl_in_rule__SJProgram__Group_0__22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJProgram__Group_0__2__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJImport__Group__0__Impl_in_rule__SJImport__Group__02122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJImport__Group__1_in_rule__SJImport__Group__02125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SJImport__Group__0__Impl2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJImport__Group__1__Impl_in_rule__SJImport__Group__12184 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJImport__Group__2_in_rule__SJImport__Group__12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJImport__ImportedNamespaceAssignment_1_in_rule__SJImport__Group__1__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJImport__Group__2__Impl_in_rule__SJImport__Group__22244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJImport__Group__2__Impl2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02309 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedNameWithWildcard__Group__1__Impl2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2520 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QualifiedName__Group_1__0__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__0__Impl_in_rule__SJClass__Group__02677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJClass__Group__1_in_rule__SJClass__Group__02680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SJClass__Group__0__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__1__Impl_in_rule__SJClass__Group__12739 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__SJClass__Group__2_in_rule__SJClass__Group__12742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__NameAssignment_1_in_rule__SJClass__Group__1__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__2__Impl_in_rule__SJClass__Group__22799 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__SJClass__Group__3_in_rule__SJClass__Group__22802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group_2__0_in_rule__SJClass__Group__2__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__3__Impl_in_rule__SJClass__Group__32860 = new BitSet(new long[]{0x000000000080E010L});
    public static final BitSet FOLLOW_rule__SJClass__Group__4_in_rule__SJClass__Group__32863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SJClass__Group__3__Impl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group__4__Impl_in_rule__SJClass__Group__42922 = new BitSet(new long[]{0x000000000080E010L});
    public static final BitSet FOLLOW_rule__SJClass__Group__5_in_rule__SJClass__Group__42925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__MembersAssignment_4_in_rule__SJClass__Group__4__Impl2952 = new BitSet(new long[]{0x000000000000E012L});
    public static final BitSet FOLLOW_rule__SJClass__Group__5__Impl_in_rule__SJClass__Group__52983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SJClass__Group__5__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group_2__0__Impl_in_rule__SJClass__Group_2__03054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJClass__Group_2__1_in_rule__SJClass__Group_2__03057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SJClass__Group_2__0__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__Group_2__1__Impl_in_rule__SJClass__Group_2__13116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJClass__SuperclassAssignment_2_1_in_rule__SJClass__Group_2__1__Impl3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__Group__0__Impl_in_rule__SJField__Group__03177 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_rule__SJField__Group__1_in_rule__SJField__Group__03180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__AccessAssignment_0_in_rule__SJField__Group__0__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__Group__1__Impl_in_rule__SJField__Group__13238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJField__Group__2_in_rule__SJField__Group__13241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__TypeAssignment_1_in_rule__SJField__Group__1__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__Group__2__Impl_in_rule__SJField__Group__23298 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJField__Group__3_in_rule__SJField__Group__23301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__NameAssignment_2_in_rule__SJField__Group__2__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJField__Group__3__Impl_in_rule__SJField__Group__33358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJField__Group__3__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__0__Impl_in_rule__SJMethod__Group__03425 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__1_in_rule__SJMethod__Group__03428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__AccessAssignment_0_in_rule__SJMethod__Group__0__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__1__Impl_in_rule__SJMethod__Group__13486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__2_in_rule__SJMethod__Group__13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__TypeAssignment_1_in_rule__SJMethod__Group__1__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__2__Impl_in_rule__SJMethod__Group__23546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__3_in_rule__SJMethod__Group__23549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__NameAssignment_2_in_rule__SJMethod__Group__2__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__3__Impl_in_rule__SJMethod__Group__33606 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__4_in_rule__SJMethod__Group__33609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SJMethod__Group__3__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__4__Impl_in_rule__SJMethod__Group__43668 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__5_in_rule__SJMethod__Group__43671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4__0_in_rule__SJMethod__Group__4__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__5__Impl_in_rule__SJMethod__Group__53729 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__6_in_rule__SJMethod__Group__53732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SJMethod__Group__5__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group__6__Impl_in_rule__SJMethod__Group__63791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__BodyAssignment_6_in_rule__SJMethod__Group__6__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4__0__Impl_in_rule__SJMethod__Group_4__03862 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4__1_in_rule__SJMethod__Group_4__03865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__ParamsAssignment_4_0_in_rule__SJMethod__Group_4__0__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4__1__Impl_in_rule__SJMethod__Group_4__13922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4_1__0_in_rule__SJMethod__Group_4__1__Impl3949 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4_1__0__Impl_in_rule__SJMethod__Group_4_1__03984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4_1__1_in_rule__SJMethod__Group_4_1__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SJMethod__Group_4_1__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__Group_4_1__1__Impl_in_rule__SJMethod__Group_4_1__14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethod__ParamsAssignment_4_1_1_in_rule__SJMethod__Group_4_1__1__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJParameter__Group__0__Impl_in_rule__SJParameter__Group__04107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJParameter__Group__1_in_rule__SJParameter__Group__04110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJParameter__TypeAssignment_0_in_rule__SJParameter__Group__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJParameter__Group__1__Impl_in_rule__SJParameter__Group__14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJParameter__NameAssignment_1_in_rule__SJParameter__Group__1__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__0__Impl_in_rule__SJMethodBody__Group__04228 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__1_in_rule__SJMethodBody__Group__04231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__1__Impl_in_rule__SJMethodBody__Group__14289 = new BitSet(new long[]{0x0000000F52801870L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__2_in_rule__SJMethodBody__Group__14292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SJMethodBody__Group__1__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__2__Impl_in_rule__SJMethodBody__Group__24351 = new BitSet(new long[]{0x0000000F52801870L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__3_in_rule__SJMethodBody__Group__24354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJMethodBody__StatementsAssignment_2_in_rule__SJMethodBody__Group__2__Impl4381 = new BitSet(new long[]{0x0000000F52001872L});
    public static final BitSet FOLLOW_rule__SJMethodBody__Group__3__Impl_in_rule__SJMethodBody__Group__34412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SJMethodBody__Group__3__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJStatement__Group_2__0__Impl_in_rule__SJStatement__Group_2__04479 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJStatement__Group_2__1_in_rule__SJStatement__Group_2__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJStatement__Group_2__0__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJStatement__Group_2__1__Impl_in_rule__SJStatement__Group_2__14538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJStatement__Group_2__1__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__0__Impl_in_rule__SJReturn__Group__04601 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__1_in_rule__SJReturn__Group__04604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SJReturn__Group__0__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__1__Impl_in_rule__SJReturn__Group__14663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__2_in_rule__SJReturn__Group__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJReturn__ExpressionAssignment_1_in_rule__SJReturn__Group__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJReturn__Group__2__Impl_in_rule__SJReturn__Group__24723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJReturn__Group__2__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__0__Impl_in_rule__SJVariableDeclaration__Group__04788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__1_in_rule__SJVariableDeclaration__Group__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__TypeAssignment_0_in_rule__SJVariableDeclaration__Group__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__1__Impl_in_rule__SJVariableDeclaration__Group__14848 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__2_in_rule__SJVariableDeclaration__Group__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__NameAssignment_1_in_rule__SJVariableDeclaration__Group__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__2__Impl_in_rule__SJVariableDeclaration__Group__24908 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__3_in_rule__SJVariableDeclaration__Group__24911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SJVariableDeclaration__Group__2__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__3__Impl_in_rule__SJVariableDeclaration__Group__34970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__4_in_rule__SJVariableDeclaration__Group__34973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__ExpressionAssignment_3_in_rule__SJVariableDeclaration__Group__3__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJVariableDeclaration__Group__4__Impl_in_rule__SJVariableDeclaration__Group__45030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SJVariableDeclaration__Group__4__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__0__Impl_in_rule__SJIfStatement__Group__05099 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__1_in_rule__SJIfStatement__Group__05102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SJIfStatement__Group__0__Impl5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__1__Impl_in_rule__SJIfStatement__Group__15161 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__2_in_rule__SJIfStatement__Group__15164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SJIfStatement__Group__1__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__2__Impl_in_rule__SJIfStatement__Group__25223 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__3_in_rule__SJIfStatement__Group__25226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__ExpressionAssignment_2_in_rule__SJIfStatement__Group__2__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__3__Impl_in_rule__SJIfStatement__Group__35283 = new BitSet(new long[]{0x0000000F52401870L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__4_in_rule__SJIfStatement__Group__35286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SJIfStatement__Group__3__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__4__Impl_in_rule__SJIfStatement__Group__45345 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__5_in_rule__SJIfStatement__Group__45348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__ThenBlockAssignment_4_in_rule__SJIfStatement__Group__4__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group__5__Impl_in_rule__SJIfStatement__Group__55405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group_5__0_in_rule__SJIfStatement__Group__5__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group_5__0__Impl_in_rule__SJIfStatement__Group_5__05475 = new BitSet(new long[]{0x0000000F52401870L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group_5__1_in_rule__SJIfStatement__Group_5__05478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SJIfStatement__Group_5__0__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group_5__1__Impl_in_rule__SJIfStatement__Group_5__15539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__ElseBlockAssignment_5_1_in_rule__SJIfStatement__Group_5__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__0__Impl_in_rule__SJIfBlock__Group_1__05600 = new BitSet(new long[]{0x0000000F52001870L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__1_in_rule__SJIfBlock__Group_1__05603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SJIfBlock__Group_1__0__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__1__Impl_in_rule__SJIfBlock__Group_1__15662 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__2_in_rule__SJIfBlock__Group_1__15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfBlock__StatementsAssignment_1_1_in_rule__SJIfBlock__Group_1__1__Impl5694 = new BitSet(new long[]{0x0000000F52001872L});
    public static final BitSet FOLLOW_rule__SJIfBlock__StatementsAssignment_1_1_in_rule__SJIfBlock__Group_1__1__Impl5706 = new BitSet(new long[]{0x0000000F52001872L});
    public static final BitSet FOLLOW_rule__SJIfBlock__Group_1__2__Impl_in_rule__SJIfBlock__Group_1__25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SJIfBlock__Group_1__2__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group__0__Impl_in_rule__SJAssignment__Group__05804 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group__1_in_rule__SJAssignment__Group__05807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJSelectionExpression_in_rule__SJAssignment__Group__0__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group__1__Impl_in_rule__SJAssignment__Group__15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__0_in_rule__SJAssignment__Group__1__Impl5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__0__Impl_in_rule__SJAssignment__Group_1__05925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__1_in_rule__SJAssignment__Group_1__05928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__1__Impl_in_rule__SJAssignment__Group_1__15986 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__2_in_rule__SJAssignment__Group_1__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SJAssignment__Group_1__1__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__Group_1__2__Impl_in_rule__SJAssignment__Group_1__26048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJAssignment__RightAssignment_1_2_in_rule__SJAssignment__Group_1__2__Impl6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group__0__Impl_in_rule__SJSelectionExpression__Group__06111 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group__1_in_rule__SJSelectionExpression__Group__06114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJTerminalExpression_in_rule__SJSelectionExpression__Group__0__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group__1__Impl_in_rule__SJSelectionExpression__Group__16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__0_in_rule__SJSelectionExpression__Group__1__Impl6197 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__0__Impl_in_rule__SJSelectionExpression__Group_1__06232 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__1_in_rule__SJSelectionExpression__Group_1__06235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__1__Impl_in_rule__SJSelectionExpression__Group_1__16293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__2_in_rule__SJSelectionExpression__Group_1__16296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SJSelectionExpression__Group_1__1__Impl6324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__2__Impl_in_rule__SJSelectionExpression__Group_1__26355 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__3_in_rule__SJSelectionExpression__Group_1__26358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__MemberAssignment_1_2_in_rule__SJSelectionExpression__Group_1__2__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1__3__Impl_in_rule__SJSelectionExpression__Group_1__36415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__0_in_rule__SJSelectionExpression__Group_1__3__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__0__Impl_in_rule__SJSelectionExpression__Group_1_3__06481 = new BitSet(new long[]{0x0000000F06001870L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__1_in_rule__SJSelectionExpression__Group_1_3__06484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__MethodinvocationAssignment_1_3_0_in_rule__SJSelectionExpression__Group_1_3__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__1__Impl_in_rule__SJSelectionExpression__Group_1_3__16541 = new BitSet(new long[]{0x0000000F06001870L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__2_in_rule__SJSelectionExpression__Group_1_3__16544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1__0_in_rule__SJSelectionExpression__Group_1_3__1__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3__2__Impl_in_rule__SJSelectionExpression__Group_1_3__26602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SJSelectionExpression__Group_1_3__2__Impl6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1__0__Impl_in_rule__SJSelectionExpression__Group_1_3_1__06667 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1__1_in_rule__SJSelectionExpression__Group_1_3_1__06670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__ArgsAssignment_1_3_1_0_in_rule__SJSelectionExpression__Group_1_3_1__0__Impl6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1__1__Impl_in_rule__SJSelectionExpression__Group_1_3_1__16727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__0_in_rule__SJSelectionExpression__Group_1_3_1__1__Impl6754 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__0__Impl_in_rule__SJSelectionExpression__Group_1_3_1_1__06789 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__1_in_rule__SJSelectionExpression__Group_1_3_1_1__06792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SJSelectionExpression__Group_1_3_1_1__0__Impl6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__Group_1_3_1_1__1__Impl_in_rule__SJSelectionExpression__Group_1_3_1_1__16851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_1_in_rule__SJSelectionExpression__Group_1_3_1_1__1__Impl6878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_0__0__Impl_in_rule__SJTerminalExpression__Group_0__06912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_0__1_in_rule__SJTerminalExpression__Group_0__06915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_0__1__Impl_in_rule__SJTerminalExpression__Group_0__16973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__ValueAssignment_0_1_in_rule__SJTerminalExpression__Group_0__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_1__0__Impl_in_rule__SJTerminalExpression__Group_1__07034 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_1__1_in_rule__SJTerminalExpression__Group_1__07037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_1__1__Impl_in_rule__SJTerminalExpression__Group_1__17095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__ValueAssignment_1_1_in_rule__SJTerminalExpression__Group_1__1__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_2__0__Impl_in_rule__SJTerminalExpression__Group_2__07156 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_2__1_in_rule__SJTerminalExpression__Group_2__07159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_2__1__Impl_in_rule__SJTerminalExpression__Group_2__17217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__ValueAssignment_2_1_in_rule__SJTerminalExpression__Group_2__1__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_3__0__Impl_in_rule__SJTerminalExpression__Group_3__07278 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_3__1_in_rule__SJTerminalExpression__Group_3__07281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_3__1__Impl_in_rule__SJTerminalExpression__Group_3__17339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SJTerminalExpression__Group_3__1__Impl7367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_4__0__Impl_in_rule__SJTerminalExpression__Group_4__07402 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_4__1_in_rule__SJTerminalExpression__Group_4__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_4__1__Impl_in_rule__SJTerminalExpression__Group_4__17463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SJTerminalExpression__Group_4__1__Impl7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_5__0__Impl_in_rule__SJTerminalExpression__Group_5__07526 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_5__1_in_rule__SJTerminalExpression__Group_5__07529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_5__1__Impl_in_rule__SJTerminalExpression__Group_5__17587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SJTerminalExpression__Group_5__1__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_6__0__Impl_in_rule__SJTerminalExpression__Group_6__07650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_6__1_in_rule__SJTerminalExpression__Group_6__07653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_6__1__Impl_in_rule__SJTerminalExpression__Group_6__17711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__SymbolAssignment_6_1_in_rule__SJTerminalExpression__Group_6__1__Impl7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__0__Impl_in_rule__SJTerminalExpression__Group_7__07772 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__1_in_rule__SJTerminalExpression__Group_7__07775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__1__Impl_in_rule__SJTerminalExpression__Group_7__17833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__2_in_rule__SJTerminalExpression__Group_7__17836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SJTerminalExpression__Group_7__1__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__2__Impl_in_rule__SJTerminalExpression__Group_7__27895 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__3_in_rule__SJTerminalExpression__Group_7__27898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__TypeAssignment_7_2_in_rule__SJTerminalExpression__Group_7__2__Impl7925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__3__Impl_in_rule__SJTerminalExpression__Group_7__37955 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__4_in_rule__SJTerminalExpression__Group_7__37958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SJTerminalExpression__Group_7__3__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_7__4__Impl_in_rule__SJTerminalExpression__Group_7__48017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SJTerminalExpression__Group_7__4__Impl8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__0__Impl_in_rule__SJTerminalExpression__Group_8__08086 = new BitSet(new long[]{0x0000000F02001870L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__1_in_rule__SJTerminalExpression__Group_8__08089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SJTerminalExpression__Group_8__0__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__1__Impl_in_rule__SJTerminalExpression__Group_8__18148 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__2_in_rule__SJTerminalExpression__Group_8__18151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJTerminalExpression__Group_8__1__Impl8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__Group_8__2__Impl_in_rule__SJTerminalExpression__Group_8__28207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SJTerminalExpression__Group_8__2__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJProgram__NameAssignment_0_18277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJImport_in_rule__SJProgram__ImportsAssignment_18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJClass_in_rule__SJProgram__ClassesAssignment_28339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__SJImport__ImportedNamespaceAssignment_18370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJClass__NameAssignment_18401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJClass__SuperclassAssignment_2_18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMember_in_rule__SJClass__MembersAssignment_48471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAccessLevel_in_rule__SJField__AccessAssignment_08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJField__TypeAssignment_18537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJField__NameAssignment_28572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAccessLevel_in_rule__SJMethod__AccessAssignment_08603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJMethod__TypeAssignment_18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJMethod__NameAssignment_28673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJParameter_in_rule__SJMethod__ParamsAssignment_4_08704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJParameter_in_rule__SJMethod__ParamsAssignment_4_1_18735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethodBody_in_rule__SJMethod__BodyAssignment_68766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJParameter__TypeAssignment_08801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJParameter__NameAssignment_18836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_rule__SJMethodBody__StatementsAssignment_28867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJReturn__ExpressionAssignment_18898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJVariableDeclaration__TypeAssignment_08933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJVariableDeclaration__NameAssignment_18968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJVariableDeclaration__ExpressionAssignment_38999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJIfStatement__ExpressionAssignment_29030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_rule__SJIfStatement__ThenBlockAssignment_49061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_rule__SJIfStatement__ElseBlockAssignment_5_19092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_rule__SJIfBlock__StatementsAssignment_09123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_rule__SJIfBlock__StatementsAssignment_1_19154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJAssignment__RightAssignment_1_29185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJSelectionExpression__MemberAssignment_1_29220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SJSelectionExpression__MethodinvocationAssignment_1_3_09260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJSelectionExpression__ArgsAssignment_1_3_1_09299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_rule__SJSelectionExpression__ArgsAssignment_1_3_1_1_19330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SJTerminalExpression__ValueAssignment_0_19361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SJTerminalExpression__ValueAssignment_1_19392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJTerminalExpression__ValueAlternatives_2_1_0_in_rule__SJTerminalExpression__ValueAssignment_2_19423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SJTerminalExpression__SymbolAssignment_6_19460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SJTerminalExpression__TypeAssignment_7_29499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SJIfStatement__Group_5__0_in_synpred29_InternalSmallJava5432 = new BitSet(new long[]{0x0000000000000002L});

}