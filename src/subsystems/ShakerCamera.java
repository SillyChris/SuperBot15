package subsystems;
import config.Electronics;
import edu.wpi.first.wpilibj.vision.AxisCamera;

public class ShakerCamera {
	public static AxisCamera cam;
	public ShakerCamera(){
		cam = new AxisCamera(Electronics.CAMERA_IP);
	}
}
