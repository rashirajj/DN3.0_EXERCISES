// src/BuilderPatternTest.java

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a basic computer
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                                    .build();
        System.out.println(basicComputer);

        // Create a computer with all options enabled
        Computer advancedComputer = new Computer.Builder("Intel i7", "16GB")
                                      .storage("1TB SSD")
                                      .graphicsCard(true)
                                      .bluetooth(true)
                                      .build();
        System.out.println(advancedComputer);

        // Create a computer with selected options
        Computer customComputer = new Computer.Builder("AMD Ryzen 5", "12GB")
                                    .storage("512GB SSD")
                                    .build();
        System.out.println(customComputer);
    }
}
