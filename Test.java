package cn.zzx.com;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		method();
	}
	public static void method() {
		int number=(int) (Math.random()*100);
		int numberOfTimes=0;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			
			System.out.println("请输入一个整数：");
			numberOfTimes++;
			int number1 = scanner.nextInt();
			if(number==number1) {
				System.out.println("恭喜你，猜对了！");
				System.out.println("你一共猜了："+numberOfTimes+"次");
				break;
			}else if(number>number1) {
				System.out.println("输入的数过少！");
			}else {
				System.out.println("输入的数过大！");
			}
			
		}
		scanner.close();
	}
}
