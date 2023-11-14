package creational.templete.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyProcessor {
    private String path; //생성자로부터 파일 경로를 받아와 저장

    public MultiplyProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            //파일에 있는 각 라인의 숫자값들을 모두 덧셈
            while ((line = br.readLine()) != null) {
                result *= Integer.parseInt(line);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
}
