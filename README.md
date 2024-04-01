# The-HerokuApp-Web-Automation-with-Selenium
This repository hosts automated test scripts utilizing Selenium WebDriver for web application testing on Herokuapp. The test suite covers diverse functionalities and scenarios to ensure expected behavior.

Test Cases:

Basic Authentication:

Preconditions: Open the Main page
Step 1: Click the "Basic Auth" link and perform basic authentication
Step 2: Accept alert
Expected Result: Success message is displayed on the Basic Auth page


Sortable Data Tables:

Preconditions: Open the Main page
Step 1: Click the "Sortable Data Tables" link
Expected Result: Example 1 dues sum equals 251.0


Dynamic Controls:

Preconditions: Open the Main page
Step 1: Click the "Dynamic Controls" link
Step 2: Click the "Enable" button
Step 3: Send random text to Enable/disable input
Expected Result: Enable/disable input is enabled and random text is displayed


File Download:

Preconditions: Open the Main page
Step 1: Click the "File Download" link
Step 2: Download "Test.txt" file
Expected Result: "Test.txt" file is downloaded


File Upload:

Preconditions: Open the Main page
Step 1: Click the "File Upload" link
Step 2: Upload the file and click Upload button
Expected Result: File name on Upload page is correct


Frames:

Preconditions: Open the Main page
Step 1: Click the "Frames" link
Step 2: Click the "iFrame" link
Step 3: Input random generated text to the text editor
Step 4: Undo changes with Edit menu
Expected Result: "Your content goes here." text is displayed in the editor after undoing changes


JavaScript Alerts:

Preconditions: Open the Main page
Step 1: Click the "JavaScript Alerts" link
Step 2: Click the "Click for JS Alert" button
Step 3: Accept alert
Expected Result: Success message is displayed on the JavaScript Alert page
