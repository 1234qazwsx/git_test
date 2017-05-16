package test_1;

import javax.swing.*;
import java.awt.*;

public class CenterFrame {
	public static void main(String args[]){
		JFrame myfram = new JFrame("center Frame");
		myfram.setSize(400, 300);
		myfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension  screensize = Toolkit.getDefaultToolkit().getScreenSize();
		// �õ���ǰ������Ļ�Ĵ�С
		int sceWeith = screensize.width;
		int sceHigh = screensize.height;
		
		int x =(sceWeith - myfram.getWidth())/2;
		int y =(sceHigh - myfram.getHeight())/2;
		//����
		
		myfram.setLocation(x, y);
		myfram.setVisible(true);	
	}
}
