package org.bhoopendra.learning.design.pattern.facade;

import java.sql.Connection;

public class FacadeClient {
    public static void main(String[] args){
        final String tableName = "EVENT";

        Connection mySqlConnection = MySqlHelper.getMySqlDbConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHtmlReport(tableName,mySqlConnection);


        Connection oracleConnection = OracleHelper.getOracleConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName,oracleConnection);

        HelperFacade.generateReport(HelperFacade.DbTypes.MYSQL,HelperFacade.ReportType.HTML,tableName);
        HelperFacade.generateReport(HelperFacade.DbTypes.ORACLE,HelperFacade.ReportType.PDF,tableName );
    }
}
