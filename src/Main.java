public class Main
{
    public static boolean canTransform(String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();


        for(int i = 0; i < c1.length; i++)
        {
            if(i != c1.length - 1)
            {
                if(c1[i] == c1[i + 1] && c2[i] != c2[i + 1])
                {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args)
    {
        canTransform("leban", "yusif");
    }

}
