package org.usfirst.frc.team7043.robot.commands;

import org.usfirst.frc.team7043.robot.Robot;

import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeCommand extends Command {
	
	private Double speed;
	
	Preferences prefs = Preferences.getInstance();
	
	//AutoMode Constructor
    public IntakeCommand(Double timeIn, Double speedIn) {
        // Use requires() here to declare subsystem dependencies
    		requires(Robot.Intake);
    		setTimeout(timeIn);
    		speed = speedIn;
    }
    
    //TeleMode Constructor
    public IntakeCommand(String mode) {
        // Use requires() here to declare subsystem dependencies
    		requires(Robot.Intake);
    		if(mode == "release") {
    			speed = prefs.getDouble("Speed of intake release: ", -1.0);
    		} else if(mode == "pull") {
    			speed = prefs.getDouble("Speed of intake pull: ", 0.4);
    		}
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		Robot.Intake.activateIntake(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    		Robot.Intake.stopIntake();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		Robot.Intake.stopIntake();
    }
}
