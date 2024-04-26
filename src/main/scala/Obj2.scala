object Obj2 {
  def main(args: Array[String]): Unit = {

    //Write a Scala function to check if a given number is both even and positive
    var a = 10
    if (a % 2 == 0 && a > 0) {
      println("Number is even and positive")
    }

    //Create a Scala program to determine if a given value is either less than -10 or greater than 10
    var b = -15
      if(b < -10 || b > 10 ) {
        println(b)
      }

    //Implement a Scala function to check if a given number is odd and not divisible by 3.
    var c = 27
    if (c%2 !=0 && c%3 != 0){
      println(c)
    }

    //Divisibility by 4 OR 6:
    var d=18
    if (d%4 ==0 || d%6 == 0){
      println(d)
    }

    //Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
    //eligible to drive (age greater than or equal to 16)
    var e=20
    if(e>=18 || e>=16){
      println(e)
    }

    //Write a Scala function to check if a given number is in the range [1, 10] or [20, 30]
    var f=25
    if ((f>=1 || f<=10) || (f>=20 || f<=30))
    {
      println(f)
    }

    //Implement a Scala program to check if a given number is both negative and odd
    var g = -7
    if (g<0 && g%2!=0){
      println(g)
    }

    //Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
    //60) or a student discount (age less than 25).
    var h= 63
    if(h<25 || h>60){
      println(h)
    }

    //Write a Scala function to check if a given number is divisible by both 5 and 7

    var i=18
    if (i%5 ==0 && i%7 == 0){
      println(i)
    }

    //Create a Scala program to check if a given number is either non-negative or even
    var j= -8
    if (j >= 0 || i%2 == 0){
      println(j)
    }

    //Write a Scala function to check if a given number is both a prime number and an odd number

    //Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
    //than 150) or qualifies for free shipping (purchase amount greater than 100).
    var k= 120
    if(k>150){
      println("Customer Eligible for discount")
    }
    if(k>100){
      println("Qualifies for Free Shipping")
    }

    //Write a Scala function to check if a given number is divisible by either 3 or 8.
    var l=24
    if (l%3 ==0 && l%8 == 0){
      println(l)
    }

    //Implement a Scala program to check if a given number is both non-positive and even.
    var m= -6
    if (m <= 0 && m%2 == 0){
      println(m)
    }

    //Age Group Classification with AND
    var age=15
    if (age<13 && age>=1){
      println("Child")
    }
    else if(age>=13 && age<=19){
      println("Teenager")
    }

    else if(age>=20){
      println("Adult")
    }

  //Check for Divisibility by 2 OR 5
  var n=25
    if (n%2 ==0 || n%5 == 0){
      println(n)
    }

    //Eligibility for Senior Discount AND Student Discount:
    var age1=70
    if (age1>60){
      println("Senior Citizen Discount")
    }
    else if (age1<25){
      println("Eligible for Student Discount")
    }

    //Check for Multiple of 3 AND 7
    var o=21
    if (o%3 ==0 && o%7 == 0){
      println(o)
    }

    //Write a Scala program to check if a given number is divisible by either 5 or 9
    var p=45
    if (p%5 ==0 || p%9 == 0){
      println(p)
    }










    }

}