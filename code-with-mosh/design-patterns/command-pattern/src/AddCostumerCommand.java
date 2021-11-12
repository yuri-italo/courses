import fx.Command;

public class AddCostumerCommand implements Command {
    private CustumerService service;

    public AddCostumerCommand(CustumerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
