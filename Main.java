class Main {
  public static void main(String[] args) {
      countdown(7);
      //fizzbuzz();
    }

    public static void countdown(int x) {
        // complete this method
        char data [] = {'C','O','D','E'};

        int i = 0;
        while( x > 0) {
            System.out.println(x + " " + data[i]);  
            x = x - 1;           
            i = i + 1;
            if (i == data.length) {
                i = 0;
            } 
        }
    }
    public static void fizzbuzz() {
        // declare variables
        int counter = 1;
        while (counter <=100) {
            if (counter % 3 == 0 && counter % 5 ==0) {
                System.out.println("fizzbuzz");
            } else if (counter % 3 == 0) {
                System.out.println("fizz");
            } else if (counter % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(counter);
            }
            counter = counter + 1;
        }
    }
}