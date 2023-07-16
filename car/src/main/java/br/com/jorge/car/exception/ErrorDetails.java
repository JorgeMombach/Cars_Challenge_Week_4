package br.com.jorge.car.exception;

public class ErrorDetails {
    private int status;
    private String error;
    private String path;

    public ErrorDetails(int status, String error, String path) {
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }

}
