package cn.wang.java.Test;

import cn.wang.java.listener.MyListener;
import cn.wang.java.target.Robot;

/**
 * @ClassNameTestDemo
 * @Description
 * @Author
 * @Date2019/9/12 11:06
 **/
public class TestDemo {

    public static void main(String[] args) {

        Robot robot=new Robot();
        robot.registerRobotListener(new MyListener());

        //目标对象操作
        robot.sing();
        robot.dance();
    }
}
