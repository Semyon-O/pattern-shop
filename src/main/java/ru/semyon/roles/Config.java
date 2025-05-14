package ru.semyon.roles;

public class Config {

    // <--- USER --->

    ///
    /// Принцип DRY
    ///

    public static final int MIN_PASSWORD_LENGTH = 8;

    public static final int MAX_LOGIN_LENGTH = 20;

    public static final String REGEX_LOGIN = "[a-zA-Z0-9_]+";

    public static final String REGEX_PASSWORD = ".*[a-zA-Z].*";

    public static final Integer EMAIL_MAX_LENGTH = 254;

    // <-- ADMIN -->

    public static final Integer SET_ACCESS_LEVEL = 3;

}
