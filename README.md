Hospital Management System (HMS) Documentation

Table of Contents
1. Introduction
2. Prerequisites
3. Technologies Used
4. Setup and Installation
5. Project Structure
6. Entity Classes
7. Repository Classes
8. Service Classes
9. Controller Classes
10. API Endpoints
11. Testing
12. Security (if applicable)
13. Error Handling

1. Introduction

The Hospital Management System (HMS) is a Spring Boot application designed to manage patient records, bed allocation, reports generation, billing, and appointment scheduling in a healthcare facility.

2. Prerequisites

Before running the application, make sure you have the following prerequisites:

- Java 8 or later
- Apache Maven
- MySQL database
- Postman (for testing the APIs)

3. Technologies Used

- Java: The core programming language used for the backend.
- Spring Boot: A powerful framework for building Java-based applications.
- MySQL: The relational database used for storing data.
- HTML, CSS, JavaScript: The frontend technologies used for the user interface.
- Postman: The tool for testing API endpoints.

4. Setup and Installation

1. Clone the repository from GitHub: PranayRamteke888/HospitalManagement
2. Configure the MySQL database in the application.properties file.
3. Build the project using Maven: mvn clean install
4. Run the application: java -jar target/hms-application.jar

5. Project Structure

- src/main/java/com/example/HospitalManagement: Main application package
  - controller: Contains REST controller classes
  - service: Contains service interfaces and implementations
  - repository: Contains Spring Data JPA repository interfaces
  - entity: Contains entity classes
  - HmsApplication.java: Application entry point

6. Entity Classes

- Patient: Represents patient information.
- Bed: Represents bed information.
- Reports: Represents report data.
- Billing: Represents billing information.

7. Repository Classes

- PatientRepository: Provides CRUD operations for patients.
- BedRepository: Provides CRUD operations for beds.
- ReportsRepository: Provides CRUD operations for reports.
- BillingRepository: Provides CRUD operations for billing.

8. Service Classes

- PatientService: Contains methods for patient registration and retrieval.
- BedService: Contains methods for bed allocation and deallocation.
- ReportsService: Contains methods for fetching reports data.
- BillingService: Contains methods for generating bills.

9. Controller Classes

- PatientController: Handles patient registration and retrieval endpoints.
- BedController: Handles bed allocation and deallocation endpoints.
- ReportsController: Handles reports retrieval endpoints.
- BillingController: Handles billing endpoints.

10. API Endpoints

Patients

- Register a New Patient
  - POST http://localhost:8080/patients/register
  - Register a new patient by sending patient information in JSON format.

- Get Patient by ID
  - GET http://localhost:8080/patients/{id}
  - Retrieve patient details by providing the patient's ID in the URL.

- Get All Patients
  - GET http://localhost:8080/patients/all
  - Retrieve a list of all registered patients.

Beds

- Allocate a Bed
  - POST http://localhost:8080/beds/allocate
  - Allocate a bed to a patient by sending relevant information in JSON format.

- Deallocate a Bed
  - POST http://localhost:8080/beds/deallocate/{bedNumber}
  - Deallocate a bed by specifying the bed number in the URL.

- Get All Beds
  - GET http://localhost:8080/beds/all
  - Retrieve a list of all beds, including their allocation status.

Reports

- Get All Reports
  - GET http://localhost:8080/reports/all
  - Retrieve a list of all reports stored in the system.

- Get Report by ID
  - GET http://localhost:8080/reports/{id}
  - Retrieve a specific report by providing its ID in the URL.

Billing

- Generate a Billing Record
  - POST http://localhost:8080/billing/generate
  - Generate a billing record for a patient by providing relevant billing information in JSON format.

- Get All Billing Records
  - GET http://localhost:8080/billing/all
  - Retrieve a list of all billing records stored in the system.

11. Testing

Use Postman or a similar tool to test the API endpoints. Import the provided Postman collection for convenience.

12. Security (if applicable)

Describe any security measures implemented in the application, such as authentication and authorization.












13. Error Handling

Error handling in the Hospital Management System (HMS) application is implemented to ensure graceful handling of unexpected situations and to provide meaningful feedback to users and developers. The application follows best practices for error reporting and response formatting.






Error Response Format

When an error occurs, the application returns an error response in JSON format with the following structure:

{
    "timestamp": "yyyy-MM-dd'T'HH:mm:ss.SSSZ",
    "status": <HTTP Status Code>,
    "error": "<HTTP Status Message>",
    "message": "<Error Message Details>",
    "path": "<Request Path>"
}
