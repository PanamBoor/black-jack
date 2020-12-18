package org.itstep.blackjack;

public class NoMoneyEnough extends Exception {
    public NoMoneyEnough() {
    }

    public NoMoneyEnough(String message) {
        super(message);
    }

    public NoMoneyEnough(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoneyEnough(Throwable cause) {
        super(cause);
    }

    public NoMoneyEnough(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
