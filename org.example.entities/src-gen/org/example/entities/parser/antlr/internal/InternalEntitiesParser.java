package org.example.entities.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.entities.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'}'", "';'", "'['", "']'", "'string'", "'int'", "'boolean'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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


        public InternalEntitiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntitiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntitiesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g"; }



     	private EntitiesGrammarAccess grammarAccess;
     	
        public InternalEntitiesParser(TokenStream input, EntitiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EntitiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:76:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:79:28: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:80:1: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:80:1: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:81:1: (lv_entities_0_0= ruleEntity )
            	    {
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:81:1: (lv_entities_0_0= ruleEntity )
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:82:3: lv_entities_0_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModel130);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_0_0, 
            	            		"Entity");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:106:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:107:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:108:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity166);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity176); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:115:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:118:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:119:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:119:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}' )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:119:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleEntity213); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:141:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:141:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity248); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:146:1: (otherlv_3= RULE_ID )
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:147:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity268); 

                    		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity282); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:162:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=18 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:163:1: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:163:1: (lv_attributes_5_0= ruleAttribute )
            	    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:164:3: lv_attributes_5_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity303);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEntity316); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:192:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:193:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:194:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute352);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute362); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:201:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:204:28: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:205:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:205:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:205:2: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:205:2: ( (lv_type_0_0= ruleAttributeType ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:206:1: (lv_type_0_0= ruleAttributeType )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:206:1: (lv_type_0_0= ruleAttributeType )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:207:3: lv_type_0_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute408);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:223:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:224:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:224:1: (lv_name_1_0= RULE_ID )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:225:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute425); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAttribute442); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:253:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:254:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:255:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType478);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType488); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:262:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_elementType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:265:28: ( ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:266:1: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:266:1: ( ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:266:2: ( (lv_elementType_0_0= ruleElementType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:266:2: ( (lv_elementType_0_0= ruleElementType ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:267:1: (lv_elementType_0_0= ruleElementType )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:267:1: (lv_elementType_0_0= ruleElementType )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:268:3: lv_elementType_0_0= ruleElementType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleElementType_in_ruleAttributeType534);
            lv_elementType_0_0=ruleElementType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"elementType",
                    		lv_elementType_0_0, 
                    		"ElementType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:284:2: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:284:3: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:284:3: ( (lv_array_1_0= '[' ) )
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:285:1: (lv_array_1_0= '[' )
                    {
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:285:1: (lv_array_1_0= '[' )
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:286:3: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,16,FOLLOW_16_in_ruleAttributeType553); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeTypeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[");
                    	    

                    }


                    }

                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:299:2: ( (lv_length_2_0= RULE_INT ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_INT) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:300:1: (lv_length_2_0= RULE_INT )
                            {
                            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:300:1: (lv_length_2_0= RULE_INT )
                            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:301:3: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeType583); 

                            			newLeafNode(lv_length_2_0, grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeTypeRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"length",
                                    		lv_length_2_0, 
                                    		"INT");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttributeType601); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:329:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:330:2: (iv_ruleElementType= ruleElementType EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:331:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType639);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType649); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:338:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:341:28: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:342:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:342:1: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:343:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleElementType696);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;

                     
                            current = this_BasicType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:353:5: this_EntityType_1= ruleEntityType
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntityType_in_ruleElementType723);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;

                     
                            current = this_EntityType_1; 
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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:369:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:370:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:371:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType758);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType768); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:378:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;

         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:381:28: ( ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) ) ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:382:1: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) ) )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:382:1: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:383:1: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:383:1: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:384:1: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:384:1: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'boolean' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
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
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:385:3: lv_typeName_0_1= 'string'
                    {
                    lv_typeName_0_1=(Token)match(input,18,FOLLOW_18_in_ruleBasicType812); 

                            newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:397:8: lv_typeName_0_2= 'int'
                    {
                    lv_typeName_0_2=(Token)match(input,19,FOLLOW_19_in_ruleBasicType841); 

                            newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:409:8: lv_typeName_0_3= 'boolean'
                    {
                    lv_typeName_0_3=(Token)match(input,20,FOLLOW_20_in_ruleBasicType870); 

                            newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicTypeRule());
                    	        }
                           		setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:432:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:433:2: (iv_ruleEntityType= ruleEntityType EOF )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:434:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType921);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType931); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:441:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:444:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:445:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:445:1: ( (otherlv_0= RULE_ID ) )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:446:1: (otherlv_0= RULE_ID )
            {
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:446:1: (otherlv_0= RULE_ID )
            // ../org.example.entities/src-gen/org/example/entities/parser/antlr/internal/InternalEntities.g:447:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityType975); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            	

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
    // $ANTLR end "ruleEntityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntity213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity230 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleEntity248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity282 = new BitSet(new long[]{0x00000000001C4010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity303 = new BitSet(new long[]{0x00000000001C4010L});
    public static final BitSet FOLLOW_14_in_ruleEntity316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleAttributeType534 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAttributeType553 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeType583 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeType601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleElementType696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleElementType723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBasicType812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBasicType841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicType870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityType975 = new BitSet(new long[]{0x0000000000000002L});

}