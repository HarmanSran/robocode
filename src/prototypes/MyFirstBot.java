package prototypes;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class MyFirstBot extends Robot {
  
  public void run() {
    turnLeft(getHeading() % 90);
    turnGunRight(90);
    while (true) {
      ahead(1000);
      turnRight(90);
      ahead(1000);
      turnLeft(-90);
    }
  }
  
  public void onScannedRobot(ScannedRobotEvent e) {
    
    stop();
    int shotsFired = 10;
    int i = 0;
    while(i < shotsFired) {
      fire(1);
      i += 1;
    }
    resume();
  }
}
