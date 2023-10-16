package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
        System.out.print("Introduceti un numar");
        int n=scanner.nextInt();
        int x=0;
        for(int i=1;i<=n;i++){
            x=i;
            for(int j=1;j<i-1;j++){
                x=x*i;
            }
            System.out.println(x);
        }
    }
}
