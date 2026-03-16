// PalmerPenguins.java
// Sakura Gordon
// 3/16/2026
// Refactored Palmer Penguins analysis using object-oriented approach

package edu.fscj.cop2800c.penguin;

public class PalmerPenguins {
    public static void main(String[] args) {
        // Create an instance of PenguinAnalyzer
PenguinAnalyzer analyzer = new PenguinAnalyzer();

analyzer.readPenguinData();
analyzer.printPenguinData();
analyzer.writePenguinData();
    }
}
