import java.text.DecimalFormat
fun main() {
    val tax = .025
    var cost = 0.00
   val decimalFormat = DecimalFormat("#,###,###.##")
    do {
        var itemCost: Double
        println("Enter the cost of the item you are buying (enter 0 if you are done): ")
        itemCost = readln().toDouble()
        cost += itemCost
    } while (itemCost > 0)
    val formattedCost = decimalFormat.format(cost)
    val tip = cost * .175
    val formattedTip = decimalFormat.format(tip)
    val taxCost = cost + (cost * tax)
    val tipCost = taxCost + tip
    val formattedTaxCost = decimalFormat.format(taxCost)
    val formattedTipCost = decimalFormat.format(tipCost)
    println("The subtotal is: $formattedCost")
    println("The total with taxes is: $formattedTaxCost")
    var userResponse: Int
    do {
        println("Would you like to add a 17.5% tip of $formattedTip? (Highly Recommended)")
        println("1) Yes")
        println("2) No")
        userResponse = readln().toInt()
    } while (userResponse<0 || userResponse>2)
    when (userResponse) {
    1 -> println("Your total is: $formattedTipCost")
    2 -> println("Your total is: $formattedTaxCost")
    }


}