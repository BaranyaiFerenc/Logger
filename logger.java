import java.util.Scanner;  // Import the Scanner class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

class Main
{
    public static void main(String[] args)
    {
        Logger log = new Logger();
        log.Log("Initalizing...");
        log.LogWarning("Something not good");
        log.LogError("Error");
    }
}

class Logger
{
    String username;
    LocalDateTime locTime;
    
    public Logger()
    {
        locTime = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        this.username = input.nextLine();
        System.out.println("User logged: "+username);
    }
    public Logger(String username)
    {
        this.username = username;
        System.out.println("User logged: "+username);
    }
    
    private String GetTime()
    {
        locTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return locTime.format(formatter);
    }
    
    public void Log(String msg)
    {
        locTime = LocalDateTime.now();
        System.out.println("["+username+"]"+"[Log]"+"["+GetTime()+"] "+msg);
    }
    
    public void LogWarning(String msg)
    {
        System.out.println("["+username+"]"+"[Warning]"+"["+GetTime()+"] "+msg);
    }
    
    
    public void LogError(String msg)
    {
        locTime = LocalDateTime.now();
        System.out.println("["+username+"]"+"[Error]"+"["+GetTime()+"] "+msg);
    }
    
}

