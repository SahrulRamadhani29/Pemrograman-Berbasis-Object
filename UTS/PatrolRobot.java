package UTS;

public class PatrolRobot extends Robot {
    public Battery RobotBattery;

    public PatrolRobot(String name , int CPUSpeed, int power, Battery robotBattery) {
        this.name = "PATROL "+ name ;
        this.CPUSpeed = CPUSpeed;
        this.Power = power;
        this.RobotBattery = robotBattery;
    }

    public void increasePower() {
        Power += 20;
    }

    public void getCapacity() {
        RobotBattery.getCapacity();
    }

}
