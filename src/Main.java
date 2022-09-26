public class Main {
    public static boolean loginCheck(String login, String password, String confirmPassword) {
        boolean loginSign = login.matches("&93hjffsdf$");
        boolean passwordSign = login.matches("&93h^^jfd_sfsd/f$");
        boolean passwordCompare = confirmPassword.equals(password);

        if (!loginSign || login.length() > 20) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException exception) {
                System.out.println("Login должен содержать в себе только латинские буквы, цифры и знак подчеркивания и быть не больше 20 символов");
            }
        } else if (!passwordSign || password.length() >= 20) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException exception) {
                System.out.println("Password должен содержать в себе только латинские буквы, цифры и знак подчеркивания и быть меньше 20 символов");
            }
        } else if (!passwordCompare) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException exception) {
                System.out.println("password и confirmPassword должны быть равны");
            }
        } else System.out.println("Пользователь зарегистрирован");
        return true;
    }


    public static void main(String[] args) {
        String login = "java_skypro.go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        loginCheck(login, password, confirmPassword);
    }
}
