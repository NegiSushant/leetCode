public class SmallestLetter {

    public static void main(String[] args) {
        char target = 'a';
        char [] letter = {'c', 'f', 'l', 'm', 'z'};
        int ans = nextGreatestLetter(letter, target);
        System.out.println(ans);


    }
    static public char nextGreatestLetter(char[] letter, char target)
    {
        int start = 0;
        int end = letter.length - 1;

        while(start<=end)
        {
            int mid = start +(end - start)/2;
            if(target < letter[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }

        }
        return letter[start % letter.length];
    }
}
