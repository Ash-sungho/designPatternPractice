package creational.templete.practice2;

public class PlusFileProcessor extends FileProcessor{

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    protected int getResult() {
        return 0;
    }

    @Override
    protected int caculate(int result, int number) {
        return result += number;
    }
}
