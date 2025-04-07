package singleton_pattern.terminal;


import singleton_pattern.memory.MemoryStack;

public class RunnableTerminal implements Runnable {
    private final String[] commands;
    private Terminal terminal;

    public RunnableTerminal(String... commands) {
        this.commands = commands;
    }

    @Override
    public void run() {
        terminal = new Terminal();
        for (String command : commands) {
            terminal.executeCommand(command);
        }

    }

    public MemoryStack getMemoryStack() {
        return terminal.getStack();
    }
}