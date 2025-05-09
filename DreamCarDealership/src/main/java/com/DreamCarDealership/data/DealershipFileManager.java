package com.DreamCarDealership.data;
import com.DreamCarDealership.model.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {

    private static final File INVENTORY_FILE = new File("src/main/resources/inventory.csv");

    public static Dealership getDealership() {
        Dealership dealership = new Dealership("Dream Car Dealership", "123 Magic St", "555-1234");

        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
            reader.readLine(); // skip header

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(Pattern.quote("|"));
                if (tokens.length != 8) {
                    System.out.println("Error in CSV: " + line);
                    continue;
                }

                Vehicle v = new Vehicle();
                v.setVin(Integer.parseInt(tokens[0]));
                v.setYear(Integer.parseInt(tokens[1]));
                v.setMake(tokens[2]);
                v.setModel(tokens[3]);
                v.setVehicleType(tokens[4]);
                v.setColor(tokens[5]);
                v.setOdometer(Integer.parseInt(tokens[6]));
                v.setPrice(Double.parseDouble(tokens[7]));

                dealership.addVehicle(v);
            }

        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }

        return dealership;
    }

    // Save method stub (you'll implement this in a later phase)
    public static void saveDealership(Dealership dealership) {
        // TODO: implement writing to inventory.csv
    }
}
