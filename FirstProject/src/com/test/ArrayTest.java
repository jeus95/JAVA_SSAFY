package com.test;

public class ArrayTest {

	public static void main(String[] args) {
		// �迭(������): ����, ����, ���
		int score;// ����
		score = 99;// ���

		// int[] scores;//����. �迭ũ�� �ָ� �ȵ�
		// scores = new int[5];//new Ű����� �迭 ����. �迭 ũ�� ����
		int[] scores = new int[5];// ����+����
		scores[0] = 90;// ���
		scores[1] = 70;
		scores[2] = 60;
		scores[3] = 80;
		scores[4] = 100;

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		int[] a = new int[100];//0
		double[] b= new double[200];//0.0
		boolean[] flag = new boolean[10];//false
		String[] msg = new String[10];//�������� �⺻ ���� .null
		// ����, ����, �ʱ�ȭ
		int[] scores2 = { 32, 58, 66, 79, 90 };

		// ���� for��
		for (int z : scores2) {
			System.out.println(z);
		}

		// 1.names: �迭�ȿ� ����̸� 5�� �ֱ�
		// 2.�迭���� �� ������ ȭ�鿡 ���(���� for�� ����� ��)
		String[] names = { "�̼���", "�������", "�̼���", "����ö", "ö��" };

		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println(names.length);//�迭�� ũ��

	}

}
