package morais.caioa.TonberryPay.controller

import morais.caioa.TonberryPay.models.CommonUser
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController {
    val caio = CommonUser("1", "Caio", "1234", "", "", 0.0);
    val isa = CommonUser("2", "Isa", "4312", "", "", 0.0);
    val luke = CommonUser("3", "Luke,", "5678", "", "", 0.0);

    @GetMapping
    fun index() = "Hello, ${caio.cpf_cnpj}!"

    @GetMapping("/list")
    fun transfer() = listOf(
        caio,
        isa,
        luke
    )
}