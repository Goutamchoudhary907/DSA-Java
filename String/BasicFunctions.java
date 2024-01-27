public class BasicFunctions {
    public static void main(String[] args) {
        String str= "Hello World";
        System.out.println("Str length:"+str.length());

        System.out.println("Char At index 3:"+str.charAt(3));

        System.out.println("Index of W:"+ str.indexOf('W'));

        String gtr="Dello";

        // Compare lexicographycally
        System.out.println("Comparision:"+str.compareTo(gtr));

        System.out.println("Concat :"+str.concat(gtr));


        String s="Physics Wallah";

        // Give true only when string contains same string that is pass  , give error in Phyc because s is missing 
        System.out.println( "Contain :"+s.contains("Phyc"));

        System.out.println("Start with "+s.startsWith("Ph"));

        System.out.println("End with"+s.endsWith("laa"));


    }
}
