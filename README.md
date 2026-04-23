# 🧪 Selenium Automation Framework (Java)

## 📌 Introduction

This project is a **Selenium Test Automation Framework** built with:

* Java (JDK 17/21)
* Selenium WebDriver
* TestNG
* Maven

The framework follows **Page Object Model (POM)** and is designed for:

* Scalability
* Maintainability
* Reusability

It supports:

* End-to-end testing
* Modular test design
* Suite-based execution

---

## 🏗️ Project Structure

```
saucedemo_test/
│
├── src/
│   ├── main/java/
│   │   ├── base/           # Base classes (driver setup, common logic)
│   │   ├── pages/          # Page Object classes
│   │   └── utils/          # Utilities (config, constants, helpers)
│   │
│   └── test/java/
│       └── tests/          # Test classes (TestNG)
│
├── testng.xml              # Main test suite
├── pom.xml                 # Maven dependencies
└── README.md               # Documentation
```

---

## ⚙️ Tech Stack

| Component | Version |
| --------- | ------- |
| Java      | 17 / 21 |
| Selenium  | 4.x     |
| TestNG    | 7.x     |
| Maven     | 3.x     |

---

## 🚀 Getting Started

### 🔧 Prerequisites

Make sure you have installed:

* Java JDK 17 or 21
* Maven
* IDE (IntelliJ / Eclipse)

Check versions:

```bash
java -version
mvn -version
```

---

### 📥 Installation

Clone project or unzip:

```bash
git clone <your-repo>
cd selenium_framework
```

Install dependencies:

```bash
mvn clean install
```

---

## 🧠 Framework Design

### 1. Base Layer (`base/`)

#### BaseTest.java

* Initialize WebDriver
* Setup browser config
* Handle setup & teardown

#### BasePage.java

* Common methods:

  * click()
  * type()
  * getText()
  * wait handling

---

### 2. Page Layer (`pages/`)

Example: `InventoryPage.java`

Responsibilities:

* Store locators
* Define actions
* Provide business methods

#### 🔹 Dynamic Locator Example

```java
private By addToCartBtn(String productName) {
    return By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
}
```

👉 Benefits:

* Reusable
* Flexible
* Easy to scale

---

### 3. Test Layer (`tests/`)

Contains:

* Test cases
* Test logic
* Assertions

Example:

```java
inventory.addProductByName("Sauce Labs Backpack");
```

---

## 🧪 Test Scenario (E2E Flow)

### Flow:

1. Open website
2. Login
3. Add products
4. Go to cart
5. Verify cart
6. Checkout
7. Finish order

---

## 📦 Running Tests

### ▶️ Run all tests

```bash
mvn test
```

---

### ▶️ Run specific suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

### ▶️ Run from IDE (Recommended)

1. Right-click `testng.xml`
2. Select **Run**

---

## 🧾 Test Suite Configuration

Example `testng.xml`:

```xml
<suite name="E2E Suite">
    <test name="Purchase Flow">
        <classes>
            <class name="tests.E2ETest"/>
        </classes>
    </test>
</suite>
```

👉 You can:

* Add multiple test flows
* Group tests
* Run parallel execution

---

## 🔐 Test Data Management

Credentials should NOT be hardcoded.

Recommended approach:

```properties
username=standard_user
password=secret_sauce
```

Load via Config class.

---

## 📊 Reporting

Default:

* TestNG HTML Report

After run:

```
/test-output/index.html
```

Open in browser to view results.

---

## 🧹 Best Practices Used

* Page Object Model (POM)
* Dynamic locators
* Separation of concerns
* Reusable methods
* Clean code structure

---

## ⚠️ Common Issues & Fixes

### ❌ Error: `getText() not found`

👉 Cause:

```java
List finds()
```

👉 Fix:

```java
List<WebElement> finds()
```

---

### ❌ Java version warning

Fix in `pom.xml`:

```xml
<configuration>
    <release>21</release>
</configuration>
```

---

## 🚀 Future Improvements

* Add Extent Report / Allure
* Add Parallel Execution
* Add CI/CD (GitHub Actions)
* Add Retry mechanism
* Add API testing layer

---

## 👨‍💻 Author

Automation QA Framework by **Lê Luân**

---

## 📌 Summary

This framework is:

* Beginner-friendly
* Scalable for real projects
* Following industry standards

👉 Ready to extend for enterprise-level automation 🚀
