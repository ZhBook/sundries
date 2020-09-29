package com.example.swt.day01;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: 张学涛
 * @Date: 2020-05-25 11:08
 * @Version 1.0
 */
public class SimpTest {
    public static void main(String[] args)
    {
        SimpleFrame frame = new SimpleFrame("运行状态：");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //显示
        frame.setVisible(true);
    }
    static class SimpleFrame extends JFrame
    {
        private static final int DEFAULT_WIDTH = 480;
        private static final int DEFAULT_HEIGHT =200;
        public SimpleFrame(String title){
            setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
            setTitle(title);
            setBackground(Color.WHITE);

            //设置框体显示在中央
            int windowWidth = this.getWidth(); //获得窗口宽
            int windowHeight = this.getHeight(); //获得窗口高
            Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
            Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
            int screenWidth = screenSize.width; //获取屏幕的宽
            int screenHeight = screenSize.height; //获取屏幕的高
            this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示
            this.setUndecorated(true);
//            this.getRootPane().setWindowDecorationStyle(JRootPane.WARNING_DIALOG);//采用指定的窗口装饰风格
            this.getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);//采用指定的窗口装饰风格

            this.setAlwaysOnTop(true);

            WordPanel wordPanel= new WordPanel();
            getContentPane().add(wordPanel);

    }
    }

    static class WordPanel extends JPanel
    {
        private static final int POS_X =30;
        private static final int POS_Y = 40;
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            setBackground(Color.WHITE);
            g.drawString("开始运行。。。",POS_X,POS_Y);

            setFont(new Font("黑体",1,18));
            setForeground(Color.red);//设置字体颜色

            g.drawString("运行成功。。。",POS_X,POS_Y);

            g.drawString("结束。。。",POS_X,POS_Y);

        }
    }
}