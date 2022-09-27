public class InputData {
    private String login;
    private String password;
    private String confirmPassword;

    public InputData(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public boolean checkLoginParameters() {
        try {
            if (!this.checkLogin() || !this.checkPassword()) {
                return false;
            }
            this.checkConfirmPassword();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean checkLogin() throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть длинее 20 символов, текущий размер равен " + login.length());
        }
        if (!login.matches("\\w+")) {
            System.out.println("Логин должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
            return false;
        }
        return true;
    }

    public boolean checkPassword() throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль не может быть длинее 20 и более символов, текущий размер равен " + password.length());
        }
        if (!password.matches("\\w+")) {
            System.out.println("Пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания");
            return false;
        }
        return true;
    }

    public void checkConfirmPassword() throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают: " + password + " и " + confirmPassword);
        }
    }
}
