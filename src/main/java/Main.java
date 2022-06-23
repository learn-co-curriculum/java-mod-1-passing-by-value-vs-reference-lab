public class Main {
    public static void main(String[] args) {
        Container num = new Container();
        multiply(num, 5, 5);
        System.out.print("Result = " + num.number);

        System.out.println(" ");

        //Container str = new Container();
        //str.text = "Some text ";
        String str = "Some text ";
        appendText(str, "text to be appended");
        //System.out.println("appended text: " + str.text);
        System.out.println("appended text: " + str);
    }
    private static void appendText(String string, String string2) {
        //string.text = string.text + string2;
        string = string + string2;
    }
    public static void multiply(Container result, int x, int y) {
        result = new Container();
        result.number = x * y;
    }
}
