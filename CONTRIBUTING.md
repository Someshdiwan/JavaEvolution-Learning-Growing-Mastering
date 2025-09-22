# Contributing to JavaEvolution — Learning, Growing, Mastering

Thank you for wanting to contribute! This project exists to help learners understand Java through **clear examples, practical explanations, and polished documentation**. Whether you’re fixing a typo, adding an example, improving site content, or contributing tooling — your work matters. 🌱

---

## ⚖️ License & Attribution

This repository and all its contents are **Copyright (c) 2025 Somesh Diwan. All rights reserved.**

If you fork, adapt, or redistribute any part of this repository, **you must include this exact attribution line** in your fork’s `README.md`, documentation files, or code comments:

```
Original Author: Somesh Diwan
```

Failure to provide this attribution is a violation of the license terms.

---

## 📖 Table of Contents
- [What to Contribute](#what-to-contribute)
- [Getting Started (Local Setup)](#getting-started-local-setup)
- [Branching & Workflow](#branching--workflow)
- [Commit Message Format](#commit-message-format)
- [Testing Locally](#testing-locally)
- [Quality Checklist](#quality-checklist-before-opening-pr)
- [Pull Request & Review Process](#pull-request--review-process)
- [Code Style & Best Practices](#code-style--best-practices)
- [Communication & Etiquette](#communication--etiquette)
- [Contributor Code of Conduct](#contributor-code-of-conduct)
- [Contact / Support](#contact--support)

---

## 💡 What to Contribute
Helpful contributions include:
- New or improved **Java example files** (`.java`) in the correct section folders.
- Explanatory files (`.md`, `.txt`) accompanying examples.
- Fixes: typos, unclear wording, or broken examples.
- Site improvements under `site/` (Jekyll pages, assets, docs).
- Tests, utilities, or tooling that make examples easier to run.
- Advanced content: concurrency, streams, design patterns, or integration with databases.
- Translations, diagrams, or supplementary learning material.

👉 If you’re unsure where a change belongs, open an issue and label it `help wanted`.

---

## 🛠️ Getting Started (Local Setup)

Suggested workspace folder name: `Java Se`.

**macOS / Linux**
```bash
mkdir -p ~/Projects/"Java Se"
cd ~/Projects/"Java Se"
```

**Windows (PowerShell)**
```powershell
mkdir "C:\Users\<YourName>\Projects\Java Se"
cd "C:\Users\<YourName>\Projects\Java Se"
```

Clone your fork:
```bash
git clone https://github.com/<your-username>/JavaEvolution-Learning-Growing-Mastering.git
cd JavaEvolution-Learning-Growing-Mastering
```

Add upstream remote:
```bash
git remote add upstream https://github.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering.git
```

### ✅ Prerequisites
- Git (latest stable)
- Java JDK (8+ depending on the section) → Check with `java -version`
- Optional: Maven or Gradle
- Optional: Jekyll (if working on `site/`)
- IDE: IntelliJ IDEA, VS Code, or Eclipse

---

## 🌱 Branching & Workflow
- Always create a new branch per feature/fix:
```bash
git checkout -b feat/<topic>-short-description
```
- Regularly sync with upstream `main` to avoid conflicts:
```bash
git fetch upstream
git rebase upstream/main   # or `merge` if preferred
```
- Push to your fork:
```bash
git push origin feat/<topic>-short-description
```
- Open a Pull Request against `main` with a clear description.

---

## 📝 Commit Message Format
Follow a **structured commit message style** to keep history clear.

### Supported Types
| Type       | Purpose |
|------------|---------|
| `feat`     | New feature/example |
| `fix`      | Bug fix |
| `docs`     | Documentation updates |
| `style`    | Formatting, missing semicolons, whitespace |
| `refactor` | Code changes without feature/bug impact |
| `perf`     | Performance improvement |
| `test`     | Adding/updating tests |
| `chore`    | Build process, dependencies, tooling |
| `ci`       | Continuous Integration changes |

### Format
```
<type>(scope): short summary

What
- Bullet list of changes.

Why
- Reason for the change.

How / Logic
- Key details or design decisions.

Testing / Notes
- How you tested, limitations, or notes for reviewers.
```

**Short Example:**
```
fix(inheritance): correct typo in class name
```

**Detailed Example:**
```markdown
feat(jdbc): add prepared statement example

What
- Added PreparedStatement demo in `Section28JDBCusingSQLite/JDBCProgram`.
- Updated explanation text file.

Why
- Learners need secure, parameter-bound SQL examples.

How / Logic
- Used try-with-resources and parameter binding.
- Added comments for clarity.

Testing / Notes
- Ran manually with SQLite DB; validated output.
```

---

## 🧪 Testing Locally

### Java Examples
```bash
javac -d out src/Section12Inheritance/YourExample.java
java -cp out Section12Inheritance.YourExample
```
Ensure examples compile and run without missing dependencies.

### Documentation / Site
```bash
cd site
jekyll serve
```

### JUnit Tests (if available)
```bash
mvn test
# or
gradle test
```

---

## ✅ Quality Checklist (Before Opening PR)
- [ ] Code compiles without errors/warnings.
- [ ] Example is runnable and documented.
- [ ] Commit message follows format.
- [ ] Attribution included when adapting external content.
- [ ] Tests updated/added if relevant.

---

## 🔄 Pull Request & Review Process
- Open a PR against `main` with a **clear title** and **description**.
- Link related issues (if any).
- Draft PRs are welcome for early feedback.
- Reviewer may request changes → respond & push updates.
- Once approved, maintainers will merge.

---

## 🎯 Code Style & Best Practices
- Prefer **clear, self-explanatory examples** over clever tricks.
- Add comments where a learner may struggle.
- Keep methods **short & focused**.
- Avoid large external dependencies for single examples.
- Always use `try-with-resources` for I/O and DB examples.
- Consistent formatting → auto-format with IDE before committing.

---

## 🤝 Communication & Etiquette
- Be respectful and patient in discussions.
- Ask questions openly if unsure.
- Small, incremental PRs are easier to review.
- Assume good intent; focus on learning and collaboration.

---

## 📜 Contributor Code of Conduct
By participating in this project, you agree to:
- Treat everyone with respect and kindness.
- Provide constructive feedback.
- Avoid harassment, discrimination, or offensive behavior.
- Foster an inclusive and supportive learning community.

Violations may result in being blocked from contributions.

---

## 📬 Contact / Support
If you have questions before contributing, open an issue with the `question` label.

---

## 🙏 Thank You!
Your contributions make JavaEvolution better for learners worldwide. Keep examples **clear, well-documented, and focused on teaching.** 🚀

---
