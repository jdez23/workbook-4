package com.DreamCarDealership.data;

import com.DreamCarDealership.model.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DealershipFileManager {
    private static File file = new File("src/main/resources/Inventory.csv");

    public static List<Vehicle> getDealership(){

        List<Vehicle> inventoryOfVehicles = new ArrayList<>();

        try {
            System.out.println("Loading Vehicles' Information");

            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            String FileInput;

            bufReader.readLine();

            while ((FileInput = bufReader.readLine()) != null) {
                String[] tokens = FileInput.split(Pattern.quote("|"));
                Vehicle vehicle = new Vehicle();
                if (tokens.length == 8) {
                    vehicle.setVin(Integer.parseInt(tokens[0]));

                    vehicle.setYear(Integer.parseInt(tokens[1]));

                    vehicle.setMake(tokens[2]);

                    vehicle.setModel(tokens[3]);

                    vehicle.setVehicleType(tokens[4]);

                    vehicle.setColor(tokens[5]);

                    vehicle.setOdometer(Integer.parseInt(tokens[6]));

                    vehicle.setPrice(Double.parseDouble(tokens[7]));
                } else {
                    System.out.println("error: missing or too much information on a given transaction");
                }
                inventoryOfVehicles.add(vehicle);
            }
            bufReader.close();

        } catch (IOException e) {
            System.out.println("error with .csv file naming, please check if its the correct save file");

        }

        return inventoryOfVehicles;
    }

    public static void saveDealerShip(){}

    public static void fileCheck() {
        if (file.exists()) {
            System.out.println("Does not exist.");
        } else {
            System.out.println("the file does not exist");
        }
    }

}