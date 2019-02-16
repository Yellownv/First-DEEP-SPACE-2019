package org.usfirst.frc.team7043.robot.subsystems;

import org.usfirst.frc.team7043.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallMotorSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double speed) {
		RobotMap.ballMotor.set(speed);
    }
    
    public void stop() {
		RobotMap.ballMotor.stopMotor();
	}
}

