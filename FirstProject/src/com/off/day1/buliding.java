package com.off.day1;

import java.util.Arrays;
import java.util.Scanner;

public class buliding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int cntA=0;

		
		while(cntA<testCase) { //ÁÂ»ó,»ó,ÁÂ¿ì, ÁÂ, ¿ì, ÁÂÇÏ,ÇÏ,¿ìÇÏ
			int[] dx = {-1,-1,-1,0,0,1,1,1};
			int[] dy = {-1,0,1,-1,1,-1,0,1};
			int N = sc.nextInt();
			int Wmax=2;
			char[][] building = new char[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					char a = sc.next().charAt(0);
					building[i][j] =a;
					
					
				}
				
			}
	
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					int cnt=0;
					if(building[i][j]=='B') {
						int rowcnt=0;
						int colcnt=0;
						int sum=0;
						for(int k=0;k<8;k++) {
							int nx=i+dx[k];
							int ny=j+dy[k];

							
							if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
								if(building[nx][ny]=='G') 
										break;
									}
							cnt++;		
						}

				if(cnt==8) {
					
								for(int m=j-1;m>=0;m--) {
								
									if(building[i][m]=='B') {
										rowcnt++;
										
										
									}
								
									
								}
								for(int m=j+1;m<N;m++) {
									if(building[i][m]=='B') {
										rowcnt++;
										
									}
								
									
								}
								for(int m=i-1;m>=0;m--) {
									if(building[m][j]=='B') {
										colcnt++;
										
									}
									
									
									
								}
								
								for(int m=i+1;m<N;m++) {
									if(building[m][j]=='B') {
										colcnt++;
								
									}
									
									
								}

								sum=colcnt+rowcnt;
								
								if(sum>Wmax) {
									Wmax = sum;
									
									
								}
						}
				}
							
						
							
							
							
				}
						}
					
	
				
			cntA++;
			System.out.println("#" +cntA+" "+(Wmax+1));
		}
			
			
			
			

		sc.close();}
	}


