package _03_behavioral_patterns._10_template_method._03_after2;

public class Client {

    public static void main(String[] args) {
        FileProcessor plus = new FileProcessor("number.txt");
        // Anonymous
        int result1 = plus.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });
        System.out.println(result1);

        // Lambda
        FileProcessor multiply = new FileProcessor("number.txt");
        int result2 = multiply.process((result, number) -> result *= number);
        System.out.println(result2);
    }
}
