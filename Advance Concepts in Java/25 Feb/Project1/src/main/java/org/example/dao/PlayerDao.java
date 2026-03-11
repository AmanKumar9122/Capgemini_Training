package org.example.dao;

import org.example.entity.Player;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDao {
    void insertBatch(List<Player> players) throws SQLException;
    void updateBatch(List<Player> players) throws SQLException;
    void deleteBatch(List<Player> players) throws SQLException;
    List<Player> fetchAll() throws SQLException;
}
