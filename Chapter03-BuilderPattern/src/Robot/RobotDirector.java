package Robot;

public class RobotDirector {
    private static RobotDirector director = null;

    private RobotDirector() {}

    public static synchronized RobotDirector getInstance() {
        if (director == null) {
            director = new RobotDirector();
        }
        return director;
    }

    public Robot CasualRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("Kasula Brain");
        builder.sword("Taito Ward");
        builder.gun("P30");

        return builder.getResult();
    }

    public Robot IntelligentRobot() {
        RobotBuilder builder = new RobotBuilder();
        builder.brainchip("AI-Powered Brain");
        builder.shield("SAS Shield");
        builder.gun("M1A4 with SmartScope");
        builder.sword("Wielded Blade Arm");

        return builder.getResult();
    }

    public Robot RereRobot() {
        RobotBuilder robotBuilder = new RobotBuilder();
        Robot bot = robotBuilder.brainchip("i3").gun("Desert Eagle").getResult();
        return bot;
    }
}
