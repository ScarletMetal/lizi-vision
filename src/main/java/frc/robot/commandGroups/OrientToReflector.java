package frc.robot.commandGroups;

import com.spikes2212.genericsubsystems.drivetrains.commands.OrientWithPID;
import com.spikes2212.utils.RunnableCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.ImageProcessing;
import frc.robot.Robot;
import frc.robot.SubsystemConstants;

public class OrientToReflector extends CommandGroup {
    ImageProcessing.ContourSource contourSource = new ImageProcessing.ContourSource(ImageProcessing.LARGEST_CONTOUR);
    public OrientToReflector(){

        addSequential(new RunnableCommand(() -> ImageProcessing.VISION_HANDLER.setExposure(ImageProcessing.CAMERA_EXPOSURE.get())));
        addSequential(new RunnableCommand(() -> ImageProcessing.VISION_HANDLER.setPipeline("reflective")));

        addSequential(new OrientWithPID(Robot.drivetrain, contourSource,
                0,SubsystemConstants.Drivetrain.VISION_SETTINGS,0,false));

    }
}
