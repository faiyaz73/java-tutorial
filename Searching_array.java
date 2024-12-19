//check the value available in my array


import java.util.Scanner;

public class Searching_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [] arr={23,45,66,78,32,78,96};

        System.out.println("Welcome to array searching \n");

        System.out.println("Enter your number search :  ");

        int num=input.nextInt();




        boolean isFound=isFound(arr,num);

        if(isFound){
            System.out.println("your number is found");
        }else {
            System.out.println("your number is not found");
        }


    }
    public static boolean isFound(int [] arr, int num){          // this is a methods
        int index=0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
    }
    return false;
}
}
