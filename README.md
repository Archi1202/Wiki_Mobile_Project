# Wiki Mobile Project

## Project Overview
The Wiki Mobile Project is an automated testing framework designed for testing mobile applications. It leverages modern tools and frameworks to ensure high-quality standards and efficient testing workflows.

## Technologies Used
<img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" alt="Java Logo" width="30" height="30"> 
<img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" alt="IntelliJ IDEA Logo" width="30" height="30">
<img src="https://junit.org/junit5/assets/img/junit5-logo.png" alt="JUnit Logo" width="30" height="30">
<img src="https://gradle.org/images/gradle-knowledge-graph-logo.png" alt="Gradle Logo" width="30" height="30">
<img src="https://selenide.org/images/logo.svg" alt="Selenide Logo" width="30" height="30">
<img src="https://appium.io/img/appium-logo-horizontally.svg" alt="Appium Logo" width="30" height="30">
<img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure Logo" width="30" height="30">
<img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure TestOps Logo" width="30" height="30">
<img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" width="30" height="30">
<img src="https://www.jenkins.io/images/logos/jenkins/jenkins.svg" alt="Jenkins Logo" width="30" height="30">
<img src="https://telegram.org/img/t_logo.png" alt="Telegram Logo" width="30" height="30">
<img src="https://developer.android.com/studio/images/studio-icon.svg" alt="Android Studio Logo" width="30" height="30">

---

## Agenda

1. **Test Automation Goals:** <img src="https://cdn-icons-png.flaticon.com/512/845/845646.png" alt="Goals Icon" width="30" height="30">
   
   - Verify the functionality and performance of the Wiki mobile app.
   - Ensure cross-platform compatibility.
   - Deliver detailed and actionable reports for stakeholders.

2. **Tool Integrations:** <img src="https://cdn-icons-png.flaticon.com/512/2917/2917991.png" alt="Integration Icon" width="30" height="30">
   - <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure Logo" width="30" height="30"> **Allure Report** for in-depth reporting with screenshots and logs.
   - <img src="https://www.jenkins.io/images/logos/jenkins/jenkins.svg" alt="Jenkins Logo" width="30" height="30"> **Jenkins** for continuous integration and dashboard tracking.
   - <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" alt="Allure TestOps Logo" width="30" height="30"> **Allure TestOps** for centralized test management.
   - <img src="https://telegram.org/img/t_logo.png" alt="Telegram Logo" width="30" height="30"> **Telegram Notifications** for instant alerts.

3. **CI/CD Workflow:** <img src="https://cdn-icons-png.flaticon.com/512/711/711284.png" alt="Workflow Icon" width="30" height="30">
   - Code pushed to <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" alt="GitHub Logo" width="30" height="30"> **GitHub** triggers Jenkins pipelines.
   - Automated tests run on real or virtual Android devices via <img src="https://appium.io/img/appium-logo-horizontally.svg" alt="Appium Logo" width="30" height="30"> **Appium**.
   - Results are published to **Allure TestOps** and **Jenkins** dashboards.
   - Notifications are sent to the configured **Telegram** channel.

---

## Test Cases List
| Test Case ID | Test Description                                       | Priority | Status      |
|--------------|-------------------------------------------------------|----------|-------------|
| TC-001       | Verify search functionality with valid keywords       | High     | Automated   |
| TC-002       | Verify app behavior with invalid search input         | Medium   | Automated   |
| TC-003       | Check navigation to external links                   | Medium   | Automated   |
| TC-004       | Validate app response to network disruptions          | High     | Automated   |
| TC-005       | Ensure user settings are saved correctly              | Low      | Automated   |
| TC-006       | Test app performance under load                       | High     | Automated   |
| TC-007       | Verify compatibility with various Android versions    | High     | Automated   |

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

## Telegram Notifications
- Configured to send test results and Jenkins build statuses.
- Notifications include:
   - Build success/failure status.
   - Summary of passed/failed tests.
   - Links to Jenkins and Allure dashboards for detailed insights.

---

## Launch Settings
### Emulator
- Run tests on the emulator.
- To run locally via the emulator, you will need to install and configure the emulator.

### BrowserStack
- Run tests on BrowserStack.
- To run locally via BrowserStack, you will need to create an `auth.properties` file in `src/test/properties` and specify your username and access key.

### Running Tests from the Terminal
- For Emulator:
  ```bash
  ./gradlew clean mobile_tests -DdeviceHost=emulator
  ```
- For BrowserStack:
  ```bash
  ./gradlew clean mobile_tests -DdeviceHost=browserstack
  ```

---

## Reporting and Dashboards
### Allure Reports
- Captures screenshots, logs, and test metrics.
- View comprehensive reports locally or through the Jenkins job.

### Jenkins Dashboards
- Displays build trends and real-time test results.
- Accessible at: [Jenkins Dashboard](https://jenkins.autotests.cloud/job/wiki_mobile_project/)

### TestOps Dashboards
- Advanced analytics with pass/fail trends and defect tracking.
- Project link: [TestOps Dashboard](https://allure.autotests.cloud/project/4583/)

---