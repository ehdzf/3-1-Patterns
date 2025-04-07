package singleton_pattern.memory;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MemoryStack {
    private static volatile MemoryStack instance;
    private final Deque<String> stack;

    private MemoryStack() {
        this.stack = new ConcurrentLinkedDeque<>();
    }


    public static MemoryStack getInstance() {
        MemoryStack result = instance;
        if (result != null) {
            return result;
        }

        synchronized (MemoryStack.class) {
            result = instance;
            if (result == null) {
                instance = result = new MemoryStack();
            }
            return result;
        }
    }

    public void add(String command) {
        stack.addFirst(command);
    }

    public String showMostRecent() {
        return stack.peekFirst();
    }

    public List<String> getAllCommands() {
        return new ArrayList<>(stack);
    }

    public void clear() {
        this.stack.clear();
    }
}