package org._2585robophiles.lib2585;

import edu.wpi.first.wpilibj.RobotBase;

public abstract class Environment2585 {
    
    private RobotBase robot;
    
    /**
     * initializes nothing
     */
    public Environment2585(){
    	
    }

    /**
     * Initializes systems
     * @param robot the RobotBase to set
     */
    public Environment2585(RobotBase robot) {
        this.setRobot(robot);
    }
    
	/**
     * @return if the robot is in auton mode
     */
    public boolean isAutonomous() {
        return getRobot().isAutonomous();
    }
    
    /**
     * @return if robot is in teleop mode
     */
    public boolean isOperatorControl() {
        return getRobot().isOperatorControl();
    }

	/**
	 * @return the robot
	 */
	protected RobotBase getRobot() {
		return robot;
	}

	/**
	 * @param robot the robot to set
	 */
	protected void setRobot(RobotBase robot) {
		this.robot = robot;
	}
    
}