# Cucumber BDD Demo — Java + Maven + Selenium

Training project for QA engineers. Tests run against **the-internet.herokuapp.com** — a public practice site, no credentials or setup required beyond Java and Maven.

---

## Prerequisites

- Java 11+
- Maven 3.6+
- Google Chrome (latest)

That's it. WebDriverManager downloads ChromeDriver automatically.

---

## Project Structure

```
cucumber-demo/
├── pom.xml
└── src/test/
    ├── java/
    │   ├── pages/          ← Page Object Model
    │   │   ├── BasePage.java
    │   │   ├── LoginPage.java
    │   │   ├── CheckboxPage.java
    │   │   └── DropdownPage.java
    │   ├── steps/          ← Step Definitions + Hooks
    │   │   ├── Hooks.java
    │   │   ├── LoginSteps.java
    │   │   ├── CheckboxSteps.java
    │   │   └── DropdownSteps.java
    │   └── runners/
    │       └── TestRunner.java
    └── resources/
        └── features/       ← Gherkin feature files
            ├── login.feature
            ├── checkbox.feature
            └── dropdown.feature
```

---

## Running Tests

```bash
# Run all scenarios
mvn test

# Run a specific feature file
mvn test -Dcucumber.features=src/test/resources/features/login.feature

# Run by tag (once you add @smoke etc. to scenarios)
mvn test -Dcucumber.filter.tags="@smoke"
```

---

## Reports

After running, open:
```
target/cucumber-reports.html
```

---

## Key Concepts Demonstrated

| Concept | Where to look |
|---|---|
| Feature file / Gherkin syntax | `features/login.feature` |
| Background (shared setup) | `features/login.feature` |
| Scenario Outline + Examples | `features/login.feature` |
| Step Definitions | `steps/LoginSteps.java` |
| Page Object Model | `pages/LoginPage.java` |
| Hooks (Before/After) | `steps/Hooks.java` |
| Screenshot on failure | `steps/Hooks.java` |
| Parameterized steps `{string}` | `steps/LoginSteps.java` |
| Parameterized steps `{int}` | `steps/CheckboxSteps.java` |

---

## Headed vs Headless

By default the browser is **visible** — great for demos.
To run headless, uncomment this line in `Hooks.java`:
```java
// options.addArguments("--headless");
```
