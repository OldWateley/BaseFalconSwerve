package frc.lib.util;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveModuleConstants {
    public final int driveMotorID;
    public final int angleMotorID;
    public final int angleEncoder0;
    public final int angleEncoder1;
    public final int driveEncoder0;
    public final int driveEncoder1;
    public final Rotation2d angleOffset;

    /**
     * Swerve Module Constants to be used when creating swerve modules.
     * @param driveMotorID
     * @param angleMotorID
     * @param angleEncoder0
     * @param angleEncoder1
     * @param driveEncoder0
     * @param driveEncoder1
     * @param angleOffset
     */
    public SwerveModuleConstants(int driveMotorID, int angleMotorID, int angleEncoder0, int angleEncoder1, int driveEncoder0, int driveEncoder1, Rotation2d angleOffset) {
        this.driveMotorID = driveMotorID;
        this.angleMotorID = angleMotorID;
        this.angleEncoder0 = angleEncoder0;
        this.angleEncoder1 = angleEncoder1;
        this.driveEncoder0 = driveEncoder0;
        this.driveEncoder1 = driveEncoder1;
        this.angleOffset = angleOffset;
    }
}
