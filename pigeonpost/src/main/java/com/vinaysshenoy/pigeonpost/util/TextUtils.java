package com.vinaysshenoy.pigeonpost.util;

/**
 * Created by vinaysshenoy on 24/08/16.
 */
public final class TextUtils {

    private TextUtils() {

    }

    public static boolean isEmpty(String s) {

        return s == null || s.isEmpty();
    }

    public static boolean areAllEmpty(String... strings) {

        for (int i = 0; i < strings.length; i++) {

            if (!isEmpty(strings[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAtLeastOneEmpty(String... strings) {

        for (int i = 0; i < strings.length; i++) {

            if (isEmpty(strings[i])) {
                return true;
            }
        }

        return false;
    }
}
