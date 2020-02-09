package com.blacklotus.service.common;

public class Util {

    private static final String PATTERN_EMAIL = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
    private static final String PATTERN_USERNAME = "^[a-z0-9_-]{3,15}$";
    private static final String PATTERN_MOBILE_NO = "\\d{12}";

    public static boolean isEmpty(String phrase) {
        return phrase == null || phrase.isEmpty();
    }

    public static boolean isValidEmail(String email) {
        return isEmpty(email) || email.matches(PATTERN_EMAIL);
    }

    public static boolean isValidUserName(String userName) {
        return userName.matches(PATTERN_USERNAME);
    }

}
