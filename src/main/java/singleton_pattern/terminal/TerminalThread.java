package singleton_pattern.terminal;

import singleton_pattern.memory.MemoryStack;

public class TerminalThread {
    private final  RunnableTerminal terminal;
    private final  Thread thread;

    public TerminalThread(String ...commands) {
        this.terminal = new RunnableTerminal(commands);
        this.thread = new Thread(terminal);
    }
    public void start() {
        thread.start();
    }
    public void join() throws InterruptedException {
        thread.join();
    }
    public MemoryStack getMemoryStack() {
        return terminal.getMemoryStack();
    }

}
