# Wiki Mobile Project <img src="src/test/resources/images/screens/wiki_logo.png" alt="Wiki Logo" width="80" height="50">


## Project Overview
The Wiki Mobile Project is an automated testing framework designed for testing mobile applications.

<img src="media/images/screens/mobile_application.jpg" alt="Mobile_application" width="500" height="350">


## Technologies Used
<img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java Logo" width="40" height="40">
<img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" alt="IntelliJ IDEA Logo" width="40" height="40">
<img src="https://junit.org/junit5/assets/img/junit5-logo.png" alt="JUnit Logo" width="40" height="40">
<img src="https://gradle.org/images/gradle-knowledge-graph-logo.png" alt="Gradle Logo" width="40" height="40">
<img src="media/images/icons/selenide_logo.png" alt="Selenide Logo" width="70" height="40">
<img src="media/images/icons/appium_logo.png" alt="Appium Logo" width="40" height="40">
<img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure Logo" width="40" height="40">
<img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" width="40" height="40">
<img src="https://www.jenkins.io/images/logos/jenkins/jenkins.svg" alt="Jenkins Logo" width="40" height="40">
<img src="https://telegram.org/img/t_logo.png" alt="Telegram Logo" width="40" height="40">
<img src="https://developer.android.com/studio/images/studio-icon.svg" alt="Android Studio Logo" width="40" height="40">

---

## Agenda

1. **Test Automation Goals:** <img src="https://cdn-icons-png.flaticon.com/512/845/845646.png" alt="Goals Icon" width="30" height="30">
   
   - Verify the functionality and performance of the Wiki mobile app.
   - Ensure cross-platform compatibility.
   - Deliver detailed and actionable reports for stakeholders.

2. **Tool Integrations:**
   - <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure Logo" width="40" height="40"> Allure Report for in-depth reporting with screenshots and logs.
   - <img src="https://www.jenkins.io/images/logos/jenkins/jenkins.svg" alt="Jenkins Logo" width="40" height="40"> Jenkins for continuous integration and dashboard tracking.
   - <img src="media/images/icons/TestOpsLogo.png" alt="Allure TestOps Logo" width="150" height="40"> for centralized test management.
   - <img src="https://telegram.org/img/t_logo.png" alt="Telegram Logo" width="30" height="30"> Telegram Notifications for instant alerts.

3. **CI/CD Workflow:**
   - Code pushed to <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" width="30" height="30"> **GitHub** triggers Jenkins pipelines.
   - Automated tests run on real or virtual Android devices via <img src="media/images/icons/appium_logo.png" alt="Appium Logo" width="30" height="30"> **Appium**.
   - Results are published to **Allure TestOps** and **Jenkins** dashboards.
   - Notifications are sent to the configured **Telegram** channel.

---

## Test Cases
| Test Case ID | Test Description                                          |
|--------------|-----------------------------------------------------------|
| TC-001       | Successful verification of Onboarding Screens             |
| TC-002       | Verify skipping onboarding navigates to the search screen |
| TC-003       | Verification of the successful search result displayed    |
| TC-004       | Testing case-insensitive search functionality             |
| TC-005       | Testing behavior when no search results are found         |

---

## Jenkins Integration
**Jenkins Pipeline:**
- Link to Jenkins job: [Jenkins Wiki Mobile Project](https://jenkins.autotests.cloud/job/wiki_mobile_project/)


**Key Features:**
- Automated build and test execution triggered by GitHub events.
- Detailed build logs and test execution results.
- Dashboard with pass/fail trends and build duration metrics.

**Reporting:**
- Test execution data, including:
   - Screenshots of failures.
   - Error stack traces.
   - Metrics for execution time and success rates.
- Integrated with **Allure Reports** and **TestOps Dashboards**.

---

## Allure TestOps Integration
- Link to project: [Allure TestOps Wiki Mobile Project](https://allure.autotests.cloud/project/4583/)

**Highlights:**
- Centralized test management and result tracking.
- Real-time reporting with custom dashboards.
- Defect tracking and analysis for failed tests.

---

## Launch Settings
### Emulator
- Run tests on the emulator.
**- To run locally via the emulator, you will need to install and configure the emulator.**

### BrowserStack
- Run tests on BrowserStack.
- To run locally via BrowserStack, you will need to create an `auth.properties` file in `src/test/resources/` and specify your username and access key.

### Running Tests
- For Emulator:
  ```bash
  ./gradlew clean tests -DdeviceHost=emulation
  ```
- For BrowserStack (from Jenkins Project):
  ```bash
  ./gradlew clean tests -DdeviceHost=browserstack
  ```

---

## Reporting and Dashboards
### Allure Reports
- Captures screenshots, logs, and test metrics.
- View comprehensive reports locally or through the Jenkins job.
- Link to Allure Report: [Allure Report](https://jenkins.autotests.cloud/job/wiki_mobile_project/allure/)


**Allure Report Dashboard**

<img src="media/images/screens/Allure_Overview.png" alt="Allure Logo" width="600" height="300">


**Allure Report Graphs**

<img src="media/images/screens/Allure_graphs.png" alt="Allure Logo" width="600" height="300">


**Allure Report test cases**

<img src="media/images/screens/Allure_Test_cases.png" alt="Allure Logo" width="600" height="300">


### Jenkins Dashboards
- Displays build trends and real-time test results.
- Accessible at: [Jenkins Dashboard](https://jenkins.autotests.cloud/job/wiki_mobile_project/)

**Jenkins Project**

<img src="media/images/screens/Jenkins_General.png" alt="Allure Logo" width="600" height="300">


### TestOps Dashboards
- Advanced analytics with pass/fail trends and defect tracking.
- Project link: [TestOps Dashboard](https://allure.autotests.cloud/project/4583/)


**TestOps Dashboard**

- <img src="media/images/screens/TestOps_Dashboard.png" alt="Allure Logo" width="600" height="300">

**TestOps test cases**

- <img src="media/images/screens/TestOps_Test_cases.png" alt="Allure Logo" width="600" height="300">

---


## Telegram Notifications
- Configured to send test results and Jenkins build statuses.
- Notifications include:
    - Build success/failure status.
    - Summary of passed/failed tests.
    - Links to Allure dashboards for detailed insights.

- <img src="media/images/screens/Telegram_notification.png" alt="Allure Logo" width="500" height="350">
---

## Test Execution Video from BrowserStack

BrowserStack is employed for remote device testing and video recording.

It captures every test execution, enabling efficient debugging and offering a clear visual representation of the test steps.

* Test execution videos can be accessed through Jenkins or a designated server path.
* These videos provide critical insights into test execution flows and failures, making them an indispensable tool for test analysis.

**Example Test Execution Video:**


---