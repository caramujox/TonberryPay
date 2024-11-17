package morais.caioa.TonberryPay.models

abstract class User(open val id: String, var Name :String,
                    var cpf_cnpj: String, var email: String,
                    var pwd: String, var balance: Double ) {

    abstract fun receive();
}