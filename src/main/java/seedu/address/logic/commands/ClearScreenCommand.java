package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Clears the Addressbook screen
 */
public class ClearScreenCommand extends Command {

    public static final String COMMAND_WORD = "cls";
    public static final String MESSAGE_SUCCESS = "Screen has been cleared!";

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(MESSAGE_SUCCESS, true,false, false);
    }
}
