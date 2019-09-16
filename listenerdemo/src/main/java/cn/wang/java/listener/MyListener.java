package cn.wang.java.listener;

import cn.wang.java.event.Event;
import cn.wang.java.target.Robot;

/**
 * @ClassNameMyListener
 * @Description
 * @Author
 * @Date2019/9/12 10:53
 **/
public class MyListener implements RobotListener {
    @Override
    public void sing(Event event) {
        Robot robot = event.getRobot();
        System.out.println(robot+"  对象正在sing");
    }

    @Override
    public void dance(Event event) {
        Robot robot = event.getRobot();
        System.out.println(robot+"  对象正在dance");
    }
}
