/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19abc;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juri
 */
public class App {
    public void run(char[] notABC) {
            /**
         * Создаем массив char c алфавитом abc[33];
         * Просим пользователя ввести строку str
         * Проходим по массиву abc и ищем индекс вхождения этого символа в str.
         * Если возвращается -1, то такого символа нет -> записываем его в массив 
         * нехватающих символов notAbc[33];
         * если -1 не встречался, то текст содержит все буквы алфавита. 
         * если -1 сработал, то выводим набор символов, которые отсутствуют в тексте.
         */
        int summ = 0;       
        Scanner input= new Scanner(System.in);
           System.out.println("ввести текст (фразу) латиницей: ");
           String st = input.nextLine().toLowerCase();           
           System.out.println(st);
           
           System.out.println("Введите алфавит или набор символов для проверки на их наличие в предыдущем тексте (фразе): ");
           String abc = input.nextLine().toLowerCase();           
           System.out.println(abc);
           
           String stNew = st.replaceAll("\\s+","");
           char []c=stNew.toCharArray();
           
           String abcNew = abc.replaceAll("\\s+","");
           char []a=abcNew.toCharArray();
           //dataType[] notABC;
           char []notABS = { };
           
            for(int j=0;j<a.length;j++){
                
                String aa = Character.toString(a[j]);
                boolean isContain = stNew.contains(aa);
                if(isContain == false){
                   int i=0;
                   notABC[i] = a[j]; 
                }
                
            }
           
          System.out.println("Введённая фраза: "+st);
          System.out.println("Введённая фраза без пробелов в нижнем регистре: "+stNew);
          System.out.println("Алфавит иди набор символов для проверки: "+abc);
          System.out.println("Алфавит... без пробелов в нижнем регистре: "+abcNew);
          
          /*System.out.println("в слове '"+st+"' буква 'а' встречаеться "+summ+" раз");*/
          System.out.println("В введённой фразе отсутствуют символы: "+Arrays.toString(notABC));
    }


    
}

/*for(byte i = 0;i<tempInYear.length;i++){
            System.out.printf("%2d| ",i+1);
            for(byte j = 0; j < tempInYear[i].length;j++){
                System.out.printf("%4d",tempInYear[i][j]);
                if(tempInYear[i][j]<minT)minT = tempInYear[i][j];
                if(tempInYear[i][j]>maxT)maxT = tempInYear[i][j];
            }
            System.out.println();
        }*/
