import java.util.Scanner;
public class Composition{
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);
		/*
			˳��ṹ��
				���ǳ����˳�����������ִ�С�
		*/

		/*double pi = 3.14;

		double r=5.0 , s ,l;

		s = r * pi * pi;
		l = 2 * pi * r;
		System.out.println("Բ�����Ϊ" + s  + "Բ���ܳ�Ϊ��" + l);
		//Բ�����Ϊ49.298Բ���ܳ�Ϊ��31.400000000000002
		System.out.println("---------------------");
		//����֧
		
		int num1 = sc.nextInt();
		if (num1 > 12){
			System.out.println("num1 > 12");
		}
*/
		/*System.out.println("----------------");

		//˫��֧�ṹ
		System.out.print("input num2 value please:");
		int num2 = sc.nextInt();
		if (num2 > 50){
			System.out.println("�ܸ�����");
		}else{
			System.out.println("��������");
		}

		System.out.println("");*/
		/*/System.out.println("---------------------");
		//���֧ѡ��ṹ
		System.out.print("������һ��������");
		int num3 = sc.nextInt();
		if (num3 >= 90 && num3 <100){
			System.out.println("���㣡");
		}else if (num3 >= 80  && num3 < 90){
			System.out.println("���ã�");
		}else if (num3 >= 70 && num3 < 80){
			System.out.println("����");
		}else if (num3 >= 60 && num3 <70){
			System.out.println("����");
		}else if (num3 >= 50 && num3 < 60){
			System.out.println("������");
		}else if(num3 > 100  || num3 < 0){
			System.out.println("���벻�Ϸ���");
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
			�����������Ʒ�Χ���жϣ�ֻ��ȥĳЩ������������ܸ��Ǻܹ�ķ�Χ
		
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









			/*System.out.print("��������ʼ�أ�");
			String  first  = sc.nextLine();
			System.out.print("������Ŀ�ĵأ�");
			String last = sc.nextLine();
			String passtat = "";

			int count = 0;
			switch (first){
				case "����":
						passtat="����->";
						System.out.println("���¿���");
						count ++;
						if(last.equals("����")){
							
							break;
						}
				case "ѧԺ":	
						passtat+="ѧԺ->";
						System.out.println("ѧԺ����");
						count ++;
						if(last.equals("ѧԺ")){
							
							break;
						}
				case "����":
						passtat+= "����->";
						System.out.println("���絽��");
						count ++;
						if(last.equals("����")){
							
							break;
						}
				case "�����³�":
						passtat+= "�����³�->";
						System.out.println("�����³ǵ���");
						count ++;
						if(last.equals("�����³�")){
						
							break;
						}
				case "ʦ���ߴ�":
						passtat+="ʦ���ߴ�->";
						System.out.println("ʦ���ߴ���");
						count ++;
						if(last.equals("ʦ���ߴ�")){
							
							break;
						}
				case "ʯ����":
						passtat+="ʯ����";
						System.out.println("�յ�վʯ����");
						count ++;
						if(last.equals("ʯ����")){
							
							break;
						}
				}
				System.out.println("�㱾������" + count +"վ�����ó��ǣ�\n" + passtat);
			*/
		int week = 1;
        switch (week)
        {
            case 1:
                System.out.println(week+"��Ӧ��������һ");
                break;
            case 2:
                System.out.println(week+"��Ӧ�������ڶ�");
                break;
            case 3:
                System.out.println(week+"��Ӧ����������");
                break;
            case 4:
                System.out.println(week+"��Ӧ����������");
                break;
            case 5:
                System.out.println(week+"��Ӧ����������");
                break;
            case 6:
                System.out.println(week+"��Ӧ����������");
                break;
            case 7:
                System.out.println(week+"��Ӧ����������");
                break;
            default :
                System.out.println(week+"û�ж�Ӧ������");
                break;      
        } 

	}
}