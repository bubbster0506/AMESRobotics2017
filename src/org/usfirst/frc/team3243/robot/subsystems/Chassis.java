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
	
    public void stop() {
    	//this isn't needed as if there is no joystick input the robot won't move
    	TR.set(0);
    	BR.set(0);
    	TL.set(0);
    	BL.set(0);     
    }
    
    public void autoDrive(){
    	
    }
    
}

