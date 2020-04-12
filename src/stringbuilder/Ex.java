package stringbuilder;

public class Ex{

    public static void main( String[] args ) {

        StringBuilder sb = new StringBuilder("James");
        sb.append(" Bond");
        sb.append(4);
        sb.deleteCharAt(1);
        System.out.println(sb); //Jmes Bond4
        sb.reverse(); //
        System.out.println(sb); //4dnoB semJ
        sb.insert(0, "Hello");
        System.out.println(sb); //Hello4dnoB semJ
        sb.delete(0,sb.length()); // if you delete everything it does not say null until you give null to it
        System.out.println(sb);  // sb get the new value James Bond


    }
}
