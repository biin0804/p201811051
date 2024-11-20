package p201811051;

public class Sansu {
    public static int max(int[] a) {
        int result = Integer.MIN_VALUE;
        for (int value : a)
        if (value > result) result = value;
            return result;
    }
}

