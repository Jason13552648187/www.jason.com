import java.util.Date;
public class DateDemo{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);//Thu Dec 21 11:33:16 CST 2017  ����һ��Я��������Ϣ�Ķ���
		/*
			��
			��
			�գ���
			����
			ʱ
			��
			��
		*/
		//��ȡ��
		int year = date.getYear() + 1900;
		System.out.println(year);
		
		//��ȡ��
		int month = date.getMonth() + 1;
		System.out.println(month);

		//��ȡ��
		int  dat = date.getDate();//getDate();  1~ 31

		//��ȡ����
		int week = date.getDay();//0 ~ 6
		String str = "";
		switch (week){
			case 0:
				str = "������";
				break;
			case 1:
				str = "����һ";
				break;
			case 2:
				str = "���ڶ�";
				break;
			case 3:
				str = "������";
				break;
			case 4:
				str = "������";
				break;
			case 5:
				str = "������";
				break;
			case 6:
				str = "������";
				break;
		}

		//��ȡСʱ
		int hour = date.getHours();//0 ~ 23
		String hou = hour < 9 ? "0" + hour : "" + hour;
		
		//��ȡ����
		int minutes = date.getMinutes();//0~59
		String minu = minutes < 9 ? "0" + minutes : "" + minutes;

		//��ȡ����
		int second = date.getSeconds(); //0~59
		String sec = second < 9 ? "0" + second : "" + second;

		//2017��12��21�� ������  09:10:10
		System.out.println("����ʱ��Ϊ��" + year + "��" + month + "��" + dat + "��\t" + 
			str +  hou + ":" + minu + ":" + sec);		







		




	
	
	}
}