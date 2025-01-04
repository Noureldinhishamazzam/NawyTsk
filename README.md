# NawyTsk
Project Setup
Tools: Use Playwright with Java.
Dependencies: Include Playwright, TestNG, and any other required libraries like (JsonFile).
Page Object Model: Implement the Page Object Model (POM) using fluent design pattern.
Video Recording: Record test execution using a screen recording tool and uploaded on drive (https://drive.google.com/drive/folders/1nYAcxc0r269sJKKWleTLP_-omMlCuSum?usp=drive_link).

Test Scenarios
Scenario 1: Register with Valid Data
Navigate to url (https://www.demoblaze.com/index.html).
Click on Signup button on MenuBar.
Input valid user data (username, password) in signup form.
Submit the form.

Scenario 2: Login with Valid Email and Password
Navigate to url (https://www.demoblaze.com/index.html).
Click on Login button on MenuBar.
Input valid credentials (username and password) in login form.
Submit the form.

Scenario 3: Log Out
Navigate to url (https://www.demoblaze.com/index.html).
Click on Login button on MenuBar.
Input valid credentials (username and password) in login form.
Submit the form.
Click on the logout button in MenuBar.

Scenario 4: Create an Order for Apple Monitor 24
Navigate to url (https://www.demoblaze.com/index.html).
Clickon Next button.
Search for Apple Monitor 24.
Add the item to the cart.
Navigate to the cart and proceed to checkout.
Fill in order details and submit.
Click on OK button.

src/
├── main/
│   ├── java/
│   │   ├── pages/               # Page Object Model classes
│   │   │   ├── ChecoutPage.java
│   │   │   ├── HomePage.java
│   │   │   ├── LoginPage.java
│   │   │   ├── MenuBarPage.java
│   │   │   ├── ProductPage.java
│   │   │   ├── SignupPage.java
│   │   
│   │
│   │   
├── test/
│   ├── java/
│   │   ├── tests/               # Test classes
│   │   │   ├── FirstScenario.java
│   │   │   ├── FourthScenario.java
│   │   │   ├── PurchaseProductEndToEndScenario.java
│   │   │   ├── SecondScenario.java
│   │   │   ├── ThirdScenario.java
├── pom.xml                      # Imported needed libraries like (Playwright,TestNG)
