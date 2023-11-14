package creational.templete.practice2;

public class Client {
    public static void main(String[] args) {
        String filePath = "src/creational/templete/practice/number.txt";
        PlusFileProcessor fileProcessor = new PlusFileProcessor(filePath);
        int plusResult = fileProcessor.process();
        System.out.println("plusResult = " + plusResult);

        MultiplyFileProcessor multiplyFileProcessor = new MultiplyFileProcessor(filePath);
        int multiplyResult = multiplyFileProcessor.process();
        System.out.println("multiplyResult = " + multiplyResult);

    }
}
