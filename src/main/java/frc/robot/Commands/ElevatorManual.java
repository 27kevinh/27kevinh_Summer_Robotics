public class ElevatorManual extends IndefiniteCommand {
    public ElevatorManual(){
        addRequirements(Elevator.getInstance());
    }
    public void execute() {
        double speed = OI.getInstance().getDriver().getRightY();
        if(Math.abs(speed)>Constants.JOYSTICK_DEADBAND) {
            Elevator.getInstance().setElevatorPower(speed);
        }
    }
    public void end(boolean interrupted){
        
    }
}