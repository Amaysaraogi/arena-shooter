JAVAC = javac
JAVA = java
SRC_DIR = src
OUT_DIR = out
MAIN = Main
SOURCES = $(wildcard $(SRC_DIR)/*.java)

all: $(OUT_DIR)
	$(JAVAC) -d $(OUT_DIR) $(SOURCES)

$(OUT_DIR):
	mkdir -p $(OUT_DIR)

run: all
	$(JAVA) -cp $(OUT_DIR) $(MAIN)

clean:
	rm -rf $(OUT_DIR)

.PHONY: all run clean
