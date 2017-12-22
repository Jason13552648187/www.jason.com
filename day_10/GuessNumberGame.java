import java.util.Scanner;
public class GuessNumberGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Math.random()会随机产生一个0~1的随机数，所以*1000,产生的范围为1~1000
		int num1 = (int)(Math.random()*1000);//0 ~ 1000
		int count = 0;
		while (true){
			System.out.print("input please :");
			int num = sc.nextInt();
			if (num > num1){
				System.out.println("big!");
				count ++;
			}else if (num < num1){
				System.out.println("small!");
				count ++;
			}else{
				count++;
				System.out.println("you guess right!congratulation!you use " 
					+ count + "time to guess right!");
				break;
			}
		}
	}
}