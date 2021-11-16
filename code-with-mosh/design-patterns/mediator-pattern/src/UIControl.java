import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<eventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(eventHandler observer) {
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers() {
        for (var observer : eventHandlers)
            observer.handle();
    }
}
