/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class AutoFrontRoller extends CommandBase {
  private Intake intake;
  private double speed;
  private boolean isIntaking;
  /**
   * Creates a new FrontRoller.
   */
  public AutoFrontRoller(Intake intake, double speed, boolean isIntaking) {
    this.intake = intake;
    this.speed = speed;
    this.isIntaking = isIntaking;
    addRequirements(intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(isIntaking == true){
    intake.set(speed, 0);
    }
    else if (isIntaking == false){
      intake.set(-speed, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
