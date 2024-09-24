# Currency Converter Java Application

This is a simple Java-based web application that converts currency from one type to another. It uses **Java Servlets**, **Ajax**, and **Java Applets** to provide a seamless user experience for currency conversion. The app fetches real-time exchange rates from an external API.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Features](#features)
4. [Project Setup](#project-setup)
5. [Running the Application](#running-the-application)
6. [Usage](#usage)
7. [Screenshots](#screenshots)
8. [Future Enhancements](#future-enhancements)
9. [Contributing](#contributing)
10. [License](#license)

---

## Project Overview

This web-based currency converter allows users to convert one currency to another based on current exchange rates. Users can select the base currency, target currency, and enter the amount they wish to convert. The application then returns the converted value dynamically without reloading the page, using **Ajax** for a smoother user experience.

## Technologies Used

- **Java** (Backend logic)
- **Java Servlets** (Handling HTTP requests)
- **Ajax** (Asynchronous communication with the server)
- **Java Applet** (For a GUI if needed)
- **HTML/CSS/JavaScript** (Frontend interface)
- **Exchange Rate API** (To get real-time exchange rates)
- **Apache Tomcat** (Servlet container to host the app)

## Features

- Real-time currency conversion.
- Asynchronous updates are using Ajax (no page reload is required).
- Dynamic fetching of live exchange rates from an external API.
- User-friendly web interface for input and output.
- Support for multiple currencies.

## Project Setup

### Prerequisites

To run this project locally, you need the following:

- **Java Development Kit (JDK)** installed.
- **Apache Tomcat** server is used to deploy the servlet.
- **Visual Studio Code** or any other IDE supporting Java.
- **Git** for version control.
- **Maven** (optional, if you use it for project build).

### Steps to Set Up

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/currency-converter.git
   cd currency-converter
   ```

2. If you are using Maven, install the dependencies and package the project:
   ```bash
   mvn clean install
   ```

3. Deploy the `.war` file:
   - Copy the `CurrencyConverterApp.war` file to your Tomcat's `webapps` directory.
   - Start the Tomcat server:
     ```bash
     cd <tomcat-directory>/bin
     ./catalina.sh start   # On Linux/Mac
     catalina.bat start    # On Windows
     ```

4. The application should now be accessible at `http://localhost:8080/CurrencyConverterApp/index.html`.

## Running the Application

### Running on Localhost

1. Open your browser and go to:
   ```bash
   http://localhost:8080/CurrencyConverterApp/index.html
   ```

2. You should see the currency converter UI where you can enter the amount, select the source currency, and the target currency. Once you press "Convert", the converted amount will be displayed on the same page dynamically.

### Running on GitHub

If you’ve deployed this on GitHub Pages or a remote server, you can provide a link here for others to use the app.

---

## Usage

1. Enter the amount you wish to convert.
2. Select the currency you are converting **from** (e.g., USD).
3. Select the currency you are converting **to** (e.g., INR).
4. Click on **Convert**.
5. The result will be shown dynamically on the page.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
