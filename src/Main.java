public class Main {

    public static void printResult(String login, String password, String confirmPassword) {
        InputData verification = new InputData(login, password, confirmPassword);
        System.out.println("\r\n" + "Login: " + login + ", " +
                "Password: " + password + ", " +
                "Confirm: " + confirmPassword);
        boolean result = verification.checkLoginParameters();
        System.out.println("result = " + result);
    }


    public static void main(String[] args) {
        printResult("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        printResult("java_skyprogo", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }
}
