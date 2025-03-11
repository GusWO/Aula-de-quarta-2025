
package textblock;


public class TextBlock {

    
    public static void main(String[] args) {
        
        String s = "dasdadadasd".toUpperCase().indent(9);
        
        String s2 = """
                    String msg = "Hello there";
                    System.out.println(msg);
                    """.toUpperCase();
                    
        
        System.out.println(s);
        System.out.println(s2);
        
        String colors = """
                red  \s
                green\s
                blue \s
                """;
        System.out.println(colors);
        
        String name = "Gustavo";
        String phone = "11213342";
        String address = "rua tal";
        Float salary = 25000.56f;
        String output = """
                Name: %s Phone: %s
                
                Address: %s
                Salary: $%.2f
    """.formatted(name, phone, address, salary);
        
        System.out.println(output);
    }
    
}
