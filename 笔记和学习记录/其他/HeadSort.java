package com.test.paixu;

import com.test.utils.Utils;

/**
 * �����򣬲�ʹ���±�0�������1��ʼ
 * 
 * @author tianxingke
 * 
 */
@SuppressWarnings("all")
public class HeadSort {

	public HeadSort() {

	}

	/**
	 * �ϸ�
	 * 
	 * @param a
	 */
	public static void swim(int[] arr, int index) {
		int N = arr.length-1;

		while (index > 0 && index <= N) {
			int left = index*2;
			int right = index*2 +1;
			
			//����������û��������
			if(left<=N&&right>N){
				if(arr[left]>arr[index]	)
					Utils.swap(arr, left, index);
			}
			//��������Ҳ��������
			if(left<=N && right<=N){
				int max ;
				max=(arr[left]-arr[right]<0?right:left);
				if(arr[max]>arr[index])
					Utils.swap(arr, index, max);
			}
			
			index=index/2;
		}

	}

	/**
	 * �³�
	 * 
	 * @param a
	 * @param n
	 */
	public static void sink(int[] a, int n) {
		int N = a.length;
		while ((a[n] < a[2 * n] || a[n] < a[2 * n + 1]) && n <= N) {
			if (a[2 * n] > a[2 * n + 1])
				Utils.swap(a, n, 2 * n);
			else
				Utils.swap(a, n, 2 * n + 1);
		}
	}

	/**
	 * ��������
	 * 
	 * @param a
	 */
	public static void bulidMaxHeap(int[] arr) {
		int length = arr.length;
		// �ȴ����һ���ڵ�Ԫ�صĸ��ڵ㿪ʼ
		for(int i=length/2;i>0;i--){
			swim(arr,i);
		}

	}

	public static void mainHeapSort(int[] arr) {
		int length = arr.length;
		bulidMaxHeap(arr);

	}

	public static void main(String[] args) {

		int[] arrtemp = { 3, 5, 8, 4, 2, 7, 6, 1, 9, 13, 12, 11 };//12��
		int[] arr =new int[arrtemp.length+1];
		for(int i=0;i<arrtemp.length;i++){
			arr[i+1]=arrtemp[i];
					
		}
		System.out.println("����ǰ:");
		Utils.printNums(arr);
		mainHeapSort(arr);
		System.out.println("�����:");
		Utils.printNums(arr);
	}

}
