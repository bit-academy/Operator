public class IntegerDataType
{
    public static void main(String[] args)
    {
        byte b = 120;
        short s = 450;
        int i = 123;
        long l = 11111;

        int result1 = b + s;
        long result2 = i + l;
        int result3 = result1 + (int)result2;
    }
}

