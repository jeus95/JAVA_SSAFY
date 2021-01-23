package com.off.day1;

import java.util.Arrays;
//4방 탐색을 해서 그값을 더해서 출력
public class ArrayDirectionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data ={ 
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
			{1,2,3,4,5},
		}; //사용할 배열

		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				
				System.out.print(data[i][j]+ " ");
			}
		System.out.println();
		}
		//상하좌우 방향 접근할 떄 사용할 인덱스 값(상,하,좌,우)
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		//int sum=0;
		//int[][]dirs = {{-1,0},{1,0},{0,-1},{0,1}};
		
		//data[2][2]를 기준으로 상하좌우 값 출력
		for(int i=0;i<data.length;i++) {
			
			for(int j=0; j<data[i].length;j++) {
				
					int value = data[i][j];// i,j는 현재 접근하고 있는 좌표값
					int sum = 0;
					int cnt = 0;	
						for(int k=0;k<4;k++) {
							//새로운 x,y좌표값 계산
							
							int nx = i+dx[k];
							int ny = j+dy[k];
							//nx,ny가 배열 안의 값인지 체크 한 후 출력 할것!\
							if(nx>=0&&nx<data.length && ny >=0 && ny<data.length)
							{
								sum += data[nx][ny];
								cnt++;
							}
								
						}//k로 도는 4방 접근 for
						
						System.out.println(cnt+" "+ sum + " ");
						
				
			}//j
			//System.out.print(sum);
	}//i
		
}
	}
