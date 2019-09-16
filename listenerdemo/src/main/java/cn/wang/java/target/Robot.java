package cn.wang.java.target;

import cn.wang.java.event.Event;
import cn.wang.java.listener.RobotListener;

/**
 * @ClassNameRobot
 * @Description   事件源
 * @Author
 * @Date2019/9/12 10:50
 **/
public class Robot {

    private RobotListener robotListener;

    /**
     * 注册监听器
     * @param robotListener
     */
    public void registerRobotListener(RobotListener robotListener) {
        this.robotListener = robotListener;
    }

    public void sing(){
        //事件源对象动作
        System.out.println("机器人正在唱歌");
        //监听器动作
        if (robotListener!=null){
            //实例化事件对象
            Event event=new Event(this);
            robotListener.sing(event);
        }
    }


    public void dance(){
        //事件源对象动作
        System.out.println("机器人正在跳舞");
        //监听器动作
        if (robotListener!=null){
            //实例化事件对象
            Event event=new Event(this);
            robotListener.dance(event);
        }
    }
}
