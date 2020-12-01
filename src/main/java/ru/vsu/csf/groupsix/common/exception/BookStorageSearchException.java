package ru.vsu.csf.groupsix.common.exception;

public class BookStorageSearchException extends BookStorageException {

    public BookStorageSearchException() {
    }

    public BookStorageSearchException(String message) {
        super(message);
    }

    public BookStorageSearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookStorageSearchException(Throwable cause) {
        super(cause);
    }

    public BookStorageSearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
