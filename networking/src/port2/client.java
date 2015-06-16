package port2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 10020);
		FileOutputStream fos = new FileOutputStream("s.txt");
		BufferedOutputStream out = new BufferedOutputStream(fos);
		byte[] buffer = new byte[1024];
		int count;
		InputStream in = socket.getInputStream();
		while((count=in.read(buffer)) >0){
		    fos.write(buffer, 0, count);
		}
		fos.close();
		socket.close();
	}

}
