package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;


public class UltraEvent implements UltrasonicListener {
    private LegoRobot robot;
    private UltrasonicSensor sensor;
    private int trigger = 20;

    public UltraEvent() {
        robot = new LegoRobot();
        sensor = new UltrasonicSensor(SensorPort.S1);
        sensor.addUltrasonicListener(this, trigger);
        robot.addPart(sensor);

        Tools.waitEscape();
        robot.exit();
    }

    public static void main(String[] args) {
        UltraEvent exp = new UltraEvent();
    }

    @Override
    public void far(SensorPort sensorPort, int i) {
        robot.drawString("far" , 0, 4);
    }

    @Override
    public void near(SensorPort sensorPort, int i) {
        robot.drawString("near", 0, 4);
    }
}
