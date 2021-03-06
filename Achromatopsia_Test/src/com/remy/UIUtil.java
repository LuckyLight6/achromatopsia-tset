package com.remy;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 针对界面进行操作的工具类
 *
 * @author Remy
 */
public class UIUtil {
	/**
	 * 需求：设置窗体居中。
	 *
	 * 分析：
	 * 
	 * A：获取屏幕的宽和高
	 * 
	 * B：获取被设置的窗体的宽和高
	 * 
	 * C：把这两个数据((屏幕的宽 - 窗体的宽) / 2, (屏幕的高 - 窗体的高) / 2)作为窗体的新坐标
	 */
	private UIUtil() {
	}

	public static void setFrameCenter(JFrame jf) {
		// 获取屏幕的宽和高
		// 获取屏幕对象
		// 获取awt操作的工具包对象

		// public static Toolkit getDefaultToolkit()
		// 获取工具包对象
		Toolkit t = Toolkit.getDefaultToolkit();

		// 获取屏幕对象
		// public sbstract Dimension getScreenSize()
		Dimension d = t.getScreenSize();

		// 获取屏幕宽
		int screenWidth = d.width;

		// 获取屏幕高
		int screenHeight = d.height;

		// 获取窗体的宽
		int jfWidth = jf.getWidth();

		// 获取窗体的高
		int jfHeight = jf.getHeight();

		// 设置窗体的坐标
		jf.setLocation((screenWidth - jfWidth) / 2, (screenHeight - jfHeight) / 2);
	}
}