# Setup and Baseline

This guide covers the environment and starting baseline for the SDE II roadmap. The curriculum and setup topics are defined in [ROADMAP.md](../ROADMAP.md); current learning progress belongs in [PROGRESS.md](../PROGRESS.md).

## Local tools confirmed

These tools are available in the current development environment:

| Tool | Detected version | Check |
|---|---|---|
| Java (Temurin JDK) | 21.0.12.1 LTS | `java -version` |
| Apache Maven | 3.9.16 | `mvn -version` |
| Git | 2.43.0 | `git --version` |

GitHub remote configuration exists, but SSH authentication has not been confirmed: the previous push attempt was rejected because GitHub did not accept the configured public key. Verify authentication before relying on push or pull-request workflows.

## Environment to have ready

### Core development setup

- Java 21 or newer JDK, with `JAVA_HOME` and `PATH` configured.
- Maven or Gradle for Java builds. Maven is installed; understand the basic Gradle concepts and how they differ, as described in the roadmap.
- An IDE that supports Java projects, debugging, breakpoints, watches, call stacks, and thread inspection.
- Git and a GitHub remote with working authentication for fetch, push, branches, and pull requests.
- A terminal and the command-line tools needed for navigation, HTTP requests, JSON inspection, process inspection, and log reading.

### Practice and project support

- Docker for later backend and container work.
- JUnit 5 for Java tests; add it to projects through their build configuration when needed.
- A notes system, coding practice platform, and issue tracker to record learning, practice, and project tasks.
- Basic CI familiarity for building and checking changes in a repository.

The roadmap is the guide to which tools are required at each stage. Avoid installing optional technologies before they are needed for the curriculum or a project.

## Repository workflow

1. Read `AGENTS.md` before repository work and inspect the relevant module files.
2. Use `ROADMAP.md` for curriculum scope and `PROGRESS.md` for confirmed status.
3. Make small, focused changes; review `git status` and the diff before staging.
4. Use branches and pull requests when GitHub authentication is working. Do not commit or push unless the task calls for it.

## Study workflow

Use the learning and review methods in `ROADMAP.md`: learn a topic, implement it, test and debug the work, then explain and revisit it. Keep Java as the implementation language for DSA in `01-dsa-java/`. Record only completed work in `PROGRESS.md`; folder creation or resource collection is not evidence of topic completion.

## Starting baseline

The roadmap's Phase 0 baseline consists of:

- One timed DSA session.
- One Java fundamentals assessment.
- One SQL assessment.
- One basic system design attempt.

Record weak areas for follow-up rather than treating the assessments as pass/fail. Also confirm the Java development environment and build tool work, a unit test can run, Git repository workflows work, and a Java application can be debugged. Update `PROGRESS.md` only with results that have actually been completed.
