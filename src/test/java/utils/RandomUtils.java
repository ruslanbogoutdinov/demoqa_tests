package utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static void main(String[] args) {
        String values[] = {"a", "b", "c", "d", "e"};

        System.out.println("Random string: "+getRandomString(10));
        System.out.println("Random int: "+getRandomInt(1, 10));
        System.out.println("Random email: "+getRandomEmail(10));
        System.out.println("Random value from array: "+getRandomItemFromStringArray(values));
    }

    public static int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public static String getRandomString(int length){
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }

    public static String getRandomEmail(int length){
        return getRandomString(length)+"@gmail.com";
    }

    public static String getRandomItemFromStringArray(String values[]){
        int index = getRandomInt(0, values.length-1);

        return values[index];
    }
}
