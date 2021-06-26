package com;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {
    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
        while (!socketChannel.finishConnect()){
            System.out.println("链接需要时间可以做其他事情！");
        }
        socketChannel.write(ByteBuffer.wrap("你好啊~".getBytes()));

    }
}
