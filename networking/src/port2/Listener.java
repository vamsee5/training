package port2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Listener {
public static void main(String[] args) throws IOException {
	ServerSocket server_socket = new ServerSocket(10020);
	File myFile = new File("/home/zemoso04/Downloads/chandan.txt");

	Socket socket = server_socket.accept();
	int count;
	byte[] buffer = new byte[1024];

	OutputStream out = socket.getOutputStream();
	BufferedInputStream in = new BufferedInputStream(new FileInputStream(myFile));
	while ((count = in.read(buffer)) > 0) {
	     out.write(buffer, 0, count);
	     out.flush();
	}
	socket.close();
}
}
