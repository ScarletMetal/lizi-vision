/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;


/**
 * Add your docs here.
 */
public class SubsystemComponents {
    public static class Drivetrain {
        public static final SpeedController LEFT  = new SpeedControllerGroup(new VictorSP(RobotMap.PWM.DRIVE_LEFT_1), new VictorSP(RobotMap.PWM.DRIVE_LEFT_2));
        public static final SpeedController RIGHT = new SpeedControllerGroup(new VictorSP(RobotMap.PWM.DRIVE_RIGHT_1), new VictorSP(RobotMap.PWM.DRIVE_RIGHT_2)); 
    }
}
