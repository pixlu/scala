import scala.util.Random

object RandomMultiplier extends App {
  // Function to multiply a list of numbers
  def multiplyNumbers(numbers: List[Double]): Double =
    numbers.foldLeft(1.0)(_ * _)

  // Generate a list of 5 random numbers between 1 and 10
  val randomNumbers = List.fill(5)(Random.nextDouble() * 10 + 1)

  // Print the generated numbers
  println(s"Generated Numbers: $randomNumbers")

  // Multiply the numbers and print the result
  val result = multiplyNumbers(randomNumbers)
  println(s"The product of the numbers is: $result")
}
