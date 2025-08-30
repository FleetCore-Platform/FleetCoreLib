default: install

clean:
	mvn clean

install: clean
	mvn install

.PHONY: clean build install