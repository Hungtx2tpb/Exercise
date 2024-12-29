# README: Setup and Run Automation Framework

## Note: Source include two file are testcases: TranXuanHung_TestCases_Search, and file AutomationTestingStrategy: TranXuanHung_AutomationTestingStrategy

## **1. System Requirements**
Before getting started, ensure your system meets the following requirements:

- **Katalon Studio:** Latest version (download from https://katalon.com)
- **Web Browsers:** Chrome, Firefox (with corresponding drivers pre-integrated in Katalon Studio)
- **Katalon Account:**
  - Register for a 30-day trial account at https://katalon.com to log in.
  - If you have a license, use your licensed account to log in and activate.

---

## **2. Framework Setup**

1. Clone the project repository:
   ```bash
   git clone <repository-url>
   ```
2. Open Katalon Studio.
3. Go to **File > Open Project** and select the folder of the downloaded project.
4. Wait for Katalon Studio to load the project configuration and files.

---

## **3. Project Structure**

### **3.1. Main Folders**
- **`Test Cases/`**: Contains all test cases written in Katalon Studio.
  - Example: `Test Cases/Search/TC_01_SearchWithValidKeyword`.
- **`Object Repository/`**: Stores all Xpath or UI object definitions.
  - Example: `Object Repository/SearchPage/SearchBar`.
- **`Test Suites/`**: Groups multiple test cases to run as a suite.
  - Example: `Test Suites/Search Test Suite`.
- **`Reports/`**: Stores reports generated after running test cases or test suites.
  - Reports are generated in HTML, PDF, or CSV format.
- **`Keywords/`**: Contains user-defined custom keyword files.
  - Example: `Keywords/msb.common/CommonActions.groovy`.

---

## **4. Running the Framework**

### **4.1. Run Individual Test Case**
1. Open **Test Cases** in Katalon Studio.
2. Double-click on the desired test case (e.g., `TC_01_SearchWithValidKeyword`).
3. Click the **Run** button (green triangle icon) on the toolbar.
4. Select the desired browser (Chrome, Firefox, etc.).
5. Monitor the execution and results in the **Log Viewer** tab.

### **4.2. Run Test Suite**
1. Open **Test Suites** in Katalon Studio.
2. Double-click on the desired test suite (e.g., `Search Test Suite`).
3. Click the **Run** button and select a browser.
4. Katalon will execute all test cases in the suite and generate a report.

---

## **5. Managing Xpath and Test Data**

### **5.1. Managing Xpath**
- All Xpaths are stored in the **Object Repository** folder.
- Each object is defined with:
  - **Name:** Description of the object (e.g., `SearchPage/SearchBar`).
  - **Xpath:** Location of the object in the DOM (e.g., `//input[@id='search-bar']`).

---

## **6. Viewing Reports**

1. After running a test case or test suite, navigate to the **Reports** folder.
2. Select the folder corresponding to the execution timestamp.
3. Reports are available in the following formats:
   - **HTML**: File `index.html`.

---

## **7. Customizing the Framework**

- **Configuring Environment Variables:**
  - Open the `Profiles/Default.glbl` file to modify global variables such as URLs or timeouts.

- **Adding New Test Objects:**
  1. Open **Object Repository**.
  2. Right-click > **New** > **Test Object**.
  3. Define the name and Xpath of the object.

- **Adding New Test Cases:**
  1. Open **Test Cases**.
  2. Right-click > **New** > **Test Case**.
  3. Use predefined keywords or the **Record** feature to create test steps.

- **Using Custom Keywords:**
  - Open the **Keywords** folder in Katalon Studio.
  - All custom keywords are saved here as Groovy files.
  - Example: `Keywords/msb.common/CommonActions.groovy` contains utility methods like opening a browser, navigating to a URL, and closing pop-ups.
  - Usage example:
    ```groovy
    import msb.common.CommonActions

    CommonActions.accessToMSB()
    ```
---

