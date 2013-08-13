package org.example.smalljava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.smalljava.services.SmallJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSmallJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'.*'", "'.'", "'class'", "'extends'", "'{'", "'}'", "'('", "','", "')'", "'return'", "'='", "'if'", "'else'", "'true'", "'false'", "'this'", "'super'", "'null'", "'new'", "'private'", "'public'", "'protected'"
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
    public String getGrammarFileName() { return "../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g"; }



     	private SmallJavaGrammarAccess grammarAccess;
     	
        public InternalSmallJavaParser(TokenStream input, SmallJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SJProgram";	
       	}
       	
       	@Override
       	protected SmallJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSJProgram"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:68:1: entryRuleSJProgram returns [EObject current=null] : iv_ruleSJProgram= ruleSJProgram EOF ;
    public final EObject entryRuleSJProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJProgram = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:69:2: (iv_ruleSJProgram= ruleSJProgram EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:70:2: iv_ruleSJProgram= ruleSJProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJProgramRule()); 
            }
            pushFollow(FOLLOW_ruleSJProgram_in_entryRuleSJProgram75);
            iv_ruleSJProgram=ruleSJProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJProgram85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJProgram"


    // $ANTLR start "ruleSJProgram"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:77:1: ruleSJProgram returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleSJImport ) )* ( (lv_classes_4_0= ruleSJClass ) )* ) ;
    public final EObject ruleSJProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:80:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleSJImport ) )* ( (lv_classes_4_0= ruleSJClass ) )* ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:81:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleSJImport ) )* ( (lv_classes_4_0= ruleSJClass ) )* )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:81:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleSJImport ) )* ( (lv_classes_4_0= ruleSJClass ) )* )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:81:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleSJImport ) )* ( (lv_classes_4_0= ruleSJClass ) )*
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:81:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:81:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSJProgram123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSJProgramAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:86:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:86:1: (lv_name_1_0= ruleQualifiedName )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:87:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJProgram144);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJProgramRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSJProgram156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSJProgramAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:107:3: ( (lv_imports_3_0= ruleSJImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:108:1: (lv_imports_3_0= ruleSJImport )
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:108:1: (lv_imports_3_0= ruleSJImport )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:109:3: lv_imports_3_0= ruleSJImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSJProgramAccess().getImportsSJImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSJImport_in_ruleSJProgram179);
            	    lv_imports_3_0=ruleSJImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSJProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_3_0, 
            	              		"SJImport");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:125:3: ( (lv_classes_4_0= ruleSJClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:126:1: (lv_classes_4_0= ruleSJClass )
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:126:1: (lv_classes_4_0= ruleSJClass )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:127:3: lv_classes_4_0= ruleSJClass
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSJProgramAccess().getClassesSJClassParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSJClass_in_ruleSJProgram201);
            	    lv_classes_4_0=ruleSJClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSJProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classes",
            	              		lv_classes_4_0, 
            	              		"SJClass");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJProgram"


    // $ANTLR start "entryRuleSJImport"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:151:1: entryRuleSJImport returns [EObject current=null] : iv_ruleSJImport= ruleSJImport EOF ;
    public final EObject entryRuleSJImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJImport = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:152:2: (iv_ruleSJImport= ruleSJImport EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:153:2: iv_ruleSJImport= ruleSJImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJImportRule()); 
            }
            pushFollow(FOLLOW_ruleSJImport_in_entryRuleSJImport238);
            iv_ruleSJImport=ruleSJImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJImport248); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJImport"


    // $ANTLR start "ruleSJImport"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:160:1: ruleSJImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleSJImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:163:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:164:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:164:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:164:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSJImport285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSJImportAccess().getImportKeyword_0());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:168:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:169:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:169:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:170:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleSJImport306);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSJImport318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSJImportAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:198:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:199:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:200:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard355);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:207:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:210:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:211:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:211:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:212:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard413);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:222:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:223:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildcard432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:236:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:237:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:238:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName486); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:245:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:248:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:249:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:249:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:249:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:256:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:257:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName545); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName560); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSJClass"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:277:1: entryRuleSJClass returns [EObject current=null] : iv_ruleSJClass= ruleSJClass EOF ;
    public final EObject entryRuleSJClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJClass = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:278:2: (iv_ruleSJClass= ruleSJClass EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:279:2: iv_ruleSJClass= ruleSJClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJClassRule()); 
            }
            pushFollow(FOLLOW_ruleSJClass_in_entryRuleSJClass607);
            iv_ruleSJClass=ruleSJClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJClass617); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJClass"


    // $ANTLR start "ruleSJClass"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:286:1: ruleSJClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleSJClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:289:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:290:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:290:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:290:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleSJMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSJClass654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSJClassAccess().getClassKeyword_0());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:294:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:295:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:295:1: (lv_name_1_0= RULE_ID )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:296:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJClass671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSJClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSJClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:312:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:312:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSJClass689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSJClassAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:316:1: ( ( ruleQualifiedName ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:317:1: ( ruleQualifiedName )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:317:1: ( ruleQualifiedName )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:318:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSJClassRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJClassAccess().getSuperclassSJClassCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJClass712);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSJClass726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSJClassAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:335:1: ( (lv_members_5_0= ruleSJMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=33 && LA7_0<=35)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:336:1: (lv_members_5_0= ruleSJMember )
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:336:1: (lv_members_5_0= ruleSJMember )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:337:3: lv_members_5_0= ruleSJMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSJClassAccess().getMembersSJMemberParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSJMember_in_ruleSJClass747);
            	    lv_members_5_0=ruleSJMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSJClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_5_0, 
            	              		"SJMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleSJClass760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSJClassAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJClass"


    // $ANTLR start "entryRuleSJMember"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:365:1: entryRuleSJMember returns [EObject current=null] : iv_ruleSJMember= ruleSJMember EOF ;
    public final EObject entryRuleSJMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJMember = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:366:2: (iv_ruleSJMember= ruleSJMember EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:367:2: iv_ruleSJMember= ruleSJMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJMemberRule()); 
            }
            pushFollow(FOLLOW_ruleSJMember_in_entryRuleSJMember796);
            iv_ruleSJMember=ruleSJMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMember806); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJMember"


    // $ANTLR start "ruleSJMember"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:374:1: ruleSJMember returns [EObject current=null] : (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod ) ;
    public final EObject ruleSJMember() throws RecognitionException {
        EObject current = null;

        EObject this_SJField_0 = null;

        EObject this_SJMethod_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:377:28: ( (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:378:1: (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:378:1: (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:379:5: this_SJField_0= ruleSJField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJMemberAccess().getSJFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJField_in_ruleSJMember853);
                    this_SJField_0=ruleSJField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJField_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:389:5: this_SJMethod_1= ruleSJMethod
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJMemberAccess().getSJMethodParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJMethod_in_ruleSJMember880);
                    this_SJMethod_1=ruleSJMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJMethod_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJMember"


    // $ANTLR start "entryRuleSJField"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:405:1: entryRuleSJField returns [EObject current=null] : iv_ruleSJField= ruleSJField EOF ;
    public final EObject entryRuleSJField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJField = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:406:2: (iv_ruleSJField= ruleSJField EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:407:2: iv_ruleSJField= ruleSJField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJFieldRule()); 
            }
            pushFollow(FOLLOW_ruleSJField_in_entryRuleSJField915);
            iv_ruleSJField=ruleSJField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJField925); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJField"


    // $ANTLR start "ruleSJField"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:414:1: ruleSJField returns [EObject current=null] : ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleSJField() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_access_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:417:28: ( ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:418:1: ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:418:1: ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:418:2: ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:418:2: ( (lv_access_0_0= ruleSJAccessLevel ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=33 && LA9_0<=35)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:419:1: (lv_access_0_0= ruleSJAccessLevel )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:419:1: (lv_access_0_0= ruleSJAccessLevel )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:420:3: lv_access_0_0= ruleSJAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJFieldAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJAccessLevel_in_ruleSJField971);
                    lv_access_0_0=ruleSJAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_0_0, 
                              		"SJAccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:436:3: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:437:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:437:1: ( ruleQualifiedName )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:438:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSJFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJFieldAccess().getTypeSJClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJField995);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:451:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:452:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:452:1: (lv_name_2_0= RULE_ID )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:453:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJField1012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSJFieldAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSJFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSJField1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSJFieldAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJField"


    // $ANTLR start "entryRuleSJMethod"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:481:1: entryRuleSJMethod returns [EObject current=null] : iv_ruleSJMethod= ruleSJMethod EOF ;
    public final EObject entryRuleSJMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJMethod = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:482:2: (iv_ruleSJMethod= ruleSJMethod EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:483:2: iv_ruleSJMethod= ruleSJMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJMethodRule()); 
            }
            pushFollow(FOLLOW_ruleSJMethod_in_entryRuleSJMethod1065);
            iv_ruleSJMethod=ruleSJMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMethod1075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJMethod"


    // $ANTLR start "ruleSJMethod"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:490:1: ruleSJMethod returns [EObject current=null] : ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleSJMethodBody ) ) ) ;
    public final EObject ruleSJMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_access_0_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:493:28: ( ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleSJMethodBody ) ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:494:1: ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleSJMethodBody ) ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:494:1: ( ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleSJMethodBody ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:494:2: ( (lv_access_0_0= ruleSJAccessLevel ) )? ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )? otherlv_7= ')' ( (lv_body_8_0= ruleSJMethodBody ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:494:2: ( (lv_access_0_0= ruleSJAccessLevel ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=33 && LA10_0<=35)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:495:1: (lv_access_0_0= ruleSJAccessLevel )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:495:1: (lv_access_0_0= ruleSJAccessLevel )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:496:3: lv_access_0_0= ruleSJAccessLevel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJMethodAccess().getAccessSJAccessLevelEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJAccessLevel_in_ruleSJMethod1121);
                    lv_access_0_0=ruleSJAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"access",
                              		lv_access_0_0, 
                              		"SJAccessLevel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:512:3: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:513:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:513:1: ( ruleQualifiedName )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:514:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSJMethodRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJMethodAccess().getTypeSJClassCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJMethod1145);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:527:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:528:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:528:1: (lv_name_2_0= RULE_ID )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:529:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJMethod1162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getSJMethodAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSJMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSJMethod1179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSJMethodAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:549:1: ( ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:549:2: ( (lv_params_4_0= ruleSJParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )*
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:549:2: ( (lv_params_4_0= ruleSJParameter ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:550:1: (lv_params_4_0= ruleSJParameter )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:550:1: (lv_params_4_0= ruleSJParameter )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:551:3: lv_params_4_0= ruleSJParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJParameter_in_ruleSJMethod1201);
                    lv_params_4_0=ruleSJParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_4_0, 
                              		"SJParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:567:2: (otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:567:4: otherlv_5= ',' ( (lv_params_6_0= ruleSJParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSJMethod1214); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSJMethodAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:571:1: ( (lv_params_6_0= ruleSJParameter ) )
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:572:1: (lv_params_6_0= ruleSJParameter )
                    	    {
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:572:1: (lv_params_6_0= ruleSJParameter )
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:573:3: lv_params_6_0= ruleSJParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSJMethodAccess().getParamsSJParameterParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSJParameter_in_ruleSJMethod1235);
                    	    lv_params_6_0=ruleSJParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSJMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_6_0, 
                    	              		"SJParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleSJMethod1251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSJMethodAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:593:1: ( (lv_body_8_0= ruleSJMethodBody ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:594:1: (lv_body_8_0= ruleSJMethodBody )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:594:1: (lv_body_8_0= ruleSJMethodBody )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:595:3: lv_body_8_0= ruleSJMethodBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJMethodAccess().getBodySJMethodBodyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSJMethodBody_in_ruleSJMethod1272);
            lv_body_8_0=ruleSJMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJMethodRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_8_0, 
                      		"SJMethodBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJMethod"


    // $ANTLR start "entryRuleSJParameter"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:619:1: entryRuleSJParameter returns [EObject current=null] : iv_ruleSJParameter= ruleSJParameter EOF ;
    public final EObject entryRuleSJParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJParameter = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:620:2: (iv_ruleSJParameter= ruleSJParameter EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:621:2: iv_ruleSJParameter= ruleSJParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJParameterRule()); 
            }
            pushFollow(FOLLOW_ruleSJParameter_in_entryRuleSJParameter1308);
            iv_ruleSJParameter=ruleSJParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJParameter1318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJParameter"


    // $ANTLR start "ruleSJParameter"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:628:1: ruleSJParameter returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSJParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:631:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:632:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:632:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:632:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:632:2: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:633:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:633:1: ( ruleQualifiedName )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:634:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSJParameterRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJParameterAccess().getTypeSJClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJParameter1366);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:647:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:648:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:648:1: (lv_name_1_0= RULE_ID )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:649:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJParameter1383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSJParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSJParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJParameter"


    // $ANTLR start "entryRuleSJMethodBody"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:673:1: entryRuleSJMethodBody returns [EObject current=null] : iv_ruleSJMethodBody= ruleSJMethodBody EOF ;
    public final EObject entryRuleSJMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJMethodBody = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:674:2: (iv_ruleSJMethodBody= ruleSJMethodBody EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:675:2: iv_ruleSJMethodBody= ruleSJMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJMethodBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSJMethodBody_in_entryRuleSJMethodBody1424);
            iv_ruleSJMethodBody=ruleSJMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJMethodBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJMethodBody1434); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJMethodBody"


    // $ANTLR start "ruleSJMethodBody"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:682:1: ruleSJMethodBody returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSJMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:685:28: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:686:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:686:1: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:686:2: () otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )* otherlv_3= '}'
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:686:2: ()
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:687:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSJMethodBodyAccess().getSJMethodBodyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSJMethodBody1480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSJMethodBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:696:1: ( (lv_statements_2_0= ruleSJStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==20||LA13_0==23||LA13_0==25||(LA13_0>=27 && LA13_0<=32)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:697:1: (lv_statements_2_0= ruleSJStatement )
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:697:1: (lv_statements_2_0= ruleSJStatement )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:698:3: lv_statements_2_0= ruleSJStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSJMethodBodyAccess().getStatementsSJStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSJStatement_in_ruleSJMethodBody1501);
            	    lv_statements_2_0=ruleSJStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSJMethodBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"SJStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSJMethodBody1514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSJMethodBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJMethodBody"


    // $ANTLR start "entryRuleSJStatement"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:726:1: entryRuleSJStatement returns [EObject current=null] : iv_ruleSJStatement= ruleSJStatement EOF ;
    public final EObject entryRuleSJStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJStatement = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:727:2: (iv_ruleSJStatement= ruleSJStatement EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:728:2: iv_ruleSJStatement= ruleSJStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSJStatement_in_entryRuleSJStatement1550);
            iv_ruleSJStatement=ruleSJStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJStatement1560); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJStatement"


    // $ANTLR start "ruleSJStatement"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:735:1: ruleSJStatement returns [EObject current=null] : (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement ) ;
    public final EObject ruleSJStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_SJVariableDeclaration_0 = null;

        EObject this_SJReturn_1 = null;

        EObject this_SJExpression_2 = null;

        EObject this_SJIfStatement_4 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:738:28: ( (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:739:1: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:739:1: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement )
            int alt14=4;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:740:5: this_SJVariableDeclaration_0= ruleSJVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJStatementAccess().getSJVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJVariableDeclaration_in_ruleSJStatement1607);
                    this_SJVariableDeclaration_0=ruleSJVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:750:5: this_SJReturn_1= ruleSJReturn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJStatementAccess().getSJReturnParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJReturn_in_ruleSJStatement1634);
                    this_SJReturn_1=ruleSJReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJReturn_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:759:6: (this_SJExpression_2= ruleSJExpression otherlv_3= ';' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:759:6: (this_SJExpression_2= ruleSJExpression otherlv_3= ';' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:760:5: this_SJExpression_2= ruleSJExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJStatementAccess().getSJExpressionParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJExpression_in_ruleSJStatement1662);
                    this_SJExpression_2=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleSJStatement1673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSJStatementAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:774:5: this_SJIfStatement_4= ruleSJIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJStatementAccess().getSJIfStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJIfStatement_in_ruleSJStatement1702);
                    this_SJIfStatement_4=ruleSJIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJIfStatement_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJStatement"


    // $ANTLR start "entryRuleSJReturn"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:790:1: entryRuleSJReturn returns [EObject current=null] : iv_ruleSJReturn= ruleSJReturn EOF ;
    public final EObject entryRuleSJReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJReturn = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:791:2: (iv_ruleSJReturn= ruleSJReturn EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:792:2: iv_ruleSJReturn= ruleSJReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJReturnRule()); 
            }
            pushFollow(FOLLOW_ruleSJReturn_in_entryRuleSJReturn1737);
            iv_ruleSJReturn=ruleSJReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJReturn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJReturn1747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJReturn"


    // $ANTLR start "ruleSJReturn"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:799:1: ruleSJReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleSJReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:802:28: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:803:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:803:1: (otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:803:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleSJExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSJReturn1784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSJReturnAccess().getReturnKeyword_0());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:807:1: ( (lv_expression_1_0= ruleSJExpression ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:808:1: (lv_expression_1_0= ruleSJExpression )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:808:1: (lv_expression_1_0= ruleSJExpression )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:809:3: lv_expression_1_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJReturnAccess().getExpressionSJExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSJExpression_in_ruleSJReturn1805);
            lv_expression_1_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJReturnRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"SJExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSJReturn1817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSJReturnAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJReturn"


    // $ANTLR start "entryRuleSJVariableDeclaration"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:837:1: entryRuleSJVariableDeclaration returns [EObject current=null] : iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF ;
    public final EObject entryRuleSJVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJVariableDeclaration = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:838:2: (iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:839:2: iv_ruleSJVariableDeclaration= ruleSJVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSJVariableDeclaration_in_entryRuleSJVariableDeclaration1853);
            iv_ruleSJVariableDeclaration=ruleSJVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJVariableDeclaration1863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJVariableDeclaration"


    // $ANTLR start "ruleSJVariableDeclaration"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:846:1: ruleSJVariableDeclaration returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleSJExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleSJVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:849:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleSJExpression ) ) otherlv_4= ';' ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:850:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleSJExpression ) ) otherlv_4= ';' )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:850:1: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleSJExpression ) ) otherlv_4= ';' )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:850:2: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleSJExpression ) ) otherlv_4= ';'
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:850:2: ( ( ruleQualifiedName ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:851:1: ( ruleQualifiedName )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:851:1: ( ruleQualifiedName )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:852:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSJVariableDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getTypeSJClassCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJVariableDeclaration1911);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:865:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:866:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:866:1: (lv_name_1_0= RULE_ID )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:867:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJVariableDeclaration1928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSJVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSJVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSJVariableDeclaration1945); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSJVariableDeclarationAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:887:1: ( (lv_expression_3_0= ruleSJExpression ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:888:1: (lv_expression_3_0= ruleSJExpression )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:888:1: (lv_expression_3_0= ruleSJExpression )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:889:3: lv_expression_3_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJVariableDeclarationAccess().getExpressionSJExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSJExpression_in_ruleSJVariableDeclaration1966);
            lv_expression_3_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"SJExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleSJVariableDeclaration1978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSJVariableDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJVariableDeclaration"


    // $ANTLR start "entryRuleSJIfStatement"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:917:1: entryRuleSJIfStatement returns [EObject current=null] : iv_ruleSJIfStatement= ruleSJIfStatement EOF ;
    public final EObject entryRuleSJIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJIfStatement = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:918:2: (iv_ruleSJIfStatement= ruleSJIfStatement EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:919:2: iv_ruleSJIfStatement= ruleSJIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSJIfStatement_in_entryRuleSJIfStatement2014);
            iv_ruleSJIfStatement=ruleSJIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJIfStatement2024); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJIfStatement"


    // $ANTLR start "ruleSJIfStatement"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:926:1: ruleSJIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? ) ;
    public final EObject ruleSJIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:929:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:930:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:930:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )? )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:930:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleSJExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleSJIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSJIfStatement2061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSJIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSJIfStatement2073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSJIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:938:1: ( (lv_expression_2_0= ruleSJExpression ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:939:1: (lv_expression_2_0= ruleSJExpression )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:939:1: (lv_expression_2_0= ruleSJExpression )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:940:3: lv_expression_2_0= ruleSJExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJIfStatementAccess().getExpressionSJExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSJExpression_in_ruleSJIfStatement2094);
            lv_expression_2_0=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"SJExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSJIfStatement2106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSJIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:960:1: ( (lv_thenBlock_4_0= ruleSJIfBlock ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:961:1: (lv_thenBlock_4_0= ruleSJIfBlock )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:961:1: (lv_thenBlock_4_0= ruleSJIfBlock )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:962:3: lv_thenBlock_4_0= ruleSJIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSJIfStatementAccess().getThenBlockSJIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSJIfBlock_in_ruleSJIfStatement2127);
            lv_thenBlock_4_0=ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenBlock",
                      		lv_thenBlock_4_0, 
                      		"SJIfBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred1_InternalSmallJava()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleSJIfBlock ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleSJIfStatement2148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSJIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:983:2: ( (lv_elseBlock_6_0= ruleSJIfBlock ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:984:1: (lv_elseBlock_6_0= ruleSJIfBlock )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:984:1: (lv_elseBlock_6_0= ruleSJIfBlock )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:985:3: lv_elseBlock_6_0= ruleSJIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJIfStatementAccess().getElseBlockSJIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJIfBlock_in_ruleSJIfStatement2170);
                    lv_elseBlock_6_0=ruleSJIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"SJIfBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJIfStatement"


    // $ANTLR start "entryRuleSJIfBlock"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1009:1: entryRuleSJIfBlock returns [EObject current=null] : iv_ruleSJIfBlock= ruleSJIfBlock EOF ;
    public final EObject entryRuleSJIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJIfBlock = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1010:2: (iv_ruleSJIfBlock= ruleSJIfBlock EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1011:2: iv_ruleSJIfBlock= ruleSJIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleSJIfBlock_in_entryRuleSJIfBlock2208);
            iv_ruleSJIfBlock=ruleSJIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJIfBlock2218); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJIfBlock"


    // $ANTLR start "ruleSJIfBlock"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1018:1: ruleSJIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleSJStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' ) ) ;
    public final EObject ruleSJIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1021:28: ( ( ( (lv_statements_0_0= ruleSJStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1022:1: ( ( (lv_statements_0_0= ruleSJStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1022:1: ( ( (lv_statements_0_0= ruleSJStatement ) ) | (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==20||LA17_0==23||LA17_0==25||(LA17_0>=27 && LA17_0<=32)) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1022:2: ( (lv_statements_0_0= ruleSJStatement ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1022:2: ( (lv_statements_0_0= ruleSJStatement ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1023:1: (lv_statements_0_0= ruleSJStatement )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1023:1: (lv_statements_0_0= ruleSJStatement )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1024:3: lv_statements_0_0= ruleSJStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJStatement_in_ruleSJIfBlock2264);
                    lv_statements_0_0=ruleSJStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJIfBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"statements",
                              		lv_statements_0_0, 
                              		"SJStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1041:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1041:6: (otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1041:8: otherlv_1= '{' ( (lv_statements_2_0= ruleSJStatement ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSJIfBlock2283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSJIfBlockAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1045:1: ( (lv_statements_2_0= ruleSJStatement ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==20||LA16_0==23||LA16_0==25||(LA16_0>=27 && LA16_0<=32)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1046:1: (lv_statements_2_0= ruleSJStatement )
                    	    {
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1046:1: (lv_statements_2_0= ruleSJStatement )
                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1047:3: lv_statements_2_0= ruleSJStatement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSJIfBlockAccess().getStatementsSJStatementParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSJStatement_in_ruleSJIfBlock2304);
                    	    lv_statements_2_0=ruleSJStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSJIfBlockRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"statements",
                    	              		lv_statements_2_0, 
                    	              		"SJStatement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSJIfBlock2317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSJIfBlockAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJIfBlock"


    // $ANTLR start "entryRuleSJExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1079:1: entryRuleSJExpression returns [EObject current=null] : iv_ruleSJExpression= ruleSJExpression EOF ;
    public final EObject entryRuleSJExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJExpression = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1080:2: (iv_ruleSJExpression= ruleSJExpression EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1081:2: iv_ruleSJExpression= ruleSJExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJExpression_in_entryRuleSJExpression2358);
            iv_ruleSJExpression=ruleSJExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJExpression2368); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJExpression"


    // $ANTLR start "ruleSJExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1088:1: ruleSJExpression returns [EObject current=null] : this_SJAssignment_0= ruleSJAssignment ;
    public final EObject ruleSJExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SJAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1091:28: (this_SJAssignment_0= ruleSJAssignment )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1093:5: this_SJAssignment_0= ruleSJAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSJExpressionAccess().getSJAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleSJAssignment_in_ruleSJExpression2414);
            this_SJAssignment_0=ruleSJAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SJAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJExpression"


    // $ANTLR start "entryRuleSJAssignment"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1109:1: entryRuleSJAssignment returns [EObject current=null] : iv_ruleSJAssignment= ruleSJAssignment EOF ;
    public final EObject entryRuleSJAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJAssignment = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1110:2: (iv_ruleSJAssignment= ruleSJAssignment EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1111:2: iv_ruleSJAssignment= ruleSJAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleSJAssignment_in_entryRuleSJAssignment2448);
            iv_ruleSJAssignment=ruleSJAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJAssignment2458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJAssignment"


    // $ANTLR start "ruleSJAssignment"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1118:1: ruleSJAssignment returns [EObject current=null] : (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? ) ;
    public final EObject ruleSJAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SJSelectionExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1121:28: ( (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1122:1: (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1122:1: (this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )? )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1123:5: this_SJSelectionExpression_0= ruleSJSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSJAssignmentAccess().getSJSelectionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSJSelectionExpression_in_ruleSJAssignment2505);
            this_SJSelectionExpression_0=ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SJSelectionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1131:1: ( () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1131:2: () otherlv_2= '=' ( (lv_right_3_0= ruleSJExpression ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1131:2: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1132:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSJAssignmentAccess().getSJAssignmentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSJAssignment2526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSJAssignmentAccess().getEqualsSignKeyword_1_1());
                          
                    }
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1141:1: ( (lv_right_3_0= ruleSJExpression ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1142:1: (lv_right_3_0= ruleSJExpression )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1142:1: (lv_right_3_0= ruleSJExpression )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1143:3: lv_right_3_0= ruleSJExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJAssignmentAccess().getRightSJExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSJExpression_in_ruleSJAssignment2547);
                    lv_right_3_0=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSJAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"SJExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJAssignment"


    // $ANTLR start "entryRuleSJSelectionExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1167:1: entryRuleSJSelectionExpression returns [EObject current=null] : iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF ;
    public final EObject entryRuleSJSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJSelectionExpression = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1168:2: (iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1169:2: iv_ruleSJSelectionExpression= ruleSJSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJSelectionExpression_in_entryRuleSJSelectionExpression2585);
            iv_ruleSJSelectionExpression=ruleSJSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJSelectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJSelectionExpression2595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJSelectionExpression"


    // $ANTLR start "ruleSJSelectionExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1176:1: ruleSJSelectionExpression returns [EObject current=null] : (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleSJSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodinvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_SJTerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1179:28: ( (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1180:1: (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1180:1: (this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )* )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1181:5: this_SJTerminalExpression_0= ruleSJTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getSJTerminalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSJTerminalExpression_in_ruleSJSelectionExpression2642);
            this_SJTerminalExpression_0=ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SJTerminalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1189:1: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )? )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1189:2: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1189:2: ()
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1190:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSJSelectionExpressionAccess().getSJMemberSelectionReceiverAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSJSelectionExpression2663); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSJSelectionExpressionAccess().getFullStopKeyword_1_1());
            	          
            	    }
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1199:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1200:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1200:1: (otherlv_3= RULE_ID )
            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1201:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJSelectionExpression2683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getSJSelectionExpressionAccess().getMemberSJMemberCrossReference_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1212:2: ( ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==20) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1212:3: ( (lv_methodinvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1212:3: ( (lv_methodinvocation_4_0= '(' ) )
            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1213:1: (lv_methodinvocation_4_0= '(' )
            	            {
            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1213:1: (lv_methodinvocation_4_0= '(' )
            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1214:3: lv_methodinvocation_4_0= '('
            	            {
            	            lv_methodinvocation_4_0=(Token)match(input,20,FOLLOW_20_in_ruleSJSelectionExpression2702); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_methodinvocation_4_0, grammarAccess.getSJSelectionExpressionAccess().getMethodinvocationLeftParenthesisKeyword_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getSJSelectionExpressionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "methodinvocation", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1227:2: ( ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )* )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INT)||LA20_0==20||(LA20_0>=27 && LA20_0<=32)) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1227:3: ( (lv_args_5_0= ruleSJExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )*
            	                    {
            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1227:3: ( (lv_args_5_0= ruleSJExpression ) )
            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1228:1: (lv_args_5_0= ruleSJExpression )
            	                    {
            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1228:1: (lv_args_5_0= ruleSJExpression )
            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1229:3: lv_args_5_0= ruleSJExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleSJExpression_in_ruleSJSelectionExpression2737);
            	                    lv_args_5_0=ruleSJExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"args",
            	                              		lv_args_5_0, 
            	                              		"SJExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1245:2: (otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) ) )*
            	                    loop19:
            	                    do {
            	                        int alt19=2;
            	                        int LA19_0 = input.LA(1);

            	                        if ( (LA19_0==21) ) {
            	                            alt19=1;
            	                        }


            	                        switch (alt19) {
            	                    	case 1 :
            	                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1245:4: otherlv_6= ',' ( (lv_args_7_0= ruleSJExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleSJSelectionExpression2750); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_6, grammarAccess.getSJSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1249:1: ( (lv_args_7_0= ruleSJExpression ) )
            	                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1250:1: (lv_args_7_0= ruleSJExpression )
            	                    	    {
            	                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1250:1: (lv_args_7_0= ruleSJExpression )
            	                    	    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1251:3: lv_args_7_0= ruleSJExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getSJSelectionExpressionAccess().getArgsSJExpressionParserRuleCall_1_3_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleSJExpression_in_ruleSJSelectionExpression2771);
            	                    	    lv_args_7_0=ruleSJExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getSJSelectionExpressionRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"args",
            	                    	              		lv_args_7_0, 
            	                    	              		"SJExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop19;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSJSelectionExpression2787); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getSJSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJSelectionExpression"


    // $ANTLR start "entryRuleSJTerminalExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1279:1: entryRuleSJTerminalExpression returns [EObject current=null] : iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF ;
    public final EObject entryRuleSJTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSJTerminalExpression = null;


        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1280:2: (iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1281:2: iv_ruleSJTerminalExpression= ruleSJTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSJTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSJTerminalExpression_in_entryRuleSJTerminalExpression2827);
            iv_ruleSJTerminalExpression=ruleSJTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSJTerminalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSJTerminalExpression2837); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSJTerminalExpression"


    // $ANTLR start "ruleSJTerminalExpression"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1288:1: ruleSJTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' ) ) ;
    public final EObject ruleSJTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_SJExpression_20 = null;


         enterRule(); 
            
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1291:28: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:1: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'this' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' ) | (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' ) )
            int alt24=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
                {
                alt24=2;
                }
                break;
            case 27:
            case 28:
                {
                alt24=3;
                }
                break;
            case 29:
                {
                alt24=4;
                }
                break;
            case 30:
                {
                alt24=5;
                }
                break;
            case 31:
                {
                alt24=6;
                }
                break;
            case RULE_ID:
                {
                alt24=7;
                }
                break;
            case 32:
                {
                alt24=8;
                }
                break;
            case 20:
                {
                alt24=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:3: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1292:3: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1293:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJStringConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1298:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1299:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1299:1: (lv_value_1_0= RULE_STRING )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1300:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSJTerminalExpression2889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getSJTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1317:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1317:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1317:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1317:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1318:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJIntConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1323:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1324:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1324:1: (lv_value_3_0= RULE_INT )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1325:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSJTerminalExpression2928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getSJTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1342:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1342:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1342:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1342:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1343:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJBoolConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1348:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1349:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1349:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1350:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1350:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==28) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1351:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,27,FOLLOW_27_in_ruleSJTerminalExpression2970); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_1, grammarAccess.getSJTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1363:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,28,FOLLOW_28_in_ruleSJTerminalExpression2999); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_2, grammarAccess.getSJTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1379:6: ( () otherlv_7= 'this' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1379:6: ( () otherlv_7= 'this' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1379:7: () otherlv_7= 'this'
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1379:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1380:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJThisAction_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleSJTerminalExpression3044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSJTerminalExpressionAccess().getThisKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1390:6: ( () otherlv_9= 'super' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1390:6: ( () otherlv_9= 'super' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1390:7: () otherlv_9= 'super'
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1390:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1391:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJSuperAction_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleSJTerminalExpression3073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getSJTerminalExpressionAccess().getSuperKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1401:6: ( () otherlv_11= 'null' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1401:6: ( () otherlv_11= 'null' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1401:7: () otherlv_11= 'null'
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1401:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1402:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJNullAction_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_11=(Token)match(input,31,FOLLOW_31_in_ruleSJTerminalExpression3102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getSJTerminalExpressionAccess().getNullKeyword_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1412:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1412:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1412:7: () ( (otherlv_13= RULE_ID ) )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1412:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1413:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJSymbolRefAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1418:2: ( (otherlv_13= RULE_ID ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1419:1: (otherlv_13= RULE_ID )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1419:1: (otherlv_13= RULE_ID )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1420:3: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      	        }
                              
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSJTerminalExpression3139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_13, grammarAccess.getSJTerminalExpressionAccess().getSymbolSJSymbolCrossReference_6_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1432:6: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1432:6: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1432:7: () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' otherlv_18= ')'
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1432:7: ()
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1433:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSJTerminalExpressionAccess().getSJNewAction_7_0(),
                                  current);
                          
                    }

                    }

                    otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleSJTerminalExpression3168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSJTerminalExpressionAccess().getNewKeyword_7_1());
                          
                    }
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1442:1: ( ( ruleQualifiedName ) )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1443:1: ( ruleQualifiedName )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1443:1: ( ruleQualifiedName )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1444:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSJTerminalExpressionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSJTerminalExpressionAccess().getTypeSJClassCrossReference_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSJTerminalExpression3191);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleSJTerminalExpression3203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                          
                    }
                    otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleSJTerminalExpression3215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1466:6: (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1466:6: (otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1466:8: otherlv_19= '(' this_SJExpression_20= ruleSJExpression otherlv_21= ')'
                    {
                    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleSJTerminalExpression3235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getSJTerminalExpressionAccess().getLeftParenthesisKeyword_8_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSJTerminalExpressionAccess().getSJExpressionParserRuleCall_8_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSJExpression_in_ruleSJTerminalExpression3257);
                    this_SJExpression_20=ruleSJExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SJExpression_20; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleSJTerminalExpression3268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSJTerminalExpressionAccess().getRightParenthesisKeyword_8_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJTerminalExpression"


    // $ANTLR start "ruleSJAccessLevel"
    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1491:1: ruleSJAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleSJAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1493:28: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) ) )
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1494:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) )
            {
            // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1494:1: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1494:2: (enumLiteral_0= 'private' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1494:2: (enumLiteral_0= 'private' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1494:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleSJAccessLevel3319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSJAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSJAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1500:6: (enumLiteral_1= 'public' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1500:6: (enumLiteral_1= 'public' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1500:8: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleSJAccessLevel3336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSJAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSJAccessLevelAccess().getPUBLICEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1506:6: (enumLiteral_2= 'protected' )
                    {
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1506:6: (enumLiteral_2= 'protected' )
                    // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:1506:8: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleSJAccessLevel3353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSJAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getSJAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSJAccessLevel"

    // $ANTLR start synpred1_InternalSmallJava
    public final void synpred1_InternalSmallJava_fragment() throws RecognitionException {   
        // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:4: ( 'else' )
        // ../org.example.smalljava/src-gen/org/example/smalljava/parser/antlr/internal/InternalSmallJava.g:978:6: 'else'
        {
        match(input,26,FOLLOW_26_in_synpred1_InternalSmallJava2140); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalSmallJava

    // Delegated rules

    public final boolean synpred1_InternalSmallJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalSmallJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\6\4\1\14\1\4\2\uffff";
    static final String DFA8_maxS =
        "\1\43\3\4\1\17\1\4\1\24\1\17\2\uffff";
    static final String DFA8_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\4\34\uffff\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\6\12\uffff\1\5",
            "\1\7",
            "\1\11\7\uffff\1\10",
            "\1\6\12\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "378:1: (this_SJField_0= ruleSJField | this_SJMethod_1= ruleSJMethod )";
        }
    }
    static final String DFA14_eotS =
        "\10\uffff";
    static final String DFA14_eofS =
        "\10\uffff";
    static final String DFA14_minS =
        "\2\4\3\uffff\1\4\1\uffff\1\4";
    static final String DFA14_maxS =
        "\1\40\1\30\3\uffff\1\4\1\uffff\1\30";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\1\1\uffff";
    static final String DFA14_specialS =
        "\10\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\2\3\15\uffff\1\3\2\uffff\1\2\1\uffff\1\4\1\uffff\6\3",
            "\1\6\7\uffff\1\3\2\uffff\1\5\10\uffff\1\3",
            "",
            "",
            "",
            "\1\7",
            "",
            "\1\6\7\uffff\1\3\2\uffff\1\5\4\uffff\1\3\3\uffff\1\3"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "739:1: (this_SJVariableDeclaration_0= ruleSJVariableDeclaration | this_SJReturn_1= ruleSJReturn | (this_SJExpression_2= ruleSJExpression otherlv_3= ';' ) | this_SJIfStatement_4= ruleSJIfStatement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSJProgram_in_entryRuleSJProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSJProgram123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJProgram144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJProgram156 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleSJImport_in_ruleSJProgram179 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleSJClass_in_ruleSJProgram201 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSJImport_in_entryRuleSJImport238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSJImport285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleSJImport306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJImport318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard413 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildcard432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName526 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName560 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSJClass_in_entryRuleSJClass607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJClass617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSJClass654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJClass671 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSJClass689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJClass712 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSJClass726 = new BitSet(new long[]{0x0000000E00080010L});
    public static final BitSet FOLLOW_ruleSJMember_in_ruleSJClass747 = new BitSet(new long[]{0x0000000E00080010L});
    public static final BitSet FOLLOW_19_in_ruleSJClass760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMember_in_entryRuleSJMember796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMember806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJField_in_ruleSJMember853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethod_in_ruleSJMember880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJField_in_entryRuleSJField915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJField925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAccessLevel_in_ruleSJField971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJField995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJField1012 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJField1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethod_in_entryRuleSJMethod1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMethod1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAccessLevel_in_ruleSJMethod1121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJMethod1145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJMethod1162 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSJMethod1179 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleSJParameter_in_ruleSJMethod1201 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSJMethod1214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSJParameter_in_ruleSJMethod1235 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSJMethod1251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleSJMethodBody_in_ruleSJMethod1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJParameter_in_entryRuleSJParameter1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJParameter1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJParameter1366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJParameter1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJMethodBody_in_entryRuleSJMethodBody1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJMethodBody1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSJMethodBody1480 = new BitSet(new long[]{0x00000001FA980070L});
    public static final BitSet FOLLOW_ruleSJStatement_in_ruleSJMethodBody1501 = new BitSet(new long[]{0x00000001FA980070L});
    public static final BitSet FOLLOW_19_in_ruleSJMethodBody1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_entryRuleSJStatement1550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJStatement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJVariableDeclaration_in_ruleSJStatement1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJReturn_in_ruleSJStatement1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJStatement1662 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJStatement1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfStatement_in_ruleSJStatement1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJReturn_in_entryRuleSJReturn1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJReturn1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSJReturn1784 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJReturn1805 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJReturn1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJVariableDeclaration_in_entryRuleSJVariableDeclaration1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJVariableDeclaration1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJVariableDeclaration1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJVariableDeclaration1928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSJVariableDeclaration1945 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJVariableDeclaration1966 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSJVariableDeclaration1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfStatement_in_entryRuleSJIfStatement2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJIfStatement2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSJIfStatement2061 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSJIfStatement2073 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJIfStatement2094 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSJIfStatement2106 = new BitSet(new long[]{0x00000001FA940070L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_ruleSJIfStatement2127 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSJIfStatement2148 = new BitSet(new long[]{0x00000001FA940070L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_ruleSJIfStatement2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJIfBlock_in_entryRuleSJIfBlock2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJIfBlock2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJStatement_in_ruleSJIfBlock2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSJIfBlock2283 = new BitSet(new long[]{0x00000001FA900070L});
    public static final BitSet FOLLOW_ruleSJStatement_in_ruleSJIfBlock2304 = new BitSet(new long[]{0x00000001FA980070L});
    public static final BitSet FOLLOW_19_in_ruleSJIfBlock2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJExpression_in_entryRuleSJExpression2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJExpression2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAssignment_in_ruleSJExpression2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJAssignment_in_entryRuleSJAssignment2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJAssignment2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJSelectionExpression_in_ruleSJAssignment2505 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleSJAssignment2526 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJAssignment2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJSelectionExpression_in_entryRuleSJSelectionExpression2585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJSelectionExpression2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSJTerminalExpression_in_ruleSJSelectionExpression2642 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSJSelectionExpression2663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJSelectionExpression2683 = new BitSet(new long[]{0x0000000000108002L});
    public static final BitSet FOLLOW_20_in_ruleSJSelectionExpression2702 = new BitSet(new long[]{0x00000001F8500070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJSelectionExpression2737 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSJSelectionExpression2750 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJSelectionExpression2771 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSJSelectionExpression2787 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSJTerminalExpression_in_entryRuleSJTerminalExpression2827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSJTerminalExpression2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSJTerminalExpression2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSJTerminalExpression2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSJTerminalExpression2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSJTerminalExpression2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSJTerminalExpression3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSJTerminalExpression3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSJTerminalExpression3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSJTerminalExpression3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSJTerminalExpression3168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSJTerminalExpression3191 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSJTerminalExpression3203 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSJTerminalExpression3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSJTerminalExpression3235 = new BitSet(new long[]{0x00000001F8100070L});
    public static final BitSet FOLLOW_ruleSJExpression_in_ruleSJTerminalExpression3257 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSJTerminalExpression3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSJAccessLevel3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSJAccessLevel3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSJAccessLevel3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred1_InternalSmallJava2140 = new BitSet(new long[]{0x0000000000000002L});

}