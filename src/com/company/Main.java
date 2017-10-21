package com.company;

import com.sun.xml.internal.ws.server.provider.AsyncProviderInvokerTube;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // task with variables
        int x,y;
	    System.out.println("Enter first number x:");
        x=in.nextInt();
        System.out.println("Enter second number y:");
        y=in.nextInt();
        System.out.println("Sum x+y:"+(x+y));


        //======================================
      /*  System.out.println("Enter size of massif :");
        int count =in.nextInt();
        int []Mas = new int[count];
        for (int i=0;i<count;i++)
        {
            System.out.println("Enter element of massif :");
            Mas[i]=in.nextInt();
        }

        //-----------Task#1
        System.out.println("Positive numbers:");
        for (int i=0;i<count;i++)
        {
           if (Mas[i]>0 ){
               System.out.println(Mas[i]);
           }
        }*/
        //-----------Task#2
       /* System.out.println("Multiply of all odd elements to 2:");
        System.out.println(Mas[0]);
        for (int i=1;i<count;i=i+2)
        {
            Mas[i]*=2;
            System.out.println(Mas[i]);
            if( i!=count-1) {
                System.out.println(Mas[i+1]);
            }
        }*/

        //-----------Task#3
       /* int sum=0;
       for (int i:Mas){
         sum=sum+i;
       }
        System.out.println("Amount of elements of massif sum ="+sum);
        */
        //-----------Task#4
        /*int max=0;
        for (int i:Mas){
            if (i>max) { max= i;}

        }
        System.out.println("Maximum element of massif ="+max);
        */
        //-----------Task#5
        /*int l=1;
        System.out.println("Odd numbers:");
        while(l <10){
            System.out.println(l);
            l+=2;

        }*/
        //-----------Task#6
       /* System.out.println("Enter first number n:");
        int n =in.nextInt();
        if ((n%2)==0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }*/
        //-----------Task#7 //[1;10]
        /*int[] Mas = new int[8];
        int[] Mas2 = new int[8];
        int lowBorder = 1;
        int highBorder = 10;
        System.out.println(" Old massiff");
        for (int i = 0; i < 8; i++) {
            Mas[i] = lowBorder + (int) (Math.random() * highBorder);
            System.out.print(Mas[i]);
            System.out.print(" ");
        }
        System.out.println('\n'+" New massiff");
        for (int i = 0; i < 8; i++) {
            if (!((i % 2) == 0) && (i!=0)) {
                Mas2[i] = 0;
            } else {
                Mas2[i] = Mas[i];
            }
            System.out.print(Mas2[i]);
            System.out.print(" ");
        }*/
        //-----------Task#8---[-5;5] random(0,1)
      /*  int[][] Mas3 = new int[7][4];
        int []line =new int[7];
        int lowBorder2 = -5;
        int highBorder2 = 10;
        System.out.println(" Old massiff");
        for (int i = 0; i < 7; i++) {
            for(int j=0;j<4;j++) {
                Mas3[i][j] = lowBorder2 + (int) (Math.random() * highBorder2);
                System.out.print(Mas3[i][j]);
                System.out.print(" ");
            }
            System.out.print('\n'+" ");
        }
        for (int i = 0; i < 7; i++) {
            int temp=1;
            for(int j=0;j<4;j++) {
                temp *=Mas3[i][j];
                }
            line[i]=Math.abs(temp);

        }
        int MaxValue=line[0];
        int LineIndex=0;
        for (int i = 1; i < 7; i++){
            if (MaxValue < line[i]){
               MaxValue=line[i];
               LineIndex=i;}
        }
        System.out.print('\n'+" Line index:");
        System.out.print(LineIndex);
        */
      //-----------Task9
       /* System.out.println("Enter natural number n:");
        int nv =in.nextInt();
        int i=10;
        int sum=0;
         while ((nv/i)>10){

                sum = sum + ((nv % i) / (i / 10));
                i *= 10;

                //5728%10=8                  5728/10=572>10
                //5728%100=28   28/10=2      5728/100=57>10
                //5728%1000=728  728/100=7   5728/1000=5<10
            //5+7+2+8=22
            }
            sum= sum+(nv/i)+((nv%i) /(i /10));

            System.out.print(sum);
            */
        //-----------Additional Task# 1--- Bubble sort
      /*  System.out.print('\n'+" Before buble sort:");
        for (int i=0;i<count;i++)
        {
            System.out.print(Mas[i]);
            System.out.print(" ");
        }
        for(int i=0 ;i<count;i++){
            for(int j=count-1 ;j>i;j--){
                if ( Mas[j-1] > Mas[j] ) {
                    int temp = 0;
                    temp = Mas[j - 1];
                    Mas[j - 1] = Mas[j];
                    Mas[j] = temp;
                }
            }

        }
        System.out.print('\n'+" After buble sort:");
        for (int i=0;i<count;i++)
        {
            System.out.print(Mas[i]);
            System.out.print(" ");
        }
        */
        //-----------Additional Task# 2_1--- Fibonachi consequence
       /*int[] Fibon=new int[11];
         Fibon[0]=1;
        Fibon[1]=1;
        System.out.print('\n'+" Fibonachi consequence:");

        for(int i=2 ;i<11;i++){
            Fibon[i]=Fibon[i-1]+Fibon[i-2];

        }
        for (int i=0;i<11;i++)
        {
            System.out.print(Fibon[i]);
            System.out.print(" ");
        }*/
        //-----------Additional Task# 2_1--- interval(-1;1)
      /*  int lowBorder = -1;
        int highBorder = 2;
        int [] Massive=new int[11];
        int [] Counter=new int[3];
        System.out.println('\n'+"  massiff");
        for (int i = 0; i < 11; i++)
        {
            Massive[i] = lowBorder + (int) (Math.random() * (highBorder-lowBorder));
            System.out.print(Massive[i]);
            System.out.print(" ");
        }
        for (int i = 0; i < 11; i++)
        {
            if (Massive[i]==0)
            {
                Counter[0] += 1;
            }
            else {
                if (Massive[i]==1)
                {
                    Counter[1]+=1;
                }
                else
                {
                    Counter[2]+=1;
                }
            }

        }



        int max =Counter[0];
        int k=0;
            boolean temp=false;
            for (int i=1 ;i<3 ;i++)
            {
                if( max< Counter[i])
                {
                    max= Counter[i];
                    k=i;
                }
            }
            for (int j=1 ;j<3 ;j++)
            {
                if ((j!=k)&&(max== Counter[j]))
                {
                    System.out.print('\n'+"Amount of More than 2 numbers are equal ");
                    temp =true;
                }

            }
            if (!temp){
            System.out.print('\n'+"Amount of this value is the most: " );
            System.out.print(k);
            }



*/


    //-----------Additional Task# 3---
     /*   System.out.println("Enter natural number n:");
        int n =in.nextInt();
        for (int i=1 ;i<=n;i++)
        {
            if ((n%i)==0)
             {
                System.out.print(i);
                System.out.print(" ");
            }
        }*/
    }
}


