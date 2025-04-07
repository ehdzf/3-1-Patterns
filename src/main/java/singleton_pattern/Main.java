package singleton_pattern;

import singleton_pattern.memory.MemoryStack;
import singleton_pattern.terminal.TerminalThread;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TerminalThread thread1 = new TerminalThread("ls", "cd /home", "mkdir test");
        TerminalThread thread2 = new TerminalThread("rm -rf test", "cd ..", "ls -a");

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        MemoryStack finalCheck = MemoryStack.getInstance();

        System.out.println("Memory stack from terminal1 and terminal2 are the same: " + (thread1.getMemoryStack() == thread2.getMemoryStack()));
        List<String> terminal1Commands = thread1.getMemoryStack().getAllCommands();
        List<String> finalCheckCommands = finalCheck.getAllCommands();
        System.out.println("Commands in terminal1 memory: " + terminal1Commands);
        System.out.println("Commands in finalCheck memory: " + finalCheckCommands);
        System.out.println("Are the commands in terminal1 and finalCheck the same: " + terminal1Commands.equals(finalCheckCommands));
    }
}
