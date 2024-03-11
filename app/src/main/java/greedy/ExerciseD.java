// This is the exercise D:
// The explanation it's on the README.md file.

package greedy;

import java.util.Scanner;

public class ExerciseD {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int c = scanner.nextInt();
      for (int index = 1; index <= c; ++index) {
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
          a[i] = scanner.nextInt();

        int mx = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
          if (counter + a[i] <= q && i + 1 <= p) {
            counter += a[i];
            mx = i + 1;
          } else {
            break;
          }
        }

        System.out.println("Case " + index + ": " + mx);
      }
    }
  }
}
