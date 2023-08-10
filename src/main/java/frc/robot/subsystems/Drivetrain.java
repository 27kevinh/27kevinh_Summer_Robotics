package frc.robot.subsytems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import con.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import harkerrobolib.wrappers.HSTalon;

public class Drivetrain extend SubsystemBase(
    private static Drivetrain instance;
    
    private HSTalon rightMaster;
    private HSTalon leftMaster;
    private VictorSPX rightFollower;
    private VictorSPX left Follower;

    private Drivetrain(){
        rightMaster = new HSTalon(RobotMap.Drivetrain.RIGHT_MASTER_ID);
        leftMaster = new HSTalon(RobotMap.Drivetrain.LEFT_MASTER_ID);
        rightFollower = new VictorSPX(RobotMap.Drivetrain.rightFollower);
        leftFollower = new VictorSPX(RobotMap.Drivetrain.leftFollower);

        leftMaster.configFactoryDefault();
        rightMaster.configFactoryDefault();
        leftFollower.configFactoryDefault();
        rightFollower.configFactoryDefault();

        rightMaster.setInverted(RobotMap.Drivetrain.A_MOTOR_INVERT);
        leftMaster.setInverted(RobotMap.Drivetrain.A_MOTOR_INVERT);
        rightFollower.setInverted(RobotMap.Drivetrain.A_MOTOR_INVERT);
        leftFollower.setInverted(RobotMap.Drivetrain.A_MOTOR_INVERT);

        rightFollower.follow(rightMaster);
        leftFollower.follow(leftMaster);

        public void setAngleAndDrive(double speed, double turn){
            rightMaster.set(ControlMode.PercentOutput, speed-turn);
            leftMaster.set(ControlMode.PercentOutput, speed+turn);
        }
    }

    
    public static Drivetrain getInstance() {
        if(instance == null){
            instance = new Drivetrain
        }
        return instance;
    }
)