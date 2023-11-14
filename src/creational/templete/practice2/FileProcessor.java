package creational.templete.practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileProcessor {
    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    //템플릿 메소드 (오버라이딩 못하게 final로 처리)
    public final int process() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int result = getResult();
            String line = null;

            while ((line = br.readLine()) != null) {
                result = caculate(result, Integer.parseInt(line));
            }
            return result;

        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    protected abstract int getResult();
    protected abstract int caculate(int result, int number);

}
