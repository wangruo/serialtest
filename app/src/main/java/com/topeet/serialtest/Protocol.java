package com.topeet.serialtest;

/**
 * Created by Administrator on 2015/6/22.
 */
public class Protocol {

    static {
        System.loadLibrary("serialtest");
    }

    serial com = new serial();

    public Protocol()
    {
        com.Open(3, 115200);
    }

    public void Send()
    {
//        buffer
//        com.Write(buffer, len);
//        = com3.Read();
    }
}
