package org.example;

import org.example.dao.PlayerDao;
import org.example.dao.PlayerDaiImpl;
import org.example.entity.Player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class App 
{
    public static void main( String[] args )
    {
        try {
            PlayerDao playerDao = new PlayerDaiImpl();

            // 1. Insert batch of players
            System.out.println("===== INSERTING BATCH OF PLAYERS =====");
            List<Player> playersToInsert = new ArrayList<>();
            playersToInsert.add(new Player(1, "Virat Kohli", "India"));
            playersToInsert.add(new Player(2, "Steve Smith", "Australia"));
            playersToInsert.add(new Player(3, "Kane Williamson", "New Zealand"));
            playersToInsert.add(new Player(4, "Joe Root", "England"));
            playersToInsert.add(new Player(5, "Babar Azam", "Pakistan"));

            playerDao.insertBatch(playersToInsert);
            System.out.println();

            // 2. Fetch all players
            System.out.println("===== FETCHING ALL PLAYERS =====");
            List<Player> allPlayers = playerDao.fetchAll();
            allPlayers.forEach(player -> System.out.println(player));
            System.out.println();

            // 3. Update batch of players
            System.out.println("===== UPDATING BATCH OF PLAYERS =====");
            List<Player> playersToUpdate = new ArrayList<>();
            playersToUpdate.add(new Player(1, "Virat Kohli", "India"));
            playersToUpdate.add(new Player(2, "Steve Smith Jr.", "Australia"));
            playersToUpdate.add(new Player(3, "Kane Williamson", "New Zealand"));

            playerDao.updateBatch(playersToUpdate);
            System.out.println();

            // 4. Fetch all players after update
            System.out.println("===== FETCHING ALL PLAYERS AFTER UPDATE =====");
            allPlayers = playerDao.fetchAll();
            allPlayers.forEach(player -> System.out.println(player));
            System.out.println();

            // 5. Delete batch of players
            System.out.println("===== DELETING BATCH OF PLAYERS =====");
            List<Player> playersToDelete = new ArrayList<>();
            playersToDelete.add(new Player(4, "Joe Root", "England"));
            playersToDelete.add(new Player(5, "Babar Azam", "Pakistan"));

            playerDao.deleteBatch(playersToDelete);
            System.out.println();

            // 6. Fetch all players after delete
            System.out.println("===== FETCHING ALL PLAYERS AFTER DELETE =====");
            allPlayers = playerDao.fetchAll();
            allPlayers.forEach(player -> System.out.println(player));

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
