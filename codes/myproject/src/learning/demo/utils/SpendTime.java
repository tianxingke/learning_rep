package learning.demo.utils;


/**
 * 
 * @author tianxingke
 *
 */
public class SpendTime {
	
	/**
	 * ����ʱ��ת�����׶��ĸ�ʽ
	 * @param startTime
	 * @param endTime
	 */
	public static void getSpendTime(Object startTime ,Object endTime){
		long start= Long.valueOf(startTime.toString());
		long end = Long.valueOf(endTime.toString());
		
		System.out.println("ִ�����ķ�ʱ�� �� " +String.valueOf(end - start));
	}

}
