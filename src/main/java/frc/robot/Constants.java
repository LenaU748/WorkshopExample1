/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Motor Controller ID Numbers
    public static int FL = 0;
    public static int BL = 1;
    public static int FR = 2;
    public static int BR = 3;

    //X-box Controller ID Numbers
    public static int DRIVEJOY = 0;
    public static int OPJOY = 1;

    //X-box deadzone
    public static double JOY_DEADZONE = 0.2;

    //X-box Axis ID Numbers
    public static int XL = 0;
    public static int YL = 1;
    public static int XR = 4;
    public static int YR = 5;

    //Limit Switch Port Number
    public static int lim = 0;
}
