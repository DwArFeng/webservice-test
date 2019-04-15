package com.dwarfeng.test.webservice.block.client;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import javax.xml.ws.BindingProvider;

import com.dwarfeng.dutil.basic.io.CT;
import com.dwarfeng.test.webservice.block.server.BlockWebServiceImpl;
import com.dwarfeng.test.webservice.block.server.BlockWebServiceImplService;
import com.dwarfeng.test.webservice.block.server.InterruptedException_Exception;

/**
 * 测试 WebService 的并发处理方式。
 * 
 * @author DwArFeng
 * @since 1.8
 */
public class BlockTest {

	public static void main(String[] args) {
		BlockWebServiceImpl servicePort = new BlockWebServiceImplService().getBlockWebServiceImplPort();
		BindingProvider bindingProvider = (BindingProvider) servicePort;

		Map<String, Object> requestContext = bindingProvider.getRequestContext();
		requestContext.put("com.sun.xml.internal.ws.connection.timeout", 10 * 1000);// 建立连接的超时时间为10秒
		requestContext.put("com.sun.xml.internal.ws.request.timeout", 15 * 1000);// 指定请求的响应超时时间为15秒

		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			while (!scanner.nextLine().equals("exit")) {
				try {
					CT.trace(servicePort.getString());
				} catch (InterruptedException_Exception e) {
					e.printStackTrace();
				}
			}
			System.exit(0);
		} finally {
			Optional.ofNullable(scanner).ifPresent(sc -> sc.close());
		}
	}

}
