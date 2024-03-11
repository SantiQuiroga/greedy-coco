// The explanation it's on the README.md file.

package coco;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }
        scanner.close();

        int count = 0;
        while (!queue.isEmpty()) {
            int happiness = queue.poll() - count;
            if (happiness > 0) {
                count++;
                queue.add(happiness);
            }
        }
        System.out.println(count);
    }
}
