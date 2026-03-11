package org.example.dao;

import org.example.entity.Player;
import org.example.repository.PlayerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerDaiImpl implements PlayerDao{
    @Override
    public void insertBatch(List<Player>players) throws SQLException{
        Connection connection = PlayerRepository.getConnection();
        String insertQuery = "INSERT INTO players VALUES (?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(insertQuery);

        for(Player p : players){
            stmt.setInt(1,p.getPlayerId());
            stmt.setString(2,p.getPlayerName());
            stmt.setString(3,p.getPlayerCountry());
            stmt.addBatch();
        }
        int result[] = stmt.executeBatch();
        System.out.println("Inserted Rows: " + result.length);
        connection.close();
    }

    @Override
    public void updateBatch(List<Player> players) throws SQLException {

        Connection connection = PlayerRepository.getConnection();
        String updateQuery = "UPDATE players SET player_name = ?, player_country = ? WHERE player_id = ?";
        PreparedStatement stmt = connection.prepareStatement(updateQuery);

        for (Player p : players) {
            stmt.setString(1, p.getPlayerName());
            stmt.setString(2, p.getPlayerCountry());
            stmt.setInt(3, p.getPlayerId());
            stmt.addBatch();
        }

        int result[] = stmt.executeBatch();
        System.out.println("Updated Rows: " + result.length);

        connection.close();
    }

    @Override
    public void deleteBatch(List<Player> players) throws SQLException {

        Connection connection = PlayerRepository.getConnection();
        String deleteQuery = "DELETE FROM players WHERE player_id = ?";
        PreparedStatement stmt = connection.prepareStatement(deleteQuery);

        for (Player p : players) {
            stmt.setInt(1, p.getPlayerId());
            stmt.addBatch();
        }

        int result[] = stmt.executeBatch();
        System.out.println("Deleted Rows: " + result.length);

        connection.close();
    }

    @Override
    public List<Player> fetchAll() throws SQLException {

        Connection connection = PlayerRepository.getConnection();
        String selectQuery = "SELECT * FROM players";
        PreparedStatement stmt = connection.prepareStatement(selectQuery);
        ResultSet rs = stmt.executeQuery();

        List<Player> players = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt("player_id");
            String name = rs.getString("player_name");
            String country = rs.getString("player_country");

            Player player = new Player(id, name, country);
            players.add(player);
        }

        connection.close();

        return players;
    }

}
