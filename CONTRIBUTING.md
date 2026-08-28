# Contributing

## Getting Started

1. Fork the repository and clone your fork.
2. Ensure you have Java 11+, Maven 3.6+, and Google Chrome installed.
3. Run `mvn test` to verify everything passes before making changes.

## Adding a New Feature

Follow this checklist for each new page/flow you want to test:

1. **Page Object** — add a class under `src/test/java/pages/` extending `BasePage`.
2. **Feature file** — add a `.feature` file under `src/test/resources/features/` using Gherkin.
3. **Step Definitions** — add a class under `src/test/java/steps/` wiring Gherkin steps to page methods.
4. Run `mvn test` and confirm all scenarios are green.

## Code Style

- Match the existing package structure (`pages`, `steps`, `runners`).
- Page Objects expose intent-driven methods (`clickLogin()`, not `clickButton()`).
- Keep step definitions thin — delegate logic to page objects.
- No hard sleeps (`Thread.sleep`); use `WebDriverWait` via `BasePage.waitFor()`.

## Pull Requests

- One logical change per PR.
- Include a short description of what scenario is covered and why.
- Ensure `mvn test` is green before opening the PR.
