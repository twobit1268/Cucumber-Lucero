# CLAUDE.md — cucumber-demo

## Project Overview
Java + Maven + Selenium + Cucumber BDD training project for QA engineers.
Tests run against **the-internet.herokuapp.com** (public practice site, no credentials needed).

## Stack
- Java 11
- Maven 3.6+
- Cucumber 7.x (JUnit runner)
- Selenium 4.x
- WebDriverManager 6.x (auto-downloads ChromeDriver)

## Running Tests
```bash
mvn test                                                          # all scenarios
mvn test -Dcucumber.features=src/test/resources/features/login.feature  # single feature
mvn test -Dcucumber.filter.tags="@smoke"                          # by tag
```

## Project Layout
```
src/test/
  java/
    pages/    ← Page Object Model (extend BasePage)
    steps/    ← Step definitions + Hooks
    runners/  ← TestRunner.java (JUnit entry point)
  resources/
    features/ ← Gherkin .feature files
```

## Code Conventions
- Page Objects extend `BasePage`; expose intent-driven methods, not raw Selenium calls.
- Step definitions stay thin — delegate all logic to page objects.
- No `Thread.sleep`; use `BasePage.waitFor()` (WebDriverWait).
- Browser is **headed** by default; uncomment `--headless` in `Hooks.java` for CI.

## Dependency Security
Transitive dependency overrides are pinned directly in `pom.xml` `<dependencies>` using Maven's nearest-wins rule:
- `jackson-core` ≥ 2.18.6 (WS-2026-0003)
- `commons-lang3` ≥ 3.18.0 (CVE-2025-48924)

When updating dependencies, verify no new CVEs are introduced (Mend.io warnings appear in the IDE).

## Commit Style
```
type: short imperative summary

- bullet details if needed
```
Common types: `feat`, `fix`, `ci`, `chore`, `docs`.
