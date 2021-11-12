import fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustumerService();
        var command = new AddCostumerCommand(service);
        var button = new Button(command);

        button.click();
    }
}
