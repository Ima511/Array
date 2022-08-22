package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String [] students = new String[5];
//        students[1]= "Abhay";
//        students[0] = "Kumar";
//        students[2] = "Jha";
//        students[3] = "Raaj";
//        students[4] = "Antharthiya";
//
//        System.out.println(students[2]);
//
//        String [] employee = {"Abhay", "Kumar", "Jha", "Raaj", "Antharthiya"};
//        int [] numebr = {1,1,2,2,3,4,5,5,6,7,8};
//
//        for(int i =0; i<numebr.length; i++){
//            System.out.println(numebr[i]);
//        }

        String [] names = {"Meisam", "Sarah", "Tom", "Brad", "Brian"};
        int [] numbers = {13456, 54665, 077045,21654, 894045 };
        for(int i =0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for(int i =0; i< names.length; i++){
            if(name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
     }
}
