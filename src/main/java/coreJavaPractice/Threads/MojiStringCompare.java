package coreJavaPractice.Threads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Moji on 18-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiStringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("asda", "as", "a");
        Collections.sort(list, new MojiStringCompare());
        list.forEach(System.out::println);
    }

}
