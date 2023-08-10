package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsytems.Drivetrain;
import harkerrobolib.commands.IndefiniteCommand;

public class DriveManual extends IndefiniteCommand{
    public DriveManueal() {
        addRequirements(Drivetrain.getInstance());
    }

    public void execute(){
        double speed = OI.getInstance().getDriver().getLeftY();
        double turn = OI.getInstance().getDriver().getLeftX();
        Drivetrain.getInstance().setAngleAndDrive(speed, turn);
    }
}