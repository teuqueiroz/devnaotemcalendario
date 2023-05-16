import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Maintest {

    @Test
    @DisplayName("Teste Portaria")
    fun test1(){
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(14 , "COMUM" , "XT000" ) , "Negado.") },
            { Assertions.assertEquals(portaria(18 ,"VIP" , "Xt000") , "Negado.") },
            { Assertions.assertEquals(portaria(18 ,"COMUM" , "Xt000") , "Welcome.") },
            { Assertions.assertEquals(portaria(18 ,"PREMIUM" , "XL-010") , "Welcome.") },
            { Assertions.assertEquals(portaria(18 ,"LUXO" , "Xt000") , "Negado.") },
            { Assertions.assertEquals(portaria(18 ,"" , "Xt000") , "Negado.") }

        )
    }

}