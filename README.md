# DemoWebshop Automated Testing with Jenkins CI/CD

## Project Overview
This project automates the testing of the DemoWebshop application using Selenium WebDriver integrated with Jenkins CI/CD pipeline. The goal is to enable continuous testing to ensure code quality and faster feedback cycles.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [How to Run](#how-to-run)
- [Jenkins Pipeline Details](#jenkins-pipeline-details)
- [Jenkins Console Output Screenshot](#jenkins-console-output-screenshot)
- [Test Results](#test-results)
- [Known Issues & Resolutions](#known-issues--resolutions)
- [Conclusion](#conclusion)
- [Screenshots](#screenshots)
- [Accessing Jenkins](#accessing-jenkins)
- [Contact](#contact)

---

## Prerequisites
- Java JDK 8 or higher installed  
- Maven installed  
- Jenkins installed and running (tested on localhost:8080)  
- Selenium WebDriver dependencies configured  
- DemoWebshop application accessible

---

## Setup Instructions
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/demo-webshop-automation.git
    cd demo-webshop-automation
    ```
2. Install dependencies using Maven:
    ```bash
    mvn clean install
    ```
3. Configure Jenkins:
    - Create a new Jenkins job (Freestyle or Pipeline)
    - Connect to your project repository
    - Set build triggers as needed (e.g., GitHub webhook)
    - Add build steps to run your tests (`mvn test` or equivalent)
    - Configure post-build actions to publish test reports

---

## How to Run
- Locally via Maven:
    ```bash
    mvn test
    ```
- Via Jenkins:
    - Trigger build manually or by commit webhook
    - Jenkins will execute tests and publish reports

---

## Jenkins Pipeline Details
- Jenkins URL: `http://localhost:8080`  
- Job Name: `DemoWebshop-CICD`  
- Pipeline includes:
    - Pulling latest code from GitHub
    - Running Selenium tests
    - Publishing test results and console output

---

## Jenkins Console Output Screenshot  
![Console Output](images/console-output.png)

---

## Test Results
- Total tests run: 20  
- Passed: 20  
- Failed: 0  
- Test reports are published inside Jenkins under the "Test Results" section.  

**Test Report Screenshot:**  
![Test Report](images/test-report.png)

---

## Known Issues & Resolutions
- Issue: Occasional test failure due to element timing delays  
- Resolution: Added explicit waits and retries to stabilize tests  

---

## Conclusion
The automation framework integrated with Jenkins ensures continuous testing of DemoWebshop, significantly reducing manual testing effort and providing fast feedback on code quality. This setup promotes efficient CI/CD practices and higher software reliability.

---

## Screenshots

| Description             | Screenshot                                  |
|------------------------|--------------------------------------------|
| Jenkins Job Configuration | ![Job Config](images/jenkins-job-config.png) |
| Jenkins Console Output    | ![Console](images/console-output.png)        |
| Test Results Report       | ![Report](images/test-report.png)             |

---

## Accessing Jenkins
Since the Jenkins server is running locally at `http://localhost:8080`, remote access is not available. Screenshots and console logs are provided above to demonstrate the successful build and test execution.

---

## Contact
For questions about this project, please contact:  
**Your Name**  
Email: your.email@example.com  

---

*End of README*
