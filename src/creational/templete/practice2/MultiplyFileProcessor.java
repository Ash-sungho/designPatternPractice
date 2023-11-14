package creational.templete.practice2;

public class MultiplyFileProcessor extends FileProcessor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult() {
        return 1; // 곱셈은 초기값이 0이면 결과값도 먹통이니까
    }

    @Override
    protected int caculate(int result, int number) {
        return result *= number;
    }
}
