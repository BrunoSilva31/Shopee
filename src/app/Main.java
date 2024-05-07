package app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main{
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product;

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Product #" + (i+1) + ": ");
            System.out.print("Common, Used or Imported (C/U/I)? ");
            char res = sc.next().toLowerCase().charAt(0);
           
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();

			if (res == 'c') {
				product = new Product(name, price);

                list.add(product);
			} else if (res == 'u') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

				product = new UsedProduct(name, price, date);

                list.add(product);
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

                product = new ImportedProduct(name, price, customsFee);
			}
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        System.out.println();
        
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}