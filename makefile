JC = javac
JVM = java
SRC = $(wildcard *.java)
CLASSES = $(SRC:.java=.class)

all: $(CLASSES)

%.class: %.java
    $(JC) $^

run: all
    $(JVM) TiendaRopa

clean:
    rm -f *.class