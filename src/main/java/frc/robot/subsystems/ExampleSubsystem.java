package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Hardware;
import frc.robot.dummy.Motor;

public class ExampleSubsystem extends SubsystemBase {
    // Constants
    public static final double MAX_SPEED = 7;
    public static final double GEAR_RATIO = 10;
    public static final double STOP = 0;
    // Member variables
    private final TalonFX motor;

    // Constructor
    public ExampleSubsystem() {
        this.motor = new TalonFX(Hardware.MOTOR_ID);
    }

    // Methods
    public void setSpeed(double speed) {
        motor.set(speed / GEAR_RATIO);
    }

    public void fullSpeed() {
        motor.set(MAX_SPEED);
    }

    public void wt() {
        motor.set(STOP);
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

    public Command spa(double speed) {
        return run(() -> setSpeed(speed));
    }

    public Command stop() {
        return run(() -> wt());
    }

    public Command sto() {
        return Commands.waitSeconds(1);
    }

}
