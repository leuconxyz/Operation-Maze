public class Users {
    private String userFirstName;
    private String userLastName;
    private int userAge;
    private String userNIF;
    private boolean activeAccount = false;

    // Constructor for the users
    public Users(String inputFirstName,
                 String inputLastName,
                 int inputUserAge,
                 String inputUserNIF) {
        this.userFirstName = inputFirstName;
        this.userLastName = inputLastName;
        this.userAge = inputUserAge;
        this.userNIF = inputUserNIF;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserNIF() {
        return userNIF;
    }

    public void setUserNIF(String userNIF) {
        this.userNIF = userNIF;
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }
}
