package ex_08102024;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {

        int length1=10;
        int length2=20;
        int length3=10;
        if (length1==length2 && length2==length3 && length1==length3){
            System.out.println("triangle");
        } else if (length1==length2 || length2==length3 || length3==length1) {
            System.out.println("Rectangle");
        }
else {
            System.out.println("circle");
        }



    }


}


