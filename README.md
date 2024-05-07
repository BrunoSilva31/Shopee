<h1 align="center"> Java Product Management App </h1>

[![Java](https://img.shields.io/badge/Java-11-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![Java Standard Library](https://img.shields.io/badge/Java%20Standard%20Library-8-blue)](https://docs.oracle.com/javase/8/docs/api/)



This is a simple Java application for product management that allows the user to register common, used, and imported products, displaying their details and price tags.

<h1 align="center"> How to Use </h1>

1. Clone the repository or download the `Main.java` file.
2. Open the `Main.java` file in your IDE.
3. Run the program.


<h1 align="center"> Features </h1>

-   The program prompts the user for the number of products to register.
-   For each product, the user provides the type (common, used, or imported), name, price, and, if applicable, manufacturing date or customs fee.
-   The products are stored in a list, and then their price tags are displayed.


<h1 align="center"> Imput Details </h1>

-   The user must provide the number of products to register.
-   For each product, the user must provide:
    -   Type (C - Common, U - Used, I - Imported)
    -   Name
    -   Price
    -   If applicable, manufacturing date (for used products) or customs fee (for imported products).

<h1 align="center"> Output </h1>

-   After registering the products, the program displays the price tags of each product.

<h1 align="center"> Sample Usage </h1>

1.  **Running the Program**
    
    After downloading or cloning the repository, navigate to the directory containing the `Main.java` file. Open the file in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) and run the program.
    
2.  **Adding Products**
    
    Upon running the program, you'll be prompted to enter the number of products you want to register. For example, let's say you want to register three products:
   
   ```` 
   Enter the number of products: 3
   ````
   
  3. **Entering Product Details**

For each product, you'll be prompted to provide details such as type (Common, Used, or Imported), name, and price. Follow the prompts and provide the required information.

````
Product #1:
Common, Used or Imported (C/U/I)? C
Name: Laptop
Price: 800.00

Product #2:
Common, Used or Imported (C/U/I)? U
Name: Smartphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 20/03/2023

Product #3:
Common, Used or Imported (C/U/I)? I
Name: Watch
Price: 100.00
Customs fee: 20.00
````

4. **Viewing Price Tags**

After entering the details for all products, the program will display the price tags for each product:
````
PRICE TAGS:

Laptop $800.00
Manufacture date: -

Smartphone $400.00
Manufacture date: 20/03/2023

Watch $120.00
Customs fee: $20.00
````

5.  **Exiting the Program**
    
    Once you've viewed the price tags, the program will terminate automatically.


<h1 align="center"> Notes </h1>

-   The program assumes that the user provides manufacturing dates in the "DD/MM/YYYY" format.
-   The program assumes that the decimal separator is the dot (.) and that monetary values are in US dollars (USD).
