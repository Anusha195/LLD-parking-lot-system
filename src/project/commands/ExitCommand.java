package project.commands;

public class ExitCommand implements ICommand {
    
    public void execute(String[] args) {
        System.out.println("Exiting the parking system...");
        System.exit(0);
    }
}
