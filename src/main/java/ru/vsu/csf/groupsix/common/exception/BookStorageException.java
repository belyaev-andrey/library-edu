package ru.vsu.csf.groupsix.common.exception;

public class BookStorageException extends Exception {

    public BookStorageException() {
    }

    public BookStorageException(String message) {
        super(message);
    }

    public BookStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStorageException(Throwable cause) {
        super(cause);
    }

    public BookStorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
