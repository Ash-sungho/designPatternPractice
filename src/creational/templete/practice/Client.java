package creational.templete.practice;

public class Client {

    public static void main(String[] args) {
        String filePath = "src/creational/templete/practice/number.txt";
        FileProcessor fileProcessor = new FileProcessor(filePath);


        int result = fileProcessor.process();
        System.out.println("result = " + result);

    }
}
