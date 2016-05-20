import ch.aplu.ev3.*;

public class Touch {
    private LegoRobot robot;
    private TouchSensor sensor;

    public Touch(){
        robot = new LegoRobot();
        sensor = new TouchSensor(SensorPort.S1);
        robot.addPart(sensor);
    }

    public void run(){
        while (!Tools.isEscapePressed()){
            if (sensor.isPressed()) {
                robot.drawString("pressed", 0, 4);
            }else{
                robot.drawString("not pressed", 0, 4);
            }
        }
        robot.exit();
    }

    public static void main(String[] args) {
        Touch exp = new Touch();
        exp.run();
    }
}
