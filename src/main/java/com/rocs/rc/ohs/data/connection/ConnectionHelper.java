//package com.rocs.rc.ohs.data.connection;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
///**
// * Utility class responsible for establishing a connection
// * to the Oracle database.
// *
// * @author
// * @version 1.0
// */
//public class ConnectionHelper {
//
//    /**
//     * Database connection URL for the Oracle database.
//     */
//    public static final String URL =
//            "jdbc:oracle:thin:@localhost:1521:rogate";
//
//    // URL = "jdbc:mysql://localhost:3306/rcis";
//
//    /**
//     * Oracle JDBC driver class name.
//     */
//    public static final String ORACLE_DRIVER =
//            "oracle.jdbc.driver.OracleDriver";
//
//    /**
//     * Database username used for authentication.
//     */
//    public static final String USERNAME = "rcis";
//
//    /**
//     * Database password used for authentication.
//     */
//    public static final String PASSWORD = "Changeme0";
//
//    /**
//     * Prevents instantiation of this utility class.
//     */
//    private ConnectionHelper() {
//        throw new UnsupportedOperationException(
//                "Utility class cannot be instantiated.");
//    }
//
//    /**
//     * Establishes and returns a connection to the Oracle database.
//     *
//     * @return an active database connection
//     * @throws RuntimeException if an error occurs while connecting
//     *                          to the database
//     */
//    public static Connection getConnection() {
//        try {
//            Class.forName(ORACLE_DRIVER).newInstance();
//
//            return DriverManager.getConnection(
//                    URL, USERNAME, PASSWORD);
//
//        } catch (Exception ex) {
//            throw new RuntimeException(
//                    "Error connecting to the database.", ex);
//        }
//    }
//}
