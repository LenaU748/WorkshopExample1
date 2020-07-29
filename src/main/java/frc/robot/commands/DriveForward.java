/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveForward extends CommandBase {
  /**
   * Creates a new DriveForward.
   */
  //This will be an input that a DriveForward object needs to control its speed
  double speed; 
  DigitalInput limSwitch = new DigitalInput(Constants.lim);

  public DriveForward(double _speed) {
    // Use addRequirements() here to declare subsystem dependencies.
    speed = _speed;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  Robot.m_robotContainer.m_drivebase.m_drive.arcadeDrive(speed, 0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    //limSwitch.get() returns true if it is open. 
    //Because we want the robot to stop when the limit switch is pressed,
    //we want this to return true when it is closed
    return !limSwitch.get();
  }
}
