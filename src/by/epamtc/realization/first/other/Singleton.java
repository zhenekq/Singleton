package by.epamtc.realization.first.other;

public class Singleton {
    private static Singleton programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized Singleton getProgramLogger(){
        if (programLogger == null){
            programLogger = new Singleton();
        }
        return programLogger;
    }
    private Singleton(){

    }
    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}
