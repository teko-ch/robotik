import ch.aplu.ev3.*;

public class SensorListener implements TouchListener {
    private LegoRobot robot;
    private TouchSensor sensor;

    public SensorListener(){
        robot = new LegoRobot();
        sensor = new TouchSensor(SensorPort.S1);
        sensor.addTouchListener(this);
        robot.addPart(sensor);
        robot.drawString("Press Sensor!", 0, 0);

    }

    private void run(){
        while (!Tools.isEscapePressed()){

        }
        robot.exit();
    }


    public static void main(String[] args) {
        SensorListener exp = new SensorListener();
        exp.run();
    }

    @Override
    public void pressed(SensorPort sensorPort) {
        robot.drawString("pressed", 0, 4);
    }

    @Override
    public void released(SensorPort sensorPort) {
        robot.drawString("released", 0, 4);
    }
}
