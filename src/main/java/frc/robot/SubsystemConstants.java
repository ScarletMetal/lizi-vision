package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;
import com.spikes2212.utils.PIDSettings;

import java.util.function.Supplier;

public class SubsystemConstants {
    public static interface  Drivetrain{
        public static final Supplier<Double> KP = ConstantHandler.
                addConstantDouble("KP",0.5);
        public static final Supplier<Double> KI = ConstantHandler.
                addConstantDouble("KI",0.0005);
        public static final Supplier<Double> KD = ConstantHandler.
                addConstantDouble("KD",0);
        public static final Supplier<Double> TOLERANCE = ConstantHandler.
                addConstantDouble("tolerance",5);
        public static final Supplier<Double> WAIT_TIME = ConstantHandler.
                addConstantDouble("wait time",0);
        public static final PIDSettings VISION_SETTINGS = new PIDSettings
                (KP.get(),KI.get(),KD.get(),TOLERANCE.get(),WAIT_TIME.get());
    }
}
