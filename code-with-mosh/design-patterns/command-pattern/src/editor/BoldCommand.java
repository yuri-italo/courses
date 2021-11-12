package editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        document.setContent(prevContent);
    }

    @Override
    public void unexecute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
