package learning.demo.utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomNum {

	private static List<Integer> RandomNum(int count) {
		List<Integer> numList = new ArrayList<Integer>();
		Random random = new Random(count);
		for (int i = 0; i < count; i++) {
		
			int temp = random.nextInt(count);
			numList.add(temp);
		}
		return numList;
	}
	
	/**
	 * ��������������
	 * @param count ָ�������С
	 * @return
	 */
	public static int[] getRandomNums(int count){
		return ListToArray.listToIntegerArray(RandomNum(count));
	}

}
