import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class index extends Application {

    private TextField pinField;
    private Label messageLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ATM Interface");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        pinField = new PasswordField();
        messageLabel = new Label("Welcome to the ATM!");

        Button insertCardButton = new Button("Insert Card");
        Button enterPinButton = new Button("Enter PIN");
        Button withdrawButton = new Button("Withdraw");
        Button depositButton = new Button("Deposit");
        Button checkBalanceButton = new Button("Check Balance");
        Button ejectCardButton = new Button("Eject Card");

        insertCardButton.setOnAction(e -> insertCard());
        enterPinButton.setOnAction(e -> enterPin());
        withdrawButton.setOnAction(e -> withdraw());
        depositButton.setOnAction(e -> deposit());
        checkBalanceButton.setOnAction(e -> checkBalance());
        ejectCardButton.setOnAction(e -> ejectCard());

        grid.add(messageLabel, 0, 0, 2, 1);
        grid.add(insertCardButton, 0, 1);
        grid.add(enterPinButton, 1, 1);
        grid.add(withdrawButton, 0, 2);
        grid.add(depositButton, 1, 2);
        grid.add(checkBalanceButton, 0, 3);
        grid.add(ejectCardButton, 1, 3);
        grid.add(pinField, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void insertCard() {
        messageLabel.setText("Please insert your card.");
    }

    private void enterPin() {
        messageLabel.setText("Enter your PIN.");
    }

    private void withdraw() {
        messageLabel.setText("Enter the amount to withdraw.");
    }

    private void deposit() {
        messageLabel.setText("Insert the amount to deposit.");
    }

    private void checkBalance() {
        messageLabel.setText("Your balance is $1000.");
    }

    private void ejectCard() {
        messageLabel.setText("Card ejected. Thank you!");
    }

    public void stop() {
        // Clean up resources if needed
    }
}
