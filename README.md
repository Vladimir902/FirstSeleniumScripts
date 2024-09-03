# Selenium WebDriver Setup Guide

This guide provides instructions on how to set up the Selenium WebDriver environment for automated testing in Java.

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure that JDK is installed on your machine. You can download it from the [Oracle JDK website](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Integrated Development Environment (IDE)**: You can use any Java IDE like [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), or [NetBeans](https://netbeans.apache.org/).

3. **Maven**: It's recommended to use a build tool like Maven or Gradle to manage dependencies.

## Steps to Set Up Selenium WebDriver

### 1. Install Java

- Download and install the JDK from the [Oracle JDK website](https://www.oracle.com/java/technologies/javase-downloads.html).
- Set up the `JAVA_HOME` environment variable to point to your JDK installation directory.

### 2. Set Up Your IDE

- **IntelliJ IDEA**:
  - Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/).
  - Open IntelliJ IDEA and create a new Java project.

- **Eclipse**:
  - Download and install [Eclipse](https://www.eclipse.org/).
  - Open Eclipse and create a new Java project.

### 3. Add Selenium WebDriver Dependencies

If you are using **Maven**:

1. Open your `pom.xml` file.
2. Add the Selenium WebDriver dependency:

    ```xml
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.24.0</version>        </dependency>
     <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.9.2</version>
        </dependency>
    </dependencies>
    ```
