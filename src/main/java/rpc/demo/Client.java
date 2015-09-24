package rpc.demo;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class Client {
	public static void main(String[] args) throws IOException {
		Configuration conf = new Configuration();
		ClientProtocol proxy = (ClientProtocol) RPC.getProxy(ClientProtocol.class, ClientProtocol.versionID, 
				new InetSocketAddress("127.0.0.1", 8111), conf);
		int result = proxy.add(1, 2);
        System.out.println(result);
		String echoResult = proxy.echo("Hello");
        System.out.println(echoResult);
	}
}
