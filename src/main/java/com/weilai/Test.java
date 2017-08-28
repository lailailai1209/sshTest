package com.weilai;

import java.util.ArrayList;

/**
 * Created by weilai on 8/23/17.
 */
public class Test {
    public static void main( String[] args ) {


        String command = "scm";
        String userName = "admin";
        String password = "lab";
        String connectionIP = "10.124.8.15";
        int channelUrate = 0;
        int channelDrate = 0;

      
        SSHManager instance = new SSHManager(userName, password, connectionIP, "");
        String errorMessage = instance.connect();
        System.out.println(errorMessage);

        try {
            instance.connect();
            String result = instance.sendCommand(command);

            System.out.println(result );


            }catch (Exception e){
             System.out.println(e );

        }

    }


}
