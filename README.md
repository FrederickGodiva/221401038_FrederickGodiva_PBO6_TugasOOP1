<h1 align="center">Tugas 1 PBO 6</h1>

# Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Tech Stack](#tech-stack)
- [Usage](#usage)

# Overview
This is a project for the OOP class. The project is about creating a payment system that can handle various payment methods, calculate the total price after discount, and display the payment status to the user.

# Project Structure

```
├── out                             # Compiled Files
├── README.md                       # Project Documentation
├── Requirements.md                 # Assignment Description
├── src             
|  ├── Main.java                    # Entry Point
|  ├── model
|  |  └── Payment.java              # Payment Class
|  ├── service
|  |  └── PaymentService.java       # Payment Service
|  └── util
|     └── CurrencyFormatter.java    # Currency Formatter Class
└── Tugas1_PBO6.iml                 # IntelliJ Project File
```

# Tech Stack

[![Tech Stack](https://skillicons.dev/icons?i=java)](https://www.java.com/en/)

# Usage

1. Clone the repository
   ```bash
   git clone https://github.com/FrederickGodiva/221401038_FrederickGodiva_PBO6_TugasOOP1.git
    ```
2. Open Project
   ```bash
   cd 221401038_FrederickGodiva_PBO6_TugasOOP1
   ```
3. Compile All Files
   ```bash
   javac -d out src/model/Payment.java src/service/PaymentService.java src/util/CurrencyFormatter.java src/Main.java
   ```
4. Run Main Class
   ```bash
   java -cp out Main
   ```
   
---

Copyright &copy; 2025 Frederick Godiva