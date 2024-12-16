package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.example.ExampleSetSpeedCommand;

public class Controls {
    public static final boolean EXAMPLE_ENABLED = true;
    public static final int DRIVE_CONTROLLER_PORT = 0;

    private final CommandXboxController driverController;

    // Normally, more descriptive names are better, but in this case, we care
    // about making the subsystem access easy
    private final Subsystems s;

    public Controls(Subsystems s) {
        driverController = new CommandXboxController(DRIVE_CONTROLLER_PORT);
        this.s = s;
        if (EXAMPLE_ENABLED) {
            AU();
        }
    }

    private void AU() {
        driverController.leftBumper().onTrue(s.exampleSubsystem.spa(0.6));
        driverController.rightBumper().onTrue(s.exampleSubsystem.spa(0.8));
        driverController.x().onTrue(s.exampleSubsystem.stop());
    }

}
