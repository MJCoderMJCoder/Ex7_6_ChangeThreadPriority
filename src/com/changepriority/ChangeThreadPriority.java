package com.changepriority;
/*
 * Static int MAX_PRIORITY：高：10
 * Static int MIN_PRIORITY：低：1
 * Static int NORM_PRIORITY：一般：5（主函数线程的优先级为一般）
 */
public class ChangeThreadPriority extends Thread {	//该线程类中包含主函数
	String threadName;
	
	public ChangeThreadPriority(String threadName) {	//构造方法（传入线程名字、输出）
		System.out.println("本线程的名字：" + threadName);
		this.threadName = threadName;
		System.out.println("创建线程\"" + this.threadName + "\"时的优先级是" + this.getPriority());
	}
	
	public void run() {	//包含线程运行时所执行的代码
		System.out.println("正在运行的线程是\""+ this.threadName + "\"的优先级是" + this.getPriority());
	}	//run
	
	public static void main(String[] args) {
		System.out.println("开始运行主函数");
		ChangeThreadPriority thread1 = new ChangeThreadPriority("如来");		//创建线程类实例
		ChangeThreadPriority thread2 = new ChangeThreadPriority("孙悟空");
		thread1.start();	//用于启动线程
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("主函数运行结束");
	}


}
