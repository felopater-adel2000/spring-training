package com.session5.task.dao;

import com.session5.task.models.Type;
import com.session5.task.models.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DatabaseOperations {

    private String url;
    private String username;
    private String password;
    private Connection connection;


    public DatabaseOperations(
            String url,
            String username,
            String password
    ) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @PostConstruct
    public void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection established successfully!");
            createTables();
        } catch (Exception e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void disconnectFromDatabase() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Error closing database connection: " + e.getMessage());
        }
    }

    private void createTables() {
        try {
            Statement stmt = connection.createStatement();

            // Create vehicles table
            String createVehiclesTable = """
                CREATE TABLE IF NOT EXISTS vehicles (
                    id VARCHAR(50) PRIMARY KEY,
                    brand VARCHAR(100) NOT NULL,
                    type ENUM('Car', 'Plane', 'Bike') NOT NULL,
                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                )
                """;

            stmt.executeUpdate(createVehiclesTable);
            System.out.println("Tables created successfully!");

        } catch (SQLException e) {
            System.err.println("Error creating tables: " + e.getMessage());
        }
    }

    public void saveVehicle(Vehicle vehicle) {
        String sql = "INSERT INTO vehicles (id, brand, type) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, vehicle.getId());
            pstmt.setString(2, vehicle.getBrand());
            pstmt.setString(3, vehicle.getType().name());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Vehicle saved successfully: " + vehicle.toString());
            }
        } catch (SQLException e) {
            System.err.println("Error saving vehicle: " + e.getMessage());
        }
    }

    public void deleteVehicle(String id) {
        String sql = "DELETE FROM vehicles WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, id);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Vehicle deleted successfully with ID: " + id);
            } else {
                System.out.println("No vehicle found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error deleting vehicle: " + e.getMessage());
        }
    }

    public void updateVehicle(Vehicle vehicle) {
        String sql = "UPDATE vehicles SET brand = ?, type = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, vehicle.getBrand());
            pstmt.setString(2, vehicle.getType().name());
            pstmt.setString(3, vehicle.getId());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Vehicle updated successfully: " + vehicle.toString());
            } else {
                System.out.println("No vehicle found with ID: " + vehicle.getId());
            }
        } catch (SQLException e) {
            System.err.println("Error updating vehicle: " + e.getMessage());
        }
    }

    public Vehicle searchById(String id) {
        String sql = "SELECT * FROM vehicles WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Vehicle vehicle = createVehicleFromResultSet(rs);
                System.out.println("Vehicle found: " + vehicle.toString());
                return vehicle;
            } else {
                System.out.println("No vehicle found with ID: " + id);
                return null;
            }
        } catch (SQLException e) {
            System.err.println("Error searching vehicle: " + e.getMessage());
            return null;
        }
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        String sql = "SELECT * FROM vehicles";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Vehicle vehicle = createVehicleFromResultSet(rs);
                vehicles.add(vehicle);
            }

            System.out.println("Retrieved " + vehicles.size() + " vehicles from database");
        } catch (SQLException e) {
            System.err.println("Error retrieving all vehicles: " + e.getMessage());
        }

        return vehicles;
    }

    private Vehicle createVehicleFromResultSet(ResultSet rs) throws SQLException {
        String id = rs.getString("id");
        String brand = rs.getString("brand");
        String typeStr = rs.getString("type");

        Vehicle vehicle = new Vehicle();
        vehicle.setId(id);
        vehicle.setBrand(brand);
        vehicle.setType(Type.valueOf(typeStr));

        return vehicle;
    }
}