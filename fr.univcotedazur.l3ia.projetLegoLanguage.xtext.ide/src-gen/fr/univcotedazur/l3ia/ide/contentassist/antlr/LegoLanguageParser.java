/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.univcotedazur.l3ia.ide.contentassist.antlr.internal.InternalLegoLanguageParser;
import fr.univcotedazur.l3ia.services.LegoLanguageGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LegoLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LegoLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LegoLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMotorAccess().getAlternatives(), "rule__Motor__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
			builder.put(grammarAccess.getActorAccess().getAlternatives(), "rule__Actor__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getLegoAccess().getGroup(), "rule__Lego__Group__0");
			builder.put(grammarAccess.getLegoAccess().getGroup_4(), "rule__Lego__Group_4__0");
			builder.put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_6(), "rule__Robot__Group_6__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_12(), "rule__Robot__Group_12__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_12_3(), "rule__Robot__Group_12_3__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_13(), "rule__Robot__Group_13__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_13_3(), "rule__Robot__Group_13_3__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_14(), "rule__Robot__Group_14__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_14_3(), "rule__Robot__Group_14_3__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_15(), "rule__Robot__Group_15__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_15_3(), "rule__Robot__Group_15_3__0");
			builder.put(grammarAccess.getMotor_ImplAccess().getGroup(), "rule__Motor_Impl__Group__0");
			builder.put(grammarAccess.getLeftMotorAccess().getGroup(), "rule__LeftMotor__Group__0");
			builder.put(grammarAccess.getRightMotorAccess().getGroup(), "rule__RightMotor__Group__0");
			builder.put(grammarAccess.getSensor_ImplAccess().getGroup(), "rule__Sensor_Impl__Group__0");
			builder.put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
			builder.put(grammarAccess.getColorSensorAccess().getGroup(), "rule__ColorSensor__Group__0");
			builder.put(grammarAccess.getPositionSensorAccess().getGroup(), "rule__PositionSensor__Group__0");
			builder.put(grammarAccess.getGoAccess().getGroup(), "rule__Go__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getContinueAccess().getGroup(), "rule__Continue__Group__0");
			builder.put(grammarAccess.getBackAccess().getGroup(), "rule__Back__Group__0");
			builder.put(grammarAccess.getShutDownAccess().getGroup(), "rule__ShutDown__Group__0");
			builder.put(grammarAccess.getDownAccess().getGroup(), "rule__Down__Group__0");
			builder.put(grammarAccess.getRotateAccess().getGroup(), "rule__Rotate__Group__0");
			builder.put(grammarAccess.getLegoAccess().getNameAssignment_2(), "rule__Lego__NameAssignment_2");
			builder.put(grammarAccess.getLegoAccess().getRobotAssignment_4_1(), "rule__Lego__RobotAssignment_4_1");
			builder.put(grammarAccess.getRobotAccess().getNameAssignment_1(), "rule__Robot__NameAssignment_1");
			builder.put(grammarAccess.getRobotAccess().getMoteurAssignment_5(), "rule__Robot__MoteurAssignment_5");
			builder.put(grammarAccess.getRobotAccess().getMoteurAssignment_6_1(), "rule__Robot__MoteurAssignment_6_1");
			builder.put(grammarAccess.getRobotAccess().getLeftmotorAssignment_9(), "rule__Robot__LeftmotorAssignment_9");
			builder.put(grammarAccess.getRobotAccess().getRightmotorAssignment_11(), "rule__Robot__RightmotorAssignment_11");
			builder.put(grammarAccess.getRobotAccess().getSensorAssignment_12_2(), "rule__Robot__SensorAssignment_12_2");
			builder.put(grammarAccess.getRobotAccess().getSensorAssignment_12_3_1(), "rule__Robot__SensorAssignment_12_3_1");
			builder.put(grammarAccess.getRobotAccess().getPortAssignment_13_2(), "rule__Robot__PortAssignment_13_2");
			builder.put(grammarAccess.getRobotAccess().getPortAssignment_13_3_1(), "rule__Robot__PortAssignment_13_3_1");
			builder.put(grammarAccess.getRobotAccess().getActorAssignment_14_2(), "rule__Robot__ActorAssignment_14_2");
			builder.put(grammarAccess.getRobotAccess().getActorAssignment_14_3_1(), "rule__Robot__ActorAssignment_14_3_1");
			builder.put(grammarAccess.getRobotAccess().getActionAssignment_15_2(), "rule__Robot__ActionAssignment_15_2");
			builder.put(grammarAccess.getRobotAccess().getActionAssignment_15_3_1(), "rule__Robot__ActionAssignment_15_3_1");
			builder.put(grammarAccess.getPortAccess().getNameAssignment_2(), "rule__Port__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LegoLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalLegoLanguageParser createParser() {
		InternalLegoLanguageParser result = new InternalLegoLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LegoLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LegoLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}