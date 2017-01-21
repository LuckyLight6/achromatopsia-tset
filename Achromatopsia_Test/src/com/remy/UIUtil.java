package com.remy;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * ��Խ�����в����Ĺ�����
 *
 * @author Remy
 */
public class UIUtil {
	/**
	 * �������ô�����С�
	 *
	 * ������
	 * 
	 * A����ȡ��Ļ�Ŀ��͸�
	 * 
	 * B����ȡ�����õĴ���Ŀ��͸�
	 * 
	 * C��������������((��Ļ�Ŀ� - ����Ŀ�) / 2, (��Ļ�ĸ� - ����ĸ�) / 2)��Ϊ�����������
	 */
	private UIUtil() {
	}

	public static void setFrameCenter(JFrame jf) {
		// ��ȡ��Ļ�Ŀ��͸�
		// ��ȡ��Ļ����
		// ��ȡawt�����Ĺ��߰�����

		// public static Toolkit getDefaultToolkit()
		// ��ȡ���߰�����
		Toolkit t = Toolkit.getDefaultToolkit();

		// ��ȡ��Ļ����
		// public sbstract Dimension getScreenSize()
		Dimension d = t.getScreenSize();

		// ��ȡ��Ļ��
		int screenWidth = d.width;

		// ��ȡ��Ļ��
		int screenHeight = d.height;

		// ��ȡ����Ŀ�
		int jfWidth = jf.getWidth();

		// ��ȡ����ĸ�
		int jfHeight = jf.getHeight();

		// ���ô��������
		jf.setLocation((screenWidth - jfWidth) / 2, (screenHeight - jfHeight) / 2);
	}
}