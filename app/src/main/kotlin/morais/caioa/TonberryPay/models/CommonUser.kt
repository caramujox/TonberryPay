package morais.caioa.TonberryPay.models


class CommonUser( id: String, Name: String, cpf_cnpj: String, email: String, pwd: String, balance: Double) : User(id, Name, cpf_cnpj, email,
    pwd,
    balance
){
    override fun receive() {
        TODO("Not yet implemented")
    }

}
