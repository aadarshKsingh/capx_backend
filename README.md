

# CapXBackend

**CapXBackend** is a backend application built using **Spring Boot** and **Hibernate JPA** for managing stock data. It provides a RESTful API to interact with stock data stored in a MySQL database. The application runs on port `8080` and exposes an endpoint `/stocks` for retrieving and storing stock information.

## Features

- **GET /stocks**: Retrieves the available stock data from the database in JSON format.
- **POST /stocks**: Accepts JSON data to store new stock data in the database.
- **Uses Maven** for managing project dependencies.

## Technologies Used

- **Spring Boot**: Framework for building Java-based backend applications.
- **Hibernate JPA**: Provides Object-Relational Mapping (ORM) to interact with the database.
- **MySQL**: Relational database management system for storing stock data.
- **Maven**: Dependency management and build tool.

## API Endpoints

### 1. **GET /stocks**
- **Description**: Retrieves all the stock records available in the database.
- **Response Format**: JSON array of stock data.

**Example Request**:
```http
GET http://localhost:8080/stocks
```

**Example Response**:
```json
[
    {
        "id": 1,
        "noOfShares": 1000,
        "symbol": "AAPL",
        "price": 150.50,
        "companyName": "Apple Inc.",
        "currency": "USD",
        "website": "https://www.apple.com",
        "createdAt": "2025-01-01T12:00:00",
        "updatedAt": "2025-01-01T12:00:00"
    },
    ...
]
```

### 2. **POST /stocks**
- **Description**: Adds a new stock record to the database using a JSON payload.
- **Request Body**: 
```json
{
    "noOfShares": 500,
    "symbol": "GOOGL",
    "price": 2750.30,
    "companyName": "Alphabet Inc.",
    "currency": "USD",
    "website": "https://www.abc.xyz"
}
```

**Example Request**:
```http
POST http://localhost:8080/stocks
Content-Type: application/json

{
    "noOfShares": 500,
    "symbol": "GOOGL",
    "price": 2750.30,
    "companyName": "Alphabet Inc.",
    "currency": "USD",
    "website": "https://www.abc.xyz"
}
```

## Project Setup

### Prerequisites

- **Java 8 or higher**
- **Maven 3.x**
- **MySQL** (or another relational database) with a database configured for this project.

### Steps to Run

1. **Clone the repository**:

   ```bash
   git clone https://github.com/aadarshKsingh/CapXBackend.git
   cd CapXBackend
   ```

2. **Set up the MySQL database**:
   - Create a MySQL database (e.g., `capxportfolio`).
   - Ensure that the connection details in `src/main/resources/application.properties` are correct.

   Example configuration in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/capxportfolio
   spring.datasource.username=root
   spring.datasource.password=root
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. **Build the project using Maven**:

   Run the following command to build the project:

   ```bash
   mvn clean install
   ```

4. **Run the application**:

   After building the project, run it using the following command:

   ```bash
   mvn spring-boot:run
   ```

   The application will start and be available at `http://localhost:8080`.

### Access the Endpoints

- **GET /stocks**: Open your browser or use a tool like Postman or cURL to make a `GET` request to `http://localhost:8080/stocks` to retrieve all available stock data.
  
- **POST /stocks**: Use Postman, cURL, or any HTTP client to send a `POST` request with a JSON payload to `http://localhost:8080/stocks` to add new stock data.

Example cURL for `POST`:

```bash
curl -X POST http://localhost:8080/stocks \
     -H "Content-Type: application/json" \
     -d '{
            "noOfShares": 500,
            "symbol": "GOOGL",
            "price": 2750.30,
            "companyName": "Alphabet Inc.",
            "currency": "USD",
            "website": "https://www.abc.xyz"
         }'
```

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new Pull Request.

---