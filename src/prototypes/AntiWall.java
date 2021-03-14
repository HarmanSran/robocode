package prototypes;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class AntiWall extends Robot {
  public void run() {
    turnLeft(getHeading() % 90);
    turnGunRight(180);
    ahead(1000);
    turnRight(90);
    while (true) {
      turnGunLeft(180);
      ahead(100);
      turnGunRight(180);
      back(100);
    }
  }
  
  public void onScannedRobot(ScannedRobotEvent e) {
    if (e.getVelocity() == 0) {
      fire(10);      
    }
    scan();
  }
}
