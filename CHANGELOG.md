# Changelog

All notable changes to this project are documented here.
Format follows [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

---

## [Unreleased]

## [1.0.1] — 2026-08-28

### Security
- Bump `webdrivermanager` 5.6.3 → 6.1.0 (CVE-2025-4641, CVSS 9.4 — XXE injection)
- Pin `jackson-core` 2.18.6 transitive override (WS-2026-0003, CVSS 7.5 — async parser DoS)
- Pin `commons-lang3` 3.18.0 transitive override (CVE-2025-48924, CVSS 5.3 — stack overflow)
- Bump `selenium-java` 4.15.0 → 4.25.0

### CI
- Pin GitHub Actions to Node 24-compatible versions
- Upgrade `setup-java` to v5; add Chrome sandbox flags for GitHub Actions runners

## [1.0.0] — Initial Release

### Added
- Cucumber BDD demo with login, checkbox, and dropdown scenarios
- Page Object Model (`BasePage`, `LoginPage`, `CheckboxPage`, `DropdownPage`)
- Hooks with screenshot-on-failure
- Scenario Outline + Examples in `login.feature`
- HTML report via `cucumber-reporting` plugin
