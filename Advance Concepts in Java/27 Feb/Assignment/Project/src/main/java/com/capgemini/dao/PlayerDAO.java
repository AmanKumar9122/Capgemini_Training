package com.capgemini.dao;

import com.capgemini.entitiy.Player;

import java.util.List;

public interface PlayerDAO {
    void insertPlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayer(int playerId);
    List<Player> getAllPlayers();
}
