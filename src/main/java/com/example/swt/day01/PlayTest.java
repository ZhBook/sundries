package com.example.swt.day01;

import javax.swing.*;

public class PlayTest {
    private static int XPOINT = 0;
    private static int YPOINT = 0;

    public static void main(String[] args) {

        int i = 0;
        while (i < 100) {

            XPOINT += 20;
            YPOINT += 20;
            Play play = new Play();
            new Thread(play).start();
            i++;
        }
    }


    static class Play implements Runnable{
        @Override
        public void run() {
            JFrame jf = new JFrame("测s试窗口");

            jf.setLocation(XPOINT,YPOINT);
            // 消息对话框无返回, 仅做通知作用
            JOptionPane.showMessageDialog(
                    jf,
                    "Hello Information Message",
                    "消息标题",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

}
