/**
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.l3ia.program.generator;

import fr.univcotedazur.l3ia.Tp_03_02_2022.Accelerate;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Actions;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Addition;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Assignment;
import fr.univcotedazur.l3ia.Tp_03_02_2022.BooleanOperationsOnMotors;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ColorSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ElseMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Equal;
import fr.univcotedazur.l3ia.Tp_03_02_2022.EqualM;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ForLoop;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GPSSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GreaterThan;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GreatherThanM;
import fr.univcotedazur.l3ia.Tp_03_02_2022.GyroSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IfCondition;
import fr.univcotedazur.l3ia.Tp_03_02_2022.IfMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.InfraredSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LeftMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LeftRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.LightSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Moteur;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Move;
import fr.univcotedazur.l3ia.Tp_03_02_2022.MoveLeft;
import fr.univcotedazur.l3ia.Tp_03_02_2022.OnForRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Program;
import fr.univcotedazur.l3ia.Tp_03_02_2022.ReferenceToColor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.RightMotor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.RightRotation;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Robot;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Sensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.SetThank;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Statement;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Stop;
import fr.univcotedazur.l3ia.Tp_03_02_2022.TurnOn;
import fr.univcotedazur.l3ia.Tp_03_02_2022.UltrasonicSensor;
import fr.univcotedazur.l3ia.Tp_03_02_2022.Variable;
import fr.univcotedazur.l3ia.Tp_03_02_2022.VariableRef;
import fr.univcotedazur.l3ia.Tp_03_02_2022.WhileLoop;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ProgGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    Program prog = ((Program) _head);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/usr/bin/env python3");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("# Import the necessary libraries");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import time");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import math");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.motor import *");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.sound import Sound");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.button import Button");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.sensor import *");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.sensor.lego import *");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("from ev3dev2.sensor.virtual import *");
    String fileContent = _builder.toString();
    String _fileContent = fileContent;
    fileContent = (_fileContent + "\n\n");
    EList<Robot> _robot = prog.getRobot();
    for (final Robot r : _robot) {
      String _fileContent_1 = fileContent;
      String _RobotToPython = this.RobotToPython(r);
      fileContent = (_fileContent_1 + _RobotToPython);
    }
    EList<Variable> _variable = prog.getVariable();
    for (final Variable v : _variable) {
      String _fileContent_2 = fileContent;
      String _VarToPython = this.VarToPython(v);
      fileContent = (_fileContent_2 + _VarToPython);
    }
    EList<Statement> _statement = prog.getStatement();
    for (final Statement s : _statement) {
      String _fileContent_3 = fileContent;
      String _StatementToPython = this.StatementToPython(s);
      fileContent = (_fileContent_3 + _StatementToPython);
    }
    String _name = prog.getName();
    String _plus = (_name + ".txt");
    fsa.generateFile(_plus, ("" + fileContent));
  }
  
  public String RobotToPython(final Robot r) {
    String res = "";
    EList<Moteur> _moteur = r.getMoteur();
    for (final Moteur m : _moteur) {
      String _res = res;
      String _MoteurToPython = this.MoteurToPython(m);
      res = (_res + _MoteurToPython);
    }
    EList<Sensor> _sensor = r.getSensor();
    for (final Sensor s : _sensor) {
      String _res_1 = res;
      String _SensorToPython = this.SensorToPython(s);
      res = (_res_1 + _SensorToPython);
    }
    return res;
  }
  
  public String SensorToPython(final Sensor s) {
    String res = "";
    int _sensorPort = s.getSensorPort();
    String _plus = ("(INPUT_" + Integer.valueOf(_sensorPort));
    String p = (_plus + ")\n");
    if ((s instanceof ColorSensor)) {
      String _name = ((ColorSensor)s).getName();
      String _plus_1 = (_name + " = ");
      String _plus_2 = (_plus_1 + "ColorSensor");
      String _plus_3 = (_plus_2 + " ");
      String _plus_4 = (_plus_3 + p);
      res = _plus_4;
    }
    if ((s instanceof UltrasonicSensor)) {
      String _name_1 = ((UltrasonicSensor)s).getName();
      String _plus_5 = (_name_1 + " = ");
      String _plus_6 = (_plus_5 + "UltrasonicSensor");
      String _plus_7 = (_plus_6 + " ");
      String _plus_8 = (_plus_7 + p);
      res = _plus_8;
    }
    if ((s instanceof GyroSensor)) {
      String _name_2 = ((GyroSensor)s).getName();
      String _plus_9 = (_name_2 + " = ");
      String _plus_10 = (_plus_9 + "GyroSensor");
      String _plus_11 = (_plus_10 + " ");
      String _plus_12 = (_plus_11 + p);
      res = _plus_12;
    }
    if ((s instanceof GPSSensor)) {
      String _name_3 = ((GPSSensor)s).getName();
      String _plus_13 = (_name_3 + " = ");
      String _plus_14 = (_plus_13 + "GPSSensor");
      String _plus_15 = (_plus_14 + " ");
      String _plus_16 = (_plus_15 + p);
      res = _plus_16;
    }
    if ((s instanceof InfraredSensor)) {
      String _name_4 = ((InfraredSensor)s).getName();
      String _plus_17 = (_name_4 + " = ");
      String _plus_18 = (_plus_17 + "InfraredSensor");
      String _plus_19 = (_plus_18 + " ");
      String _plus_20 = (_plus_19 + p);
      res = _plus_20;
    }
    if ((s instanceof LightSensor)) {
      String _name_5 = ((LightSensor)s).getName();
      String _plus_21 = (_name_5 + " = ");
      String _plus_22 = (_plus_21 + "LightSensor");
      String _plus_23 = (_plus_22 + " ");
      String _plus_24 = (_plus_23 + p);
      res = _plus_24;
    }
    return res;
  }
  
  public String MoteurToPython(final Moteur m) {
    String res = "";
    String _port = m.getPort();
    String _plus = ("(OUTPUT_" + _port);
    String p = (_plus + ")\n");
    if ((m instanceof RightMotor)) {
      String _name = ((RightMotor)m).getName();
      String _plus_1 = (_name + " = ");
      String _plus_2 = (_plus_1 + "LargeMotor");
      String _plus_3 = (_plus_2 + " ");
      String _plus_4 = (_plus_3 + p);
      res = _plus_4;
    }
    if ((m instanceof LeftMotor)) {
      String _name_1 = ((LeftMotor)m).getName();
      String _plus_5 = (_name_1 + " = ");
      String _plus_6 = (_plus_5 + "LargeMotor");
      String _plus_7 = (_plus_6 + " ");
      String _plus_8 = (_plus_7 + p);
      res = _plus_8;
    }
    return res;
  }
  
  public String VarToPython(final Variable v) {
    String _name = v.getName();
    String _plus = (_name + "=");
    int _initialValue = v.getInitialValue();
    String _plus_1 = (_plus + Integer.valueOf(_initialValue));
    String res = (_plus_1 + "\n");
    return res;
  }
  
  public String AdditionToPython(final Addition a) {
    String _StatementToPython = this.StatementToPython(a.getLeft());
    String _plus = (_StatementToPython + " + ");
    String _StatementToPython_1 = this.StatementToPython(a.getRight());
    String res = (_plus + _StatementToPython_1);
    return res;
  }
  
  public String VariableRefToPython(final VariableRef vr) {
    return vr.getVariable().getName();
  }
  
  public String AssignmentToPython(final Assignment ass) {
    String _StatementToPython = this.StatementToPython(ass.getLeft());
    String _plus = (_StatementToPython + " = ");
    String _StatementToPython_1 = this.StatementToPython(ass.getRight());
    String res = (_plus + _StatementToPython_1);
    return res;
  }
  
  public String GreaterThanToPython(final GreaterThan gt) {
    String _StatementToPython = this.StatementToPython(gt.getLeft());
    String _plus = (_StatementToPython + ">");
    String _StatementToPython_1 = this.StatementToPython(gt.getRight());
    String res = (_plus + _StatementToPython_1);
    return res;
  }
  
  public String EqualToPython(final Equal e) {
    String res = "";
    String _StatementToPython = this.StatementToPython(e.getLeft());
    String _plus = (_StatementToPython + "==");
    String _StatementToPython_1 = this.StatementToPython(e.getRight());
    String _plus_1 = (_plus + _StatementToPython_1);
    res = _plus_1;
    return res;
  }
  
  public String ForLoopToPython(final ForLoop fl) {
    String res = "";
    String _StatementToPython = this.StatementToPython(fl.getExpression());
    String _plus = ("for " + _StatementToPython);
    String _plus_1 = (_plus + " :");
    String _plus_2 = (_plus_1 + "\n");
    res = _plus_2;
    EList<Statement> _statement = fl.getStatement();
    for (final Statement st : _statement) {
      String _StatementToPython_1 = this.StatementToPython(st);
      String _plus_3 = ((res + "\t") + _StatementToPython_1);
      res = _plus_3;
    }
    return res;
  }
  
  public String WhileLoopToPython(final WhileLoop wl) {
    String res = "";
    String _StatementToPython = this.StatementToPython(wl.getExpression());
    String _plus = ("while " + _StatementToPython);
    String _plus_1 = (_plus + " :");
    String _plus_2 = (_plus_1 + "\n");
    res = _plus_2;
    EList<Statement> _statement = wl.getStatement();
    for (final Statement st : _statement) {
      String _StatementToPython_1 = this.StatementToPython(st);
      String _plus_3 = ((res + "\t") + _StatementToPython_1);
      res = _plus_3;
    }
    return res;
  }
  
  public String IfConditionToPython(final IfCondition a) {
    String res = "";
    String _StatementToPython = this.StatementToPython(a.getExpression());
    String _plus = ("if " + _StatementToPython);
    String _plus_1 = (_plus + ":");
    String _plus_2 = (_plus_1 + "\n");
    res = _plus_2;
    EList<Statement> _statement = a.getStatement();
    for (final Statement st : _statement) {
      String _StatementToPython_1 = this.StatementToPython(st);
      String _plus_3 = ((res + "\t") + _StatementToPython_1);
      res = _plus_3;
    }
    return res;
  }
  
  public String ActionsToPython(final Actions a) {
    String res = "";
    if ((a instanceof TurnOn)) {
      String _name = ((TurnOn)a).getMoteur().getName();
      String _plus = (_name + ".on");
      String _plus_1 = (_plus + "(");
      int _speed = ((TurnOn)a).getSpeed();
      String _plus_2 = (_plus_1 + Integer.valueOf(_speed));
      String _plus_3 = (_plus_2 + ")\n");
      res = _plus_3;
    }
    if ((a instanceof Stop)) {
      String _name_1 = ((Stop)a).getMoteur().getName();
      String _plus_4 = (_name_1 + ".off()");
      String _plus_5 = (_plus_4 + "\n");
      res = _plus_5;
    }
    if ((a instanceof OnForRotation)) {
      String _name_2 = ((OnForRotation)a).getMoteur().getName();
      String _plus_6 = (_name_2 + ".on_for_rotations");
      String _plus_7 = (_plus_6 + "(");
      int _speed_1 = ((OnForRotation)a).getSpeed();
      String _plus_8 = (_plus_7 + Integer.valueOf(_speed_1));
      String _plus_9 = (_plus_8 + ",");
      int _angle = ((OnForRotation)a).getAngle();
      String _plus_10 = (_plus_9 + Integer.valueOf(_angle));
      String _plus_11 = (_plus_10 + ")\n");
      res = _plus_11;
    }
    if ((a instanceof Accelerate)) {
      String _name_3 = ((Accelerate)a).getMoteur().getName();
      String _plus_12 = (_name_3 + ".on_for_seconds(speed = ");
      int _speed_2 = ((Accelerate)a).getSpeed();
      String _plus_13 = (_plus_12 + Integer.valueOf(_speed_2));
      String _plus_14 = (_plus_13 + ", seconds=");
      int _duration = ((Accelerate)a).getDuration();
      String _plus_15 = (_plus_14 + Integer.valueOf(_duration));
      String _plus_16 = (_plus_15 + ")\n");
      res = _plus_16;
    }
    return res;
  }
  
  public String MoveLeftToPython(final MoveLeft a) {
    String res = "";
    int _speed = a.getSpeed();
    String _plus = ("tank_drive.on(" + Integer.valueOf(_speed));
    String _plus_1 = (_plus + ", 0)\n");
    res = _plus_1;
    return res;
  }
  
  public String MoveToPython(final Move a) {
    String res = "";
    int _speed = a.getSpeed();
    String _plus = ("tank_drive.on(0," + Integer.valueOf(_speed));
    String _plus_1 = (_plus + ")\n");
    res = _plus_1;
    return res;
  }
  
  public String SetThankToPython(final SetThank a) {
    String res = "";
    String _port = a.getLeftmotor().getPort();
    String _plus = ((("tank_drive = MoveTank" + "(") + "OUTPUT_") + _port);
    String _plus_1 = (_plus + ",");
    String _plus_2 = (_plus_1 + "OUTPUT_");
    String _port_1 = a.getRightmotor().getPort();
    String _plus_3 = (_plus_2 + _port_1);
    String _plus_4 = (_plus_3 + ")\n");
    res = _plus_4;
    return res;
  }
  
  public String LeftRotationToPython(final LeftRotation a) {
    String res = "steering_drive.on((-20), 20)\n";
    String _res = res;
    res = (_res + "\t");
    String _res_1 = res;
    res = (_res_1 + "time.sleep(2)\n");
    return res;
  }
  
  public String RightRotationToPython(final RightRotation a) {
    String res = "steering_drive.on((20), 20)\n";
    String _res = res;
    res = (_res + "\t");
    String _res_1 = res;
    res = (_res_1 + "time.sleep(2)");
    String _res_2 = res;
    res = (_res_2 + "\n");
    return res;
  }
  
  public String ReferenceToColorToPython(final ReferenceToColor a) {
    String res = "";
    String _name = a.getColorsensor().getName();
    String _plus = (_name + ".reflected_light_intensity");
    res = _plus;
    return res;
  }
  
  public String ColorRefToPython(final ColorRef a) {
    String res = "";
    res = this.ReferenceToColorToPython(a.getReferencetocolor());
    return res;
  }
  
  public String EqualMToPython(final EqualM a) {
    String res = "";
    String _ColorRefToPython = this.ColorRefToPython(a.getLeftC());
    String _plus = (_ColorRefToPython + "==");
    String _VariableRefToPython = this.VariableRefToPython(a.getRightC());
    String _plus_1 = (_plus + _VariableRefToPython);
    res = _plus_1;
    return res;
  }
  
  public String GreatherThanMToPython(final GreatherThanM a) {
    String res = "";
    String _ColorRefToPython = this.ColorRefToPython(a.getLeftC());
    String _plus = (_ColorRefToPython + ">");
    String _VariableRefToPython = this.VariableRefToPython(a.getRightC());
    String _plus_1 = (_plus + _VariableRefToPython);
    res = _plus_1;
    return res;
  }
  
  public String BooleanOperationsOnMotorsToPython(final BooleanOperationsOnMotors a) {
    String res = "";
    if ((a instanceof EqualM)) {
      res = this.EqualMToPython(((EqualM)a));
    }
    if ((a instanceof GreatherThanM)) {
      res = this.GreatherThanMToPython(((GreatherThanM)a));
    }
    return res;
  }
  
  public String ElseMotorToPython(final ElseMotor a) {
    String res = "";
    res = "else:";
    String _res = res;
    res = (_res + "\n\t");
    EList<Statement> _statement = a.getStatement();
    for (final Statement st : _statement) {
      String _StatementToPython = this.StatementToPython(st);
      String _plus = ((res + "\t") + _StatementToPython);
      res = _plus;
    }
    return res;
  }
  
  public String IfMotorToPython(final IfMotor a) {
    String res = "";
    String _BooleanOperationsOnMotorsToPython = this.BooleanOperationsOnMotorsToPython(a.getBoolM());
    String _plus = ("if " + _BooleanOperationsOnMotorsToPython);
    String _plus_1 = (_plus + ":");
    String _plus_2 = (_plus_1 + "\n\t");
    res = _plus_2;
    EList<Statement> _statement = a.getStatement();
    for (final Statement st : _statement) {
      String _StatementToPython = this.StatementToPython(st);
      String _plus_3 = ((res + "\t") + _StatementToPython);
      res = _plus_3;
    }
    EList<ElseMotor> _elsemotor = a.getElsemotor();
    for (final ElseMotor el : _elsemotor) {
      String _ElseMotorToPython = this.ElseMotorToPython(el);
      String _plus_4 = ((res + "\t") + _ElseMotorToPython);
      res = _plus_4;
    }
    res = (res + "\n");
    return res;
  }
  
  public String StatementToPython(final Statement a) {
    String res = " ";
    if ((a instanceof ElseMotor)) {
      res = this.ElseMotorToPython(((ElseMotor)a));
    }
    if ((a instanceof IfMotor)) {
      res = this.IfMotorToPython(((IfMotor)a));
    }
    if ((a instanceof IfCondition)) {
      res = this.IfConditionToPython(((IfCondition)a));
    }
    if ((a instanceof LeftRotation)) {
      res = this.LeftRotationToPython(((LeftRotation)a));
    }
    if ((a instanceof RightRotation)) {
      res = this.RightRotationToPython(((RightRotation)a));
    }
    if ((a instanceof Move)) {
      res = this.MoveToPython(((Move)a));
    }
    if ((a instanceof MoveLeft)) {
      res = this.MoveLeftToPython(((MoveLeft)a));
    }
    if ((a instanceof SetThank)) {
      res = this.SetThankToPython(((SetThank)a));
    }
    if ((a instanceof Actions)) {
      res = this.ActionsToPython(((Actions)a));
    }
    if ((a instanceof WhileLoop)) {
      res = this.WhileLoopToPython(((WhileLoop)a));
    }
    if ((a instanceof ForLoop)) {
      res = this.ForLoopToPython(((ForLoop)a));
    }
    if ((a instanceof Addition)) {
      res = this.AdditionToPython(((Addition)a));
      res = (res + "\n");
    }
    if ((a instanceof VariableRef)) {
      res = this.VariableRefToPython(((VariableRef)a));
    }
    if ((a instanceof Assignment)) {
      res = this.AssignmentToPython(((Assignment)a));
      res = (res + "\n");
    }
    if ((a instanceof GreaterThan)) {
      res = this.GreaterThanToPython(((GreaterThan)a));
    }
    if ((a instanceof Equal)) {
      res = this.EqualToPython(((Equal)a));
    }
    return res;
  }
}
