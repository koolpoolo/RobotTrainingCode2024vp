package frc.robot.commands.example;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleSubsystem;

public class ExampleSetSpeedCommand extends Command {
    private final ExampleSubsystem exampleSubsystem;
    private final double speed;

    public ExampleSetSpeedCommand(ExampleSubsystem exampleSubsystem, double speed) {
        this.exampleSubsystem = exampleSubsystem;
        this.speed = speed;
        addRequirements(exampleSubsystem);
    }

    @Override
    public void initialize() {
        exampleSubsystem.setSpeed(speed);
    }

    @Override
    public boolean isFinished() {
        return MathUtil.isNear(speed, exampleSubsystem.getSpeed(), 0.5);
    }
}
