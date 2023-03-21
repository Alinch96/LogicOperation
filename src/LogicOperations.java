public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        System.out.print("x = " + x + "= " + Integer.toBinaryString(x));
        System.out.print("\ty = " + y + "= " + Integer.toBinaryString(y));
        System.out.println("\tz = " + z + "= " + Integer.toBinaryString(z));

        x += y >> x++ * z; // x= 5+(0*15) =5

        System.out.print("x= " + x + "= ");
        System.out.println(Integer.toBinaryString(x));

        z = ++x & y * 5; // x= 7&50
        //   110010 (50)
        // & 000111  (7)
        //   000010  (2)
        System.out.println("z = " + z + "= " + Integer.toBinaryString(z));

        y /= x + 5 | z; //y= 10/(7+5|15)
        //    1111 (15)
        //  | 0101 (5)
        //    1101 (13)
        System.out.println("y = " + y + "= " + Integer.toBinaryString(y));

        z = x++ & y * 5; //z= 7&0 =0

        System.out.println("z = " + z + "= " + Integer.toBinaryString(z));

        x = y << x++ ^ z;// 0^0 = 0

        System.out.println("x = " + x + "= " + Integer.toBinaryString(x));
    }
}
