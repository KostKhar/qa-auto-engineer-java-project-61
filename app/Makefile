# Homebrew OpenJDK 21 (install: brew install openjdk@21)
BREW_PREFIX := $(shell brew --prefix openjdk@21 2>/dev/null)
ifneq ($(BREW_PREFIX),)
export JAVA_HOME := $(BREW_PREFIX)/libexec/openjdk.jdk/Contents/Home
export PATH := $(JAVA_HOME)/bin:$(PATH)
endif

.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 9.2.1

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/java-package/bin/java-package

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew spotlessApply

update-deps:
	./gradlew refreshVersions
	# ./gradlew dependencyUpdates -Drevision=release

play-even:
	script -q /dev/null asciinema play src/main/resources/even.cast

play-calc:
	script -q /dev/null asciinema play src/main/resources/calc.cast

play-gcd:
	script -q /dev/null asciinema play src/main/resources/gcd.cast

play-prog:
	script -q /dev/null asciinema play src/main/resources/progression.cast

play-prime:
	script -q /dev/null asciinema play src/main/resources/prime.cast

build-run: build run

.PHONY: build

