package by.epamtc.runner;

import by.epamtc.other.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.getProgramLogger().addLogInfo("First log...");
        Singleton.getProgramLogger().addLogInfo("Second log..");
        Singleton.getProgramLogger().addLogInfo("Third log log...");

        Singleton.getProgramLogger().showLogFile();
    }
}
