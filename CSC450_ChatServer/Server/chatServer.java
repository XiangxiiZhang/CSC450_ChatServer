import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class chatServer
{
    public static void main(String[] args) throws Exception
    {   /*
        String s = "hello";
        String s2 = "hello";
        String s3 = "wordl";
        String s4 = new String("hello");
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s4));
        System.out.println(s.compareTo(s2)==0);
        System.out.println(s.compareTo(s4)==0);
        */
        ServerSocket s = new ServerSocket(2222);
        ArrayList<ChatWorkerThread> theThreads = new ArrayList<ChatWorkerThread>();
        while(true)
        {
            System.out.println("Listenning for Connection...");
            Socket client = s.accept(); //blocks
            ChatWorkerThread t = new ChatWorkerThread(client);
            theThreads.add(t);
            t.start();
        }
    }
}