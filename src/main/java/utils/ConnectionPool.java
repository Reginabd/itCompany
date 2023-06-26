package utils;

import java.sql.Connection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConnectionPool {

    private final ConcurrentLinkedDeque<Connection> connectionPool;
    private int maxSize;

    private static volatile ConnectionPool pool;

    private ConnectionPool(int maxSize) {
        this.maxSize = maxSize;
        connectionPool = new ConcurrentLinkedDeque<>();
    }

    public static ConnectionPool getInstance(int maxSize) {
        if (pool == null) {
            synchronized (ConnectionPool.class) {
                if (pool == null) {
                    pool = new ConnectionPool(maxSize);
                }
            }
        }
        return pool;
    }
    public Connection getConnection() {
        return connectionPool.poll();
    }
    public void releaseConnection(Connection connection) {
        connectionPool.add(connection);
    }
}