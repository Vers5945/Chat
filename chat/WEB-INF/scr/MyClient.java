/* In this example, client will write first to the server then server will receive and print the text.
Then server will write to the client and client will receive and print the text. The step goes on. */

import java.net.*;
import java.io.*;

class MyClient {
	public static void main(String[] args) throws Exception {
		// Socket s=new Socket("192.168.43.12",4567);
		Socket s=new Socket("localhost",3333);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str="",str2="";
		while(!str.equals("stop")) {
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			System.out.println("Server says: "+str2);
		}

		dout.close();
		s.close();
	}
}