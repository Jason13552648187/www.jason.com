import java.util.Scanner;
public class Composition{
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);
		/*
			顺序结构：
				就是程序的顺序的依次往下执行。
		*/

		/*double pi = 3.14;

		double r=5.0 , s ,l;

		s = r * pi * pi;
		l = 2 * pi * r;
		System.out.println("圆的面积为" + s  + "圆的周长为：" + l);
		//圆的面积为49.298圆的周长为：31.400000000000002
		System.out.println("---------------------");
		//单分支
		
		int num1 = sc.nextInt();
		if (num1 > 12){
			System.out.println("num1 > 12");
		}
*/
		/*System.out.println("----------------");

		//双分支结构
		System.out.print("input num2 value please:");
		int num2 = sc.nextInt();
		if (num2 > 50){
			System.out.println("很给力！");
		}else{
			System.out.println("不给力！");
		}

		System.out.println("");*/
		/*/System.out.println("---------------------");
		//多分支选择结构
		System.out.print("请输入一个分数：");
		int num3 = sc.nextInt();
		if (num3 >= 90 && num3 <100){
			System.out.println("优秀！");
		}else if (num3 >= 80  && num3 < 90){
			System.out.println("良好！");
		}else if (num3 >= 70 && num3 < 80){
			System.out.println("良！");
		}else if (num3 >= 60 && num3 <70){
			System.out.println("及格！");
		}else if (num3 >= 50 && num3 < 60){
			System.out.println("补考！");
		}else if(num3 > 100  || num3 < 0){
			System.out.println("输入不合法！");
		}
		int y ;
		System.out.print("input  a Int type value :");
		int x = sc.nextInt();

		if (x > 10  && x < 36){
			y = x +7;
			System.out.println("y=" + y);
		}else if (x > 120 && x < 135){
			y = x - 3*x;
			System.out.println("y=" + y);
		}else if (x > 36){
			y = x * x;
			System.out.println("y=" + y);
		}else  if (x < 0){
			y = -x;
			System.out.println("y=" + y);
		}
		*/
		//System.out.println("-------------------");
		/*
			switch....case.......
			这种是有限制范围的判断，只能去某些特殊情况，不能覆盖很广的范围
		
		int y;
		int x = sc.nextInt();
		switch (x){
			case 70:
				y = x +7;
				System.out.println("y=" + y);
				break;
			case 80:
				y = x - 3*x;
				System.out.println("y=" + y);
				
			case 90:
				y = x * x;
				System.out.println("y=" + y);
				break;
		}
		*/









			/*System.out.print("请输入起始地：");
			String  first  = sc.nextLine();
			System.out.print("请输入目的地：");
			String last = sc.nextLine();
			String passtat = "";

			int count = 0;
			switch (first){
				case "棠下":
						passtat="棠下->";
						System.out.println("棠下开车");
						count ++;
						if(last.equals("棠下")){
							
							break;
						}
				case "学院":	
						passtat+="学院->";
						System.out.println("学院到了");
						count ++;
						if(last.equals("学院")){
							
							break;
						}
				case "上社":
						passtat+= "上社->";
						System.out.println("上社到了");
						count ++;
						if(last.equals("上社")){
							
							break;
						}
				case "华景新城":
						passtat+= "华景新城->";
						System.out.println("华景新城到了");
						count ++;
						if(last.equals("华景新城")){
						
							break;
						}
				case "师大暨大":
						passtat+="师大暨大->";
						System.out.println("师大暨大到了");
						count ++;
						if(last.equals("师大暨大")){
							
							break;
						}
				case "石牌桥":
						passtat+="石牌桥";
						System.out.println("终点站石牌桥");
						count ++;
						if(last.equals("石牌桥")){
							
							break;
						}
				}
				System.out.println("你本次坐了" + count +"站，的旅程是：\n" + passtat);
			*/
		int week = 1;
        switch (week)
        {
            case 1:
                System.out.println(week+"对应的是星期一");
                break;
            case 2:
                System.out.println(week+"对应的是星期二");
                break;
            case 3:
                System.out.println(week+"对应的是星期三");
                break;
            case 4:
                System.out.println(week+"对应的是星期四");
                break;
            case 5:
                System.out.println(week+"对应的是星期五");
                break;
            case 6:
                System.out.println(week+"对应的是星期六");
                break;
            case 7:
                System.out.println(week+"对应的是星期日");
                break;
            default :
                System.out.println(week+"没有对应的星期");
                break;      
        } 

	}
}