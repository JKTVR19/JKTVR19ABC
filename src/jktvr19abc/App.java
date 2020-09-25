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
    public void run() {
            /**
         * Создаем массив char c алфавитом abc[33];
         * Просим пользователя ввести строку str
         * Проходим по массиву abc и ищем индекс вхождения этого символа в str.
         * Если возвращается -1, то такого символа нет -> записываем его в массив 
         * нехватающих символов notAbc[33];
         * если -1 не встречался, то текст содержит все буквы алфавита. 
         * если -1 сработал, то выводим набор символов, которые отсутствуют в тексте.
         */
        /*int summ = 0;*/

        Scanner input= new Scanner(System.in);
           System.out.println("ввести текст (фразу) латиницей: ");
           String st = input.nextLine();
           /*System.out.println(st);*/
           String stL = st.toLowerCase();
           /*Метод toLowerCase()
            *Преобразует все буквы в строке к нижнему регистру.
            *Метод toLowerCase не применяется к знакам, отличным от букв.*/

           System.out.println("Введите алфавит или набор символов для проверки на их наличие в предыдущем тексте (фразе): ");
           String abc = input.nextLine(); 
          /* System.out.println(abc);*/
           String abcL = abc.toLowerCase();

           String stNew = stL.replaceAll("\\s+","");
           /*stL.replaceAll("\\s+","")
           **/
           /*char []c=stNew.toCharArray();*/
           
           String abcNew = abcL.replaceAll("\\s+","");
           char []a=abcNew.toCharArray();
           /*dataType[] notABC; убирает пробелы(//) в строке(s) -
           * → заменяет их на ""(пусто).
           */
           char[] notABC =new char[26];
           
           int i=0;
           String aa ;
           /*водится строковая переменная для просвоения ей елемента 
           *массива a[j]. что бы применить метод isContain = stNew.contains(aa)
           *который проверяет наличие в строке "stNew" строки "аа" */
           boolean isContain;
           /**вводим булевую переменнуя isContain, используется в isContain = stNew.contains(aa)
            * и принимает значение 'true' or 'false'*/
           
            for(int j=0;j<a.length;j++){
                /*Character.toString(a[j]) переводит в строку (string) a[j](char)
                *требуется для isContain = stNew.contains(aa)
                *где сравниваются строки*/
                aa = Character.toString(a[j]);
                
                isContain = stNew.contains(aa);
                
                if(isContain == false){
                   notABC[i] = a[j]; 
                    ++i;
                }else{
                    
                    }
                }

          System.out.println("\nВведённая фраза: "+st);
          System.out.println("Введённая фраза без пробелов в нижнем регистре: "+stNew);
          System.out.println("\nАлфавит или набор символов для проверки: "+abc);
          System.out.println("Алфавит... без пробелов в нижнем регистре: "+abcNew);
          
          /*System.out.println("в слове '"+st+"' буква 'а' встречаеться "+summ+" раз");*/
          System.out.println("\nВ введённой фразе отсутствуют символы: "+Arrays.toString(notABC));
          /*Arrays.toString(notABC) переводит массив notABC(char) в строку*/
          /*System.out.println("В введённой фразе отсутствуют символы: "+notABC);*/
      
    }
}


