package creational.templete.practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    void brew() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }

    @Override
     public boolean CustomerWantsCondiments(){
         String answer = "";

         System.out.print("커피에 우유와 설탕을 넣어 드릴까요? (y/n) : ");
         try(BufferedReader in =  new BufferedReader(new InputStreamReader(System.in))) {
             answer = in.readLine();
             return answer.toLowerCase().startsWith("y");

         } catch (IOException e) {
             System.out.println("IO 오류");
             throw new RuntimeException(e);
         }
    }
}

