// The explanation it's on the README.md file.

package coco;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Party {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestAmount = scanner.nextInt();
        ArrayList<Integer> guests = new ArrayList<>();
        for (int i = 0; i < guestAmount; i++) {
            guests.add(scanner.nextInt());
        }
        scanner.close();

        Collections.sort(guests);
        int sum = 0;
        for (int i = 0; i < guestAmount / 2; i++) {
            int difference = guests.get(i) - guests.get(guestAmount - 1 - i);
            sum += Math.abs(difference);
            difference = guests.get(i + 1) - guests.get(guestAmount - 1 - i);
            sum += Math.abs(difference);
        }

        System.out.println(sum);
    }
}
