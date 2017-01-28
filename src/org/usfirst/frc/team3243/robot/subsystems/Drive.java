package org.usfirst.frc.team3243.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{
	
	Double leftdrv;
	Double rightdrv;
//	@Override
//	public void initDefaultCommand() {
//		// TODO Auto-generated method stub
//		if (turbo){
//			leftdrv = val[0];
//			rightdrv = val[1];
//		}else{
//			leftdrv = val[0]*.5;
//			rightdrv = val[1]*.5;
//		}
//		if(backdrv){
//			leftdrv = -leftdrv;
//			rightdrv = -rightdrv;
//		}
//		
//	}

	Double getVal(Double[] val, boolean turbo, boolean backdrv){
		if (turbo){
			leftdrv = val[0];
			rightdrv = val[1];
		}else{
			leftdrv = val[0]*.5;
			rightdrv = val[1]*.5;
		}
		if(backdrv){
			leftdrv = -leftdrv;
			rightdrv = -rightdrv;
		}
		
		return leftdrv, rightdrv;
	}


}
