package cn.wang.java.event;

import cn.wang.java.target.Robot;

/**
 * @ClassNameEvent
 * @Description   事件类  事件对象  事件对象 包含事件源对象
 * @Author
 * @Date2019/9/12 10:45
 **/
public class Event {

    private Robot robot;


    public Event(Robot robot) {
        this.robot = robot;
    }


    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}

