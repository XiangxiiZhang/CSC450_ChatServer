import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;
public class chatClient
{
    public static void main(String[] args)
    {
        Socket s = new Socket('localhost', 2222);
        Scanner clientInput = new Scanner(client.getInputStream());
        String question = clientInput.nextLine();
        System.out.println(question);
        Scanner localInput = new Scanner(system.in);
        PrintStream clientOutput = new PrintStream(client.getOutputStream());

        Thread lt = new Thread() { System.out.println("woot");};
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
        String line;
        while(true)
        {
            line = localInput.nextLine();
            clientOutput.println(line);
            if(line.equals("/quit"))
            {
                break;
            }

        }
        System.out.println("Goodbye");
        System.exit(0);
    }
}