package pl.akademia108;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {

            int b = i % 3;
            int c = i % 5;
            if (b == 0 && c == 0){
                System.out.println(i + " FooBar");
            } else if(b == 0) {
                System.out.println(i + " Foo");
            } else if(c == 0) {
                System.out.println(i + " Bar");
            }
        }
    }
}
