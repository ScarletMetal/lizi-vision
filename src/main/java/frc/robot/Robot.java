/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.dashboard.DashBoardController;
import com.spikes2212.genericsubsystems.drivetrains.TankDrivetrain;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commandGroups.OrientWithVision;


public class Robot extends TimedRobot {
    public static OI oi;
    public static DashBoardController dbc = new DashBoardController();
    public static TankDrivetrain drivetrain;

    @Override
    public void robotInit() {

        drivetrain = new TankDrivetrain(
                SubsystemComponents.Drivetrain.LEFT::set,
                SubsystemComponents.Drivetrain.RIGHT::set);

        SmartDashboard.putData("Orient To Contour", new OrientWithVision());

        oi = new OI();

    }


    @Override
    public void robotPeriodic() {
        dbc.update();
    }


    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }


    @Override
    public void autonomousInit() {
    }


    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
    }


    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {
    }
}
