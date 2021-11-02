# Carbon-Android
# This project is executed using Katalon Studio

#Installation/Setup Guideline

1. Download and Intsall latest Katon studio app from www.katalon.com
2. Install Node.js
Download and install Node.js using the Windows installer on: https://nodejs.org/en/download. Make sure you install Node.js into a location where you have full Read and Write permissions.
When installing Node.js, make sure that the Add to PATH option is checked. To make sure Node.js is installed correctly, you can open Windows command line and type the command: where node to see if system can find Node.js.
3.Install Appium
Open Command Prompt of Windows and input following command to install Appium.
npm install -g appium

4. Open Katalon Studio and go to the Windows > Katalon Studio Preferences > Katalon > Mobile settings. Set Appium Directory to the installed folder. By default, it's usually installed at C:\Users\{your login account}\AppData\Roaming\npm\node_modules\appium.
Setup Devices
5. Install USB Driver for your phone, you can download it from the device manufacturer site. (If your Android phone is one of Google Nexus series, please skip this step because Android SDK already include the driver).
6. Turn on the phone developer mode (go to Settings -> Developer options).
Connect your Android device to the computer using USB cable. Just confirm if prompted for accepting/trusting the phone.

#Test Execution

1. Launch Katalon studio
2. clone the carbon android app test suite from the repository https://github.com/johnkelvin360/Carbon-Android.git
3. Navigate to Projects-settings and add the following capabilities (automationName = uiAutomator2)
4. Conect your mobile test device
5. Run Mobile test.
