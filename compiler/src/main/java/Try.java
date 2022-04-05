public class Try {
static void printSum(int a){ int sum = 0;
int number = 0;
while (number < a)
{
number = number + 1;
sum = sum + number;
System.out.println(sum);
}


return;
}public static void main(java.lang.String[] args)
{
int a = 6;
printSum(a);
System.out.println("ThisIsTheRight");
}

}