package frc.robot;

import com.spikes2212.scvf.client.Contour;
import com.spikes2212.scvf.client.VisionHandler;
import com.spikes2212.scvf.client.middleware.OffsetMiddleware;
import com.spikes2212.scvf.client.middleware.PercentMiddleware;

import java.util.function.Supplier;

public class ImageProcessing {

    public static final int CAMERA_WIDTH = 640;
    public static final int CAMERA_HEIGHT = 480;

    public static final VisionHandler VISION_HANDLER = new VisionHandler(CAMERA_WIDTH, CAMERA_HEIGHT);

    public static final double HORIZONTAL_FOW = 61.37;

    static {
        VISION_HANDLER.applyDefaultMiddleware(new OffsetMiddleware(CAMERA_WIDTH, CAMERA_HEIGHT),
                new PercentMiddleware(CAMERA_WIDTH, CAMERA_HEIGHT));
    }

    public static final Contour LARGEST_CONTOUR = VISION_HANDLER.generateContour(0);

    public static final Supplier<Double> GET_ANGLE_TO_LARGEST_X = () -> HORIZONTAL_FOW * LARGEST_CONTOUR.getCenterX();

}
