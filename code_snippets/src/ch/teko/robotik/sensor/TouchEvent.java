package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;


public class TouchEvent implements TouchListener {
    private LegoRobot robot;
    private TouchSensor sensor;

    public TouchEvent(){
        robot = new LegoRobot();
        sensor = new TouchSensor(SensorPort.S1);
        sensor.addTouchListener(this);
        robot.addPart(sensor);
        robot.drawString("Press Touch!", 0, 0);

        Tools.waitEscape();
        robot.exit();
    }

    public static void main(String[] args) {
        TouchEvent exp = new TouchEvent();
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
