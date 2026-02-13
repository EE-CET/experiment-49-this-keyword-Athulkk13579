import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThisDemo demo = new ThisDemo();

        int val = scanner.nextInt();
        demo.setValue(val);
        demo.display();
        
        scanner.close();
    }
}
