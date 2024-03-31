package ru.oop;

public class Error {
    private boolean active;
    private int status;
    private String  message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void showError(){
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Все сломалость " + message);
    }

    public static void main(String[] args){
        Error error = new Error(true, 1, "pzdc");
        error.showError();
    }
}