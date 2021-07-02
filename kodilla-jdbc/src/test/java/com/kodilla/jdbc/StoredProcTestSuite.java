package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=TRUE";
        String sqlCheckTable1 = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=FALSE";
        String sqlCheckTable2 = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS";
        int all = -1;
        ResultSet rs = statement.executeQuery(sqlCheckTable2);
        if (rs.next()) {
            all = rs.getInt("HOW_MANY");
        }

        // When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        // Then
        int howManyTrue = -1;
        int howManyFalse = -1;

        rs = statement.executeQuery(sqlCheckTable);
        if (rs.next()) {
            howManyTrue = rs.getInt("HOW_MANY");
        }
        rs = statement.executeQuery(sqlCheckTable1);
        if (rs.next()) {
            howManyFalse = rs.getInt("HOW_MANY");
        }

        assertEquals(all, howManyFalse+howManyTrue);
        rs.close();
        statement.close();
    }
}