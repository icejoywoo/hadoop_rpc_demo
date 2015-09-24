package rpc.demo;

import java.io.IOException;

public class ClientProtocolImpl implements ClientProtocol {

	@Override
	public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
		return ClientProtocol.versionID;
	}

	@Override
	public String echo(String value) throws IOException {
		return value;
	}

	@Override
	public int add(int v1, int v2) throws IOException {
		return v1 + v2;
	}

}
