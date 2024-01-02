public class NonPrimitiveDataTypes {
    public static void main(String[] args) {

        Byte a = Byte.valueOf((byte) -126);
        Character b = Character.valueOf('+');
        Integer c = Integer.valueOf(5);
        Float d = Float.valueOf(5.0f);
        Long e = Long.valueOf(256987);
        Double f = Double.valueOf(45.5468);
        Boolean g = Boolean.valueOf(true);
        Short h = Short.valueOf((short) 26487);

        System.out.println("byte a " + a);
        System.out.println("char b " + b);
        System.out.println("int c " + c);
        System.out.println("float d " + d);
        System.out.println("long e " + e);
        System.out.println("double f " + f);
        System.out.println("boolean g " + g);
        System.out.println("short h " + h);
    }
}
