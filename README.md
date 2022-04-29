# **POWER NUMBERS**

## INFORMATION

* **Base and power numbers are determined and exponentiation is done.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **a**, **b**, **total**, **i** and **value** are defined with int.

* Base and exponent numbers are determined by taking data from the user.

* The exponentiation calculation was performed using the recursive method.

## CODES

```Java

        import java.util.Scanner;

        public class powernumbers{

            static int power(int a, int b){

                int total = 1;

                for(int i = 1; i <= b; i++){

                    total *= a;


                }

                return total;
            }


```

```Java

            public static void main(String[] args) {

                int a, b;

                Scanner value = new Scanner(System.in);

                System.out.print("Enter First Number : ");

                a = value.nextInt();

                System.out.print("Enter Second Number : ");

                b = value.nextInt();


                System.out.println("Result : " + power(a, b));

            }
        }

```

```bash

    Enter First Number : 3
    Enter Second Number : 4
    Result : 81

```

<br />

## LINK

* Click here https://github.com/Fogo9/PowerNumbers.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
