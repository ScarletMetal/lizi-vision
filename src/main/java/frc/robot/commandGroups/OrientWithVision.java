package frc.robot.commandGroups;

import com.spikes2212.genericsubsystems.drivetrains.commands.OrientWithPID;
import com.spikes2212.utils.PIDSettings;
import com.spikes2212.utils.RunnableCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.ImageProcessing;
import frc.robot.Robot;
import frc.robot.SubsystemComponents;
import frc.robot.SubsystemConstants;

import static frc.robot.SubsystemComponents.Drivetrain.GYRO;
public class OrientWithVision extends CommandGroup {

    private double targetAngle;
    public OrientWithVision() {
        super();

        addSequential(new RunnableCommand(() -> {
            targetAngle = ImageProcessing.GET_ANGLE_TO_LARGEST_X.get();
        }));
        addSequential(new RunnableCommand(GYRO::reset));
        addSequential(new OrientWithPID(Robot.drivetrain, GYRO, () -> targetAngle,
                SubsystemConstants.Drivetrain.VISION_SETTINGS, 0, false));
    }

}
