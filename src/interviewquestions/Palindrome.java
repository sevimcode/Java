package interviewquestions;

public class Palindrome{



        public static void main(String[] args) {
            char[] c = new char[1000000];
            c[0] = 'a';

            String s = new String(c);
            long start = System.currentTimeMillis();
            //System.out.println(isPalindrome(s));
            //System.out.println(isPalindromeBetterOne(s));
            System.out.println(isPalindromeWithStringBuilder(s));
            long end = System.currentTimeMillis();
            System.out.println(end - start);


            // how do you test your palindrom?
            System.out.println(isPalindromeBetterOne("civic"));
            System.out.println(isPalindromeBetterOne("civic1"));
            System.out.println(isPalindromeBetterOne("Civic"));
            System.out.println(isPalindromeBetterOne("  civic"));
            System.out.println(isPalindromeBetterOne(""));
            System.out.println(isPalindromeBetterOne(null));
        }

        static boolean isPalindrome(String str)
        {
            String reversed = "";
            for(int i = str.length()-1; i >= 0; i--)
                reversed += str.charAt(i);
            return str.equals(reversed);
        }

        static boolean isPalindromeBetterOne(String s)
        {
            boolean isPalindrome = true;

            for(int i = 0; i < s.length()/2; i++)
            {
                if(s.charAt(i) != s.charAt(s.length() -1 - i))
                {
                    isPalindrome = false;
                    break;
                }

            }

            return isPalindrome;
        }

        static boolean isPalindromeWithStringBuilder(String s)
        {
            StringBuilder sB = new StringBuilder(s);
            String reversed = sB.reverse().toString();
            return s.equals(reversed);


        }

    }





