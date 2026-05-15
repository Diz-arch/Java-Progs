public class ReplaceCharacter {
    public static void main(String[] args) {
        // The original string
        String originalString = "The diligent dog dug a deep hole in the dirt.";
        
        System.out.println("Original String : " + originalString);

        String modifiedString = originalString.replace('d', 'f');

        System.out.println("Modified String : " + modifiedString);
    }
}