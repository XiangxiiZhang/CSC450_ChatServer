import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;
public class chatClient
{
    public static void main(String[] args)
    {
        Socket s = new Socket('localhost', 2222);
        Scanner clientInput = new Scanner(client.getInputStream());
        string question = clientInput.nextLine();
        System.out.println(question);
        Scanner localInput = new Scanner(system.in);
        PrintStream clientOutput = new PrintStream(client.getOutputStream());
        String myString = new String("Woot")


        Thread lt = new Thread() { System.out.println("woot");};
            public void madeUpMethod(){};
            public void run()
            {
                String line;
                while(true)
                {
                    line = clientInput.nextLine();
                    System.out.println(line);
                }
            }
        };
        lt.start();
        while(true)
        {
            clientOutput. println(localInput.nextLine());
        }
    
    }
}