package org.usfirst.frc.team3243.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3243.robot.*;

/**
 *
 */
public class Chassis extends Subsystem {
	Victor TL = new Victor(0);
	Victor TR = new Victor(1);
	Victor BL = new Victor(2);
	Victor BR = new Victor(3);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
 
    	TR.set(OI.right);
    	BR.set(OI.right);
    	TL.set(OI.left);
    	BL.set(OI.left);
    }
    
    public void autoDrive(){
    	
    }
    
}

