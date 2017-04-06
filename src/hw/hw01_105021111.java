package hw;
/*
* Topic: 建立一個Student 的類別，並用 ArrayList 進行管理，使用者可以一直輸入，
* 直到使用者按 N or n 才結束Student 的類別裡有 name,
* id 及 score 三個資料成員，同學在加入student 物件之後要能依 student 的 score 進行遞減排序
* Date: 2017/03/31
* Author: 10502111 林孟璇
*/
import java.util.Scanner;
import java.util.ArrayList;
public class hw01_105021111 {

	public static void main(String[] args) {
		ArrayList<Student> stuData = new ArrayList<Student>();
		Scanner scn = new Scanner (System.in);
		while (true){
			System.out.println("Please enter the information");
			System.out.print("Name, ID, Score .");
			stuData.add(new Student(scn.next(),scn.next(),scn.nextInt()));
			for(int i=0; i<stuData.size();i++){
                for(int j=i+1;j<stuData.size();j++){
                    if(stuData.get(i).getScore()<stuData.get(j).getScore()){
                        Student tmp = stuData.get(i);
                        stuData.set(i, stuData.get(j));
                        stuData.set(j,tmp);
                    }
                }
            }
			System.out.println();
			for(int i=0; i<stuData.size();i++){
				System.out.println(stuData.get(i).getInfo());		
			}
			System.out.println();
		}
	}
}
