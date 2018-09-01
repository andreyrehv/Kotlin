fun main(args: Array<String>) {
    
    val x = 12
when (x) {
   in 1..3 -> print("valor ruim")
   in 4..7 -> print("valor aceito")
   in 8..10 -> print("valor otimo")
  
   else -> { // Note the block
       print("valor não encontrado")
	}

}

}


