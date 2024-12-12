package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

/*
 * This is an example of a more complex path to really test the tuning.
 */
@Autonomous(group = "drive")
public class mysequence extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

        Trajectory traj = drive.trajectoryBuilder(new Pose2d())
                .splineTo(new Vector2d(-24.86, -48.93), Math.toRadians(154.58))
                .splineTo(new Vector2d(43.36, -36.00), Math.toRadians(10.73))
                .splineTo(new Vector2d(35.40, 2.98), Math.toRadians(101.53))
                .splineTo(new Vector2d(9.75, 49.72), Math.toRadians(118.76))
                .splineTo(new Vector2d(-51.71, 30.03), Math.toRadians(197.76))
                .splineTo(new Vector2d(-39.58, -25.06), Math.toRadians(-77.58))
                .splineTo(new Vector2d(6.56, -0.20), Math.toRadians(28.32))
                .splineTo(new Vector2d(-5.37, 29.44), Math.toRadians(170.36))
                .splineTo(new Vector2d(-37.99, 14.92), Math.toRadians(161.26))
                .splineTo(new Vector2d(-51.12, -28.44), Math.toRadians(-35.24))
                .splineTo(new Vector2d(45.35, -52.71), Math.toRadians(-39.06))
                .splineTo(new Vector2d(22.67, -44.75), Math.toRadians(160.67))
                .splineTo(new Vector2d(20.09, -63.85), Math.toRadians(262.29))
                .build();

        drive.followTrajectory(traj);

        sleep(2000);

        drive.followTrajectory(
                drive.trajectoryBuilder(traj.end(), true)
                        .splineTo(new Vector2d(0, 0), Math.toRadians(180))
                        .build()
        );
    }
}
