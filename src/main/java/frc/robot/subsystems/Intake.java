public class Intake extends SubsystemBase{
    private static Intake instance;

    private HSTalon master;
    private HSTalon follower; 

    private DoubleSolenoid intakePiston;
    private DoubleSolenoid reversePiston;

    master = new TalonSRX(RobotMap.Intake.INTAKE_MASTER_ID);
    follower = new TalonSRX(RobotMap.Intake.INTAKE_FOLLOWER_ID);
    follower.follow(master);

    intakePiston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.Intake.INTAKE_PISTON_FORWARD, RobotMap.Intake.INTAKE_PISTON_REVERSE);
    private static boolean Intaking = false;

    public void setOutput(double power){
        master.setPower(ControlMode.PercentOutput, power);

    }

    public static Intake getInstance(){
        if(instance==null){
            instance = new Intake;
        }
        return instance;
    }
}