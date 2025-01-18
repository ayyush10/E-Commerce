# E-Commerce Project

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Database Configuration](#database-configuration)
- [Usage](#usage)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

---

## Introduction
This E-Commerce project is a web-based application designed to manage and facilitate online shopping activities. Users can browse products, add items to their cart, and place orders. The project is built with Java and Spring Boot on the backend, integrating MySQL for database management.

## Features
- User authentication and authorization (login and registration).
- Product management:
  - Add, update, and delete products.
  - Product images stored in the database (fields include `imageName`, `imageType`, and `imageData`).
- Cart and checkout functionality.
- Responsive design for a user-friendly experience.
- Admin panel for managing products and orders.

## Technologies Used
- **Backend:** Java, Spring Boot, Hibernate
- **Frontend:** JSP, HTML, CSS, JavaScript
- **Database:** MySQL
- **Tools and Platforms:**
  - Apache Maven
  - AWS EC2 for deployment
  - Git for version control

## Setup and Installation

Follow these steps to set up and run the project on your local machine:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/ayyush10/E-Commerce.git
   cd E-Commerce
   ```

2. **Configure the Database**
   - Ensure MySQL is installed and running on your machine.
   - Create a database named `ecomProj`.
   - Update the database credentials in the `application.properties` file:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ecomProj
     spring.datasource.username=root
     spring.datasource.password=your_password
     ```

3. **Build the Project**
   - Use Maven to build the project:
     ```bash
     mvn clean install
     ```

4. **Run the Application**
   - Start the Spring Boot application:
     ```bash
     mvn spring-boot:run
     ```
   - Access the application at `http://localhost:8080`.

## Database Configuration
- The database schema includes tables for managing users, products, orders, and carts.
- Product table schema includes fields for `productId`, `productName`, `price`, `quantity`, `imageName`, `imageType`, and `imageData`.

## Usage
- **Admin Operations:**
  - Add new products with images.
  - Manage product inventory.
- **User Operations:**
  - Browse products and view details.
  - Add products to the cart and place orders.
  - Manage account information.

## Future Enhancements
- Add support for payment gateway integration.
- Improve the user interface using modern frontend frameworks like React.
- Implement REST APIs for mobile app integration.
- Add Elasticsearch for efficient product search.

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add feature name'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Feel free to explore and contribute to this repository!
