# Security Policy

## Supported Versions

| Version | Supported |
|---------|-----------|
| 1.x     | Yes       |

## Reporting a Vulnerability

Please do **not** open a public GitHub issue for security vulnerabilities.

Report them privately via GitHub's [Security Advisories](../../security/advisories/new) feature,
or email the maintainer directly.

We aim to acknowledge reports within 48 hours and publish a fix within 14 days for confirmed issues.

## Dependency Vulnerabilities

This project uses [Mend.io](https://www.mend.io/) via JetBrains IDE integration to surface CVEs in dependencies.

When a transitive dependency vulnerability is reported:
1. Add an explicit version override in `pom.xml` `<dependencies>` to force the patched version (Maven nearest-wins).
2. Document it in `CHANGELOG.md` under `Security`.
3. Commit with message type `fix:` referencing the CVE/WS ID and CVSS score.

## Known Patched CVEs

| ID | Library | Patched Version | CVSS |
|----|---------|-----------------|------|
| CVE-2025-4641 | webdrivermanager | 6.1.0 | 9.4 |
| WS-2026-0003 | jackson-core | 2.18.6 | 7.5 |
| CVE-2025-48924 | commons-lang3 | 3.18.0 | 5.3 |
