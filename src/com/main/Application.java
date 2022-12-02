package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String kesilenParca = S.substring(start,end);
        System.out.println(kesilenParca);
        
            
            
        


	}

}
