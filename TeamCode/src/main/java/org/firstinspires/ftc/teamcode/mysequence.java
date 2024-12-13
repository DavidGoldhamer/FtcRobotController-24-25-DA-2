package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

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

        Trajectory traj0 = drive.trajectoryBuilder(new Pose2d())
                .splineTo(new Vector2d(-0.20, -39.98), Math.toRadians(134.44))
                .splineTo(new Vector2d(-17.90, -36.00), Math.toRadians(9180.00))
                .splineTo(new Vector2d(-27.25, -35.20), Math.toRadians(152.74))
                .splineTo(new Vector2d(-34.81, -26.85), Math.toRadians(120.00))
                .splineTo(new Vector2d(-38.78, -16.91), Math.toRadians(112.01))
                .splineTo(new Vector2d(-46.74, -22.48), Math.toRadians(263.02))
                .splineTo(new Vector2d(-47.73, -47.34), Math.toRadians(-86.66))
                .splineTo(new Vector2d(-58.48, -63.45), Math.toRadians(230.52))
                .build();


        drive.followTrajectory(traj0);
    }
}
