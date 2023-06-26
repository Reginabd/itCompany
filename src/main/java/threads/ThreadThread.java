package threads;

import utils.ConnectionPool;

public class ThreadThread extends Thread {

    private String name;


    private ConnectionPool connectionPool;

    public ThreadThread(String name, ConnectionPool cp) {
        this.name = name;
        this.connectionPool = cp;
    }


      @Override
       public void run() {
        System.out.println(name + "is running");
       }
}



