package singleton_pattern.terminal;

import singleton_pattern.memory.MemoryStack;

public class Terminal {
    private final MemoryStack stack;

    public Terminal() {
        this.stack = MemoryStack.getInstance();
    }

    public MemoryStack getStack() {
        return stack;
    }

    public void executeCommand(String command) {
        stack.add(command);
    }

    public void showAllCommands() {
        System.out.println("All commands: " + stack.getAllCommands());
    }
}
