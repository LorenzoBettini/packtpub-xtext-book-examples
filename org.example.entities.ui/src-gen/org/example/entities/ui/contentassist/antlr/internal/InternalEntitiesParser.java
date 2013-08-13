package org.example.entities.ui.contentassist.antlr.internal; 

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
import org.example.entities.services.EntitiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntitiesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'entity'", "'{'", "'}'", "'extends'", "';'", "']'", "'['"
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
    public String getGrammarFileName() { return "../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g"; }


     
     	private EntitiesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntitiesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:61:1: ( ruleModel EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:69:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:73:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:74:1: ( ( rule__Model__EntitiesAssignment )* )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:74:1: ( ( rule__Model__EntitiesAssignment )* )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:75:1: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:76:1: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:76:2: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__EntitiesAssignment_in_ruleModel94);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:89:1: ( ruleEntity EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity122);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity129); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:104:1: ( rule__Entity__Group__0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity155);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:117:1: ( ruleAttribute EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute182);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute189); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:125:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:129:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:130:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:130:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:131:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:132:1: ( rule__Attribute__Group__0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:132:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute215);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:144:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:145:1: ( ruleAttributeType EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:146:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType242);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType249); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:153:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:157:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:158:1: ( ( rule__AttributeType__Group__0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:158:1: ( ( rule__AttributeType__Group__0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:159:1: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:160:1: ( rule__AttributeType__Group__0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:160:2: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeType__Group__0_in_ruleAttributeType275);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleElementType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:172:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:173:1: ( ruleElementType EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:174:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType302);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType309); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:181:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:185:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:186:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:186:1: ( ( rule__ElementType__Alternatives ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:187:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:188:1: ( rule__ElementType__Alternatives )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:188:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementType__Alternatives_in_ruleElementType335);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:200:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:201:1: ( ruleBasicType EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:202:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType362);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType369); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:209:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:213:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:214:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:214:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:215:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:216:1: ( rule__BasicType__TypeNameAssignment )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:216:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType395);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:228:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:229:1: ( ruleEntityType EOF )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:230:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType422);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType429); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:237:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:241:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:242:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:242:1: ( ( rule__EntityType__EntityAssignment ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:243:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:244:1: ( rule__EntityType__EntityAssignment )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:244:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType455);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__ElementType__Alternatives"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:256:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:260:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:261:1: ( ruleBasicType )
                    {
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:261:1: ( ruleBasicType )
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:262:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives491);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:267:6: ( ruleEntityType )
                    {
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:267:6: ( ruleEntityType )
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:268:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives508);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:278:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:282:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:283:1: ( 'string' )
                    {
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:283:1: ( 'string' )
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:284:1: 'string'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_0541); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:291:6: ( 'int' )
                    {
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:291:6: ( 'int' )
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:292:1: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_0561); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:299:6: ( 'boolean' )
                    {
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:299:6: ( 'boolean' )
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:300:1: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_0581); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_2()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:314:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:318:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:319:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0613);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0616);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:326:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:330:1: ( ( 'entity' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:331:1: ( 'entity' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:331:1: ( 'entity' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:332:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__0__Impl644); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:345:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:349:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:350:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1675);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1678);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:357:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:361:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:362:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:362:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:363:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:364:1: ( rule__Entity__NameAssignment_1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:364:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl705);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:374:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:378:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:379:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2735);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2738);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:386:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:390:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:391:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:391:1: ( ( rule__Entity__Group_2__0 )? )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:392:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:393:1: ( rule__Entity__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:393:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl765);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:403:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:407:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:408:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3796);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3799);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:415:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:419:1: ( ( '{' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:420:1: ( '{' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:420:1: ( '{' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:421:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Entity__Group__3__Impl827); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:434:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:438:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:439:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4858);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4861);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:446:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:450:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:451:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:451:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:452:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:453:1: ( rule__Entity__AttributesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:453:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl888);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:463:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:467:1: ( rule__Entity__Group__5__Impl )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:468:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5919);
            rule__Entity__Group__5__Impl();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:474:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:478:1: ( ( '}' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:479:1: ( '}' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:479:1: ( '}' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:480:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__Entity__Group__5__Impl947); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:505:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:509:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:510:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0990);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0993);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:517:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:521:1: ( ( 'extends' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:522:1: ( 'extends' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:522:1: ( 'extends' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:523:1: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Entity__Group_2__0__Impl1021); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:536:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:540:1: ( rule__Entity__Group_2__1__Impl )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:541:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11052);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:547:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:551:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:552:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:552:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:553:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:554:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:554:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1079);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:568:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:572:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:573:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01113);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01116);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:580:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:584:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:585:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:585:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:586:1: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:587:1: ( rule__Attribute__TypeAssignment_0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:587:2: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl1143);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:597:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:601:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:602:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11173);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11176);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:609:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:613:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:614:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:614:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:615:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:616:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:616:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1203);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:626:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:630:1: ( rule__Attribute__Group__2__Impl )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:631:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21233);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:637:1: rule__Attribute__Group__2__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:641:1: ( ( ';' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:642:1: ( ';' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:642:1: ( ';' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:643:1: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group__2__Impl1261); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:662:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:666:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:667:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeType__Group__0__Impl_in_rule__AttributeType__Group__01298);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeType__Group__1_in_rule__AttributeType__Group__01301);
            rule__AttributeType__Group__1();

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
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:674:1: rule__AttributeType__Group__0__Impl : ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:678:1: ( ( ( rule__AttributeType__ElementTypeAssignment_0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:679:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:679:1: ( ( rule__AttributeType__ElementTypeAssignment_0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:680:1: ( rule__AttributeType__ElementTypeAssignment_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:681:1: ( rule__AttributeType__ElementTypeAssignment_0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:681:2: rule__AttributeType__ElementTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeType__ElementTypeAssignment_0_in_rule__AttributeType__Group__0__Impl1328);
            rule__AttributeType__ElementTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getElementTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:691:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:695:1: ( rule__AttributeType__Group__1__Impl )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:696:2: rule__AttributeType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeType__Group__1__Impl_in_rule__AttributeType__Group__11358);
            rule__AttributeType__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:702:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__Group_1__0 )? ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:706:1: ( ( ( rule__AttributeType__Group_1__0 )? ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:707:1: ( ( rule__AttributeType__Group_1__0 )? )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:707:1: ( ( rule__AttributeType__Group_1__0 )? )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:708:1: ( rule__AttributeType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup_1()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:709:1: ( rule__AttributeType__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:709:2: rule__AttributeType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeType__Group_1__0_in_rule__AttributeType__Group__1__Impl1385);
                    rule__AttributeType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:723:1: rule__AttributeType__Group_1__0 : rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 ;
    public final void rule__AttributeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:727:1: ( rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:728:2: rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeType__Group_1__0__Impl_in_rule__AttributeType__Group_1__01420);
            rule__AttributeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeType__Group_1__1_in_rule__AttributeType__Group_1__01423);
            rule__AttributeType__Group_1__1();

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
    // $ANTLR end "rule__AttributeType__Group_1__0"


    // $ANTLR start "rule__AttributeType__Group_1__0__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:735:1: rule__AttributeType__Group_1__0__Impl : ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:739:1: ( ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:740:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:740:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:741:1: ( rule__AttributeType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:742:1: ( rule__AttributeType__ArrayAssignment_1_0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:742:2: rule__AttributeType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AttributeType__ArrayAssignment_1_0_in_rule__AttributeType__Group_1__0__Impl1450);
            rule__AttributeType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:752:1: rule__AttributeType__Group_1__1 : rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 ;
    public final void rule__AttributeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:756:1: ( rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:757:2: rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2
            {
            pushFollow(FOLLOW_rule__AttributeType__Group_1__1__Impl_in_rule__AttributeType__Group_1__11480);
            rule__AttributeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeType__Group_1__2_in_rule__AttributeType__Group_1__11483);
            rule__AttributeType__Group_1__2();

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
    // $ANTLR end "rule__AttributeType__Group_1__1"


    // $ANTLR start "rule__AttributeType__Group_1__1__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:764:1: rule__AttributeType__Group_1__1__Impl : ( ( rule__AttributeType__LengthAssignment_1_1 )? ) ;
    public final void rule__AttributeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:768:1: ( ( ( rule__AttributeType__LengthAssignment_1_1 )? ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:769:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:769:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:770:1: ( rule__AttributeType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:771:1: ( rule__AttributeType__LengthAssignment_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:771:2: rule__AttributeType__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__AttributeType__LengthAssignment_1_1_in_rule__AttributeType__Group_1__1__Impl1510);
                    rule__AttributeType__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__2"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:781:1: rule__AttributeType__Group_1__2 : rule__AttributeType__Group_1__2__Impl ;
    public final void rule__AttributeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:785:1: ( rule__AttributeType__Group_1__2__Impl )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:786:2: rule__AttributeType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeType__Group_1__2__Impl_in_rule__AttributeType__Group_1__21541);
            rule__AttributeType__Group_1__2__Impl();

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
    // $ANTLR end "rule__AttributeType__Group_1__2"


    // $ANTLR start "rule__AttributeType__Group_1__2__Impl"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:792:1: rule__AttributeType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AttributeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:796:1: ( ( ']' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:797:1: ( ']' )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:797:1: ( ']' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:798:1: ']'
            {
             before(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,19,FOLLOW_19_in_rule__AttributeType__Group_1__2__Impl1569); 
             after(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__2__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:818:1: rule__Model__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:822:1: ( ( ruleEntity ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:823:1: ( ruleEntity )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:823:1: ( ruleEntity )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:824:1: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment1611);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:833:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:837:1: ( ( RULE_ID ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:838:1: ( RULE_ID )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:838:1: ( RULE_ID )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:839:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11642); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:848:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:852:1: ( ( ( RULE_ID ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:853:1: ( ( RULE_ID ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:853:1: ( ( RULE_ID ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:854:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:855:1: ( RULE_ID )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:856:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_11677); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:867:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:871:1: ( ( ruleAttribute ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:872:1: ( ruleAttribute )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:872:1: ( ruleAttribute )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:873:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41712);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:882:1: rule__Attribute__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:886:1: ( ( ruleAttributeType ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:887:1: ( ruleAttributeType )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:887:1: ( ruleAttributeType )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:888:1: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_01743);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:897:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:901:1: ( ( RULE_ID ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:902:1: ( RULE_ID )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:902:1: ( RULE_ID )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:903:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11774); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__AttributeType__ElementTypeAssignment_0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:912:1: rule__AttributeType__ElementTypeAssignment_0 : ( ruleElementType ) ;
    public final void rule__AttributeType__ElementTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:916:1: ( ( ruleElementType ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:917:1: ( ruleElementType )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:917:1: ( ruleElementType )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:918:1: ruleElementType
            {
             before(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__AttributeType__ElementTypeAssignment_01805);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getElementTypeElementTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ElementTypeAssignment_0"


    // $ANTLR start "rule__AttributeType__ArrayAssignment_1_0"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:927:1: rule__AttributeType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:931:1: ( ( ( '[' ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:932:1: ( ( '[' ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:932:1: ( ( '[' ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:933:1: ( '[' )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:934:1: ( '[' )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:935:1: '['
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,20,FOLLOW_20_in_rule__AttributeType__ArrayAssignment_1_01841); 
             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeType__LengthAssignment_1_1"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:950:1: rule__AttributeType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:954:1: ( ( RULE_INT ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:955:1: ( RULE_INT )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:955:1: ( RULE_INT )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:956:1: RULE_INT
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeType__LengthAssignment_1_11880); 
             after(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__LengthAssignment_1_1"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:965:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:969:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:970:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:970:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:971:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:972:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:972:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment1911);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:981:1: rule__EntityType__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:985:1: ( ( ( RULE_ID ) ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:986:1: ( ( RULE_ID ) )
            {
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:986:1: ( ( RULE_ID ) )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:987:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:988:1: ( RULE_ID )
            // ../org.example.entities.ui/src-gen/org/example/entities/ui/contentassist/antlr/internal/InternalEntities.g:989:1: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityType__EntityAssignment1948); 
             after(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__EntitiesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group__0_in_ruleAttributeType275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_0541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_0561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_0581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__0__Impl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1675 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2735 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3796 = new BitSet(new long[]{0x0000000000013810L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Entity__Group__3__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4858 = new BitSet(new long[]{0x0000000000013810L});
    public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl888 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Entity__Group__5__Impl947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__0990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__0993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Entity__Group_2__0__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_0_in_rule__Attribute__Group__0__Impl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11173 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group__2__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group__0__Impl_in_rule__AttributeType__Group__01298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AttributeType__Group__1_in_rule__AttributeType__Group__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__ElementTypeAssignment_0_in_rule__AttributeType__Group__0__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group__1__Impl_in_rule__AttributeType__Group__11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__0_in_rule__AttributeType__Group__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__0__Impl_in_rule__AttributeType__Group_1__01420 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__1_in_rule__AttributeType__Group_1__01423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__ArrayAssignment_1_0_in_rule__AttributeType__Group_1__0__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__1__Impl_in_rule__AttributeType__Group_1__11480 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__2_in_rule__AttributeType__Group_1__11483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__LengthAssignment_1_1_in_rule__AttributeType__Group_1__1__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Group_1__2__Impl_in_rule__AttributeType__Group_1__21541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AttributeType__Group_1__2__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Model__EntitiesAssignment1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_41712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__AttributeType__ElementTypeAssignment_01805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AttributeType__ArrayAssignment_1_01841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeType__LengthAssignment_1_11880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityType__EntityAssignment1948 = new BitSet(new long[]{0x0000000000000002L});

}