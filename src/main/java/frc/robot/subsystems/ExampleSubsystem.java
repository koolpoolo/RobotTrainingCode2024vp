package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.dummy.Motor;

public class ExampleSubsystem extends SubsystemBase {
    // Constants
    public static final double MAX_SPEED = 7;
    public static final double GEAR_RATIO = 10;

    // Member variables
    private final Motor motor;

    // Constructor
    public ExampleSubsystem() {
        this.motor = new Motor(1);
    }

    // Methods
    public void setSpeed(double speed) {
        motor.set(speed / GEAR_RATIO);
    }

    public void fullSpeed() {
        motor.set(MAX_SPEED);
    }

    public void fullReverse() {
        motor.set(-MAX_SPEED);
    }

    public double getSpeed() {
        return motor.get() * GEAR_RATIO;
    }

    // Factories
    public Command setSpeedCmd(double speed) {
        return runOnce(() -> setSpeed(speed));
    }
}
