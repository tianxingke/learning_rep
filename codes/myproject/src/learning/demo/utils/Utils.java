package learning.demo.utils;

public class Utils {

	/**
	 * �ж��Ƿ��Ѿ�����
	 * 
	 * @param temp
	 * @return
	 */
	public static boolean isSorted(int[] temp) {
		boolean flag = true;
		for (int i = 0; i < temp.length - 1; i++) {
			if (temp[i] > temp[i + 1])
				flag = false;
		}
		System.out.println(" ����״̬ :  " + ( flag ==true ? "������":"δ����"));
		return flag;
	}

	public static void printNums(int[] temp) {
		System.out.println("BEGIN: ");
		for (int i : temp) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("END: ");

	}

	public static void swap(int[] a ,int i ,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
