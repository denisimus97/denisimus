
package cocktail;

public class Cocktail {

    public static void main(String[] args) {
       int[] array = {14,9,17,23,1,3,2,19,6};
        int left = 0; 
        int right = array.length - 1; 
        int elem;
        do
             {
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    elem = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = elem;
                    /*можно сделать не используя третью переменную. Вот так:
                    array[i]=array[i + 1]+array[i];
                    array[i + 1]=array[i]-array[i + 1];
                    array[i]=array[i]-array[i + 1];*/
                 
                }
            }
            right--; 
            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                     elem = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = elem;
                    /*можно сделать не используя третью переменную. Вот так:
                    array[i]=array[i - 1]+array[i];
                    array[i - 1]=array[i]-array[i - 1];
                    array[i]=array[i]-array[i - 1];*/
                }
            }
            left++; 
        } while (left <= right);
        /* for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);                 вывод в столбец 
         } */
        for (int i : array) System.out.print(i + " "); // вывод в строку
    }
    
}
