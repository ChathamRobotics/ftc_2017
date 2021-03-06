package org.firstinspires.ftc.team9853.tests;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.team9853.opmodes.Tele9853;

/**
 * tele op mode
 */

@TeleOp(name = "Test: Driving", group = "Test")

@Disabled

public class DriveTest extends Tele9853 {
    DriveTest() {
        super();
    }

    @Override
    public void loop() {
        robot().driveAtPoint(1, 1, 0);

        robot().debug();
    }
}
