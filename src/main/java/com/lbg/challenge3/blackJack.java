package com.lbg.challenge3;

import java.util.ArrayList;
import java.util.Random;

public class blackJack {

    public static void main(String[] args) {

        Random rand = new Random();

        int rand_int1 = rand.nextInt(30) + 1;
        int rand_int2 = rand.nextInt(30) + 1;

        if (rand_int1 > 21) {
            rand_int1 = 0;
        }

        if (rand_int2 > 21) {
            rand_int2 = 0;
        }


        ArrayList<Integer> pair = new ArrayList<Integer>();
        pair.add(rand_int1);
        pair.add(rand_int2);

        if (pair.get(0) > pair.get(1)) {
            System.out.println(pair.get(0));
        }

        else {
            System.out.println(pair.get(1));
        }


    }
}
