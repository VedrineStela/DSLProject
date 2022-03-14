package fr.univcotedazur.l3ia.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.univcotedazur.l3ia.services.LegoLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLegoLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Lego'", "'{'", "'robot'", "'}'", "'Robot'", "'moteur'", "','", "'leftmotor'", "'rightmotor'", "'sensor'", "'port'", "'actor'", "'action'", "'Motor'", "'LeftMotor'", "'RightMotor'", "'Sensor'", "'Port'", "'ColorSensor'", "'PositionSensor'", "'Go'", "'Right'", "'Left'", "'Continue'", "'Back'", "'ShutDown'", "'Down'", "'Rotate'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLegoLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLegoLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLegoLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLegoLanguage.g"; }



     	private LegoLanguageGrammarAccess grammarAccess;

        public InternalLegoLanguageParser(TokenStream input, LegoLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Lego";
       	}

       	@Override
       	protected LegoLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLego"
    // InternalLegoLanguage.g:64:1: entryRuleLego returns [EObject current=null] : iv_ruleLego= ruleLego EOF ;
    public final EObject entryRuleLego() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLego = null;


        try {
            // InternalLegoLanguage.g:64:45: (iv_ruleLego= ruleLego EOF )
            // InternalLegoLanguage.g:65:2: iv_ruleLego= ruleLego EOF
            {
             newCompositeNode(grammarAccess.getLegoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLego=ruleLego();

            state._fsp--;

             current =iv_ruleLego; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLego"


    // $ANTLR start "ruleLego"
    // InternalLegoLanguage.g:71:1: ruleLego returns [EObject current=null] : ( () otherlv_1= 'Lego' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleLego() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_robot_5_0 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:77:2: ( ( () otherlv_1= 'Lego' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )? otherlv_6= '}' ) )
            // InternalLegoLanguage.g:78:2: ( () otherlv_1= 'Lego' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )? otherlv_6= '}' )
            {
            // InternalLegoLanguage.g:78:2: ( () otherlv_1= 'Lego' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )? otherlv_6= '}' )
            // InternalLegoLanguage.g:79:3: () otherlv_1= 'Lego' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )? otherlv_6= '}'
            {
            // InternalLegoLanguage.g:79:3: ()
            // InternalLegoLanguage.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLegoAccess().getLegoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLegoAccess().getLegoKeyword_1());
            		
            // InternalLegoLanguage.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLegoLanguage.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalLegoLanguage.g:91:4: (lv_name_2_0= ruleEString )
            // InternalLegoLanguage.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLegoAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLegoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLegoAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLegoLanguage.g:113:3: (otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLegoLanguage.g:114:4: otherlv_4= 'robot' ( (lv_robot_5_0= ruleRobot ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getLegoAccess().getRobotKeyword_4_0());
                    			
                    // InternalLegoLanguage.g:118:4: ( (lv_robot_5_0= ruleRobot ) )
                    // InternalLegoLanguage.g:119:5: (lv_robot_5_0= ruleRobot )
                    {
                    // InternalLegoLanguage.g:119:5: (lv_robot_5_0= ruleRobot )
                    // InternalLegoLanguage.g:120:6: lv_robot_5_0= ruleRobot
                    {

                    						newCompositeNode(grammarAccess.getLegoAccess().getRobotRobotParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_robot_5_0=ruleRobot();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLegoRule());
                    						}
                    						set(
                    							current,
                    							"robot",
                    							lv_robot_5_0,
                    							"fr.univcotedazur.l3ia.LegoLanguage.Robot");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLegoAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLego"


    // $ANTLR start "entryRuleMotor"
    // InternalLegoLanguage.g:146:1: entryRuleMotor returns [EObject current=null] : iv_ruleMotor= ruleMotor EOF ;
    public final EObject entryRuleMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor = null;


        try {
            // InternalLegoLanguage.g:146:46: (iv_ruleMotor= ruleMotor EOF )
            // InternalLegoLanguage.g:147:2: iv_ruleMotor= ruleMotor EOF
            {
             newCompositeNode(grammarAccess.getMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotor=ruleMotor();

            state._fsp--;

             current =iv_ruleMotor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalLegoLanguage.g:153:1: ruleMotor returns [EObject current=null] : (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor ) ;
    public final EObject ruleMotor() throws RecognitionException {
        EObject current = null;

        EObject this_Motor_Impl_0 = null;

        EObject this_LeftMotor_1 = null;

        EObject this_RightMotor_2 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:159:2: ( (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor ) )
            // InternalLegoLanguage.g:160:2: (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor )
            {
            // InternalLegoLanguage.g:160:2: (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLegoLanguage.g:161:3: this_Motor_Impl_0= ruleMotor_Impl
                    {

                    			newCompositeNode(grammarAccess.getMotorAccess().getMotor_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Motor_Impl_0=ruleMotor_Impl();

                    state._fsp--;


                    			current = this_Motor_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLegoLanguage.g:170:3: this_LeftMotor_1= ruleLeftMotor
                    {

                    			newCompositeNode(grammarAccess.getMotorAccess().getLeftMotorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftMotor_1=ruleLeftMotor();

                    state._fsp--;


                    			current = this_LeftMotor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLegoLanguage.g:179:3: this_RightMotor_2= ruleRightMotor
                    {

                    			newCompositeNode(grammarAccess.getMotorAccess().getRightMotorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightMotor_2=ruleRightMotor();

                    state._fsp--;


                    			current = this_RightMotor_2;
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
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleSensor"
    // InternalLegoLanguage.g:191:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalLegoLanguage.g:191:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalLegoLanguage.g:192:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalLegoLanguage.g:198:1: ruleSensor returns [EObject current=null] : (this_Sensor_Impl_0= ruleSensor_Impl | this_ColorSensor_1= ruleColorSensor | this_PositionSensor_2= rulePositionSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_Impl_0 = null;

        EObject this_ColorSensor_1 = null;

        EObject this_PositionSensor_2 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:204:2: ( (this_Sensor_Impl_0= ruleSensor_Impl | this_ColorSensor_1= ruleColorSensor | this_PositionSensor_2= rulePositionSensor ) )
            // InternalLegoLanguage.g:205:2: (this_Sensor_Impl_0= ruleSensor_Impl | this_ColorSensor_1= ruleColorSensor | this_PositionSensor_2= rulePositionSensor )
            {
            // InternalLegoLanguage.g:205:2: (this_Sensor_Impl_0= ruleSensor_Impl | this_ColorSensor_1= ruleColorSensor | this_PositionSensor_2= rulePositionSensor )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
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
                    // InternalLegoLanguage.g:206:3: this_Sensor_Impl_0= ruleSensor_Impl
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getSensor_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_Impl_0=ruleSensor_Impl();

                    state._fsp--;


                    			current = this_Sensor_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLegoLanguage.g:215:3: this_ColorSensor_1= ruleColorSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getColorSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorSensor_1=ruleColorSensor();

                    state._fsp--;


                    			current = this_ColorSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLegoLanguage.g:224:3: this_PositionSensor_2= rulePositionSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getPositionSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PositionSensor_2=rulePositionSensor();

                    state._fsp--;


                    			current = this_PositionSensor_2;
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActor"
    // InternalLegoLanguage.g:236:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalLegoLanguage.g:236:46: (iv_ruleActor= ruleActor EOF )
            // InternalLegoLanguage.g:237:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalLegoLanguage.g:243:1: ruleActor returns [EObject current=null] : (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        EObject this_Motor_Impl_0 = null;

        EObject this_LeftMotor_1 = null;

        EObject this_RightMotor_2 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:249:2: ( (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor ) )
            // InternalLegoLanguage.g:250:2: (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor )
            {
            // InternalLegoLanguage.g:250:2: (this_Motor_Impl_0= ruleMotor_Impl | this_LeftMotor_1= ruleLeftMotor | this_RightMotor_2= ruleRightMotor )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLegoLanguage.g:251:3: this_Motor_Impl_0= ruleMotor_Impl
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getMotor_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Motor_Impl_0=ruleMotor_Impl();

                    state._fsp--;


                    			current = this_Motor_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLegoLanguage.g:260:3: this_LeftMotor_1= ruleLeftMotor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getLeftMotorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftMotor_1=ruleLeftMotor();

                    state._fsp--;


                    			current = this_LeftMotor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLegoLanguage.g:269:3: this_RightMotor_2= ruleRightMotor
                    {

                    			newCompositeNode(grammarAccess.getActorAccess().getRightMotorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightMotor_2=ruleRightMotor();

                    state._fsp--;


                    			current = this_RightMotor_2;
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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleAction"
    // InternalLegoLanguage.g:281:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalLegoLanguage.g:281:47: (iv_ruleAction= ruleAction EOF )
            // InternalLegoLanguage.g:282:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalLegoLanguage.g:288:1: ruleAction returns [EObject current=null] : (this_Go_0= ruleGo | this_Right_1= ruleRight | this_Left_2= ruleLeft | this_Continue_3= ruleContinue | this_Back_4= ruleBack | this_ShutDown_5= ruleShutDown | this_Down_6= ruleDown | this_Rotate_7= ruleRotate ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Right_1 = null;

        EObject this_Left_2 = null;

        EObject this_Continue_3 = null;

        EObject this_Back_4 = null;

        EObject this_ShutDown_5 = null;

        EObject this_Down_6 = null;

        EObject this_Rotate_7 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:294:2: ( (this_Go_0= ruleGo | this_Right_1= ruleRight | this_Left_2= ruleLeft | this_Continue_3= ruleContinue | this_Back_4= ruleBack | this_ShutDown_5= ruleShutDown | this_Down_6= ruleDown | this_Rotate_7= ruleRotate ) )
            // InternalLegoLanguage.g:295:2: (this_Go_0= ruleGo | this_Right_1= ruleRight | this_Left_2= ruleLeft | this_Continue_3= ruleContinue | this_Back_4= ruleBack | this_ShutDown_5= ruleShutDown | this_Down_6= ruleDown | this_Rotate_7= ruleRotate )
            {
            // InternalLegoLanguage.g:295:2: (this_Go_0= ruleGo | this_Right_1= ruleRight | this_Left_2= ruleLeft | this_Continue_3= ruleContinue | this_Back_4= ruleBack | this_ShutDown_5= ruleShutDown | this_Down_6= ruleDown | this_Rotate_7= ruleRotate )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            case 34:
                {
                alt5=4;
                }
                break;
            case 35:
                {
                alt5=5;
                }
                break;
            case 36:
                {
                alt5=6;
                }
                break;
            case 37:
                {
                alt5=7;
                }
                break;
            case 38:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLegoLanguage.g:296:3: this_Go_0= ruleGo
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Go_0=ruleGo();

                    state._fsp--;


                    			current = this_Go_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLegoLanguage.g:305:3: this_Right_1= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_1=ruleRight();

                    state._fsp--;


                    			current = this_Right_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLegoLanguage.g:314:3: this_Left_2= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLeftParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_2=ruleLeft();

                    state._fsp--;


                    			current = this_Left_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLegoLanguage.g:323:3: this_Continue_3= ruleContinue
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getContinueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Continue_3=ruleContinue();

                    state._fsp--;


                    			current = this_Continue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLegoLanguage.g:332:3: this_Back_4= ruleBack
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getBackParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Back_4=ruleBack();

                    state._fsp--;


                    			current = this_Back_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLegoLanguage.g:341:3: this_ShutDown_5= ruleShutDown
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getShutDownParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShutDown_5=ruleShutDown();

                    state._fsp--;


                    			current = this_ShutDown_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLegoLanguage.g:350:3: this_Down_6= ruleDown
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getDownParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Down_6=ruleDown();

                    state._fsp--;


                    			current = this_Down_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLegoLanguage.g:359:3: this_Rotate_7= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRotateParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_7=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_7;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEString"
    // InternalLegoLanguage.g:371:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLegoLanguage.g:371:47: (iv_ruleEString= ruleEString EOF )
            // InternalLegoLanguage.g:372:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLegoLanguage.g:378:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:384:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLegoLanguage.g:385:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLegoLanguage.g:385:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
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
                    // InternalLegoLanguage.g:386:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLegoLanguage.g:394:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRobot"
    // InternalLegoLanguage.g:405:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalLegoLanguage.g:405:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalLegoLanguage.g:406:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalLegoLanguage.g:412:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'moteur' otherlv_4= '{' ( (lv_moteur_5_0= ruleMotor ) ) (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )* otherlv_8= '}' otherlv_9= 'leftmotor' ( (lv_leftmotor_10_0= ruleLeftMotor ) ) otherlv_11= 'rightmotor' ( (lv_rightmotor_12_0= ruleRightMotor ) ) (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )? (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )? (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_moteur_5_0 = null;

        EObject lv_moteur_7_0 = null;

        EObject lv_leftmotor_10_0 = null;

        EObject lv_rightmotor_12_0 = null;

        EObject lv_sensor_15_0 = null;

        EObject lv_sensor_17_0 = null;

        EObject lv_port_21_0 = null;

        EObject lv_port_23_0 = null;

        EObject lv_actor_27_0 = null;

        EObject lv_actor_29_0 = null;

        EObject lv_action_33_0 = null;

        EObject lv_action_35_0 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:418:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'moteur' otherlv_4= '{' ( (lv_moteur_5_0= ruleMotor ) ) (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )* otherlv_8= '}' otherlv_9= 'leftmotor' ( (lv_leftmotor_10_0= ruleLeftMotor ) ) otherlv_11= 'rightmotor' ( (lv_rightmotor_12_0= ruleRightMotor ) ) (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )? (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )? (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )? otherlv_37= '}' ) )
            // InternalLegoLanguage.g:419:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'moteur' otherlv_4= '{' ( (lv_moteur_5_0= ruleMotor ) ) (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )* otherlv_8= '}' otherlv_9= 'leftmotor' ( (lv_leftmotor_10_0= ruleLeftMotor ) ) otherlv_11= 'rightmotor' ( (lv_rightmotor_12_0= ruleRightMotor ) ) (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )? (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )? (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            {
            // InternalLegoLanguage.g:419:2: (otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'moteur' otherlv_4= '{' ( (lv_moteur_5_0= ruleMotor ) ) (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )* otherlv_8= '}' otherlv_9= 'leftmotor' ( (lv_leftmotor_10_0= ruleLeftMotor ) ) otherlv_11= 'rightmotor' ( (lv_rightmotor_12_0= ruleRightMotor ) ) (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )? (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )? (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )? otherlv_37= '}' )
            // InternalLegoLanguage.g:420:3: otherlv_0= 'Robot' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'moteur' otherlv_4= '{' ( (lv_moteur_5_0= ruleMotor ) ) (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )* otherlv_8= '}' otherlv_9= 'leftmotor' ( (lv_leftmotor_10_0= ruleLeftMotor ) ) otherlv_11= 'rightmotor' ( (lv_rightmotor_12_0= ruleRightMotor ) ) (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )? (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )? (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )? (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )? otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalLegoLanguage.g:424:3: ( (lv_name_1_0= ruleEString ) )
            // InternalLegoLanguage.g:425:4: (lv_name_1_0= ruleEString )
            {
            // InternalLegoLanguage.g:425:4: (lv_name_1_0= ruleEString )
            // InternalLegoLanguage.g:426:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getMoteurKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalLegoLanguage.g:455:3: ( (lv_moteur_5_0= ruleMotor ) )
            // InternalLegoLanguage.g:456:4: (lv_moteur_5_0= ruleMotor )
            {
            // InternalLegoLanguage.g:456:4: (lv_moteur_5_0= ruleMotor )
            // InternalLegoLanguage.g:457:5: lv_moteur_5_0= ruleMotor
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getMoteurMotorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_moteur_5_0=ruleMotor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					add(
            						current,
            						"moteur",
            						lv_moteur_5_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.Motor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLegoLanguage.g:474:3: (otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLegoLanguage.g:475:4: otherlv_6= ',' ( (lv_moteur_7_0= ruleMotor ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalLegoLanguage.g:479:4: ( (lv_moteur_7_0= ruleMotor ) )
            	    // InternalLegoLanguage.g:480:5: (lv_moteur_7_0= ruleMotor )
            	    {
            	    // InternalLegoLanguage.g:480:5: (lv_moteur_7_0= ruleMotor )
            	    // InternalLegoLanguage.g:481:6: lv_moteur_7_0= ruleMotor
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getMoteurMotorParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_moteur_7_0=ruleMotor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"moteur",
            	    							lv_moteur_7_0,
            	    							"fr.univcotedazur.l3ia.LegoLanguage.Motor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getLeftmotorKeyword_8());
            		
            // InternalLegoLanguage.g:507:3: ( (lv_leftmotor_10_0= ruleLeftMotor ) )
            // InternalLegoLanguage.g:508:4: (lv_leftmotor_10_0= ruleLeftMotor )
            {
            // InternalLegoLanguage.g:508:4: (lv_leftmotor_10_0= ruleLeftMotor )
            // InternalLegoLanguage.g:509:5: lv_leftmotor_10_0= ruleLeftMotor
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getLeftmotorLeftMotorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_leftmotor_10_0=ruleLeftMotor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"leftmotor",
            						lv_leftmotor_10_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.LeftMotor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getRobotAccess().getRightmotorKeyword_10());
            		
            // InternalLegoLanguage.g:530:3: ( (lv_rightmotor_12_0= ruleRightMotor ) )
            // InternalLegoLanguage.g:531:4: (lv_rightmotor_12_0= ruleRightMotor )
            {
            // InternalLegoLanguage.g:531:4: (lv_rightmotor_12_0= ruleRightMotor )
            // InternalLegoLanguage.g:532:5: lv_rightmotor_12_0= ruleRightMotor
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getRightmotorRightMotorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_rightmotor_12_0=ruleRightMotor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"rightmotor",
            						lv_rightmotor_12_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.RightMotor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLegoLanguage.g:549:3: (otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLegoLanguage.g:550:4: otherlv_13= 'sensor' otherlv_14= '{' ( (lv_sensor_15_0= ruleSensor ) ) (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getSensorKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalLegoLanguage.g:558:4: ( (lv_sensor_15_0= ruleSensor ) )
                    // InternalLegoLanguage.g:559:5: (lv_sensor_15_0= ruleSensor )
                    {
                    // InternalLegoLanguage.g:559:5: (lv_sensor_15_0= ruleSensor )
                    // InternalLegoLanguage.g:560:6: lv_sensor_15_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getSensorSensorParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sensor_15_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"sensor",
                    							lv_sensor_15_0,
                    							"fr.univcotedazur.l3ia.LegoLanguage.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegoLanguage.g:577:4: (otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalLegoLanguage.g:578:5: otherlv_16= ',' ( (lv_sensor_17_0= ruleSensor ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getRobotAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalLegoLanguage.g:582:5: ( (lv_sensor_17_0= ruleSensor ) )
                    	    // InternalLegoLanguage.g:583:6: (lv_sensor_17_0= ruleSensor )
                    	    {
                    	    // InternalLegoLanguage.g:583:6: (lv_sensor_17_0= ruleSensor )
                    	    // InternalLegoLanguage.g:584:7: lv_sensor_17_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getSensorSensorParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_sensor_17_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensor",
                    	    								lv_sensor_17_0,
                    	    								"fr.univcotedazur.l3ia.LegoLanguage.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalLegoLanguage.g:607:3: (otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLegoLanguage.g:608:4: otherlv_19= 'port' otherlv_20= '{' ( (lv_port_21_0= rulePort ) ) (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getRobotAccess().getPortKeyword_13_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_20, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalLegoLanguage.g:616:4: ( (lv_port_21_0= rulePort ) )
                    // InternalLegoLanguage.g:617:5: (lv_port_21_0= rulePort )
                    {
                    // InternalLegoLanguage.g:617:5: (lv_port_21_0= rulePort )
                    // InternalLegoLanguage.g:618:6: lv_port_21_0= rulePort
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getPortPortParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_port_21_0=rulePort();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"port",
                    							lv_port_21_0,
                    							"fr.univcotedazur.l3ia.LegoLanguage.Port");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegoLanguage.g:635:4: (otherlv_22= ',' ( (lv_port_23_0= rulePort ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalLegoLanguage.g:636:5: otherlv_22= ',' ( (lv_port_23_0= rulePort ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FOLLOW_17); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getRobotAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalLegoLanguage.g:640:5: ( (lv_port_23_0= rulePort ) )
                    	    // InternalLegoLanguage.g:641:6: (lv_port_23_0= rulePort )
                    	    {
                    	    // InternalLegoLanguage.g:641:6: (lv_port_23_0= rulePort )
                    	    // InternalLegoLanguage.g:642:7: lv_port_23_0= rulePort
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getPortPortParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_port_23_0=rulePort();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"port",
                    	    								lv_port_23_0,
                    	    								"fr.univcotedazur.l3ia.LegoLanguage.Port");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_24, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalLegoLanguage.g:665:3: (otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLegoLanguage.g:666:4: otherlv_25= 'actor' otherlv_26= '{' ( (lv_actor_27_0= ruleActor ) ) (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getRobotAccess().getActorKeyword_14_0());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalLegoLanguage.g:674:4: ( (lv_actor_27_0= ruleActor ) )
                    // InternalLegoLanguage.g:675:5: (lv_actor_27_0= ruleActor )
                    {
                    // InternalLegoLanguage.g:675:5: (lv_actor_27_0= ruleActor )
                    // InternalLegoLanguage.g:676:6: lv_actor_27_0= ruleActor
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getActorActorParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_actor_27_0=ruleActor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"actor",
                    							lv_actor_27_0,
                    							"fr.univcotedazur.l3ia.LegoLanguage.Actor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegoLanguage.g:693:4: (otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalLegoLanguage.g:694:5: otherlv_28= ',' ( (lv_actor_29_0= ruleActor ) )
                    	    {
                    	    otherlv_28=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getRobotAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalLegoLanguage.g:698:5: ( (lv_actor_29_0= ruleActor ) )
                    	    // InternalLegoLanguage.g:699:6: (lv_actor_29_0= ruleActor )
                    	    {
                    	    // InternalLegoLanguage.g:699:6: (lv_actor_29_0= ruleActor )
                    	    // InternalLegoLanguage.g:700:7: lv_actor_29_0= ruleActor
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getActorActorParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_actor_29_0=ruleActor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actor",
                    	    								lv_actor_29_0,
                    	    								"fr.univcotedazur.l3ia.LegoLanguage.Actor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_30, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalLegoLanguage.g:723:3: (otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLegoLanguage.g:724:4: otherlv_31= 'action' otherlv_32= '{' ( (lv_action_33_0= ruleAction ) ) (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_31, grammarAccess.getRobotAccess().getActionKeyword_15_0());
                    			
                    otherlv_32=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_32, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalLegoLanguage.g:732:4: ( (lv_action_33_0= ruleAction ) )
                    // InternalLegoLanguage.g:733:5: (lv_action_33_0= ruleAction )
                    {
                    // InternalLegoLanguage.g:733:5: (lv_action_33_0= ruleAction )
                    // InternalLegoLanguage.g:734:6: lv_action_33_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getActionActionParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_action_33_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"action",
                    							lv_action_33_0,
                    							"fr.univcotedazur.l3ia.LegoLanguage.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLegoLanguage.g:751:4: (otherlv_34= ',' ( (lv_action_35_0= ruleAction ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLegoLanguage.g:752:5: otherlv_34= ',' ( (lv_action_35_0= ruleAction ) )
                    	    {
                    	    otherlv_34=(Token)match(input,17,FOLLOW_20); 

                    	    					newLeafNode(otherlv_34, grammarAccess.getRobotAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalLegoLanguage.g:756:5: ( (lv_action_35_0= ruleAction ) )
                    	    // InternalLegoLanguage.g:757:6: (lv_action_35_0= ruleAction )
                    	    {
                    	    // InternalLegoLanguage.g:757:6: (lv_action_35_0= ruleAction )
                    	    // InternalLegoLanguage.g:758:7: lv_action_35_0= ruleAction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getActionActionParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_action_35_0=ruleAction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"action",
                    	    								lv_action_35_0,
                    	    								"fr.univcotedazur.l3ia.LegoLanguage.Action");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_36, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_37=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMotor_Impl"
    // InternalLegoLanguage.g:789:1: entryRuleMotor_Impl returns [EObject current=null] : iv_ruleMotor_Impl= ruleMotor_Impl EOF ;
    public final EObject entryRuleMotor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotor_Impl = null;


        try {
            // InternalLegoLanguage.g:789:51: (iv_ruleMotor_Impl= ruleMotor_Impl EOF )
            // InternalLegoLanguage.g:790:2: iv_ruleMotor_Impl= ruleMotor_Impl EOF
            {
             newCompositeNode(grammarAccess.getMotor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotor_Impl=ruleMotor_Impl();

            state._fsp--;

             current =iv_ruleMotor_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMotor_Impl"


    // $ANTLR start "ruleMotor_Impl"
    // InternalLegoLanguage.g:796:1: ruleMotor_Impl returns [EObject current=null] : ( () otherlv_1= 'Motor' ) ;
    public final EObject ruleMotor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:802:2: ( ( () otherlv_1= 'Motor' ) )
            // InternalLegoLanguage.g:803:2: ( () otherlv_1= 'Motor' )
            {
            // InternalLegoLanguage.g:803:2: ( () otherlv_1= 'Motor' )
            // InternalLegoLanguage.g:804:3: () otherlv_1= 'Motor'
            {
            // InternalLegoLanguage.g:804:3: ()
            // InternalLegoLanguage.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMotor_ImplAccess().getMotorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMotor_ImplAccess().getMotorKeyword_1());
            		

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
    // $ANTLR end "ruleMotor_Impl"


    // $ANTLR start "entryRuleLeftMotor"
    // InternalLegoLanguage.g:819:1: entryRuleLeftMotor returns [EObject current=null] : iv_ruleLeftMotor= ruleLeftMotor EOF ;
    public final EObject entryRuleLeftMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftMotor = null;


        try {
            // InternalLegoLanguage.g:819:50: (iv_ruleLeftMotor= ruleLeftMotor EOF )
            // InternalLegoLanguage.g:820:2: iv_ruleLeftMotor= ruleLeftMotor EOF
            {
             newCompositeNode(grammarAccess.getLeftMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftMotor=ruleLeftMotor();

            state._fsp--;

             current =iv_ruleLeftMotor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLeftMotor"


    // $ANTLR start "ruleLeftMotor"
    // InternalLegoLanguage.g:826:1: ruleLeftMotor returns [EObject current=null] : ( () otherlv_1= 'LeftMotor' ) ;
    public final EObject ruleLeftMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:832:2: ( ( () otherlv_1= 'LeftMotor' ) )
            // InternalLegoLanguage.g:833:2: ( () otherlv_1= 'LeftMotor' )
            {
            // InternalLegoLanguage.g:833:2: ( () otherlv_1= 'LeftMotor' )
            // InternalLegoLanguage.g:834:3: () otherlv_1= 'LeftMotor'
            {
            // InternalLegoLanguage.g:834:3: ()
            // InternalLegoLanguage.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftMotorAccess().getLeftMotorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftMotorAccess().getLeftMotorKeyword_1());
            		

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
    // $ANTLR end "ruleLeftMotor"


    // $ANTLR start "entryRuleRightMotor"
    // InternalLegoLanguage.g:849:1: entryRuleRightMotor returns [EObject current=null] : iv_ruleRightMotor= ruleRightMotor EOF ;
    public final EObject entryRuleRightMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightMotor = null;


        try {
            // InternalLegoLanguage.g:849:51: (iv_ruleRightMotor= ruleRightMotor EOF )
            // InternalLegoLanguage.g:850:2: iv_ruleRightMotor= ruleRightMotor EOF
            {
             newCompositeNode(grammarAccess.getRightMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightMotor=ruleRightMotor();

            state._fsp--;

             current =iv_ruleRightMotor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRightMotor"


    // $ANTLR start "ruleRightMotor"
    // InternalLegoLanguage.g:856:1: ruleRightMotor returns [EObject current=null] : ( () otherlv_1= 'RightMotor' ) ;
    public final EObject ruleRightMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:862:2: ( ( () otherlv_1= 'RightMotor' ) )
            // InternalLegoLanguage.g:863:2: ( () otherlv_1= 'RightMotor' )
            {
            // InternalLegoLanguage.g:863:2: ( () otherlv_1= 'RightMotor' )
            // InternalLegoLanguage.g:864:3: () otherlv_1= 'RightMotor'
            {
            // InternalLegoLanguage.g:864:3: ()
            // InternalLegoLanguage.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightMotorAccess().getRightMotorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightMotorAccess().getRightMotorKeyword_1());
            		

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
    // $ANTLR end "ruleRightMotor"


    // $ANTLR start "entryRuleSensor_Impl"
    // InternalLegoLanguage.g:879:1: entryRuleSensor_Impl returns [EObject current=null] : iv_ruleSensor_Impl= ruleSensor_Impl EOF ;
    public final EObject entryRuleSensor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor_Impl = null;


        try {
            // InternalLegoLanguage.g:879:52: (iv_ruleSensor_Impl= ruleSensor_Impl EOF )
            // InternalLegoLanguage.g:880:2: iv_ruleSensor_Impl= ruleSensor_Impl EOF
            {
             newCompositeNode(grammarAccess.getSensor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor_Impl=ruleSensor_Impl();

            state._fsp--;

             current =iv_ruleSensor_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor_Impl"


    // $ANTLR start "ruleSensor_Impl"
    // InternalLegoLanguage.g:886:1: ruleSensor_Impl returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:892:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalLegoLanguage.g:893:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalLegoLanguage.g:893:2: ( () otherlv_1= 'Sensor' )
            // InternalLegoLanguage.g:894:3: () otherlv_1= 'Sensor'
            {
            // InternalLegoLanguage.g:894:3: ()
            // InternalLegoLanguage.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_ImplAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensor_ImplAccess().getSensorKeyword_1());
            		

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
    // $ANTLR end "ruleSensor_Impl"


    // $ANTLR start "entryRulePort"
    // InternalLegoLanguage.g:909:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalLegoLanguage.g:909:45: (iv_rulePort= rulePort EOF )
            // InternalLegoLanguage.g:910:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalLegoLanguage.g:916:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLegoLanguage.g:922:2: ( ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalLegoLanguage.g:923:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalLegoLanguage.g:923:2: ( () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) ) )
            // InternalLegoLanguage.g:924:3: () otherlv_1= 'Port' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalLegoLanguage.g:924:3: ()
            // InternalLegoLanguage.g:925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            // InternalLegoLanguage.g:935:3: ( (lv_name_2_0= ruleEString ) )
            // InternalLegoLanguage.g:936:4: (lv_name_2_0= ruleEString )
            {
            // InternalLegoLanguage.g:936:4: (lv_name_2_0= ruleEString )
            // InternalLegoLanguage.g:937:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPortAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.univcotedazur.l3ia.LegoLanguage.EString");
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleColorSensor"
    // InternalLegoLanguage.g:958:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalLegoLanguage.g:958:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalLegoLanguage.g:959:2: iv_ruleColorSensor= ruleColorSensor EOF
            {
             newCompositeNode(grammarAccess.getColorSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorSensor=ruleColorSensor();

            state._fsp--;

             current =iv_ruleColorSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalLegoLanguage.g:965:1: ruleColorSensor returns [EObject current=null] : ( () otherlv_1= 'ColorSensor' ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:971:2: ( ( () otherlv_1= 'ColorSensor' ) )
            // InternalLegoLanguage.g:972:2: ( () otherlv_1= 'ColorSensor' )
            {
            // InternalLegoLanguage.g:972:2: ( () otherlv_1= 'ColorSensor' )
            // InternalLegoLanguage.g:973:3: () otherlv_1= 'ColorSensor'
            {
            // InternalLegoLanguage.g:973:3: ()
            // InternalLegoLanguage.g:974:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorSensorAccess().getColorSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getColorSensorKeyword_1());
            		

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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRulePositionSensor"
    // InternalLegoLanguage.g:988:1: entryRulePositionSensor returns [EObject current=null] : iv_rulePositionSensor= rulePositionSensor EOF ;
    public final EObject entryRulePositionSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionSensor = null;


        try {
            // InternalLegoLanguage.g:988:55: (iv_rulePositionSensor= rulePositionSensor EOF )
            // InternalLegoLanguage.g:989:2: iv_rulePositionSensor= rulePositionSensor EOF
            {
             newCompositeNode(grammarAccess.getPositionSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionSensor=rulePositionSensor();

            state._fsp--;

             current =iv_rulePositionSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePositionSensor"


    // $ANTLR start "rulePositionSensor"
    // InternalLegoLanguage.g:995:1: rulePositionSensor returns [EObject current=null] : ( () otherlv_1= 'PositionSensor' ) ;
    public final EObject rulePositionSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1001:2: ( ( () otherlv_1= 'PositionSensor' ) )
            // InternalLegoLanguage.g:1002:2: ( () otherlv_1= 'PositionSensor' )
            {
            // InternalLegoLanguage.g:1002:2: ( () otherlv_1= 'PositionSensor' )
            // InternalLegoLanguage.g:1003:3: () otherlv_1= 'PositionSensor'
            {
            // InternalLegoLanguage.g:1003:3: ()
            // InternalLegoLanguage.g:1004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPositionSensorAccess().getPositionSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionSensorAccess().getPositionSensorKeyword_1());
            		

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
    // $ANTLR end "rulePositionSensor"


    // $ANTLR start "entryRuleGo"
    // InternalLegoLanguage.g:1018:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalLegoLanguage.g:1018:43: (iv_ruleGo= ruleGo EOF )
            // InternalLegoLanguage.g:1019:2: iv_ruleGo= ruleGo EOF
            {
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalLegoLanguage.g:1025:1: ruleGo returns [EObject current=null] : ( () otherlv_1= 'Go' ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1031:2: ( ( () otherlv_1= 'Go' ) )
            // InternalLegoLanguage.g:1032:2: ( () otherlv_1= 'Go' )
            {
            // InternalLegoLanguage.g:1032:2: ( () otherlv_1= 'Go' )
            // InternalLegoLanguage.g:1033:3: () otherlv_1= 'Go'
            {
            // InternalLegoLanguage.g:1033:3: ()
            // InternalLegoLanguage.g:1034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGoAccess().getGoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGoAccess().getGoKeyword_1());
            		

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
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleRight"
    // InternalLegoLanguage.g:1048:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalLegoLanguage.g:1048:46: (iv_ruleRight= ruleRight EOF )
            // InternalLegoLanguage.g:1049:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalLegoLanguage.g:1055:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'Right' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1061:2: ( ( () otherlv_1= 'Right' ) )
            // InternalLegoLanguage.g:1062:2: ( () otherlv_1= 'Right' )
            {
            // InternalLegoLanguage.g:1062:2: ( () otherlv_1= 'Right' )
            // InternalLegoLanguage.g:1063:3: () otherlv_1= 'Right'
            {
            // InternalLegoLanguage.g:1063:3: ()
            // InternalLegoLanguage.g:1064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAccess().getRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
            		

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleLeft"
    // InternalLegoLanguage.g:1078:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalLegoLanguage.g:1078:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalLegoLanguage.g:1079:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalLegoLanguage.g:1085:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'Left' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1091:2: ( ( () otherlv_1= 'Left' ) )
            // InternalLegoLanguage.g:1092:2: ( () otherlv_1= 'Left' )
            {
            // InternalLegoLanguage.g:1092:2: ( () otherlv_1= 'Left' )
            // InternalLegoLanguage.g:1093:3: () otherlv_1= 'Left'
            {
            // InternalLegoLanguage.g:1093:3: ()
            // InternalLegoLanguage.g:1094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAccess().getLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
            		

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleContinue"
    // InternalLegoLanguage.g:1108:1: entryRuleContinue returns [EObject current=null] : iv_ruleContinue= ruleContinue EOF ;
    public final EObject entryRuleContinue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinue = null;


        try {
            // InternalLegoLanguage.g:1108:49: (iv_ruleContinue= ruleContinue EOF )
            // InternalLegoLanguage.g:1109:2: iv_ruleContinue= ruleContinue EOF
            {
             newCompositeNode(grammarAccess.getContinueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinue=ruleContinue();

            state._fsp--;

             current =iv_ruleContinue; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLegoLanguage.g:1115:1: ruleContinue returns [EObject current=null] : ( () otherlv_1= 'Continue' ) ;
    public final EObject ruleContinue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1121:2: ( ( () otherlv_1= 'Continue' ) )
            // InternalLegoLanguage.g:1122:2: ( () otherlv_1= 'Continue' )
            {
            // InternalLegoLanguage.g:1122:2: ( () otherlv_1= 'Continue' )
            // InternalLegoLanguage.g:1123:3: () otherlv_1= 'Continue'
            {
            // InternalLegoLanguage.g:1123:3: ()
            // InternalLegoLanguage.g:1124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinueAccess().getContinueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getContinueAccess().getContinueKeyword_1());
            		

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


    // $ANTLR start "entryRuleBack"
    // InternalLegoLanguage.g:1138:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // InternalLegoLanguage.g:1138:45: (iv_ruleBack= ruleBack EOF )
            // InternalLegoLanguage.g:1139:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // InternalLegoLanguage.g:1145:1: ruleBack returns [EObject current=null] : ( () otherlv_1= 'Back' ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1151:2: ( ( () otherlv_1= 'Back' ) )
            // InternalLegoLanguage.g:1152:2: ( () otherlv_1= 'Back' )
            {
            // InternalLegoLanguage.g:1152:2: ( () otherlv_1= 'Back' )
            // InternalLegoLanguage.g:1153:3: () otherlv_1= 'Back'
            {
            // InternalLegoLanguage.g:1153:3: ()
            // InternalLegoLanguage.g:1154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackAccess().getBackAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBackAccess().getBackKeyword_1());
            		

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
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleShutDown"
    // InternalLegoLanguage.g:1168:1: entryRuleShutDown returns [EObject current=null] : iv_ruleShutDown= ruleShutDown EOF ;
    public final EObject entryRuleShutDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShutDown = null;


        try {
            // InternalLegoLanguage.g:1168:49: (iv_ruleShutDown= ruleShutDown EOF )
            // InternalLegoLanguage.g:1169:2: iv_ruleShutDown= ruleShutDown EOF
            {
             newCompositeNode(grammarAccess.getShutDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShutDown=ruleShutDown();

            state._fsp--;

             current =iv_ruleShutDown; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShutDown"


    // $ANTLR start "ruleShutDown"
    // InternalLegoLanguage.g:1175:1: ruleShutDown returns [EObject current=null] : ( () otherlv_1= 'ShutDown' ) ;
    public final EObject ruleShutDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1181:2: ( ( () otherlv_1= 'ShutDown' ) )
            // InternalLegoLanguage.g:1182:2: ( () otherlv_1= 'ShutDown' )
            {
            // InternalLegoLanguage.g:1182:2: ( () otherlv_1= 'ShutDown' )
            // InternalLegoLanguage.g:1183:3: () otherlv_1= 'ShutDown'
            {
            // InternalLegoLanguage.g:1183:3: ()
            // InternalLegoLanguage.g:1184:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShutDownAccess().getShutDownAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getShutDownAccess().getShutDownKeyword_1());
            		

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
    // $ANTLR end "ruleShutDown"


    // $ANTLR start "entryRuleDown"
    // InternalLegoLanguage.g:1198:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalLegoLanguage.g:1198:45: (iv_ruleDown= ruleDown EOF )
            // InternalLegoLanguage.g:1199:2: iv_ruleDown= ruleDown EOF
            {
             newCompositeNode(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDown=ruleDown();

            state._fsp--;

             current =iv_ruleDown; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalLegoLanguage.g:1205:1: ruleDown returns [EObject current=null] : ( () otherlv_1= 'Down' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1211:2: ( ( () otherlv_1= 'Down' ) )
            // InternalLegoLanguage.g:1212:2: ( () otherlv_1= 'Down' )
            {
            // InternalLegoLanguage.g:1212:2: ( () otherlv_1= 'Down' )
            // InternalLegoLanguage.g:1213:3: () otherlv_1= 'Down'
            {
            // InternalLegoLanguage.g:1213:3: ()
            // InternalLegoLanguage.g:1214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDownAccess().getDownAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getDownKeyword_1());
            		

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
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleRotate"
    // InternalLegoLanguage.g:1228:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalLegoLanguage.g:1228:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalLegoLanguage.g:1229:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalLegoLanguage.g:1235:1: ruleRotate returns [EObject current=null] : ( () otherlv_1= 'Rotate' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLegoLanguage.g:1241:2: ( ( () otherlv_1= 'Rotate' ) )
            // InternalLegoLanguage.g:1242:2: ( () otherlv_1= 'Rotate' )
            {
            // InternalLegoLanguage.g:1242:2: ( () otherlv_1= 'Rotate' )
            // InternalLegoLanguage.g:1243:3: () otherlv_1= 'Rotate'
            {
            // InternalLegoLanguage.g:1243:3: ()
            // InternalLegoLanguage.g:1244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotateAccess().getRotateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getRotateKeyword_1());
            		

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
    // $ANTLR end "ruleRotate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000F04000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000068000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007F80000000L});

}