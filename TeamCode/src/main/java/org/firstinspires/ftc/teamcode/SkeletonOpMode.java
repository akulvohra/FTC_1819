package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="SkeletonOpMode", group="TeleOp")
public class SkeletonOpMode extends OpMode {

    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;
    double leftWheelsPower;
    double rightWheelsPower;

    @Override
    public void init() {
        /*
        Instantiating Motors
         */
        leftFront = hardwareMap.dcMotor.get("left_front");
        rightFront = hardwareMap.dcMotor.get("right_front");
        leftBack = hardwareMap.dcMotor.get("left_back");
        rightBack = hardwareMap.dcMotor.get("right_back");

        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {
        leftWheelsPower = 1;
        rightWheelsPower = 1;

        leftFront.setPower(-leftWheelsPower);
        leftBack.setPower(-leftWheelsPower);
        rightFront.setPower(rightWheelsPower);
        rightBack.setPower(rightWheelsPower);
    }

    @Override
    public void stop() {

    }
}
