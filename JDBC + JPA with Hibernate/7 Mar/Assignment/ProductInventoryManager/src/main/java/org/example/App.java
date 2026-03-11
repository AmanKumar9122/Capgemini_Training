package org.example;

import org.example.dao.ProductDAO;
import org.example.model.Product;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductDAO dao = new ProductDAO();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewAllProducts();
                    break;
                case 3:
                    viewProductById();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    updateProductQuantity();
                    break;
                case 6:
                    deleteProduct();
                    break;
                case 7:
                    searchProductByName();
                    break;
                case 8:
                    showLowStockProducts();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== PRODUCT INVENTORY MENU =====");
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. View Product By ID");
        System.out.println("4. Update Product Price");
        System.out.println("5. Update Product Quantity");
        System.out.println("6. Delete Product");
        System.out.println("7. Search Product By Name");
        System.out.println("8. Show Low Stock Products");
        System.out.println("9. Exit");
    }

    private static void addProduct() {
        try {
            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Category: ");
            String category = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter Rating: ");
            double rating = scanner.nextDouble();

            Product product = new Product(id, name, category, price, quantity, rating, null);
            dao.addProduct(product);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct data types.");
            scanner.nextLine(); // clear buffer
        }
    }

    private static void viewAllProducts() {
        List<Product> products = dao.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        System.out.println("ID    Name                Category          Price     Qty   Rating");
        System.out.println("--------------------------------------------------------------");
        for (Product p : products) {
            System.out.printf("%-5d %-20s %-15s %-10.2f %-5d %.1f%n",
                    p.getProductId(), p.getProductName(), p.getCategory(), p.getPrice(), p.getQuantity(), p.getRating());
        }
    }

    private static void viewProductById() {
        int id = readInt("Enter Product ID: ");
        Product p = dao.getProductById(id);
        if (p != null) {
            System.out.println("ID: " + p.getProductId());
            System.out.println("Name: " + p.getProductName());
            System.out.println("Category: " + p.getCategory());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Rating: " + p.getRating());
            System.out.println("Created At: " + p.getCreatedAt());
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void updateProductPrice() {
        int id = readInt("Enter Product ID: ");
        double price = readDouble("Enter New Price: ");
        dao.updatePrice(id, price);
    }

    private static void updateProductQuantity() {
        int id = readInt("Enter Product ID: ");
        int quantity = readInt("Enter New Quantity: ");
        dao.updateQuantity(id, quantity);
    }

    private static void deleteProduct() {
        int id = readInt("Enter Product ID: ");
        dao.deleteProduct(id);
    }

    private static void searchProductByName() {
        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();
        List<Product> products = dao.searchByName(keyword);
        if (products.isEmpty()) {
            System.out.println("No products found.");
            return;
        }
        for (Product p : products) {
            System.out.println(p.getProductName());
        }
    }

    private static void showLowStockProducts() {
        List<Product> products = dao.getLowStockProducts();
        if (products.isEmpty()) {
            System.out.println("No low stock products.");
            return;
        }
        System.out.println("Low Stock Products");
        System.out.println("ID   Name              Qty");
        System.out.println("-------------------------");
        for (Product p : products) {
            System.out.printf("%-5d %-18s %-5d%n", p.getProductId(), p.getProductName(), p.getQuantity());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }
}
