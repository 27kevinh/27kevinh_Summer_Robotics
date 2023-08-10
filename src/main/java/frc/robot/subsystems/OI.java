package frc.robot;

public class OI {
    private static OI instance;
    private XboxGamepad driver;

    private OI() {
        driver = new XboxGamepad(Constants.DRIVER_ID);
        initBindings();
    }
    public XboxGamepad getDriver(){
        return driver;
    }

    private void initBindings(){
        driver.getButtonX().whileTrue(new ToggleIntake());
        driver.getButtonY().whileTrue(new ToggleRaise());
    }

    public static OI
}