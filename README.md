# SauceDemo Automation Testing Project

Automated test suite for [SauceDemo.com](https://www.saucedemo.com/) using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** framework in **Java**.

## 🧪 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- ExtentReports (for reporting)
- GitHub Actions / Jenkins (for CI, optional)

---

## 📁 Project Structure
saucedemo-automation/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── pages/ # Page Object classes
│ │ └── utils/ # Utility classes (e.g., WebDriverManager, ConfigReader)
│ ├── test/
│ │ └── java/
│ │ └── tests/ # TestNG test classes
│ │ └── base/ # Base test setup/teardown
├── testng.xml # TestNG suite configuration
├── pom.xml # Maven dependencies and plugins
└── README.md # Project documentation

---

## ⚙️ Setup Instructions

### Prerequisites

- Java JDK 11+
- Maven 3.6+
- Eclipse
- Chrome or Firefox browser
- Git

✅ Running the Tests
Using TestNG
# Run all tests defined in testng.xml
mvn test

✨ Features Covered
🔐 Login functionality (valid & invalid credentials)

🛒 Add to cart / remove from cart

📦 Checkout process

🚪 Logout functionality

📋 Page title and URL verification

🔁 Sorting products


