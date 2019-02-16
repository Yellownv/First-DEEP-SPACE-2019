package org.usfirst.frc.team7043.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all.
 * Unless you know what you are doing, do not modify this file except to
 * change the parameter class to the startRobot call.
 */
public final class Main {
  private Main() {
  }

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}

/*.RobotBase.startRobot(RobotBase.java:263) 
 org.usfirst.frc.team7043.robot.Main.main(Main.java:20) 
  
ERROR  1  CTRE CAN Receive Timeout  org.usfirst.frc.team7043.robot.Main.main(Main.java:20) 
 Error at org.usfirst.frc.team7043.robot.Main.main(Main.java:20): CTRE CAN Receive Timeout 
 edu.wpi.first.hal.SolenoidJNI.getSolenoid(Native Method) 
 edu.wpi.first.wpilibj.Solenoid.get(Solenoid.java:76) 
 edu.wpi.first.wpilibj.smartdashboard.SendableBuilderImpl.lambda$addBooleanProperty$0(SendableBuilderImpl.java:219) 
 edu.wpi.first.wpilibj.smartdashboard.SendableBuilderImpl.updateTable(SendableBuilderImpl.java:95) 
 edu.wpi.first.wpilibj.livewindow.LiveWindow.updateValues(LiveWindow.java:290) 
 edu.wpi.first.wpilibj.IterativeRobotBase.loopFunc(IterativeRobotBase.java:263) 
 edu.wpi.first.wpilibj.TimedRobot.startCompetition(TimedRobot.java:81) 
 edu.wpi.first.wpilibj.RobotBase.startRobot(RobotBase.java:263) 
 org.usfirst.frc.team7043.robot.Main.main(Main.java:20) 
  
*/