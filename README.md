# 🔐 Screenia UI Testing — Login & File Upload Validation

This project demonstrates manual and automated testing of the Screenia application, focusing on login functionality and file upload workflows.

---

## 📋 Project Overview

The goal of this project was to validate core user workflows, including authentication and file management, through structured test cases and execution tracking.

Testing covered both positive and negative scenarios to ensure reliability, usability, and proper error handling.

---

## 🧪 Features Tested

🔄 User login (valid and invalid credentials)<br>
🔄 Authentication error handling<br>
🔄 File upload functionality<br>
🔄 Image preview and editing<br>
🔄 File deletion<br>
🔄 File zoom and interaction<br>

---

## 🧪 Testing Approach

### Functional Testing

Validated expected behavior for core user actions:

🔷 Successful login with valid credentials<br>
🔷 File upload and display in gallery<br>
🔷 Image editing and interaction<br>

---

### Negative Testing

Tested failure and edge scenarios:

🔴 Invalid login credentials<br>
🔴 Missing input fields<br>
🔴 Unauthorized access attempts<br>

---

### Validation Focus

🔶 UI behavior and navigation<br>
🔶 Error message accuracy<br>
🔶 Functional consistency across workflows<br>
🔶 Data handling during file operations<br>

---

## 📊 Test Case Execution

Test cases were designed and tracked in a structured spreadsheet, including:<br>

⭐ Test steps and preconditions<br>
⭐ Expected results<br>
⭐ Environment details (browser/version)<br>
⭐ Pass/Fail status<br>

📌 Example scenarios include:<br>

⭐ Login with valid credentials → successful access<br>
⭐ Login with invalid credentials → error message displayed<br>
⭐ Upload image → appears in gallery<br>
⭐ Delete image → removed from system<br>

---

## 🛠 Tools & Technologies

🔧 Selenium WebDriver<br>
🔧 Java<br>
🔧 TestNG <br>
🔧 Manual Testing<br>
🔧 Microsoft Excel (Test Case Management)<br>

---

## 📈 Code Structure Explanation<br>

| File | Purpose |
| ------------- | ------------- |
|AutomateBasicTasks.java|Selenium scripts automating core login and upload workflows|<br>
|TestingControl.java| TestNG test controller managing test execution flow | <br>
|testNG.xml | TestNG configuration file defining the test suite and execution order|<br>
|package-info.java | A special Java file used to provide package-level documentation and annotations|<br>



---

## ▶️ How to Run the Test Suite<br>
### Prerequisites<br>
🔧 Java JDK 8 or higher — Download Here<br>
🔧 Maven or an IDE such as Eclipse or IntelliJ IDEA<br>
🔧 Google Chrome browser installed<br>
🔧 ChromeDriver matching your Chrome version — Download Here <br>
🔧 TestNG plugin installed in your IDE<br>

### Setup Steps<br>

Clone or download this repository to your local machine<br>
Open the project in Eclipse or IntelliJ IDEA<br>
Ensure ChromeDriver is installed and its path is configured in your system<br>
Add Selenium and TestNG libraries to your project build path<br>
Update any file path references in AutomateBasicTasks.java to match your local environment<br>


### Running the Tests<br>
Option 1 — Run via TestNG XML:<br>

Right-click testng.xml<br>
Select Run As → TestNG Suite<br>
Results will display in the TestNG console<br>

Option 2 — Run Individual Test Class:<br>

Right-click TestingControl.java<br>
Select Run As → TestNG Test<br>


Expected Output<br>
✅ TestNG will open a Chrome browser window automatically<br>
✅ Tests will execute login and file upload workflows<br>
✅ Pass/Fail results will display in the TestNG Results console<br>
✅ Failed tests will include error messages and stack traces for debugging<br>



## 📸 Test Case Sample<br>

![image](https://github.com/user-attachments/assets/71aa064b-82ac-407e-9ab3-26328184cc89)

---

## 📚 Key Takeaways

🎯 Gained hands-on experience testing real-world user workflows<br>
🎯 Strengthened ability to design and execute structured test cases<br>
🎯 Improved understanding of UI validation and user behavior testing<br>
🎯 Practiced identifying defects through both functional and negative testing<br>
🎯 Reinforced importance of documenting test execution and results<br>

---

## 🚀 Future Improvements

🔲 Automate full test suite using Selenium<br>
🔲 Add assertion-based validation for UI elements<br>
🔲 Expand test coverage to additional application features<br>
🔲 Integrate tests into CI/CD pipeline<br>

<hr>





