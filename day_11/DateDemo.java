import java.util.Date;
public class DateDemo{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println(date);//Thu Dec 21 11:33:16 CST 2017  这是一个携带日期信息的对象。
		/*
			年
			月
			日，号
			星期
			时
			分
			秒
		*/
		//提取年
		int year = date.getYear() + 1900;
		System.out.println(year);
		
		//提取月
		int month = date.getMonth() + 1;
		System.out.println(month);

		//提取日
		int  dat = date.getDate();//getDate();  1~ 31

		//提取星期
		int week = date.getDay();//0 ~ 6
		String str = "";
		switch (week){
			case 0:
				str = "星期日";
				break;
			case 1:
				str = "星期一";
				break;
			case 2:
				str = "星期二";
				break;
			case 3:
				str = "星期三";
				break;
			case 4:
				str = "星期四";
				break;
			case 5:
				str = "星期五";
				break;
			case 6:
				str = "星期六";
				break;
		}

		//提取小时
		int hour = date.getHours();//0 ~ 23
		String hou = hour < 9 ? "0" + hour : "" + hour;
		
		//提取分钟
		int minutes = date.getMinutes();//0~59
		String minu = minutes < 9 ? "0" + minutes : "" + minutes;

		//提取秒数
		int second = date.getSeconds(); //0~59
		String sec = second < 9 ? "0" + second : "" + second;

		//2017年12月21号 星期四  09:10:10
		System.out.println("现在时间为：" + year + "年" + month + "月" + dat + "号\t" + 
			str +  hou + ":" + minu + ":" + sec);		







		




	
	
	}
}