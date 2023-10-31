import scala.util.Random
import scala.io.StdIn

object NormalizeList {
  def main(args: Array[String]): Unit = {
    val random = new Random
    // Запрашиваем количество элементов массива
    println("Enter the number of array elements: ")
    val listSize = scala.io.StdIn.readInt
    // Запрашиваем максимальный элемент массива
    println("Enter an upper limit for the randomize numbers in the array (from 0 to ...): ")
    val max_value = scala.io.StdIn.readInt
    // Генерируем массив из amount элементов случайными значениями от 0 до max_value
    val randomList = List.fill(listSize)(random.nextInt(max_value))

    // Находим максимальный элемент в списке
    val maxElement = randomList.max

    // Нормализуем список, разделив каждый элемент на максимальный элемент
    val normalizedList = randomList.map(_ / maxElement)

    // Выводим исходный список и нормализованный список
    println("Исходный список:")
    println(randomList)
    println("Нормализованный список:")
    println(normalizedList)
  }
}