package ui.command;

import presenter.Presenter;
import ui.View;

import java.util.Scanner;

public class ListNotesCommand extends Command {

    public static final String NAME = "List of notes";
    public static final String CODE = "2";

    public ListNotesCommand(Presenter pre, Scanner s) {
        super(NAME, CODE, pre, s);
    }

    @Override
    public void execute() {
        View.listNotes(presenter.getAllNotes());
    }
}
