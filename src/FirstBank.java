public class FirstBank {

    public static void main(String[] args) {
        Account tim = new Account("Tim Tom", "A00001");
        UserInterface userInterface = new UserInterface(tim);
        userInterface.showMenu();
    }
}
