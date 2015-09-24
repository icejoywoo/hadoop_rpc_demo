package rpc.demo;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class Server {
	public static void main(String[] args) throws IOException {
		Configuration conf = new Configuration();
		RPC.Server server = RPC.getServer(new ClientProtocolImpl(), "0.0.0.0", 8111, conf);
		server.start();
	}
}
