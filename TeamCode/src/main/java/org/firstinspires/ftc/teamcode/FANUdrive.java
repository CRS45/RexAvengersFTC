package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Basic TeleOp", group = "OpMode")
public class FANUdrive extends OpMode {
    DcMotor motorOne;
    @Override
    public void init() {
        motorOne = hardwareMap.get(DcMotor.class, "driveFL");
    }
    @Override
    public void loop() {
        if (gamepad1.a) {
            motorOne.setPower(0.3);
        } else {
            motorOne.setPower(0.0);
        }
    }
}