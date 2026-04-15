# Homebrew OpenJDK 21 (install: brew install openjdk@21)
BREW_PREFIX := $(shell brew --prefix openjdk@21 2>/dev/null)
ifneq ($(BREW_PREFIX),)
export JAVA_HOME := $(BREW_PREFIX)/libexec/openjdk.jdk/Contents/Home
export PATH := $(JAVA_HOME)/bin:$(PATH)
endif

.PHONY: setup clean build install run-dist run test report lint check-deps build-run play

setup:
	./gradlew wrapper --gradle-version 8.13

clean:
	./gradlew clean

build:
	./gradlew clean build

installDist:
	./gradlew clean installDist

install-jar:
	./gradlew installDist

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

test:
	./gradlew test

lint:
	./gradlew checkstyleMain

check-deps:
	./gradlew dependencyUpdates -Drevision=release

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

