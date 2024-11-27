import java.util.Scanner;
import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8888);
        Scanner sc = new Scanner(System.in);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        String msg = sc.nextLine();
        out.println(msg);
        String serverMessage = in.readLine();
        System.out.println("Server: " + serverMessage);

    }
}