package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;


public class Light {
    private LegoRobot robot;
    private LightSensor sensor;

    public Light() {
        robot = new LegoRobot();
        sensor = new LightSensor(SensorPort.S1);
        robot.addPart(sensor);
    }

    public void run(){
        while (!Tools.isEscapePressed()){
            robot.drawString("brightness: " + sensor.getValue(), 0, 4);
        }
        robot.exit();
    }

    public static void main(String[] args) {
        Light exp = new Light();
        exp.run();
    }
}
