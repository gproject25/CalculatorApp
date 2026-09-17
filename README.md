# 🧮 Calculator App

> **Java를 활용한 단계별 계산기 구현 프로젝트**

Java의 기본 문법부터 다양한 Java 기능까지 단계적으로 적용하며 계산기 프로그램을 구현한 프로젝트입니다.

단순한 사칙연산 계산기에서 시작하여 클래스, Enum, Generic, Lambda, Stream, 예외 처리 등의 개념을 단계적으로 적용했습니다.

---

## 📌 Project Overview

| 항목 | 내용 |
|---|---|
| 📚 목적 | Java 기본 문법 및 주요 기능 학습 |
| 💻 Language | Java |
| 🧩 구현 단계 | STEP 1 → STEP 2 → STEP 3 |
| 📦 주요 Collection | `ArrayList` |
| 🔧 주요 개념 | Class, Enum, Generic, Lambda, Stream |
| ⚠️ 예외 처리 | `InputMismatchException` 등 |

### Project Goal
- 자바 기본 문법을 활용한 프로그램 구현
- 메서드 기능 분리 및 책임 분리
- 컬렉션을 활용한 데이터 관리 (ArrayList)
- 다양한 자바 기능 활용
- 예외 처리 (InputException)

---

## 🛠️ Implementation

### 1️⃣ STEP 1 — Basic Calculator

클래스를 사용하지 않고 Java의 기본 문법만을 활용하여 계산기를 구현

**주요 내용**

- 사칙연산 구현
- `switch`를 활용한 연산 처리
- 사용자 입력 처리
- 계산 결과 출력

📂 [STEP 1 바로가기](./src/STEP1)

<img src="./img.png" width="700"/>


---

### 2️⃣ STEP 2 — Advanced Calculator

계산기 기능을 클래스로 분리하여 객체지향적인 구조

**주요 내용**

- Calculator 클래스 구현
- 연산 기능 분리
- `ArrayList`를 활용한 계산 결과 관리
- `enum`을 활용한 연산자 관리
- 예외 처리 및 입력 검증

📂 [STEP 2 바로가기](./src/STEP2)

<img src="./img_1.png" width="700"/>

---

### 3️⃣ STEP 3 — Arithmetic Calculator

STEP 2의 구조를 확장하고 Java의 다양한 기능을 추가 적용

**주요 내용**

- `Generic <T>` 적용
- Lambda Expression 활용
- Stream 활용
- 기존 계산기 기능 확장
- 데이터 처리 및 필터링

📂 [STEP 3 바로가기](./src/STEP3)

<img src="./img_2.png" width="700"/>

---

## 🚀 프로젝트 구성

```text
CalculatorApp
├── src
│   ├── STEP1
│   │   └── App.java
│   │
│   ├── STEP2
│   │   ├── App.java
│   │   └── ...
│   │
│   └── STEP3
│       ├── App.java
│       └── ...
│
├── img.png
├── img_1.png
├── img_2.png
└── README.md
```
