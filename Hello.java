import java.util.*;
import java.io.*;

class ScaanerEx {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int i;
      //for (int n = scanner.nextInt(); n<10; n++){
      if (n >= 1 && n <= 9) {
        for (i=1; i<10; i++) {
            System.out.printf(n+ "*" +i+ "="+(n*i));
        }

      }
    }

}