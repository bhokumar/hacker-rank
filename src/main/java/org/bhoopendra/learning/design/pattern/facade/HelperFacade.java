package org.bhoopendra.learning.design.pattern.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DbTypes dbType, ReportType reportType, final String tableName){
        Connection connection = null;
        switch (dbType){
            case MYSQL:
                connection = MySqlHelper.getMySqlDbConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();

                switch (reportType){
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName,connection);
                        break;
                    case HTML:
                        mySqlHelper.generateMySqlHtmlReport(tableName,connection);
                    default:
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleConnection();
                OracleHelper oracleHelper = new OracleHelper();

                switch (reportType){
                    case PDF:
                        oracleHelper.generateOracleHtmlReport(tableName,connection);
                        break;
                    case HTML:
                        oracleHelper.generateOraclePDFReport(tableName,connection);
                        default:
                            break;
                }
                default:
                    break;

        }
    }

    public static enum DbTypes{
        MYSQL, ORACLE;
    }

    public static enum ReportType{
        HTML,PDF;
    }
}
