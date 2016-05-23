package ch.teko.robotik.sensor;

import ch.aplu.ev3.*;

public class Gyro {
    private LegoRobot robot;
    private GyroAngleSensor angleSensor;
    //private GyroRateSensor rateSensor;

    public Gyro() {
        robot = new LegoRobot();
        angleSensor = new GyroAngleSensor();
        robot.addPart(angleSensor);
        //rateSensor = new GyroRateSensor(SensorPort.S1);
        //robot.addPart(rateSensor);
    }

    public void run(){
        while (Tools.isEscapePressed()){
            robot.drawString("Angle: " + angleSensor.getValue(), 0, 4);
            //robot.drawString("Rate: " + rateSensor.getValue(), 0, 5);
        }
        robot.exit();
    }

    public static void main(String[] args) {
        Gyro exp = new Gyro();
        exp.run();
    }
}
