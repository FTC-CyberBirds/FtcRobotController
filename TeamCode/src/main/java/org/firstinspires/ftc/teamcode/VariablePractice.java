package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 21892;
        double motorSpeed = .75;
        boolean clawClosed = true;
        String name = "Yasir";

        telemetry.addData("Team Number",  teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("Claw closed", clawClosed);
        telemetry.addData("Name", name);
    }
    @Override
    public void loop() {

    }



}
