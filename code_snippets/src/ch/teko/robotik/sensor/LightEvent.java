package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;


public class LightEvent implements LightListener{
    private LegoRobot robot;
    private LightSensor sensor;
    private int trigger = 400;

    public LightEvent(){
        robot = new LegoRobot();
        sensor = new LightSensor(SensorPort.S1);
        sensor.addLightListener(this, trigger);
        robot.addPart(sensor);

        Tools.waitEscape();
        robot.exit();
    }

    public static void main(String[] args) {
        LightEvent exp = new LightEvent();
    }

    @Override
    public void bright(SensorPort sensorPort, int i) {
        robot.drawString("It's bright", 0, 4);
    }

    @Override
    public void dark(SensorPort sensorPort, int i) {
        robot.drawString("It's dark", 0, 4);
    }
}
