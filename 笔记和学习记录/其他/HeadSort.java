package com.demo.algorithm;

import com.utils.Utils;

/**
 * �����򣬲�ʹ���±�0�������1��ʼ
 * 
 * @author tianxingke 2016/9/2
 * 
 */
@SuppressWarnings("all")
public class HeapSort {

	public HeapSort() {

	}

	/**
	 * �ϸ�
	 * 
	 * @param a
	 */
	public static void swim(int[] arr, int index) {
		int N = arr.length - 1;
		int target = 1;
		while (index > 0 && index <= N) {
			int left = index * 2;
			int right = index * 2 + 1;

			// ����������û��������
			if (left <= N && right > N) {
				if (arr[left] > arr[index])
					Utils.swap(arr, left, index);
				else
					break;
				target = left;
			}
			// ��������Ҳ��������
			if (left <= N && right <= N) {
				int max;
				max = (arr[left] - arr[right] < 0 ? right : left);
				if (arr[max] > arr[index])
					Utils.swap(arr, index, max);
				else
					break;
				target = max;
			}
			sink(arr, target, arr.length - 1);
			index = index / 2;
		}

	}

	/**
	 * �³�
	 * 
	 * @param a
	 * @param n
	 */
	public static void sink(int[] arr, int index, int len) {
		int N = len;
		int max;
		while ((index * 2 <= N || index * 2 + 1 <= N) && index >= 1) {
			int left = index * 2;
			int right = index * 2 + 1;
			// ����������û��������
			if (left <= N && right > N) {
				if (arr[left] > arr[index])
					Utils.swap(arr, left, index);
				else
					break;
				sink(arr, left, len);
			}

			// ��������Ҳ��������
			if (left <= N && right <= N) {
				if (arr[index] < arr[left] || arr[index] < arr[right]) {
					max = (arr[left] - arr[right] < 0 ? right : left);
					Utils.swap(arr, index, max);
					sink(arr, max, len);
				} else {
					break;
				}
			}

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
		for (int i = length / 2; i > 0; i--) {
			swim(arr, i);
		}

	}

	public static void mainHeapSort(int[] arr) {
		int length = arr.length;
		bulidMaxHeap(arr);
		swapLastIndex(arr);
	}

	/**
	 * ����������Ѻ�ѭ���������һ��Ԫ�غ͵�һ��Ԫ�صĽ������������³�����
	 * 
	 * @param arr
	 */
	private static void swapLastIndex(int[] arr) {
		int N = arr.length;
		for (int i = N - 1; i > 1; i--) {

			Utils.swap(arr, 1, i);
			sink(arr, 1, i - 1);
			if (arr[1] < arr[i - 1])
				return;
			System.out.println("��ǰN�� " + i);
			Utils.printNums(arr);
		}
	}

	public static void main(String[] args) {

		int[] arrtemp = { 3, 5, 8, 4, 2, 7, 6, 1, 9, 13, 12, 11 };// 12��
		int[] arr = new int[arrtemp.length + 1];
		for (int i = 0; i < arrtemp.length; i++) {
			arr[i + 1] = arrtemp[i];

		}
		System.out.println("����ǰ:");
		Utils.printNums(arr);
		mainHeapSort(arr);
		System.out.println("�����:");
		Utils.printNums(arr);
	}

}
