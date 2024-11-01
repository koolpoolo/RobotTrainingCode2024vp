package frc.robot;

import frc.robot.subsystems.ExampleSubsystem;

public class Subsystems {
    public static final boolean EXAMPLE_ENABLED = false;

    public final ExampleSubsystem exampleSubsystem;

    public Subsystems() {
        if (EXAMPLE_ENABLED) {
            this.exampleSubsystem = new ExampleSubsystem();
        } else {
            this.exampleSubsystem = null;
        }
    }
}
