package com.DreamCarDealership.ui;
import com.DreamCarDealership.data.*;
import com.DreamCarDealership.model.Vehicle;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        init();  // load dealership via file manager

        while (true) {
            showMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    processFindByPriceRange();
                    break;
                case "2":
                    processFindByMakeModel();
                    break;
                case "3":
                    processFindByYearRange();
                    break;
                case "4":
                    processFindByColor();
                    break;
                case "5":
                    processFindByMileageRange();
                    break;
                case "6":
                    processFindByType();
                    break;
                case "7":
                    processAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    //  Loads the Dealership from file via DealershipFileManager.
    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = (Dealership) fileManager.getDealership();
    }

    private void showMenu() {
        System.out.println("\nPlease select an option:");
        System.out.println("  1 - Find vehicles by price range");
        System.out.println("  2 - Find vehicles by make/model");
        System.out.println("  3 - Find vehicles by year range");
        System.out.println("  4 - Find vehicles by color");
        System.out.println("  5 - Find vehicles by mileage range");
        System.out.println("  6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("  7 - List ALL vehicles");
        System.out.println("  8 - Add a vehicle");
        System.out.println("  9 - Remove a vehicle");
        System.out.println(" 99 - Quit");
        System.out.print("> ");
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("  (no matching vehicles)");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.println("  " + v);
        }
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> all = dealership.getAllVehicles();
        displayVehicles(all);
    }


    private void processFindByPriceRange() { /* TODO */ }
    private void processFindByMakeModel()  { /* TODO */ }
    private void processFindByYearRange()  { /* TODO */ }
    private void processFindByColor()      { /* TODO */ }
    private void processFindByMileageRange(){ /* TODO */ }
    private void processFindByType()       { /* TODO */ }
    private void processAddVehicleRequest(){ /* TODO */ }
    private void processRemoveVehicleRequest(){ /* TODO */ }
}
