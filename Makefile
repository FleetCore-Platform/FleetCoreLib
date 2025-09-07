.PHONY: clean install format lint test

default: install

clean:
	./mvnw clean

install: clean
	./mvnw install

format:
	./mvnw spotless:apply

lint:
	./mvnw verify

test:
	./mvnw test

