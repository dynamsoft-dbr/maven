# DBR Java Example Using Maven
Use Visual Studio Code and Maven to build and run Java barcode reader built with [Dynamsoft Barcode Reader](https://www.dynamsoft.com/Products/Dynamic-Barcode-Reader.aspx).

## Installation
* [Visual Studio Code](https://code.visualstudio.com/download)
* [Maven](https://maven.apache.org/download.cgi)
* [Maven for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven)
* [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)

## HowTo
1. Load projects to Visual Studio Code.
2. Run `mvn package`.
3. Press `F5` to debug the code. Or run it in command line:
    
    Windows
    ```
    java -cp target/BarcodeReaderDemo-1.0-SNAPSHOT.jar;%USERPROFILE%\.m2\repository\com\dynamsoft\dbr\6.2\dbr-6.2.jar  com.dynamsoft.demo.App
    ```
