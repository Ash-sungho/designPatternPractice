package creational.templete.practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{

    @Override
    void addCondiments() {
    }

    @Override
    void brew() {
        System.out.println("차를 우리는 중");
    }

}

