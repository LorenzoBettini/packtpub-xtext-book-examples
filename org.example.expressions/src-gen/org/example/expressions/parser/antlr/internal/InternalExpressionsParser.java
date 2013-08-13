package org.example.expressions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.expressions.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'!'", "'true'", "'false'"
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
    public String getGrammarFileName() { return "../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g"; }



     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ExpressionsModel";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpressionsModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:67:1: entryRuleExpressionsModel returns [EObject current=null] : iv_ruleExpressionsModel= ruleExpressionsModel EOF ;
    public final EObject entryRuleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionsModel = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:68:2: (iv_ruleExpressionsModel= ruleExpressionsModel EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:69:2: iv_ruleExpressionsModel= ruleExpressionsModel EOF
            {
             newCompositeNode(grammarAccess.getExpressionsModelRule()); 
            pushFollow(FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel75);
            iv_ruleExpressionsModel=ruleExpressionsModel();

            state._fsp--;

             current =iv_ruleExpressionsModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionsModel85); 

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
    // $ANTLR end "entryRuleExpressionsModel"


    // $ANTLR start "ruleExpressionsModel"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:76:1: ruleExpressionsModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleExpressionsModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==24||(LA1_0>=26 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionsModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleExpressionsModel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionsModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionsModel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:115:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:118:28: ( (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:119:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==11) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=12 && LA2_1<=24)||(LA2_1>=26 && LA2_1<=28)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_INT && LA2_0<=RULE_STRING)||LA2_0==24||(LA2_0>=26 && LA2_0<=28)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:120:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleAbstractElement223);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:130:5: this_Expression_1= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractElement250);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:147:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:148:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable285);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable295); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:155:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:158:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:160:1: (lv_name_0_0= RULE_ID )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleVariable354); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:181:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:182:1: (lv_expression_2_0= ruleExpression )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:183:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable375);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:207:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:208:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:209:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression411);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression421); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:216:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:219:28: (this_Or_0= ruleOr )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:221:5: this_Or_0= ruleOr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleExpression467);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:237:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:238:2: (iv_ruleOr= ruleOr EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:239:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr501);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr511); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:246:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:249:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:250:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:250:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:251:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleOr558);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:259:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:260:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleOr579); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	        
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:269:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:270:1: (lv_right_3_0= ruleAnd )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:271:3: lv_right_3_0= ruleAnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr600);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:295:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:296:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:297:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd638);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd648); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:304:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:307:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:308:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:308:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:309:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd695);
            this_Equality_0=ruleEquality();

            state._fsp--;

             
                    current = this_Equality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:317:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:317:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:317:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:318:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAnd716); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	        
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:327:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:328:1: (lv_right_3_0= ruleEquality )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:329:3: lv_right_3_0= ruleEquality
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd737);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Equality");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:353:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:354:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:355:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality775);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality785); 

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:362:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:365:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:366:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:366:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:367:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality832);
            this_Comparison_0=ruleComparison();

            state._fsp--;

             
                    current = this_Comparison_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:375:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:375:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:375:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:376:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:381:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:382:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:382:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:383:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:383:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==14) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==15) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:384:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,14,FOLLOW_14_in_ruleEquality861); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:396:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,15,FOLLOW_15_in_ruleEquality890); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEqualityRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:411:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:412:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:412:1: (lv_right_3_0= ruleComparison )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:413:3: lv_right_3_0= ruleComparison
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality927);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Comparison");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:437:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:438:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:439:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison965);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison975); 

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:446:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:449:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:450:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:450:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:451:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1022);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;

             
                    current = this_PlusOrMinus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:459:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:459:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:459:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:460:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:465:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:466:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:466:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:467:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:467:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt7=4;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:468:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,16,FOLLOW_16_in_ruleComparison1051); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:480:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,17,FOLLOW_17_in_ruleComparison1080); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:492:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,18,FOLLOW_18_in_ruleComparison1109); 

            	                    newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:504:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,19,FOLLOW_19_in_ruleComparison1138); 

            	                    newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getComparisonRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:519:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:520:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:520:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:521:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison1175);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PlusOrMinus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:545:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:546:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:547:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1213);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus1223); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:554:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:557:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:558:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:558:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:559:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1270);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;

             
                    current = this_MulOrDiv_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==20) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==21) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:3: ( () otherlv_2= '+' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:4: () otherlv_2= '+'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:567:4: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:568:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePlusOrMinus1293); 

            	                	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:578:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:578:6: ( () otherlv_4= '-' )
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:578:7: () otherlv_4= '-'
            	            {
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:578:7: ()
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:579:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePlusOrMinus1322); 

            	                	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:588:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:589:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:589:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:590:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1345);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MulOrDiv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:614:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:615:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:616:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1383);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv1393); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:623:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:626:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:627:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:627:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:628:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv1440);
            this_Primary_0=rulePrimary();

            state._fsp--;

             
                    current = this_Primary_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:636:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:636:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:636:2: ()
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:637:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:642:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:643:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:643:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:644:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:644:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==22) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==23) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:645:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,22,FOLLOW_22_in_ruleMulOrDiv1469); 

            	                    newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:657:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,23,FOLLOW_23_in_ruleMulOrDiv1498); 

            	                    newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	            	        }
            	                   		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:672:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:673:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:673:1: (lv_right_3_0= rulePrimary )
            	    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:674:3: lv_right_3_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv1535);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:698:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:699:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:700:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1573);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1583); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:707:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:710:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 27:
            case 28:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:711:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePrimary1621); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary1643);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_rulePrimary1654); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:729:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:729:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:729:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:729:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:730:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulePrimary1683); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:739:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:740:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:740:1: (lv_expression_5_0= rulePrimary )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:741:3: lv_expression_5_0= rulePrimary
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary1704);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"Primary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:759:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary1733);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:775:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:776:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:777:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic1768);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic1778); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:784:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:787:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt15=1;
                }
                break;
            case RULE_STRING:
                {
                alt15=2;
                }
                break;
            case 27:
            case 28:
                {
                alt15=3;
                }
                break;
            case RULE_ID:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:788:3: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:789:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:794:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:795:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:795:1: (lv_value_1_0= RULE_INT )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:796:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic1830); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:813:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:813:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:813:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:813:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:814:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:819:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:820:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:820:1: (lv_value_3_0= RULE_STRING )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:821:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic1869); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:838:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:838:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:838:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:838:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:839:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:844:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:845:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:845:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:846:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:846:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==28) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:847:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,27,FOLLOW_27_in_ruleAtomic1911); 

                                    newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:859:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,28,FOLLOW_28_in_ruleAtomic1940); 

                                    newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAtomicRule());
                            	        }
                                   		setWithLastConsumed(current, "value", lv_value_5_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:875:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:875:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:875:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:875:7: ()
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:876:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                                current);
                        

                    }

                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:881:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:882:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:882:1: (otherlv_7= RULE_ID )
                    // ../org.example.expressions/src-gen/org/example/expressions/parser/antlr/internal/InternalExpressions.g:883:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1993); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }


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
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpressionsModel_in_entryRuleExpressionsModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionsModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleExpressionsModel130 = new BitSet(new long[]{0x000000001D000072L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAbstractElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleVariable354 = new BitSet(new long[]{0x000000001D000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr558 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleOr579 = new BitSet(new long[]{0x000000001D001070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr600 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd695 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAnd716 = new BitSet(new long[]{0x000000001D002070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd737 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality832 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleEquality861 = new BitSet(new long[]{0x000000001D00C070L});
    public static final BitSet FOLLOW_15_in_ruleEquality890 = new BitSet(new long[]{0x000000001D00C070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality927 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1022 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_ruleComparison1051 = new BitSet(new long[]{0x000000001D0F0070L});
    public static final BitSet FOLLOW_17_in_ruleComparison1080 = new BitSet(new long[]{0x000000001D0F0070L});
    public static final BitSet FOLLOW_18_in_ruleComparison1109 = new BitSet(new long[]{0x000000001D0F0070L});
    public static final BitSet FOLLOW_19_in_ruleComparison1138 = new BitSet(new long[]{0x000000001D0F0070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison1175 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus1213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1270 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_rulePlusOrMinus1293 = new BitSet(new long[]{0x000000001D300070L});
    public static final BitSet FOLLOW_21_in_rulePlusOrMinus1322 = new BitSet(new long[]{0x000000001D300070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus1345 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv1440 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleMulOrDiv1469 = new BitSet(new long[]{0x000000001DC00070L});
    public static final BitSet FOLLOW_23_in_ruleMulOrDiv1498 = new BitSet(new long[]{0x000000001DC00070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv1535 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrimary1621 = new BitSet(new long[]{0x000000001F000070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary1643 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePrimary1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimary1683 = new BitSet(new long[]{0x000000001D000070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAtomic1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomic1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1993 = new BitSet(new long[]{0x0000000000000002L});

}