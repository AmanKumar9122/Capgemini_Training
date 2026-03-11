package com.capgemini.dao;


import com.capgemini.entitiy.Player;
import com.capgemini.repository.PlayerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {

    @Override
    public void insertPlayer(Player player) {

        String sql = "insert into players values (?,?,?)";

        try (Connection conn = PlayerRepository.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, player.getPlayerId());
            ps.setString(2, player.getPlayerName());
            ps.setString(3, player.getPlayerCountry());

            ps.executeUpdate();
            System.out.println("Player Inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePlayer(Player player) {

    }

    @Override
    public void deletePlayer(int playerId) {

    }

    @Override
    public List<Player> getAllPlayers() {
        return null;
    }


}