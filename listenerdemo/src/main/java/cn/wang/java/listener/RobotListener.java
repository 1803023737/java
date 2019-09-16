package cn.wang.java.listener;

import cn.wang.java.event.Event;

/**
 * @ClassNameRobotListener
 * @Description    事件监听器   监听事件对象
 * @Author
 * @Date2019/9/12 10:51
 **/
public interface RobotListener {

    public void sing(Event event);
    public void dance(Event event);


}
