package com.changepriority;
/*
 * Static int MAX_PRIORITY���ߣ�10
 * Static int MIN_PRIORITY���ͣ�1
 * Static int NORM_PRIORITY��һ�㣺5���������̵߳����ȼ�Ϊһ�㣩
 */
public class ChangeThreadPriority extends Thread {	//���߳����а���������
	String threadName;
	
	public ChangeThreadPriority(String threadName) {	//���췽���������߳����֡������
		System.out.println("���̵߳����֣�" + threadName);
		this.threadName = threadName;
		System.out.println("�����߳�\"" + this.threadName + "\"ʱ�����ȼ���" + this.getPriority());
	}
	
	public void run() {	//�����߳�����ʱ��ִ�еĴ���
		System.out.println("�������е��߳���\""+ this.threadName + "\"�����ȼ���" + this.getPriority());
	}	//run
	
	public static void main(String[] args) {
		System.out.println("��ʼ����������");
		ChangeThreadPriority thread1 = new ChangeThreadPriority("����");		//�����߳���ʵ��
		ChangeThreadPriority thread2 = new ChangeThreadPriority("�����");
		thread1.start();	//���������߳�
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("���������н���");
	}


}
