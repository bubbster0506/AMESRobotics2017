package org.usfirst.frc.team3243.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3243.robot.*;

/**
 *
 */
public class BallsDeep extends Subsystem {
  Victor collect = new Victor(4);
  Victor dump = new Victor(5);
  
	public void collectOn() {
    	collect.set(OI.collectPower);
	}
	
	public void dumperOn() {
		dump.set(1.0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
