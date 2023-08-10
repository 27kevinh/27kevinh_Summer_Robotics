package frc, robot;

public class RobotMap{
    public static final class Drivetrain{
        public static final int RIGHT_MASTER_ID = 1;
        public static final int LEFT_MASTER_ID = 0;
        public static final int RIGHT_FOLLOWER_ID = 1;
        public static final int LEFT_FOLLOWER_ID = 0;
        public static final boolean RIGHT_MASTER_INVERT = false;
        public static final boolean LEFT_MASTER_INVERT = true;
        public static final boolean RIGHT_FOLLOWER_INVERT = false;
        public static final boolean LEFT_FOLLOWER_INVERT = true;
    }

    public static final class Elevator{
        public static final int MASTER_ID = 9;
        public static final int FOLLOWER1_ID = 7;
        public static final int FOLLOWER2_ID = 8;
        public static final int FOLLOWER3_ID = 10;

        public static final boolean MASTER_INVERT = false;
        public static final boolean FOLLOWER1_INVERT = false;
        public static final boolean FOLLOWER2_INVERT = false;
        public static final boolean FOLLOWER3_INVERT = false;
    }

    public static final class Intake{
        public static final int INTAKE_MASTER_ID = 0;
        public static final int INTAKE_FOLLOWER_ID = 0;
        
    }
}