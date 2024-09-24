package _03_behavioral_patterns._10_template_method._02_after1;

public class Plus extends FileProcessor {

    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int number) {
        return result += number;
    }
}
