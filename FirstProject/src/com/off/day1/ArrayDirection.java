package com.off.day1;

import java.util.Arrays;

public class ArrayDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data ={ 
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
		}; //����� �迭

		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				
				System.out.print(data[i][j]+ " ");
			}
		System.out.println();
		}
		//�����¿� ���� ������ �� ����� �ε��� ��(��,��,��,��)
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		//int[][]dirs = {{-1,0},{1,0},{0,-1},{0,1}};
		
		//data[2][2]�� �������� �����¿� �� ���
		for(int i=0;i<data.length;i++)
			for(int j=0; j<data[i].length;j++) {
					int value = data[i][j];// i,j�� ���� �����ϰ� �ִ� ��ǥ��
					if(i==0&j==0) {
						for(int k=0;k<4;k++) {
							//���ο� x,y��ǥ�� ���
							int nx = i+dx[k];
							int ny = j+dy[k];
							//nx,ny�� �迭 ���� ������ üũ �� �� ��� �Ұ�!\
							if(nx>=0&&nx<data.length && ny >=0 && ny<data.length)
							System.out.print(data[nx][ny]+ " ");
						}//k�� ���� 4�� ���� for
						
						
						
					}//if
			}//j
		
	}//i

}