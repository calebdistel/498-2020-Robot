package frc.robot;

import frc.robot.Subsystems.*;
import frc.robot.Subsystems.ControlPanel.ControlPanel;
import frc.robot.Subsystems.WristSubsystem.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Autonomous.*;
import frc.robot.Sensors.*;

public class RobotContainer {
 public static void RobotPeriodic() {
    Smart_Dashboard.Smart_Dashboard_Periodic();
    //ColorSensor.ColorSensorUpdate();
   }
 public static void RobotInit() {
    
    Smart_Dashboard.Smart_Dashboard_RobotInit();
    DriveSubsystem.driveInit();
    Limelight.LimelightInit();
    ClimberSubsystem.ClimberInit();
    //ColorSensor.ColorSensorInit();
   }
 public static void TeleOpInit() {

 }
 public static void TeleOp(){
    Smart_Dashboard.Smart_Dashboard_TeleOp();
    DriveSubsystem.driveTeleOp();
    Wrist.WristTeleOp();
    Intake.IntakeTeleOp();
    Limelight.LimelightTeleOp();
    ClimberSubsystem.ClimberTeleop();
    ControlPanel.ControlPanelTeleOp();
   }
 public static void AutoInit() {
    Smart_Dashboard.Smart_Dashboard_AutoInit();
    Autonomous.Auto();
   }
 public static void Auto(){
    Scheduler.getInstance().run();
   }
}