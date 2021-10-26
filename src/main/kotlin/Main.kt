fun main(args: Array<String>) {

    var idade = 0
    var desconto = 0.0
    var precoIn = 18.0
    var precoCo = 0.0
    var quantIngresso = 0.0

    print("Digite a sua idade: ")
    idade = readLine()!!.toInt()

    if(idade > 0 && idade < 5){
        desconto = precoIn * 0.6
        precoCo = precoIn - desconto
        println("O preço do seu ingresso é: $precoCo")
    }else if(idade >= 5 && idade <= 60){
        println("Você não tem desconto se comprar apenas 1 ingresso: ")
        print("Se deseja mais de 1, informe quantos: ")
        quantIngresso = readLine()!!.toDouble()
            if(quantIngresso > 1){
                desconto = precoIn * 0.3
                precoCo = (precoIn - desconto) * quantIngresso
             println("O preço dos seus ingressos é de: $precoCo")
            }else{
            println("Inválido")
            }
        }else if(idade > 60){
        desconto = precoIn * 0.55
        precoCo = precoIn - desconto
        println("O preço do seu ingresso é: $precoCo")
    }
}






