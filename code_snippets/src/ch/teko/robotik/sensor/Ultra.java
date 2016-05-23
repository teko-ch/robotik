package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;


public class Ultra {
    private LegoRobot robot;
    private UltrasonicSensor sensor;

    public Ultra() {
        robot = new LegoRobot();
        sensor = new UltrasonicSensor(SensorPort.S1);
        robot.addPart(sensor);
    }

    public void run(){
        while (!Tools.isEscapePressed()){
            robot.drawString("distance: " + sensor.getDistance(), 0, 4);
        }
        robot.exit();
    }

    public static void main(String[] args) {
        Ultra exp = new Ultra();
        exp.run();
    }

}
