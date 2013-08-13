package org.example.expressions.ui.contentassist.antlr.internal; 

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
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'='", "'||'", "'&&'", "'+'", "'-'", "'('", "')'", "'!'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleExpressionsModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:60:1: entryRuleExpressionsModel : ruleExpressionsModel EOF ;
    public final void entryRuleExpressionsModel() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: ( ruleExpressionsModel EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ruleExpressionsModel EOF
            {
             before(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel61);
            ruleExpressionsModel();

            state._fsp--;

             after(grammarAccess.getExpressionsModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionsModel68); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:69:1: ruleExpressionsModel : ( ( rule__ExpressionsModel__ElementsAssignment )* ) ;
    public final void ruleExpressionsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:73:2: ( ( ( rule__ExpressionsModel__ElementsAssignment )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:74:1: ( ( rule__ExpressionsModel__ElementsAssignment )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( rule__ExpressionsModel__ElementsAssignment )*
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__ExpressionsModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=19 && LA1_0<=20)||LA1_0==26||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:76:2: rule__ExpressionsModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionsModel__ElementsAssignment_in_ruleExpressionsModel94);
            	    rule__ExpressionsModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExpressionsModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:88:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: ( ruleAbstractElement EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement129); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:97:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:101:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:102:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ( rule__AbstractElement__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:104:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:116:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: ( ruleVariable EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable182);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable189); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:125:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:129:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:130:1: ( ( rule__Variable__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Variable__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:132:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable215);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: ( ruleExpression EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression242);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression249); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:153:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:157:2: ( ( ruleOr ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ruleOr )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:158:1: ( ruleOr )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_in_ruleExpression275);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:172:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: ( ruleOr EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr301);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr308); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:181:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:185:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:186:1: ( ( rule__Or__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__Or__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:188:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr334);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:200:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: ( ruleAnd EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd361);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd368); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:209:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:213:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:214:1: ( ( rule__And__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__And__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:216:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd394);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:228:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: ( ruleEquality EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality421);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality428); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:237:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:241:2: ( ( ( rule__Equality__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Equality__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:242:1: ( ( rule__Equality__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Equality__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:244:2: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_rule__Equality__Group__0_in_ruleEquality454);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:256:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: ( ruleComparison EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison481);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison488); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:265:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:269:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:270:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:270:1: ( ( rule__Comparison__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__Comparison__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:272:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison514);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:284:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: ( rulePlusOrMinus EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus541);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus548); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:293:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:297:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:298:1: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:298:1: ( ( rule__PlusOrMinus__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__PlusOrMinus__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:300:2: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus574);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:312:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: ( ruleMulOrDiv EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv601);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv608); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:321:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:325:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:326:1: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:326:1: ( ( rule__MulOrDiv__Group__0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( rule__MulOrDiv__Group__0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:328:2: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv634);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:340:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: ( rulePrimary EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary661);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary668); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:349:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:353:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:354:1: ( ( rule__Primary__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__Primary__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:356:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary694);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:368:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: ( ruleAtomic EOF )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic721);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic728); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:377:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:381:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:382:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:382:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ( rule__Atomic__Alternatives )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:384:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic754);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:396:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:400:1: ( ( ruleVariable ) | ( ruleExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=20)||(LA2_1>=22 && LA2_1<=26)||LA2_1==28) ) {
                    alt2=2;
                }
                else if ( (LA2_1==21) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||(LA2_0>=19 && LA2_0<=20)||LA2_0==26||LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:401:1: ( ruleVariable )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:401:1: ( ruleVariable )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:402:1: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives790);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:407:6: ( ruleExpression )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:407:6: ( ruleExpression )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:408:1: ruleExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives807);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:418:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:422:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:423:1: ( '==' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:423:1: ( '==' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:424:1: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Equality__OpAlternatives_1_1_0840); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:431:6: ( '!=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:431:6: ( '!=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:432:1: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_0860); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:444:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:448:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:449:1: ( '>=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:449:1: ( '>=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:450:1: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Comparison__OpAlternatives_1_1_0895); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:457:6: ( '<=' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:457:6: ( '<=' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:458:1: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_0915); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:465:6: ( '>' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:465:6: ( '>' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:466:1: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_0935); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:473:6: ( '<' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:473:6: ( '<' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:474:1: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_0955); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:486:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:491:1: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:492:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:1: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:493:2: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0989);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:497:6: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:498:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:499:1: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:499:2: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01007);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:508:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:512:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:513:1: ( '*' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:513:1: ( '*' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:514:1: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_17_in_rule__MulOrDiv__OpAlternatives_1_1_01041); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:521:6: ( '/' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:521:6: ( '/' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:522:1: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01061); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:534:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 19:
            case 20:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ( ( rule__Primary__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:540:1: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:541:1: ( rule__Primary__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:541:2: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1095);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:545:6: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:545:6: ( ( rule__Primary__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:1: ( rule__Primary__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:547:2: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1113);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:551:6: ( ruleAtomic )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:551:6: ( ruleAtomic )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1131);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:562:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case 19:
            case 20:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:568:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:569:1: ( rule__Atomic__Group_0__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:569:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1163);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:573:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:573:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:1: ( rule__Atomic__Group_1__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:575:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1181);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:579:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:579:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ( rule__Atomic__Group_2__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:581:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1199);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:585:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:585:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:586:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:587:1: ( rule__Atomic__Group_3__0 )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:587:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1217);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:596:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:600:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:601:1: ( 'true' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:601:1: ( 'true' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Atomic__ValueAlternatives_2_1_01251); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:6: ( 'false' )
                    {
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:609:6: ( 'false' )
                    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:610:1: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Atomic__ValueAlternatives_2_1_01271); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:624:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:628:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:629:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01303);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01306);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:640:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:641:1: ( ( rule__Variable__NameAssignment_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:642:1: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:643:1: ( rule__Variable__NameAssignment_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:643:2: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl1333);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:653:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:657:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:658:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11363);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__11366);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:669:1: ( ( '=' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( '=' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:670:1: ( '=' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:671:1: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Variable__Group__1__Impl1394); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:684:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:688:1: ( rule__Variable__Group__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:689:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__21425);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:695:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ExpressionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: ( ( ( rule__Variable__ExpressionAssignment_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:700:1: ( ( rule__Variable__ExpressionAssignment_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:701:1: ( rule__Variable__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:1: ( rule__Variable__ExpressionAssignment_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:702:2: rule__Variable__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl1452);
            rule__Variable__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:718:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:722:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:723:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__01488);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__01491);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:730:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:734:1: ( ( ruleAnd ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:735:1: ( ruleAnd )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:735:1: ( ruleAnd )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:736:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl1518);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:747:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:751:1: ( rule__Or__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:752:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__11547);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:758:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:762:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:763:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:764:1: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:765:1: ( rule__Or__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:765:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl1574);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:779:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:784:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__01609);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__01612);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:791:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:795:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:797:1: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:798:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:800:1: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:810:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:815:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__11670);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__11673);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:822:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:826:1: ( ( '||' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:827:1: ( '||' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:827:1: ( '||' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:828:1: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Or__Group_1__1__Impl1701); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:845:1: ( rule__Or__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:846:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__21732);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:852:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:856:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:858:1: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:1: ( rule__Or__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:859:2: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl1759);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:875:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:880:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__01795);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__01798);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:887:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:891:1: ( ( ruleEquality ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ( ruleEquality )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ( ruleEquality )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:893:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__Group__0__Impl1825);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:904:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:908:1: ( rule__And__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:909:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__11854);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:915:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:919:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:920:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:920:1: ( ( rule__And__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:921:1: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:922:1: ( rule__And__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:922:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl1881);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:936:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:940:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:941:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__01916);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__01919);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:948:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:952:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:953:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:953:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:954:1: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:955:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:957:1: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:967:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:971:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:972:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__11977);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__11980);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:979:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:983:1: ( ( '&&' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ( '&&' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:984:1: ( '&&' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:985:1: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,23,FOLLOW_23_in_rule__And__Group_1__1__Impl2008); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:998:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1002:1: ( rule__And__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1003:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22039);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1009:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1013:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1014:1: ( ( rule__And__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1015:1: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:1: ( rule__And__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1016:2: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2066);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1036:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1037:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02102);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02105);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1044:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1048:1: ( ( ruleComparison ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( ruleComparison )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1049:1: ( ruleComparison )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1050:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2132);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1061:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1065:1: ( rule__Equality__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1066:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12161);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1072:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1076:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1077:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1077:1: ( ( rule__Equality__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1078:1: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:1: ( rule__Equality__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1079:2: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2188);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1097:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1098:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__02223);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__02226);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1105:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1109:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1110:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1111:1: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1112:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1114:1: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1124:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1128:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1129:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__12284);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__12287);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1136:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1140:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1141:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1141:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1142:1: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1143:1: ( rule__Equality__OpAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1143:2: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl2314);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1153:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1157:1: ( rule__Equality__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1158:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__22344);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1164:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1168:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1169:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1170:1: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1171:1: ( rule__Equality__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1171:2: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl2371);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1187:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1191:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1192:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02407);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02410);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1199:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1203:1: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1204:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1204:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1205:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl2437);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1216:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: ( rule__Comparison__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1221:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12466);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1227:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1231:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1232:1: ( ( rule__Comparison__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1233:1: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1234:1: ( rule__Comparison__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=16)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1234:2: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2493);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1248:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1252:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1253:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02528);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02531);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1260:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1264:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1265:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1266:1: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1267:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1269:1: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1279:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1283:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1284:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12589);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12592);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1291:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1295:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1296:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1297:1: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1298:1: ( rule__Comparison__OpAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1298:2: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2619);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1308:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1312:1: ( rule__Comparison__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1313:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22649);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1319:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1323:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1324:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1325:1: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1326:1: ( rule__Comparison__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1326:2: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2676);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1342:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1346:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1347:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__02712);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__02715);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1354:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1358:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1359:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1360:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl2742);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1371:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1375:1: ( rule__PlusOrMinus__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1376:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__12771);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1382:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1386:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1387:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1387:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1388:1: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1389:1: ( rule__PlusOrMinus__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=24 && LA14_0<=25)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1389:2: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl2798);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1403:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1408:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__02833);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__02836);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1415:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1419:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1420:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1420:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1421:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1422:1: ( rule__PlusOrMinus__Alternatives_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1422:2: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl2863);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1432:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1436:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1437:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__12893);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1443:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1447:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1448:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1448:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1449:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:1: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1450:2: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl2920);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1468:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1469:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__02954);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__02957);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1476:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1480:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1481:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1481:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1482:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1483:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1485:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1499:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1500:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__13015);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1506:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1510:1: ( ( '+' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: ( '+' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1511:1: ( '+' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1512:1: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,24,FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_0__1__Impl3043); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1529:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1533:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1534:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__03078);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__03081);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1545:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1546:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1547:1: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1548:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1550:1: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1560:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1564:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1565:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__13139);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1571:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1575:1: ( ( '-' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1576:1: ( '-' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1576:1: ( '-' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1577:1: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,25,FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_1__1__Impl3167); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1594:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1598:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1599:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__03202);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__03205);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1606:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1610:1: ( ( rulePrimary ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1611:1: ( rulePrimary )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1611:1: ( rulePrimary )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1612:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl3232);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1623:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1627:1: ( rule__MulOrDiv__Group__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1628:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__13261);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1638:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1639:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1639:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1640:1: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:1: ( rule__MulOrDiv__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=17 && LA15_0<=18)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1641:2: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl3288);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1655:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1659:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1660:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__03323);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__03326);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1667:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1671:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1672:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1672:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1673:1: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1674:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1676:1: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1686:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1690:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1691:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__13384);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__13387);
            rule__MulOrDiv__Group_1__2();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1698:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1702:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1703:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1703:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1704:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1705:1: ( rule__MulOrDiv__OpAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1705:2: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl3414);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1715:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1719:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1720:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__23444);
            rule__MulOrDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1726:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1731:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1732:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1733:1: ( rule__MulOrDiv__RightAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1733:2: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl3471);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1753:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1754:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__03507);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__03510);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1765:1: ( ( '(' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: ( '(' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: ( '(' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1767:1: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Primary__Group_0__0__Impl3538); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1780:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1784:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1785:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__13569);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__13572);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1796:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1797:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1797:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1798:1: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl3599);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1809:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1813:1: ( rule__Primary__Group_0__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1814:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__23628);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1824:1: ( ( ')' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( ')' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( ')' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1826:1: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Primary__Group_0__2__Impl3656); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1845:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1849:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1850:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03693);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03696);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1857:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1861:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1862:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1863:1: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1864:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1866:1: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1876:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1880:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1881:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__13754);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__13757);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1888:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1892:1: ( ( '!' ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: ( '!' )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1893:1: ( '!' )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1894:1: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Primary__Group_1__1__Impl3785); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1907:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1911:1: ( rule__Primary__Group_1__2__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1912:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__23816);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1918:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1922:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1923:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1924:1: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1925:1: ( rule__Primary__ExpressionAssignment_1_2 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1925:2: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl3843);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1941:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1945:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1946:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__03879);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__03882);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1953:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1957:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1958:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1959:1: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1960:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1972:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1976:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1977:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__13940);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1983:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1987:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1988:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1989:1: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1990:1: ( rule__Atomic__ValueAssignment_0_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:1990:2: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl3967);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2004:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2008:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2009:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04001);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04004);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2016:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2020:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2021:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2021:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2022:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2023:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2025:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2035:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2039:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2040:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14062);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2046:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2050:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2051:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2051:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2052:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2053:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2053:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl4089);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2067:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2071:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2072:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__04123);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__04126);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2083:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2084:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2085:1: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2086:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2088:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2098:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2102:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2103:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__14184);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2113:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2114:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2114:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2115:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2116:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2116:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl4211);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2134:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2135:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__04245);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__04248);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2146:1: ( ( () ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2147:1: ( () )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2147:1: ( () )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2148:1: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2149:1: ()
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2151:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2165:1: ( rule__Atomic__Group_3__1__Impl )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2166:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__14306);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__VariableAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2176:1: ( ( ( rule__Atomic__VariableAssignment_3_1 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2177:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2177:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2178:1: ( rule__Atomic__VariableAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2179:1: ( rule__Atomic__VariableAssignment_3_1 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2179:2: rule__Atomic__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__VariableAssignment_3_1_in_rule__Atomic__Group_3__1__Impl4333);
            rule__Atomic__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__ExpressionsModel__ElementsAssignment"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2194:1: rule__ExpressionsModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__ExpressionsModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2198:1: ( ( ruleAbstractElement ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2199:1: ( ruleAbstractElement )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2199:1: ( ruleAbstractElement )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2200:1: ruleAbstractElement
            {
             before(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__ExpressionsModel__ElementsAssignment4372);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionsModel__ElementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2213:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2214:1: ( RULE_ID )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2214:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2215:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_04403); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ExpressionAssignment_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2224:1: rule__Variable__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2228:1: ( ( ruleExpression ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2229:1: ( ruleExpression )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2229:1: ( ruleExpression )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2230:1: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_24434);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ExpressionAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2243:1: ( ( ruleAnd ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2244:1: ( ruleAnd )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2244:1: ( ruleAnd )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2245:1: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_24465);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2254:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2258:1: ( ( ruleEquality ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2259:1: ( ruleEquality )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2259:1: ( ruleEquality )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2260:1: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_24496);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2269:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2275:1: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2276:1: ( rule__Equality__OpAlternatives_1_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2276:2: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_14527);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2285:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2289:1: ( ( ruleComparison ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2290:1: ( ruleComparison )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2290:1: ( ruleComparison )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2291:1: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_24560);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2300:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2304:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2305:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2305:1: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2306:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2307:1: ( rule__Comparison__OpAlternatives_1_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2307:2: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_14591);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2316:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2320:1: ( ( rulePlusOrMinus ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: ( rulePlusOrMinus )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: ( rulePlusOrMinus )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2322:1: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_24624);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2331:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2335:1: ( ( ruleMulOrDiv ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: ( ruleMulOrDiv )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2336:1: ( ruleMulOrDiv )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2337:1: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_14655);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2346:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2350:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2351:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2351:1: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2352:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2353:1: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2353:2: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_14686);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2362:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2366:1: ( ( rulePrimary ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2367:1: ( rulePrimary )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2367:1: ( rulePrimary )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2368:1: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_24719);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2377:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2381:1: ( ( rulePrimary ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2382:1: ( rulePrimary )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2382:1: ( rulePrimary )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2383:1: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_24750);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2392:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2396:1: ( ( RULE_INT ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2397:1: ( RULE_INT )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2397:1: ( RULE_INT )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2398:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_0_14781); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2407:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2411:1: ( ( RULE_STRING ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2412:1: ( RULE_STRING )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2412:1: ( RULE_STRING )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2413:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_1_14812); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2422:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2426:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2427:1: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2428:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2429:1: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2429:2: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_14843);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3_1"
    // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2438:1: rule__Atomic__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2442:1: ( ( ( RULE_ID ) ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2443:1: ( ( RULE_ID ) )
            {
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2443:1: ( ( RULE_ID ) )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2444:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2445:1: ( RULE_ID )
            // ../org.example.expressions.ui/src-gen/org/example/expressions/ui/contentassist/antlr/internal/InternalExpressions.g:2446:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_3_14880); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionsModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionsModel__ElementsAssignment_in_ruleExpressionsModel94 = new BitSet(new long[]{0x0000000014180072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0_in_ruleEquality454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0_in_rulePlusOrMinus574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0_in_ruleMulOrDiv634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__AbstractElement__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractElement__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Equality__OpAlternatives_1_1_0840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equality__OpAlternatives_1_1_0860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Comparison__OpAlternatives_1_1_0895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Comparison__OpAlternatives_1_1_0915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Comparison__OpAlternatives_1_1_0935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Comparison__OpAlternatives_1_1_0955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0_in_rule__PlusOrMinus__Alternatives_1_0989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0_in_rule__PlusOrMinus__Alternatives_1_01007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MulOrDiv__OpAlternatives_1_1_01041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MulOrDiv__OpAlternatives_1_1_01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0_in_rule__Primary__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0_in_rule__Primary__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Primary__Alternatives1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Atomic__ValueAlternatives_2_1_01251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Atomic__ValueAlternatives_2_1_01271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__01303 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__01306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_0_in_rule__Variable__Group__0__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__11363 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Variable__Group__1__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__21425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__ExpressionAssignment_2_in_rule__Variable__Group__2__Impl1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__01488 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__01491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__Group__0__Impl1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl1574 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__01609 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__01612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__11670 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Or__Group_1__1__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__21732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__RightAssignment_1_2_in_rule__Or__Group_1__2__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__01795 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__Group__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl1881 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__01916 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__01919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__11977 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__And__Group_1__1__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__22039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__RightAssignment_1_2_in_rule__And__Group_1__2__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__0__Impl_in_rule__Equality__Group__02102 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Equality__Group__1_in_rule__Equality__Group__02105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__Group__0__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group__1__Impl_in_rule__Equality__Group__12161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0_in_rule__Equality__Group__1__Impl2188 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__0__Impl_in_rule__Equality__Group_1__02223 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1_in_rule__Equality__Group_1__02226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__1__Impl_in_rule__Equality__Group_1__12284 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2_in_rule__Equality__Group_1__12287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAssignment_1_1_in_rule__Equality__Group_1__1__Impl2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__Group_1__2__Impl_in_rule__Equality__Group_1__22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__RightAssignment_1_2_in_rule__Equality__Group_1__2__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__02407 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__02410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__Group__0__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0_in_rule__Comparison__Group__1__Impl2493 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__0__Impl_in_rule__Comparison__Group_1__02528 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1_in_rule__Comparison__Group_1__02531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__1__Impl_in_rule__Comparison__Group_1__12589 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2_in_rule__Comparison__Group_1__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAssignment_1_1_in_rule__Comparison__Group_1__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_1__2__Impl_in_rule__Comparison__Group_1__22649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__RightAssignment_1_2_in_rule__Comparison__Group_1__2__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__0__Impl_in_rule__PlusOrMinus__Group__02712 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1_in_rule__PlusOrMinus__Group__02715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__Group__0__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group__1__Impl_in_rule__PlusOrMinus__Group__12771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0_in_rule__PlusOrMinus__Group__1__Impl2798 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__0__Impl_in_rule__PlusOrMinus__Group_1__02833 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1_in_rule__PlusOrMinus__Group_1__02836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Alternatives_1_0_in_rule__PlusOrMinus__Group_1__0__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1__1__Impl_in_rule__PlusOrMinus__Group_1__12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__RightAssignment_1_1_in_rule__PlusOrMinus__Group_1__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__0__Impl_in_rule__PlusOrMinus__Group_1_0_0__02954 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1_in_rule__PlusOrMinus__Group_1_0_0__02957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_0__1__Impl_in_rule__PlusOrMinus__Group_1_0_0__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlusOrMinus__Group_1_0_0__1__Impl3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__0__Impl_in_rule__PlusOrMinus__Group_1_0_1__03078 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1_in_rule__PlusOrMinus__Group_1_0_1__03081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlusOrMinus__Group_1_0_1__1__Impl_in_rule__PlusOrMinus__Group_1_0_1__13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlusOrMinus__Group_1_0_1__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__0__Impl_in_rule__MulOrDiv__Group__03202 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1_in_rule__MulOrDiv__Group__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__Group__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group__1__Impl_in_rule__MulOrDiv__Group__13261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0_in_rule__MulOrDiv__Group__1__Impl3288 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__0__Impl_in_rule__MulOrDiv__Group_1__03323 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1_in_rule__MulOrDiv__Group_1__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__1__Impl_in_rule__MulOrDiv__Group_1__13384 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2_in_rule__MulOrDiv__Group_1__13387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAssignment_1_1_in_rule__MulOrDiv__Group_1__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__Group_1__2__Impl_in_rule__MulOrDiv__Group_1__23444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__RightAssignment_1_2_in_rule__MulOrDiv__Group_1__2__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__0__Impl_in_rule__Primary__Group_0__03507 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1_in_rule__Primary__Group_0__03510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Primary__Group_0__0__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__1__Impl_in_rule__Primary__Group_0__13569 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2_in_rule__Primary__Group_0__13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Primary__Group_0__1__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_0__2__Impl_in_rule__Primary__Group_0__23628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Primary__Group_0__2__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__0__Impl_in_rule__Primary__Group_1__03693 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1_in_rule__Primary__Group_1__03696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__1__Impl_in_rule__Primary__Group_1__13754 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2_in_rule__Primary__Group_1__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Primary__Group_1__1__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Group_1__2__Impl_in_rule__Primary__Group_1__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__ExpressionAssignment_1_2_in_rule__Primary__Group_1__2__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__03879 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__13940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_0_1_in_rule__Atomic__Group_0__1__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__04001 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__04004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__04123 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__04126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__04245 = new BitSet(new long[]{0x0000000014180070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__04248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__14306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__VariableAssignment_3_1_in_rule__Atomic__Group_3__1__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__ExpressionsModel__ElementsAssignment4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_04403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Variable__ExpressionAssignment_24434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Or__RightAssignment_1_24465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_rule__And__RightAssignment_1_24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equality__OpAlternatives_1_1_0_in_rule__Equality__OpAssignment_1_14527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Equality__RightAssignment_1_24560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__OpAlternatives_1_1_0_in_rule__Comparison__OpAssignment_1_14591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_rule__Comparison__RightAssignment_1_24624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rule__PlusOrMinus__RightAssignment_1_14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulOrDiv__OpAlternatives_1_1_0_in_rule__MulOrDiv__OpAssignment_1_14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__MulOrDiv__RightAssignment_1_24719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__Primary__ExpressionAssignment_1_24750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_0_14781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_1_14812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAlternatives_2_1_0_in_rule__Atomic__ValueAssignment_2_14843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__VariableAssignment_3_14880 = new BitSet(new long[]{0x0000000000000002L});

}