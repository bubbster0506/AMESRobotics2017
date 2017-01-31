package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	Joystick move = new Joystick(0);
	Button turbo = new JoystickButton(move, 8);//RT
	Button crawl = new JoystickButton(move, 7);//LT
	Button backwards = new JoystickButton(move, 9);//Back
	Double modify;
	boolean reversed;
	
	public static Double left;
	public static Double right;
	
	public void getDrvVals(){
		
		modify = .5;
		reversed = false;
		
		left = move.getRawAxis(0);
		right = move.getRawAxis(2);
		
		turbo.whenPressed(turbo());
		crawl.whenPressed(crawl());
		backwards.whenPressed(back());
		//
		Double r;
		Double l;
		if(reversed)
		{
			r = left;
			l = right;
		}else
		{
			r = right;
			l = left;
		}
		right = r*modify;
		left = l*modify;
		}
	public Command turbo(){
		modify = 1.0;
		return null;
	}
	
	public Command crawl(){
		modify = 0.25;
		return null;
	}
	
	public Command back(){
		modify = modify*-1;
		reversed = true;
		return null;
	
	}
	
	
	
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

